//CD 

package ivan.polovyi.AuxiliarySystem.controllers;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import ivan.polovyi.AuxiliarySystem.database.DBConnCod;
import ivan.polovyi.AuxiliarySystem.model.dataprocessors.CodProcessor;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class CodController implements Initializable {

	final Clipboard clipboard = Clipboard.getSystemClipboard();
	final ClipboardContent content = new ClipboardContent();
	ArrayList<String> codesAmplified = new ArrayList<String>();
	@FXML
	private AnchorPane anchorPaneCod;

	@FXML
	private Button returnButton;

	@FXML
	private GridPane gpCod;
	@FXML
	private Label lblActualCodeHead;

	@FXML
	private Label lblNectCodes;
	@FXML
	private Label lblPlants;

	@FXML
	private Label lblPlantsCod;

	@FXML
	private Label lblImports;

	@FXML
	private Label lblImportsCod;

	@FXML
	private Label lblAccessories;

	@FXML
	private Label lblAccessoriesCod;

	@FXML
	private Label lblServices;

	@FXML
	private Label lblServicesCod;

	@FXML
	private Label lblPacks;

	@FXML
	private Label lblPacksCod;

	@FXML
	private Label lblBox;

	@FXML
	private Label lblBoxCod;

	@FXML
	private TextField txtFieldPlants;

	@FXML
	private TextField txtFieldImp;

	@FXML
	private TextField txtFieldAccess;

	@FXML
	private TextField txtFieldServises;

	@FXML
	private TextField txtFieldPacks;

	@FXML
	private TextField txtFieldBoxws;

	@FXML
	private Button btnUpdate;

	@FXML
	private Button btnDuplicates;

	@FXML
	void checkForDuplicates(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getDuplicatesScene();
		btnDuplicates.getScene().getWindow().hide();
	}

	@FXML
	void returnToMain(ActionEvent event) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getMainScene();
		returnButton.getScene().getWindow().hide();
	}

	@FXML
	void update(ActionEvent event) {
		upDateAction();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		upDateAction();
	}

	private void upDateAction() {
		// call
		ArrayList<String> codes = new ArrayList<String>();

		DBConnCod connCod = new DBConnCod();
		try {
			codes = connCod.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// set current codes to labels
		lblPlantsCod.setText(codes.get(0));
		lblImportsCod.setText(codes.get(1));
		lblAccessoriesCod.setText(codes.get(2));
		lblServicesCod.setText(codes.get(3));
		lblPacksCod.setText(codes.get(4));
		lblBoxCod.setText(codes.get(5));
		CodProcessor codProc = new CodProcessor();
		codesAmplified = codProc.codAmplifier(codes);
		// set amplified codes
		txtFieldPlants.setText(codesAmplified.get(0));
		txtFieldAccess.setText(codesAmplified.get(1));
		txtFieldImp.setText(codesAmplified.get(2));
		txtFieldServises.setText(codesAmplified.get(3));
		txtFieldPacks.setText(codesAmplified.get(4));
		txtFieldBoxws.setText(codesAmplified.get(5));
// set mouse click
		txtFieldPlants.setOnMouseClicked(eventMouse(codesAmplified.get(0)));
		txtFieldAccess.setOnMouseClicked(eventMouse(codesAmplified.get(1)));
		txtFieldImp.setOnMouseClicked(eventMouse(codesAmplified.get(2)));
		txtFieldServises.setOnMouseClicked(eventMouse(codesAmplified.get(3)));
		txtFieldPacks.setOnMouseClicked(eventMouse(codesAmplified.get(4)));
		txtFieldBoxws.setOnMouseClicked(eventMouse(codesAmplified.get(5)));

	}

	private EventHandler<MouseEvent> eventMouse(String string) {

		return new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
					if (mouseEvent.getClickCount() == 2) {
						content.putString(string);
						clipboard.setContent(content);
					}
				}
			}
		};
	}

}