package ivan.polovyi.AuxiliarySystem.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ErrorController implements Initializable {

	@FXML
	private AnchorPane errorAnchorPane;

	@FXML
	private Button errorBTN;

	@FXML
	private TextArea errorTextArea;

	private static String errorContent;

	@FXML
	void errorMessClose(ActionEvent event) {
		errorBTN.getScene().getWindow().hide();
	}

	public Stage errorLuncher(String fxmlPath, String cssPath, String title) {

		Pane pane;

		try {
			pane = FXMLLoader.load(getClass().getResource(fxmlPath));
		} catch (IOException e) {
			pane = null;
			e.printStackTrace();
		}

		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/ivan/polovyi/AuxiliarySystem/view/pictures/Logo.png"));
		stage.getIcons().add(applicationIcon);
		stage.setScene(scene);

		stage.show();
		stage.setTitle(title);

		return stage;

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		errorTextArea.setText(getErrorContent());
	}

	public String getErrorContent() {

		return errorContent;
	}

	public void setErrorContent(String errorContent) {

		System.out.println("set " + errorContent);

	}

}
