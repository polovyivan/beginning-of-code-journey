package ivan.polovyi.AuxiliarySystem.view;

import java.io.IOException;

import ivan.polovyi.AuxiliarySystem.controllers.ErrorController;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ViewFactory {

	public void getMainScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/MainWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/MainWindow.css";

		String title = "CONVERSOR";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getAcessoriesScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/AccesoriesWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/AccesoriesWindow.css";
		String title = "ACESSÓRIOS";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getCooperfloraScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/CooperfloraWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/CooperfloraWindow.css";
		String title = "COOPERFLORA";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getImportadosScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/ImportadosWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/ImportadosWindow.css";
		String title = "IMPORTADOS";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getXMLScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/XMLWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/XMLWindow.css";
		String title = "XML";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getCEASAScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/CEASAWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/CEASAWindow.css";
		String title = "CEASA";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getCodScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/CodWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/CodWindow.css";
		String title = "CADASTRO";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public void getDuplicatesScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/DuplicatesFXML.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/DuplicatesWindow.css";
		String title = "CÓDIGOS DUPLICADOS";
		stegeLuncher(fxmlPath, cssPath, title);

	}

	public Stage getInventoryScene() {
		String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/InventoryWindow.fxml";
		String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/InventoryWindow.css";
		String title = "INVENTÁRIO";
		return stegeLuncher(fxmlPath, cssPath, title);
	}

	public void getErrorMess(String content) {

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				String fxmlPath = "/ivan/polovyi/AuxiliarySystem/view/fxml/ErrorMess.fxml";
				String cssPath = "/ivan/polovyi/AuxiliarySystem/view/css/ErrorMess.css";
				String title = "ERRO!!!";

				ErrorController errorController = new ErrorController();

				errorController.setErrorContent(content);
				errorController.errorLuncher(fxmlPath, cssPath, title);

			}

		});

	}

	public Stage stegeLuncher(String fxmlPath, String cssPath, String title) {

		Pane pane;

		try {
			pane = FXMLLoader.load(getClass().getResource(fxmlPath));
		} catch (IOException e) {
			pane = null;
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("ViewFactory class_ " + e.toString());
		}
		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/ivan/polovyi/AuxiliarySystem/view/pictures/Logo.png"));
		stage.getIcons().add(applicationIcon);
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.show();
		stage.setTitle(title);
		scene.getStylesheets().add(cssPath);
		return stage;

	}

}
