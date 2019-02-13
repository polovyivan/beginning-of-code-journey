package ivan.polovyi.SelfCheckoutMaven.controllers;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.MainSelfCheckout;
import ivan.polovyi.SelfCheckoutMaven.barcode.Encryptor;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;
import ivan.polovyi.SelfCheckoutMaven.dao.database.DBConnCredentials;
import ivan.polovyi.SelfCheckoutMaven.view.ViewFactory;
import javafx.animation.PauseTransition;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebView;
import javafx.util.Duration;

public class LoginController implements Initializable {

	@FXML
	private AnchorPane loginAP;

	@FXML
	private WebView loginWW;

	@FXML
	private Label lblHowItWorks;

	@FXML
	private AnchorPane apHowItWorks;

	@FXML
	private Rectangle rctHowItWorks;

	@FXML
	private VBox vBoxHelp;

	@FXML
	private Label lblHowItWorks1;

	@FXML
	private Label lblHowItWorks11;

	@FXML
	private Label lblHowItWorks2;

	@FXML
	private Label lblHowItWorks22;

	@FXML
	private Label lblHowItWorks3;

	@FXML
	private Label lblHowItWorks4;

	@FXML
	private VBox vBoxLoginPanel;

	@FXML
	private TextField txtFieldUserName;

	@FXML
	private PasswordField passField;

	@FXML
	private Button btnLogin;

	@FXML
	private PasswordField passFieldAcKey;

	@FXML
	private Label lblWarning;

	@FXML
	private Label lblSelfCheckOut;

	@FXML
	private AnchorPane aPprocesPicture;

	@FXML
	private AnchorPane aLogoPicture;

	@FXML
	private Button btnBarCodePane;

	CustomerBean customer;

	@FXML
	void getACKey(ActionEvent event) {

		customer = new CustomerBean(null, null, null, null, passFieldAcKey.getText(), null);

		DBConnCredentials conn = new DBConnCredentials(customer);
		try {
			customer = conn.executeQueryFetchData();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		Encryptor ce = new Encryptor(customer);

		customer = ce.decrypt();

		customer.setWsUserName(StringUtils.substringBefore(customer.getBarcodeKey(), "+"));
		customer.setWsPassword(StringUtils.substringAfter(customer.getBarcodeKey(), "+"));
		loginaction();

	}

	@FXML
	void loginAction(ActionEvent event) {
		customer = new CustomerBean(null, null, txtFieldUserName.getText(), passField.getText(), null, null);

		if (customer.getWsUserName().isEmpty()) {

			System.out.println("inside");
			lblWarning.setText("Digita usuário e senha");
			lblWarning.setStyle("-fx-text-fill: red;");
			lableClean(lblWarning);
			vBoxLoginPanel.setDisable(false);
			passFieldAcKey.clear();
			txtFieldUserName.clear();
			passField.clear();

		} else {
			loginaction();

		}
	}

	private void loginaction() {

		System.out.println("loginaction" + customer.getWsUserName());
		System.out.println(customer.getWsPassword());
		String enterUserName = "document.getElementById('WEU_Username').value='" + customer.getWsUserName() + "';";
		String enterPw = "document.getElementById('WEU_Password').value='" + customer.getWsPassword() + "';";

		String cklickLogin = "document.getElementsByName('login')[0].click()";

		loginWW.getEngine().executeScript(enterUserName);
		loginWW.getEngine().executeScript(enterPw);
		loginWW.getEngine().executeScript(cklickLogin);
		vBoxLoginPanel.setDisable(true);

	}

	@FXML
	void lblHowItWorksEntered(MouseEvent event) {

		apHowItWorks.setVisible(true);
	}

	@FXML
	void lblHowItWorksExited(MouseEvent event) {
		apHowItWorks.setVisible(false);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// load blank page on a webshop
		loginWW.getEngine().load("http://www.exampleforgit.com/pt/login/index/index/redirect_page_id/86/");

		loginWW.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {

			if (newValue == Worker.State.SUCCEEDED) {
				lblWarning.setText("");
				vBoxLoginPanel.setDisable(false);
				loginWW.getEngine().executeScript("window.scrollTo(0, document.body.scrollHeight);");
				loginAP.setOnMouseClicked((MouseEvent event) -> {
					loginWW.getEngine().executeScript("window.scrollTo(0, document.body.scrollHeight);");

				});
				String html = (String) loginWW.getEngine().executeScript("document.documentElement.outerHTML");
				if (html.contains("Aviso!")) {
					lblWarning.setStyle("-fx-text-fill: red;");
					lblWarning.setText(StringUtils.substringBetween(html, "Aviso!</strong>", "</h4>"));

					txtFieldUserName.clear();
					passField.clear();
					passFieldAcKey.clear();
					lableClean(lblWarning);
				}
				// pass to another stage
				if (!loginWW.getEngine().getLocation()
						.equals("http://www.exampleforgit.com/pt/login/index/index/redirect_page_id/86/")) {
					stageTransition();
				}
			} else {
				lblWarning.setStyle("-fx-text-fill: #3CB371;");
				lblWarning.setText("Carregando...");
			}

		});

	}

	private void stageTransition() {
		MainSelfCheckout.getSt().setScene(new ViewFactory().createMainScene());
		MainSelfCheckout.getSt().setFullScreen(true);
		MainSelfCheckout.getSt().setAlwaysOnTop(true);
		MainWindowController.setCustomer(customer);

	}

	// makes label disappear in 4 seconds
	private void lableClean(Label labl) {
		PauseTransition delay = new PauseTransition(Duration.seconds(4));
		delay.setOnFinished(event -> {
			labl.setText("");

		});
		delay.play();
	}

}
