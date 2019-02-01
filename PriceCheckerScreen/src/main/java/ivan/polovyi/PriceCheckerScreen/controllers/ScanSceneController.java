package ivan.polovyi.PriceCheckerScreen.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ivan.polovyi.PriceCheckerScreen.MainPriceChecker;
import ivan.polovyi.PriceCheckerScreen.model.PageContentHTML;
import ivan.polovyi.PriceCheckerScreen.model.ProductBean;
import ivan.polovyi.PriceCheckerScreen.model.ProductFromHTMLCreator;
import ivan.polovyi.PriceCheckerScreen.view.SceneFactory;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class ScanSceneController implements Initializable {
	int pictureNumber = 0;
	private String htmlContent = null;

	@FXML
	private AnchorPane aPRScanScene;

	@FXML
	private AnchorPane aPTop;

	@FXML
	private AnchorPane apBottom;

	@FXML
	private TextField txtFieldScanInput;

	@FXML
	private AnchorPane aPImage;

	@FXML
	private Label lblWarning;

	@FXML
	void getInput(ActionEvent event) {
		String stiId = inputValidation(txtFieldScanInput.getText());
		txtFieldScanInput.clear();
		if (stiId != null) {

			String lotLink = "https:/example.com/stock/price/form/STE_ID/" + stiId + "/";
//pass url and retrieve html content
			try {
				setHtmlContent(PageContentHTML.retriveHTML(lotLink, "ERPusername", "userPassword"));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
// pass html content and create product
			ProductBean product = ProductFromHTMLCreator.createProductFromHTML(htmlContent);

			ResultSceneController.setProduct(product);

			if (product.getName() == null || product.getStickerPrice() == null
					|| product.getStickerPricePlus20() == null || product.getStickerPricePlus25() == null) {

				lblWarning.setVisible(true);
				lblWarning.setText(" Problema de conexão na Internet. Tenta de novo ");

				lableClean(lblWarning);
			}

			sceneTransition();

		}

	}

	private void sceneTransition() {
		MainPriceChecker.getSt().setScene(new SceneFactory().createResultScene());
		MainPriceChecker.getSt().setFullScreen(true);
		MainPriceChecker.getSt().setAlwaysOnTop(true);

	}

	private String inputValidation(String input) {

		if ((input.length() == 8 & input.startsWith("l") || input.startsWith("L"))
				&& (!input.isEmpty() || input != null)) {
			input = input.substring(2, Math.min(input.length(), 8));
		} else if (input.equals(null) || input.isEmpty()) {
			input = null;
			lblWarning.setVisible(true);
			lblWarning.setText("Leia código de barras");

			lableClean(lblWarning);
		} else {
			input = null;
			lblWarning.setVisible(true);
			lblWarning.setText(
					"       O código de barras não pode ser lido. \nVerifique o outro código presente na embalagem.");

			lableClean(lblWarning);
			txtFieldScanInput.clear();
		}
		return input;

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		loadPicture();

	}

	private void loadPicture() {

		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(50),

				ae -> {
					pictureNumber++;
					aPImage.setStyle(
							"-fx-background-image:url(\"/ivan/polovyi/PriceCheckerScreen/view/pictures/gif/barcode_"
									+ (pictureNumber + 1) + ".png\");");

					pictureNumber++;
					if (pictureNumber == 60) {
						pictureNumber = 0;
					}

				}));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();

		// text field focus
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				txtFieldScanInput.requestFocus();
			}
		});

	}

	private void lableClean(Label lable) {

		PauseTransition delay = new PauseTransition(Duration.seconds(4));
		delay.setOnFinished(event -> {
			lable.setVisible(false);
			lable.setText("");

		});
		delay.play();

	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

}
