
package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.poi.ss.usermodel.Workbook;

import ivan.polovyi.AuxiliarySystem.database.DBConnXMLACC;
import ivan.polovyi.AuxiliarySystem.model.dataprocessors.XMLProcess;
import ivan.polovyi.AuxiliarySystem.model.utilities.CopyFileFromOneDirToAnother;
import ivan.polovyi.AuxiliarySystem.model.utilities.Directories;
import ivan.polovyi.AuxiliarySystem.model.utilities.SearchFilePath;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

public class AcessoriesController implements Initializable {
	private String input;
	String dateStamp = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());

	private String fileDirectory = "\\\\xxx.xxx.xxx.xxx\\Faturamento\\NFE Lançadoria\\XML\\NF-es (Com Certificado)\\Destinatário xxxxxxxxxxxx90\\"
			+ dateStamp;

	@FXML
	private AnchorPane anchorPaneAccessories;

	@FXML
	private Label xmlLable;

	@FXML
	private TextField xmlTextField;

	@FXML
	private Label warningLable;

	@FXML
	private TableView<ProductBeanXML> xmlTableView;

	@FXML
	private TableColumn<ProductBeanXML, String> productCodeColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productCodeHBLOColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productNameColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> ProductGrowerColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productBoxQuantityColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productPerBoxColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productPriceColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productChaveColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productLotNumberColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productBillNumberColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productStatusColumn;

	@FXML
	private Hyperlink hyperlinkLable;

	@FXML
	private ProgressBar xmlProgressBar;

	@FXML
	private Button returnButton;

	public void getBarcode(ActionEvent event) throws Exception {

		inputValidation();

	}

	@FXML
	void returnToMain(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getMainScene();
		returnButton.getScene().getWindow().hide();
	}

	@FXML
	public void getEnter(ActionEvent event) throws Exception {

		inputValidation();

	}

	private void inputValidation() throws Exception {

		input = xmlTextField.getText();

		if (input.length() == 44 && input.matches("[0-9]+")) {

			System.out.println(input);
			warningLable.setStyle("-fx-text-fill:green");
			warningLable.setText("Valido!");

//search file absolute path by name and folder directory

			SearchFilePath searchFilePath = new SearchFilePath(fileDirectory, input + ".xml");
			String filePath = searchFilePath.returnFilePath();
//convert file absolute path to url cause file located on the local network

			if (filePath == null || filePath.isEmpty()) {
				warningLable.setText("Nota não encontrada ");
				hyperlinkLable.setText("www.fsist.com.br");
				warningLable.setStyle("-fx-text-fill:red");
			} else {
				// filePath = (new File(filePath).toURI().toURL()).toString();
				mainAction(filePath);

			}

		} else if (input.equals("0") || input.isEmpty()) {
			warningLable.setText("Preencha o campo acima");
			warningLable.setStyle("-fx-text-fill:white");
		} else {
			warningLable.setText("Código incorreto");
			warningLable.setStyle("-fx-text-fill:red");
		}

	}

	@FXML
	void getLink(ActionEvent event) throws IOException {
		Runtime rt = Runtime.getRuntime();
		String url = "https://www.fsist.com.br/#xmlsemcert";
		rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		anchorPaneAccessories.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				if (db.hasFiles()) {
					event.acceptTransferModes(TransferMode.COPY);
				} else {
					event.consume();
				}
			}
		});

		anchorPaneAccessories.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				boolean success = false;
				if (db.hasFiles()) {
					success = true;
					for (File file : db.getFiles()) {
						String filePath = file.getAbsolutePath();
						
						// task
						mainAction(filePath);

					}
				}
				event.setDropCompleted(success);
				event.consume();
			}

		});

	}

	public void mainAction(String filePath) {

		final Task<Void> task = new Task<Void>() {

			public Void call() throws Exception {

				updateProgress(10, 100);
				try {
					// call read method pass file path and return ObservableList<ProductBean> and
					// BillBeanAcc

					ReadXMLFile readXMLFile = new ReadXMLFile(filePath);
					readXMLFile.getFileContent();

					Pair<ObservableList<ProductBeanXML>, BillBean> xmlInfo = readXMLFile.getProductandBillFromFile();
					updateProgress(20, 100);

					// call process method and pass xmlInfo and return
					// ObservableList<ProductBeanAcc> listOfProducts

					ObservableList<ProductBeanXML> listOfProducts = FXCollections.observableArrayList();
					XMLProcess xMLProcess = new XMLProcess();
					listOfProducts = xMLProcess.xmlProcess(xmlInfo);

					updateProgress(30, 100);

					// call DAO and pass ObservableList<ProductBeanAcc> and bill.getSupplier return
					// list of lists
					// ObservableList<ProductBean>

					BillBean bill = xmlInfo.getValue();
					DBConnXMLACC DBConnXMLAcc = new DBConnXMLACC();
					listOfProducts = DBConnXMLAcc.executeQuery(listOfProducts, bill.getSupplierCNPJ());
					ObservableList<ProductBeanXML> listOfUnknownProducts = FXCollections.observableArrayList();
					updateProgress(60, 100);

					// freshportal productCode adjust

					// separate unknown products end correct price according to product unit

					for (ProductBeanXML productBeanAcc : listOfProducts) {

						if (productBeanAcc.getUnit() != null) {

							BigDecimal qty = new BigDecimal(productBeanAcc.getQuantityPerBox());
							BigDecimal price = new BigDecimal(productBeanAcc.getProductPrice());

							BigDecimal unit = new BigDecimal(productBeanAcc.getUnit().replaceAll("[^-?0-9]+", ""));

							price = price.divide(unit, 2, RoundingMode.CEILING);

							qty = qty.multiply(unit);

							productBeanAcc.setProductPrice(new SimpleStringProperty(price.toString()));
							productBeanAcc.setQuantityPerBox(new SimpleStringProperty(qty.toString()));

						}

						// Multiply price by 100 for MVA format
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

					updateProgress(70, 100);
					// call createMVATXTFile pass ObservableList<ProductBeanAXM> return string
					CreateMVATXTFile createMVATXTFile = new CreateMVATXTFile(null, listOfProducts, bill);
					String mvaContent = createMVATXTFile.setMVAcontent();

					// replacing illegal character in fileName

					bill.setSupplierName(
							new SimpleStringProperty(bill.getSupplierName().replaceAll("[^a-zA-Z0-9\\.\\-]", "_")));

					// call print to file

					String outputTXTFilePath = Directories.getCdMvaAcDir() + bill.getSupplierName() + "_"
							+ bill.getBillNumber() + ".txt";
					PrintToFile printToFile = new PrintToFile(outputTXTFilePath, mvaContent);
					printToFile.printToTXTFile();

					// call CreateExelFile and pass listOfUnknoweProducts
					updateProgress(80, 100);

					if (!listOfUnknownProducts.isEmpty()) {
						String unknownproductsExelFilePath = Directories.getExelDir();
						CreateExelFile createExelFile = new CreateExelFile();
						Workbook wb = createExelFile.setExelProductBeanXML(listOfUnknownProducts, bill);

						unknownproductsExelFilePath = unknownproductsExelFilePath + "\\" + bill.getSupplierName()
								+ "CADASTRO NF# " + bill.getBillNumber() + ".xls";

						PrintToFile printToExelFile = new PrintToFile(unknownproductsExelFilePath, wb);
						printToFile.printToTXTFile();

						printToExelFile.writeToExelFile();

					} else {
						String insertFileTo = Directories.getCdXmlACProcDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".xml";

						if (!filePath.contains("Faturamento")) {
							CopyFileFromOneDirToAnother copyFileFromOneDirToAnother = new CopyFileFromOneDirToAnother(
									filePath, insertFileTo);
							copyFileFromOneDirToAnother.moveFile();
							File originalFile = new File(filePath);
							originalFile.delete();
						}

					}

					for (ProductBeanXML productBeanAcc : listOfProducts) {

						BigDecimal priceMVA = new BigDecimal(productBeanAcc.getProductPrice());
						priceMVA = priceMVA.divide(new BigDecimal(100));
						productBeanAcc.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

					}

					productCodeColumn.setCellValueFactory(
							new PropertyValueFactory<ProductBeanXML, String>("productSupplierCode"));
					productCodeHBLOColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productHBLOCode"));

					productNameColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productName"));
					ProductGrowerColumn // supplier on the grover row
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productSupplier"));
					productBoxQuantityColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("boxQuantity"));
					productPerBoxColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("quantityPerBox"));
					productPriceColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productPrice"));
					updateProgress(50, 1000);
					productChaveColumn.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("chave"));
					productBillNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("billNumber"));
					productLotNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("lotNumber"));
					productStatusColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productStatus"));
					xmlTableView.setItems(listOfProducts);

					updateProgress(100, 100);
				} catch (Exception e) {
					e.getStackTrace();
					e.printStackTrace();

					ViewFactory error = new ViewFactory();
					error.getErrorMess("AcessoriesController class_ " + e.toString());

				}

				return null;
			}
		};

		xmlProgressBar.progressProperty().bind(task.progressProperty());
		new Thread(task).start();

	}

}
