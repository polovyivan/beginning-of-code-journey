//CD 

package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.lang3.tuple.Pair;
import org.w3c.dom.Document;

import ivan.polovyi.AuxiliarySystem.database.DBConnCEASA;
import ivan.polovyi.AuxiliarySystem.model.dataprocessors.CeasaPDFProc;
import ivan.polovyi.AuxiliarySystem.model.utilities.CopyFileFromOneDirToAnother;
import ivan.polovyi.AuxiliarySystem.model.utilities.Directories;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.model.utilities.input.ReadPDFFile;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.CreateMVATXTFile;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.CreateWriteXMLFile;
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
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

public class CEASAController implements Initializable {

	@FXML
	private AnchorPane anchorPaneCEASA;

	@FXML
	private Label cooperfloraLable;

	@FXML
	private TableView<ProductBeanXML> ceasaTableView;

	@FXML
	private TableColumn<ProductBeanXML, String> productCodeColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productNameColumn;

	@FXML
	private TableColumn<ProductBeanXML, String> productGrowerColumn;

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
	private ProgressBar progressBar;

	ObservableList<ProductBeanXML> data = FXCollections.observableArrayList();

	@FXML
	private Label drugAndDrop;

	String filePath = null;
	@FXML
	private Button returnButton;

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
		setOnDrugOverMethod();

		setOnDrugDroppedMethod();
	}

	private void setOnDrugDroppedMethod() {
		anchorPaneCEASA.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				boolean success = false;
				if (db.hasFiles()) {
					success = true;
					for (File file : db.getFiles()) {
						String filePath = file.getAbsolutePath();

						mainAction(filePath);

					}
				}
				event.setDropCompleted(success);
				event.consume();
			}

		});

	}

	private void setOnDrugOverMethod() {
		anchorPaneCEASA.setOnDragOver(new EventHandler<DragEvent>() {
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

	}

	private void mainAction(String filePath) {
		final Task<Void> task = new Task<Void>() {

			public Void call() throws Exception {
				updateProgress(10, 100);
				try {

					ReadPDFFile readPDFFile = new ReadPDFFile(filePath);

					String resultString = readPDFFile.getFileContent();

					updateProgress(20, 100);
					// call process method and pass StringBean and return
					// ObservableList<ProductBean>
					CeasaPDFProc ceasaPDFProc = new CeasaPDFProc();
					Pair<ObservableList<ProductBeanXML>, BillBean> pdfInfo = ceasaPDFProc.converter(resultString);
					BillBean bill = pdfInfo.getValue();
					ObservableList<ProductBeanXML> listOfProducts = FXCollections.observableArrayList();
					listOfProducts = pdfInfo.getKey();
					// call CreateMVA pass ObservableList<ProductBean> return StringBuilder
					updateProgress(70, 100);
//convert supplier cod to supplier  CNPJ
					DBConnCEASA dBConnCEASA = new DBConnCEASA();
					bill.setSupplierCNPJ(new SimpleStringProperty(dBConnCEASA.executeQuery(bill.getSupplierCNPJ())));

					for (ProductBeanXML productBean : listOfProducts) {

						BigDecimal priceMVA = new BigDecimal(productBean.getProductPrice().replaceAll(",", "."));
						priceMVA = priceMVA.multiply(new BigDecimal(100));
						productBean.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

					}
					// call createMVATXTFile pass ObservableList<ProductBeanAXM> return string
					CreateMVATXTFile createMVATXTFile = new CreateMVATXTFile(null, listOfProducts, bill);
					String mvaContent = createMVATXTFile.setMVAcontent();
					for (ProductBeanXML productBean : listOfProducts) {
						BigDecimal priceMVA = new BigDecimal(productBean.getProductPrice().replaceAll(",", "."));
						priceMVA = priceMVA.divide(new BigDecimal(100));
						productBean.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

					}

					// call CreateWriteXMLFile pass
					CreateWriteXMLFile createWriteXMLFile = new CreateWriteXMLFile(listOfProducts, bill);
					Document doc = createWriteXMLFile.xml();

					// call print to .txt file

					String outputTXTFilePath = null;
					String outputXMLFilePath = null;
					String insertFileTo = null;
					if (bill.getSubsidiaryCNPJ().toString().contains("xxxxxxxxxxxx70")) {
						outputTXTFilePath = Directories.getGfMvaCeasaDir() + bill.getSupplierName()
								+ bill.getBillNumber() + ".txt";
						outputXMLFilePath = Directories.getGfXmlCeasaDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".xml";
						insertFileTo = Directories.getGfProcFileDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".pdf";
					} else {
						outputTXTFilePath = Directories.getCdMvaCeasaDir() + bill.getSupplierName()
								+ bill.getBillNumber() + ".txt";
						outputXMLFilePath = Directories.getCdXmlCeasaDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".xml";
						insertFileTo = Directories.getCdProcFileDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".pdf";
					}

					PrintToFile printToFile = new PrintToFile(outputTXTFilePath, mvaContent);
					printToFile.printToTXTFile();

					// call print to .txt file

					PrintToFile printToXMLFile = new PrintToFile(outputXMLFilePath, doc);
					printToXMLFile.writeToXML();

					updateProgress(80, 100);

					CopyFileFromOneDirToAnother copyFileFromOneDirToAnother = new CopyFileFromOneDirToAnother(filePath,
							insertFileTo);

					copyFileFromOneDirToAnother.moveFile();

					File originalFile = new File(filePath);
					originalFile.delete();
					

					productCodeColumn.setCellValueFactory(
							new PropertyValueFactory<ProductBeanXML, String>("productSupplierCode"));

					productNameColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBeanXML, String>("productName"));

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
					ceasaTableView.setItems(listOfProducts);
					updateProgress(100, 100);
				} catch (Exception e) {
					e.getStackTrace();
					ViewFactory error = new ViewFactory();
					error.getErrorMess("CEASAController class_ " + e.toString());
				}

				return null;
			}

		};

		progressBar.progressProperty().bind(task.progressProperty());
		new Thread(task).start();

	}

}