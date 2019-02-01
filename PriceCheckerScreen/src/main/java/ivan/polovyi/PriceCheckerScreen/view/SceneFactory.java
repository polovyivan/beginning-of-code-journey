package ivan.polovyi.PriceCheckerScreen.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class SceneFactory {
	public Stage stageLuncher(String title) {

		Stage stage = new Stage();
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/ivan/polovyi/PriceCheckerScreen/view/pictures/Logo-Holambelo-sf.png"));
		stage.getIcons().add(applicationIcon);
		stage.setTitle(title);

		Screen screen = Screen.getPrimary();

		Rectangle2D bounds = screen.getVisualBounds();
		stage.setX(bounds.getMaxX());
		stage.setY(bounds.getMaxY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());

		stage.setAlwaysOnTop(true);
		stage.setFullScreenExitHint("");
		stage.centerOnScreen();
		stage.setFullScreenExitKeyCombination(new KeyCodeCombination(KeyCode.F4, KeyCombination.ALT_ANY));

		stage.show();

		return stage;

	}

	public Scene createScanScene() {
		
		String fxmlPath = "/ivan/polovyi/PriceCheckerScreen/view/fxml/ScanSceneFXML.fxml";
		String cssPath = "css/ScanSceneCSS.css";

		return sceneCreator(fxmlPath, cssPath);
	}

	public Scene createResultScene() {

		String fxmlPath = "/ivan/polovyi/PriceCheckerScreen/view/fxml/ResultSceneFXML.fxml";
		String cssPath = "css/ResultSceneCSS.css";

		return sceneCreator(fxmlPath, cssPath);
	}

	public Scene sceneCreator(String fxmlPath, String cssPath) {

		Pane pane = null;

		try {
			pane = FXMLLoader.load(getClass().getResource(fxmlPath));
		} catch (IOException e) {
			e.getStackTrace();
		}

		Scene scene = new Scene(pane);
		scene.getStylesheets().add(getClass().getResource(cssPath).toExternalForm());
		scene.setCursor(Cursor.NONE);
		return scene;

	}

}
