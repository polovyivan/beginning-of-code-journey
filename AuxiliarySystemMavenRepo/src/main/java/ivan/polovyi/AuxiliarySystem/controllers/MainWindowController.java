package ivan.polovyi.AuxiliarySystem.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MainWindowController implements Initializable {

	@FXML
	private AnchorPane anchorPane;

	@FXML
	private Button btnCoop;

	@FXML
	private Button btnImp;

	@FXML
	private Button btnXML;

	@FXML
	private Button btnAC;

	@FXML
	private Label mainLable;

	@FXML
	private Button btnCEASA;

	@FXML
	private Button btnCod;

	@FXML
	private Button btnInventory;

	@FXML
	void goToAccessories(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getAcessoriesScene();
		btnAC.getScene().getWindow().hide();

	}

	@FXML
	void goToCooperflora(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getCooperfloraScene();
		btnCoop.getScene().getWindow().hide();
	}

	@FXML
	void goToImportados(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getImportadosScene();
		btnImp.getScene().getWindow().hide();
	}

	@FXML
	void goToXML(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getXMLScene();
		btnXML.getScene().getWindow().hide();
	}

	@FXML
	void goToCEASA(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getCEASAScene();
		btnCEASA.getScene().getWindow().hide();
	}

	@FXML
	void goToCod(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getCodScene();
		btnCod.getScene().getWindow().hide();
	}

	@FXML
	void goToInvent(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getInventoryScene();
		btnInventory.getScene().getWindow().hide();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
