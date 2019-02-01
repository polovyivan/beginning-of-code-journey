package ivan.polovyi.PriceCheckerScreen.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ivan.polovyi.PriceCheckerScreen.MainPriceChecker;
import ivan.polovyi.PriceCheckerScreen.model.ProductBean;
import ivan.polovyi.PriceCheckerScreen.model.animation.TextIncrementTransition;
import ivan.polovyi.PriceCheckerScreen.model.animation.TextTypingTransition;
import ivan.polovyi.PriceCheckerScreen.view.SceneFactory;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class ResultSceneController implements Initializable {

	private static ProductBean product;
	int countDown = 15;

	@FXML
	private AnchorPane apResultScene;

	@FXML
	private GridPane gPaneResultScene;

	@FXML
	private Label lblStickerPrice;

	@FXML
	private Label lblPriceplus1;

	@FXML
	private Label lblPricePlus2;

	@FXML
	private Label lblStickerPriceValue;

	@FXML
	private Label lblStickerPricePlus1Value;

	@FXML
	private Label lblStickerPricePlus2Value;

	@FXML
	private Label lblProductName;

	@FXML
	private ProgressBar resScenePB;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// transit text size from 10 to 100 during 5 seconds
		try {
			animation();
		} catch (Exception e) {
			e.getStackTrace();
			e.printStackTrace();
			System.out.println(e.toString());
		}

	}

	private void animation() {
		// transition type product name

		PauseTransition pt1 = new PauseTransition(Duration.millis(1000));
		PauseTransition pt2 = new PauseTransition(Duration.millis(6000));
		TextTypingTransition prodNametr = new TextTypingTransition(lblProductName, product.getName(),
				Duration.millis(400));
		// transition type product name

		TextTypingTransition typeLabel1 = new TextTypingTransition(lblStickerPrice, "PREÇO DE ETIQUETA",
				Duration.millis(400));
		TextTypingTransition typelblStickerPriceValue = new TextTypingTransition(lblStickerPriceValue,
				product.getStickerPrice().toString(), Duration.millis(500));
		// second row

		TextTypingTransition typeLabel3 = new TextTypingTransition(lblPricePlus2, "PREÇO DE ETIQUETA + 25%",
				Duration.millis(400));

		TextIncrementTransition tickerPricePlus2Value = new TextIncrementTransition(lblStickerPricePlus2Value,
				product.getStickerPrice(), product.getStickerPricePlus25(), Duration.millis(400));

		SequentialTransition seqT = new SequentialTransition(prodNametr, typeLabel1, typelblStickerPriceValue,
				typeLabel3, tickerPricePlus2Value);
		seqT.play();
		seqT.setOnFinished(e -> {
			resScenePB.setVisible(true);
			Task<Void> task = new Task<Void>() {

				@Override
				protected Void call() throws Exception {
					int max = 100;
					for (int i = max; i >= 0; i--) {
						updateProgress(i, max);
						Thread.sleep(35);
					}

					return null;
				}

			};
			resScenePB.progressProperty().bind(task.progressProperty());
			new Thread(task).start();

			task.setOnSucceeded(event -> {
				sceneTransition();
			});
			;

		});
	}

	private void sceneTransition() {
		MainPriceChecker.getSt().setScene(new SceneFactory().createScanScene());
		MainPriceChecker.getSt().setFullScreen(true);
		MainPriceChecker.getSt().setAlwaysOnTop(true);

	}

	public ProductBean getProduct() {
		return product;
	}

	public static void setProduct(ProductBean product) {
		ResultSceneController.product = product;
	}
}
