package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import ivan.polovyi.AuxiliarySystem.model.dataprocessors.InventoryProcessor;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.input.ReadXLS;
import ivan.polovyi.AuxiliarySystem.model.utilities.output.PrintToFile;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;

public class InventoryController implements Initializable {

	@FXML
	private AnchorPane aPInventory;

	@FXML
	private ProgressBar progBarInventory;

	@FXML
	private TextArea txtAreaInventory;

	private String filePath;

	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		setOnDrugDroppedMethod();
		setOnDrugOverMethod();

	}

	private String setOnDrugDroppedMethod() {

		aPInventory.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				boolean success = false;
				if (db.hasFiles()) {
					success = true;
					for (File file : db.getFiles()) {

						setFilePath(file.getAbsolutePath());
						mainAction();

					}
				}
				event.setDropCompleted(success);
				event.consume();
			}

		});
		return null;

	}

	protected String mainAction() {

		final Task<Void> task = new Task<Void>() {

			public Void call() throws Exception {
				txtAreaInventory.appendText("Lendo arquivo...");
				updateProgress(10, 100);

				ReadXLS xlsReader = new ReadXLS(filePath);
				updateProgress(30, 100);
				ArrayList<ProductBean> listofProducts = xlsReader.getProductFromInput();

				InventoryProcessor invProc = new InventoryProcessor();
				updateProgress(60, 100);
				setResult(invProc.inventoryProcessing(listofProducts, txtAreaInventory));
				updateProgress(100, 100);
				return null;
			}
		};

		progBarInventory.progressProperty().bind(task.progressProperty());
		new Thread(task).start();

		task.setOnSucceeded(event -> {

			PrintToFile print = new PrintToFile(chooseDirectory(), result);
			print.printToTXTFile();

		});

		return result;

	}

	protected String chooseDirectory() {

		DirectoryChooser chooser = new DirectoryChooser();
		String saveToFile = null;
		File file = chooser.showDialog(null);
		if (file != null) {
			saveToFile = file.toString() + "\\ResultadoInventario.csv";
		}
		return saveToFile;
	}

	private void setOnDrugOverMethod() {
		aPInventory.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				if (db.hasFiles()) {
					event.acceptTransferModes(TransferMode.MOVE);
				} else {
					event.consume();
				}
			}
		});

	}

}
