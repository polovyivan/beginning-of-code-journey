package ivan.polovyi.PriceCheckerScreen;

import ivan.polovyi.PriceCheckerScreen.view.SceneFactory;

/**
 * 
 *
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class MainPriceChecker extends Application {

	private static Stage st;

	public static Stage getSt() {
		return st;
	}

	public static void setSt(Stage st) {
		MainPriceChecker.st = st;
	}

	@Override
	public void start(Stage primaryStage) {
		st = new SceneFactory().stageLuncher("PREÇO");
		st.setScene(new SceneFactory().createScanScene());
		st.setFullScreen(true);
		st.setAlwaysOnTop(true);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
