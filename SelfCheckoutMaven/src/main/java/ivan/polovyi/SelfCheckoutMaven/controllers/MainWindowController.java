package ivan.polovyi.SelfCheckoutMaven.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.lang3.StringUtils;

import com.jfoenix.controls.JFXProgressBar;

import ivan.polovyi.SelfCheckoutMaven.MainSelfCheckout;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.CustomerBean;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.ProductBean;
import ivan.polovyi.SelfCheckoutMaven.dao.HTTPConnFactory;
import ivan.polovyi.SelfCheckoutMaven.dao.ProductFromHTML;
import ivan.polovyi.SelfCheckoutMaven.view.ViewFactory;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebView;
import javafx.util.Duration;

public class MainWindowController implements Initializable {

	@FXML
	private AnchorPane mainWindowAP;

	@FXML
	private WebView weShopingCart;

	@FXML
	private Rectangle rctlMainTop;

	@FXML
	private Button btnCompleteOrder;

	@FXML
	private Tooltip ttpBtnSubmit;

	@FXML
	private Button btnDeletAll;

	@FXML
	private Tooltip ttpBtnDelletAll;

	@FXML
	private Button btnLogOut;

	@FXML
	private Tooltip ttpBtnSair;

	@FXML
	private Label lblHelp;

	@FXML
	private Label lblProdCod;

	@FXML
	private TextField mainWindowTextField;

	@FXML
	private Rectangle rctMainMidle;

	@FXML
	private JFXProgressBar fxLoadProgress;

	@FXML
	private GridPane gPProductInfoPanel;

	@FXML
	private ImageView imgViewProd;

	@FXML
	private Label lblProdName;

	@FXML
	private Label lblPrice;

	@FXML
	private Label labAvalibale;

	@FXML
	private Label lblProductLot;

	@FXML
	private Label mainWindowLable;

	@FXML
	private Rectangle rctShoppingcartRight;

	@FXML
	private Rectangle rectButom;

	@FXML
	private Label lblShoppingCart;

	@FXML
	private AnchorPane aPFAQ;

	@FXML
	private GridPane gPHelp;

	@FXML
	private Label lbl1;

	@FXML
	private Label lbl11;

	@FXML
	private Label lbl2;

	@FXML
	private Label lbl22;

	@FXML
	private Label lbl3;

	@FXML
	private Label lbl33;

	@FXML
	private Label lbl4;

	@FXML
	private Label lbl44;

	@FXML
	private Label lbl5;

	@FXML
	private Label lbl6;

	@FXML
	private Label lbl66;

	@FXML
	private Label lbl7;

	@FXML
	private Label lbl77;

	@FXML
	private Label lbl8;

	@FXML
	private Label lbl88;

	@FXML
	private Label lblLoadMess;

	private String lotNumber;

	private ProductBean product;

	private static CustomerBean customer;

	@FXML
	void helpEnter(MouseEvent event) {
		aPFAQ.setVisible(true);

	}

	@FXML
	void helpExit(MouseEvent event) {
		aPFAQ.setVisible(false);
	}

	@FXML
	void logOut(ActionEvent event) {
		mainWindowLable.setText("Saindo do sistema");
		weShopingCart.getEngine().load("http://www.example.com/pt/login/logout/index/");
		MainSelfCheckout.getSt().setScene(new ViewFactory().createLoginScene());
		MainSelfCheckout.getSt().setFullScreen(true);
		MainSelfCheckout.getSt().setAlwaysOnTop(true);
	}

	@FXML
	void completOrder(ActionEvent event) {
		mainWindowLable.setText("Finalizando seu pedido...");
		weShopingCart.getEngine().load("http://www.example.com/pt/order/confirm/index/");
		btnDeletAll.setVisible(false);
		btnCompleteOrder.setVisible(false);
		btnLogOut.setVisible(false);
	}

	@FXML
	void deleteAll(ActionEvent event) {
		weShopingCart.getEngine().load("http://www.example.com/pt/order/order_item/deleteAll/");

	}

	@FXML
	void getLot(ActionEvent event) throws InterruptedException {

		lotNumber = mainWindowTextField.getText();

		String urlProduct = null;
		// input validation
		if (lotNumber.isEmpty()) {
			mainWindowLable.setVisible(true);
			mainWindowLable.setText("Insira o código");
			lableClean(mainWindowLable);

		} else if (lotNumber.startsWith("L0") && lotNumber.length() == 8) {
			urlProduct = actionOnBarcodeScan();
			actionMain(urlProduct);
		} else if (lotNumber.matches("[0-9]+") && lotNumber.length() == 6) {
			urlProduct = actionOnLotNumberTyping();
			actionMain(urlProduct);
		} else {
			mainWindowLable.setVisible(true);
			mainWindowLable.setText("O código está errado");
			lableClean(mainWindowLable);

		}
		mainWindowTextField.selectAll();
		mainWindowTextField.clear();
	}

	private void actionMain(String urlProduct) {
		String productHTML = null;

		System.out.println(urlProduct);

		if (!urlProduct.contains("null")) {
			productHTML = HTTPConnFactory.getHTTPconection(urlProduct, customer.getWsUserName(),
					customer.getWsPassword());

			product = new ProductFromHTML(productHTML).createProductfromWebShopHTML();
			setPurchasePanel(product);

			try {
				addToShoppingCart();

			} catch (Exception e) {

				e.printStackTrace();
			}

		} else {
			mainWindowLable.setVisible(true);
			mainWindowLable.setText("Produto não existe");
			lableClean(mainWindowLable);
		}

	}

	private String actionOnLotNumberTyping() {

		String urlProduct = "http://www.example.com/pt/product/details/index/STI_ID/" + lotNumber + "/WPA_ID/";

		return urlProduct;
	}

	private String actionOnBarcodeScan() throws InterruptedException {

		String loginURL = "https://example1.com/login/index/index/";
		String urlWithSTIID = "https://example1.com/stock/stock_item/index/STE_ID/"
				+ StringUtils.substringAfter(lotNumber, "L0") + "/";

		String pageHTML = HTTPConnFactory.getHTTPconectionWithCookies(loginURL, urlWithSTIID);

		lotNumber = StringUtils.substringBetween(pageHTML, "STI_ID/", "/");

		String urlProduct = "http://www.example1.com/pt/product/details/index/STI_ID/" + lotNumber + "/WPA_ID/";

		return urlProduct;
	}

	private void addToShoppingCart() throws Exception {
		String responce = null;
		String urlAddToSCard = "http://www.example1.com/order/ajax/add/STI_ID/" + product.getProductLot()
				+ "/quantity/" + 1 + "/quantity_per_pack/" + product.getProductSalesUnit() + "/";

		responce = HTTPConnFactory.getHTTPconection(urlAddToSCard, customer.getWsUserName(), customer.getWsPassword());
		System.out.println("responce" + responce);

		if (responce.contains("Connection error") || responce.contains("suficiente do produto dispon")) {
			mainWindowLable.setVisible(true);
			mainWindowLable.setText("Produto sem estoque. Por favor, realize o checkout de todos os outros produtos,"
					+ " \n         e entregue o cupom gerado e produtos ao conferente");
			lableClean(mainWindowLable);
		} else {
			weShopingCart.getEngine().load("http://www.example.com/order/index/index/");

		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		java.net.CookieHandler.getDefault();

		weShopingCart.getEngine().load("http://www.example.com/order/index/index/");

		weShopingCart.getEngine().getLoadWorker().stateProperty()
				.addListener((observableSC, oldValueSC, newValueSC) -> {
					fxLoadProgress.progressProperty()
							.bind(weShopingCart.getEngine().getLoadWorker().progressProperty());
					fxLoadProgress.visibleProperty().bind(weShopingCart.getEngine().getLoadWorker().runningProperty());
					if (newValueSC == Worker.State.SUCCEEDED) {

						String htmlShopingCart = (String) weShopingCart.getEngine()
								.executeScript("document.documentElement.outerHTML");

						if (htmlShopingCart.contains("Enviar pedido")) {
							// shoppimgCart has something
							btnDeletAll.setVisible(true);
							btnCompleteOrder.setVisible(true);
							btnLogOut.setVisible(true);

						} else if (weShopingCart.getEngine().getLocation().contains("WEO_ID")
								&& htmlShopingCart.contains("Histórico de pedidos")) {

							// confirmation page opened
							ResultController.setOrderLink(weShopingCart.getEngine().getLocation());
							MainSelfCheckout.getSt().setScene(new ViewFactory().createResultScene());
							MainSelfCheckout.getSt().setFullScreen(true);
							MainSelfCheckout.getSt().setAlwaysOnTop(true);

						} else if (!htmlShopingCart.contains("Seu pedido")) {
							// if page is another then shopping cart
							weShopingCart.getEngine().load("http://www.example.com/order/index/index/");
							btnLogOut.setVisible(false);
						}

				else {
							btnDeletAll.setVisible(false);
							btnCompleteOrder.setVisible(false);
						}
						lblLoadMess.setVisible(false);
					} else {

						lblLoadMess.setVisible(true);

					}

				});
// text field focus
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				mainWindowTextField.requestFocus();
			}
		});

	}

	// set product info on the panel
	private void setPurchasePanel(ProductBean product) {
		if (product.getProductPictureLink() != null || !product.getProductPictureLink().isEmpty()) {
			imgViewProd.setImage(new Image(product.getProductPictureLink()));
		}

		lblProdName.setText(product.getProductName());

		if (product.getProductLot() != null) {
			lblProductLot.setText("Lote: " + product.getProductLot());
		}

		if (product.getProductPrice() != null) {
			lblPrice.setText("Preço: R$ " + product.getProductPrice());
		}
	}

	private void lableClean(Label lable) {

		PauseTransition delay = new PauseTransition(Duration.seconds(4));
		delay.setOnFinished(event -> {
			lable.setVisible(false);
			lable.setText("");

		});
		delay.play();

	}

	public static CustomerBean getCustomer() {
		return customer;
	}

	public static void setCustomer(CustomerBean customer) {
		MainWindowController.customer = customer;
	}

}
