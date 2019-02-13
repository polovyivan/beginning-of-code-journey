package ivan.polovyi.SelfCheckoutMaven.controllers;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.lang3.StringUtils;

import ivan.polovyi.SelfCheckoutMaven.MainSelfCheckout;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.ChecklistBean;
import ivan.polovyi.SelfCheckoutMaven.beanclasses.OrderBean;
import ivan.polovyi.SelfCheckoutMaven.checklist.CheckList;
import ivan.polovyi.SelfCheckoutMaven.checklist.Order;
import ivan.polovyi.SelfCheckoutMaven.dao.HTTPConnFactory;
import ivan.polovyi.SelfCheckoutMaven.printutilities.FileToPrint;
import ivan.polovyi.SelfCheckoutMaven.printutilities.PrinterPC;
import ivan.polovyi.SelfCheckoutMaven.printutilities.PrinterToFile;
import ivan.polovyi.SelfCheckoutMaven.view.ViewFactory;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ResultController implements Initializable {

	int countDown = 10;
	private double progress = 0;
	private OrderBean order;
	private Timeline timeline;
	private static String orderLink;
	private String invoiceHtml;
	private Stage resultStage;
	private String orderId;

	@FXML
	private AnchorPane ApResult;

	@FXML
	private WebView WwResult;

	@FXML
	private VBox vBoxResult;

	@FXML
	private Label lblResult;

	@FXML
	private Label lblResult2;

	@FXML
	private Label lblResult3;

	@FXML
	private Label lblResult4;

	@FXML
	private Label lblResult5;

	@FXML
	private Label lblResult6;

	@FXML
	private Label lblError;
	@FXML
	private Button btnLogOut;
	@FXML
	private ProgressIndicator progInd;

	@FXML
	void logOut(ActionEvent event) {
		logout();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		WwResult.getEngine().load(orderLink);
		System.out.println(orderLink);
		WwResult.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {

			if (WwResult.getEngine().getLocation().equals(orderLink) && newValue == Worker.State.SUCCEEDED) {
				String htmlShopingCart = (String) WwResult.getEngine()
						.executeScript("document.documentElement.outerHTML");

				try {
					checklistPrepareAndPrint(htmlShopingCart);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				WwResult.getEngine().executeScript("window.scrollTo(0, document.body.scrollHeight);");

				if (resultStage != null) {
					resultStage.setMaximized(true);
				}

			}

		});

	}

	// checklist preparation and printing
	private void checklistPrepareAndPrint(String htmlShopingCart) throws InterruptedException {
		Task<Void> task = new Task<Void>() {
			public Void call() throws Exception {
				progInd.setVisible(true);
				updateProgress(1, 100);

				try {

					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date date = new Date();

					// create order from confirmation html page
					order = Order.createOrder(htmlShopingCart);

					// set invoice ID
					String searchlink = "https://www.exampleforgit2.com/transport_list/list/index/?customer_name="
							+ order.getCustomerName()
							+ "&invoice_date_s=&invoice_date_e=&delivery_date_s=&delivery_date_e="
							+ dateFormat.format(date) + "&delivery_date_s=&delivery_date_e=&sequence="
							+ order.getCheckListOrderNumber() + "&filter_submit=Filtro";

					orderId = StringUtils.substringBetween(htmlContent(searchlink), "/INV_ID/", "/");
					updateProgress(20, 100);
					order.setCheckListId(orderId);

					// mark as printed

					searchlink = "https://www.exampleforgit2.com/packing_list/print/index/INV_ID/"
							+ order.getCheckListId() + "/";
					htmlContent(searchlink);
					updateProgress(40, 100);

					// get invoice html to

					searchlink = "https://www.exampleforgit2.com/invoice/invoice/details/INV_ID/"
							+ order.getCheckListId() + "/";

					setInvoiceHtml(htmlContent(searchlink));
					System.out.println(htmlContent(searchlink));

					updateProgress(50, 100);

					// Create CheckList Object from invoice HTML
					ChecklistBean checkList = CheckList.createChecklistfromHTML(invoiceHtml);

					// complete checklist Information from order
					updateProgress(60, 100);
					checkList.setCheckListId(order.getCheckListId());
					checkList.setCustomerName(order.getCustomerName());
					checkList.setOrderNumber(order.getCheckListOrderNumber());

					// create content to print
					String contentToPrint = FileToPrint.createContentfromHTML(checkList);
					updateProgress(70, 100);

					// print to file

					String filePath = "C:\\SelfCheckout\\CUPOM#"
							+ StringUtils.substringBetween(WwResult.getEngine().getLocation(), "/WEO_ID/", "/")
							+ ".txt";
					PrinterToFile printToFile = new PrinterToFile(filePath, contentToPrint);
					printToFile.printToTXTFile();
					updateProgress(80, 100);

					// print it on a printer
					PrinterPC printer = new PrinterPC(filePath);
					printer.print();
					printer.print();
					updateProgress(100, 100);
					progInd.setVisible(false);

					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							timeLineCountDown();

						}
					});

				} catch (Exception e) {
					e.printStackTrace();
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							lblError.setVisible(true);
							lblError.setText("Aconteceu um erro. Leve os produtos para conferente.");
							timeLineCountDown();
						}
					});

				}
				return null;
			}
		};
		progInd.progressProperty().bind(task.progressProperty());
		Thread t = new Thread(task);
		t.start();

	}

	// time coun tdown
	private void timeLineCountDown() {
		lblResult4.setText("Sua sessão expira em");
		lblResult6.setVisible(true);
		timeline = new Timeline(new KeyFrame(Duration.millis(1000),

				ae -> {
					String countdownString = String.valueOf(countDown);
					lblResult5.setText(countdownString);
					countDown--;
					if (countDown == 0) {
						timeline.stop();
						logout();
					}
				}));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	// to get html content from webpage
	private String htmlContent(String searchlink) {
		String htmlContent = null;
		try {
			htmlContent = HTTPConnFactory
					.getHTTPconectionWithCookies("https://www.exampleforgit2.com/login/index/index/", searchlink);
		} catch (Exception e) {
			htmlContent = "Failed";
			e.printStackTrace();
		}
//if an error happened on retrieving html content
		if (htmlContent.contains("Failed") || htmlContent.contains("Error") || htmlContent.isEmpty()
				|| htmlContent == null) {
			Platform.runLater(() -> {
				lblError.setVisible(true);
				lblError.setText("Aconteceu um erro. Leve os produtos para conferente.");
				timeLineCountDown();
			});

		}

		return htmlContent;

	}

//logout
	private void logout() {
		progInd.setVisible(false);
		WwResult.getEngine().load("http://www.exampleforgit.com/pt/login/logout/index/");
		MainSelfCheckout.getSt().setScene(new ViewFactory().createLoginScene());
		MainSelfCheckout.getSt().setFullScreen(true);
		MainSelfCheckout.getSt().setAlwaysOnTop(true);
	}

	public String getOrderLink() {
		return orderLink;
	}

	public static void setOrderLink(String orderLink) {
		ResultController.orderLink = orderLink;
	}

	public String getInvoiceHtml() {
		return invoiceHtml;
	}

	public void setInvoiceHtml(String invoiceHtml) {
		this.invoiceHtml = invoiceHtml;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

}
