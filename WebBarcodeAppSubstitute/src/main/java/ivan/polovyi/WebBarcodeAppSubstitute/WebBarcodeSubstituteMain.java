package ivan.polovyi.WebBarcodeAppSubstitute;

/**
  
 *
 */
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class WebBarcodeSubstituteMain extends Application {

	@Override
	public void start(Stage primaryStage) throws NoSuchAlgorithmException, KeyManagementException {
		String title = "COLETA";
		String fxmlPath = "/ivan/polovyi/WebBarcodeAppSubstitute/view/ScanView.fxml";

		try {
			Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));

			Scene scene = new Scene(root, 1024, 768);
			scene.getStylesheets().add(
					getClass().getResource("/ivan/polovyi/WebBarcodeAppSubstitute/view/iPodCss.css").toExternalForm());

			Image applicationIcon = new Image(getClass()
					.getResourceAsStream("/ivan/polovyi/WebBarcodeAppSubstitute/view/images/logo.png"));
			primaryStage.getIcons().add(applicationIcon);
			primaryStage.setTitle(title);
			primaryStage.setScene(scene);
			primaryStage.setFullScreen(true);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException {

		launch(args);

	}

}