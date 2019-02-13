//Granflora

package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.poi.ss.usermodel.Workbook;

import ivan.polovyi.AuxiliarySystem.database.DBConnCooperflora;
import ivan.polovyi.AuxiliarySystem.model.dataprocessors.CooperfloraFLOProcess;
import ivan.polovyi.AuxiliarySystem.model.utilities.CopyFileFromOneDirToAnother;
import ivan.polovyi.AuxiliarySystem.model.utilities.Directories;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.input.ReadFLOFile;
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
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

public class CooperfloraController implements Initializable {

	ObservableList<ProductBean> listOfProducts = FXCollections.observableArrayList();
	@FXML
	private AnchorPane anchorPaneCooperflora;

	@FXML
	private Label cooperfloraLable;

	@FXML
	private TableView<ProductBean> cooperfloraTableView;

	@FXML
	private TableColumn<ProductBean, String> productCodeColumn;

	@FXML
	private TableColumn<ProductBean, String> productCodeHBLOColumn;

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

	@FXML
	private Label drugAndDrop;

	@FXML
	private Button returnButton;

	@FXML
	void returnToMain(ActionEvent event) {
		listOfProducts.clear();

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
		anchorPaneCooperflora.setOnDragDropped(new EventHandler<DragEvent>() {
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
		anchorPaneCooperflora.setOnDragOver(new EventHandler<DragEvent>() {
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

					// call read method pass file path and return StringBean
					ReadFLOFile readFloFile = new ReadFLOFile(filePath);
					String resultString = readFloFile.getFileContent();

					updateProgress(20, 100);

					// call process method and pass StringBean and return
					// ObservableList<ProductBean>
					CooperfloraFLOProcess cooperfloraFLOProcess = new CooperfloraFLOProcess();
					// to drop the list
					listOfProducts = cooperfloraFLOProcess.displayText(resultString);

					updateProgress(30, 100);

					if (listOfProducts.size() == 0) {
						cooperfloraLable.setText("NÃO FOI FATURADO");
						ViewFactory error = new ViewFactory();
						error.getErrorMess("NÃO FOI FATURADO");
						throw new IllegalArgumentException("Exeption !!!");

					}

					// create BillBean object base on first product
					BillBean bill = new BillBean(listOfProducts.get(0).getBillNumber(), null, null, "Cooperflora",
							"03300062000107", null, null, null, null);
					// call DAO and pass ObservableList<ProductBean> and return list of lists
					// ObservableList<ProductBean>

					DBConnCooperflora dBConnCooperflora = new DBConnCooperflora();
					listOfProducts = dBConnCooperflora.executeQuery(listOfProducts);

					ObservableList<ProductBean> listOfUnknownProducts = FXCollections.observableArrayList();
					updateProgress(60, 100);

					StringBuilder keys = new StringBuilder();
					for (ProductBean productBean : listOfProducts) {
						keys.append(productBean.getChave() + ";");

						if (productBean.getProductStatus() != null) {

							productBean.setProductHBLOCode(new SimpleStringProperty(
									productBean.getProductSupplierCode() + " " + productBean.getProductName()));

							listOfUnknownProducts.add(productBean);

						}

					}

					updateProgress(70, 100);
					// call print to file accourding to chaves
					String outputTXTFilePath = null;

					if (keys.toString().contains("1763")) {
						outputTXTFilePath = Directories.getGfMvaDir() + bill.getSupplierName()
								+ listOfProducts.get(0).getChave() + ".txt";
					} else {
						outputTXTFilePath = Directories.getCdMvaCoopDir() + bill.getSupplierName()
								+ listOfProducts.get(0).getChave() + ".txt";
					}
					// call createMVATXTFile pass ObservableList<ProductBeanAXM> return string

					CreateMVATXTFile createMVATXTFile = new CreateMVATXTFile(listOfProducts, null, bill);
					String mvaContent = createMVATXTFile.setMVAcontent();
					// call print to file
					PrintToFile printToFile = new PrintToFile(outputTXTFilePath, mvaContent);
					printToFile.printToTXTFile();

					// call CreateExelFile and pass listOfUnknoweProducts
					updateProgress(80, 100);

					if (!listOfUnknownProducts.isEmpty()) {
						String unknownproductsExelFilePath = Directories.getExelDir();
						CreateExelFile createExelFile = new CreateExelFile();
						Workbook wb = createExelFile.setExelProductBean(listOfUnknownProducts, bill);

						unknownproductsExelFilePath = unknownproductsExelFilePath + "\\" + bill.getSupplierName() + " "
								+ "CADASTRO NF# " + bill.getBillNumber() + ".xls";

						PrintToFile printToExelFile = new PrintToFile(unknownproductsExelFilePath, wb);
						printToFile.printToTXTFile();

						printToExelFile.writeToExelFile();

					} else {
						String insertFileTo = Directories.getGfProcFileDir() + bill.getSupplierName() + "_"
								+ bill.getBillNumber() + ".flo";

						CopyFileFromOneDirToAnother copyFileFromOneDirToAnother = new CopyFileFromOneDirToAnother(
								filePath, insertFileTo);

						copyFileFromOneDirToAnother.moveFile();

						File originalFile = new File(filePath);
						originalFile.delete();

					}

					for (ProductBean productBean : listOfProducts) {

						BigDecimal priceMVA = new BigDecimal(productBean.getProductPrice());
						priceMVA = priceMVA.divide(new BigDecimal(100));
						productBean.setProductPrice(new SimpleStringProperty(priceMVA.toString()));

					}
					productCodeColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productSupplierCode"));

					productCodeHBLOColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productHBLOCode"));

					productNameColumn.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productName"));
					ProductGrowerColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productGrower"));
					productBoxQuantityColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("boxQuantity"));
					productPerBoxColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("quantityPerBox"));
					productPriceColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productPrice"));
					updateProgress(50, 1000);
					productChaveColumn.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("chave"));
					productBillNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("billNumber"));
					productLotNumberColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("lotNumber"));
					productStatusColumn
							.setCellValueFactory(new PropertyValueFactory<ProductBean, String>("productStatus"));
					cooperfloraTableView.setItems(listOfProducts);
					updateProgress(100, 100);
					return null;
				} catch (Exception e) {
					e.getStackTrace();
					ViewFactory error = new ViewFactory();
					error.getErrorMess("CooperfloraController class_ " + e.toString());

				}

				return null;
			}

		};

		progressBar.progressProperty().bind(task.progressProperty());
		new Thread(task).start();

	}
}