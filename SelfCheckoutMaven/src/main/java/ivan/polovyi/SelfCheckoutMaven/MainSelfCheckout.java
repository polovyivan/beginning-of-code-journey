package ivan.polovyi.SelfCheckoutMaven;

import ivan.polovyi.SelfCheckoutMaven.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainSelfCheckout extends Application {

	private static Stage st;

	public static Stage getSt() {
		return st;
	}

	@Override
	public void start(Stage primaryStage) {

		st = new ViewFactory().stageLuncher("Self Service");
		st.setScene(new ViewFactory().createLoginScene());
		st.setFullScreen(true);
		st.setAlwaysOnTop(true);

	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void setSt(Stage st) {
		MainSelfCheckout.st = st;
	}
}
