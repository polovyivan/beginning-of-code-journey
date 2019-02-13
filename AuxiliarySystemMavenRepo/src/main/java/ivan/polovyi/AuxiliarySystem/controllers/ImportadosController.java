
package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ResourceBundle;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.poi.ss.usermodel.Workbook;

import ivan.polovyi.AuxiliarySystem.database.BDConnImp;
import ivan.polovyi.AuxiliarySystem.model.dataprocessors.ImportadosProcess;
import ivan.polovyi.AuxiliarySystem.model.utilities.CopyFileFromOneDirToAnother;
import ivan.polovyi.AuxiliarySystem.model.utilities.Directories;
import ivan.polovyi.AuxiliarySystem.model.utilities.ListAllFiles;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.model.utilities.input.ReadXMLFile;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.CreateExelFile;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.CreateMVATXTFile;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.PrintToFile;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.AnchorPane;

public class ImportadosController implements Initializable {

	@FXML
	private AnchorPane anchorPaneImportados;

	@FXML
	private Label cooperfloraLable;

	@FXML
	private TableView<ProductBeanXML> importadosTableView;

	@FXML
	private TableColumn<ProductBean, String> productCodeColumn;

	@FXML
	private TableColumn<ProductBean, String> productNameColumn;

	@FXML
	private TableColumn<ProductBean, String> ProductGrowerColumn;

	@FXML
	private TableColumn<ProductBean, String> productBoxQuantityColumn;

	@FXML
	private TableColumn<ProductBean, String> productPerBoxColumn;

	@FXML
	private TableColumn<ProductBean, String> productPriceColumn;

	@FXML
	private TableColumn<ProductBean, String> productChaveColumn;

	@FXML
	private TableColumn<ProductBean, String> productLotNumberColumn;

	@FXML
	private TableColumn<ProductBean, String> productBillNumberColumn;

	@FXML
	private TableColumn<ProductBean, String> productStatusColumn;

	@FXML
	private ProgressBar progressBar;

	ObservableList<ProductBean> data = FXCollections.observableArrayList();
	String dateStamp = new SimpleDateFormat("yyyyMMddmmss").format(Calendar.getInstance().getTime());
	@FXML
	private Label drugAndDrop;

	@FXML
	private Button returnButton;

	@FXML
	private Button importadosBtn;

	@FXML
	void runConvert(ActionEvent event) {

		mainAction();

	}

	private void mainAction() {

		final Task<Void> task = new Task<Void>() {

			public Void call() throws Exception {
				updateProgress(10, 100);
				try {

					Pair<ObservableList<ProductBeanXML>, BillBean> xmlInfo = null;
					ObservableList<ProductBeanXML> listOfProducts = FXCollections.observableArrayList();
					ObservableList<ProductBeanXML> listOfUnknownProducts = FXCollections.observableArrayList();
					ObservableList<BillBean> billList = FXCollections.observableArrayList();

					BillBean bill = null;
					// get files absolute path return array list of Strings
					String directory = Directories.getImpXmlDir();

					ListAllFiles listAllFiles = new ListAllFiles(directory);

					String[] listofFiles = listAllFiles.listAllFielesinDirectory();
					if (listofFiles.length == 0) {

						ViewFactory error = new ViewFactory();
						error.getErrorMess("PASTA ESTA VAZIA!!");
						throw new IllegalArgumentException("PASTA ESTA VAZIA!!!");

					}

					// get only xml files
					ArrayList<String> listofXMLFiles = new ArrayList<String>();

					for (String filePath : listofFiles) {
						if (filePath.endsWith(".xml")) {
							listofXMLFiles.add(directory + filePath);

						}
					}
					// read all files and create general product list
					for (String fileAbsolutePath : listofXMLFiles) {
						ObservableList<ProductBeanXML> listOfProductsTemp = FXCollections.observableArrayList();

						// call readXML pass absolute file path and return Pair of ProductBean list and
						// Bill bean

						ReadXMLFile readXMLFile = new ReadXMLFile(fileAbsolutePath);

						xmlInfo = readXMLFile.getProductandBillFromFile();

						ImportadosProcess importadosProcess = new ImportadosProcess();
						listOfProductsTemp = importadosProcess.importadosProcess(xmlInfo);

						listOfProductsTemp = xmlInfo.getLeft();
						bill = xmlInfo.getValue();

						// get grower number and set to list of products
						BDConnImp dBConnImpGrower = new BDConnImp();
						String grower = "PEXT" + dBConnImpGrower.getSupplierCod(bill);
						// convert product codes
						listOfProductsTemp = dBConnImpGrower.executeQuery(listOfProductsTemp);
						// process list of products

						for (ProductBeanXML productBeanXML : listOfProductsTemp) {

							productBeanXML.setProductGrower(new SimpleStringProperty(grower));
							listOfProducts.add(productBeanXML);

						}

						billList.add(bill);

						// move file from one dir to another

						String insertFileTo = Directories.getImpXmlProcDir() + bill.getBillNumber() + ".xml";

						CopyFileFromOneDirToAnother copyFileFromOneDirToAnother = new CopyFileFromOneDirToAnother(
								fileAbsolutePath, insertFileTo);

						copyFileFromOneDirToAnother.moveFile();

						File originalFile = new File(fileAbsolutePath);
						originalFile.delete();

					}

					updateProgress(30, 100);

					for (ProductBeanXML productBeanAcc : listOfProducts) {

						BigDecimal priceMVA = new BigDecimal(productBeanAcc.getProductPrice());
						priceMVA = priceMVA.multiply(new BigDecimal(100));
						productBeanAcc.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

						// separate unknow products
						if (productBeanAcc.getProductStatus() != null) {
							productBeanAcc.setProductHBLOCode(new SimpleStringProperty(
									productBeanAcc.getProductSupplierCode() + " " + productBeanAcc.getProductName()));

							listOfUnknownProducts.add(productBeanAcc);

						}

					}

					// call make mva and return String
					CreateMVATXTFile createMVATXTFile = new CreateMVATXTFile(null, listOfProducts, bill);
					String mvaContent = createMVATXTFile.setMVAcontent();
					// call print to file
					String outputTXTFilePath = Directories.getImpMvaDir() + dateStamp + ".txt";
					PrintToFile printToFile = new PrintToFile(outputTXTFilePath, mvaContent);
					printToFile.printToTXTFile();

					// call CreateExelFile and pass listOfUnknoweProducts
					updateProgress(80, 100);

					if (!listOfUnknownProducts.isEmpty()) {
						String unknownproductsExelFilePath = Directories.getExelDir();
						CreateExelFile createExelFile = new CreateExelFile();
						Workbook wb = createExelFile.setExelProductBeanXML(listOfUnknownProducts, bill);

						unknownproductsExelFilePath = unknownproductsExelFilePath + "\\Importados_" + dateStamp
								+ ".xls";

						PrintToFile printToExelFile = new PrintToFile(unknownproductsExelFilePath, wb);
						printToFile.printToTXTFile();

						printToExelFile.writeToExelFile();

					}

					for (ProductBeanXML productBeanAcc : listOfProducts) {

						BigDecimal priceMVA = new BigDecimal(productBeanAcc.getProductPrice());
						priceMVA = priceMVA.divide(new BigDecimal(100));
						productBeanAcc.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

					}

					productCodeColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productSupplierCode"));
					productNameColumn.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productName"));
					productBoxQuantityColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("boxQuantity"));
					productPerBoxColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("quantityPerBox"));
					productPriceColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productPrice"));
					updateProgress(50, 1000);

					productBillNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("billNumber"));
					productLotNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("lotNumber"));
					importadosTableView.setItems(listOfProducts);
					updateProgress(100, 100);
					return null;

				} catch (Exception e) {
					e.getStackTrace();
					e.printStackTrace();
					ViewFactory error = new ViewFactory();
					error.getErrorMess("ImportadosController class_ " + e.toString());

				}

				return null;
			}

		};

		progressBar.progressProperty().bind(task.progressProperty());
		new Thread(task).start();

	}

	@FXML
	void returnToMain(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getMainScene();
		returnButton.getScene().getWindow().hide();
	}

	@FXML
	void changeCollorOnDragOver(DragEvent event) {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}