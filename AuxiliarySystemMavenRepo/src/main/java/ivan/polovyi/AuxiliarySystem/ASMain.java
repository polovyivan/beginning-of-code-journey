package ivan.polovyi.AuxiliarySystem;

import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class ASMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		ViewFactory viewFactory = new ViewFactory();
		viewFactory.getMainScene();

	}
}
