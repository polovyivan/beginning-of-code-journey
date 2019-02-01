package ivan.polovyi.WebBarcodeAppSubstitute.controllers;

import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.events.EventTarget;

import ivan.polovyi.WebBarcodeAppSubstitute.model.beans.ChecklistBean;
import ivan.polovyi.WebBarcodeAppSubstitute.model.checklist.CheckList;
import ivan.polovyi.WebBarcodeAppSubstitute.model.checklist.PageContentHTML;
import ivan.polovyi.WebBarcodeAppSubstitute.model.printutilities.FileToPrint;
import ivan.polovyi.WebBarcodeAppSubstitute.model.printutilities.PrinterPC;
import ivan.polovyi.WebBarcodeAppSubstitute.model.printutilities.PrinterToFile;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebView;
import javafx.util.Duration;

public class Controller implements Initializable {

	@FXML
	private AnchorPane aPane;

	@FXML
	private TextField ipodTextField;

	@FXML
	private WebView iPodWeb;

	@FXML
	private HBox hBoxBtn;

	@FXML
	private Button btnScanTab;

	@FXML
	private Button btnLogout;

	@FXML
	private Button btnPrintScreen;

	@FXML
	private AnchorPane apPrint;

	@FXML
	private Button btnPrintOrder;

	@FXML
	private ProgressBar pbMain;

	@FXML
	private ProgressIndicator pIndPrint;
	@FXML
	private AnchorPane aPUnknownProd;

	@FXML
	private TextArea tAUnknownProd;

	@FXML
	private Button btnPrintUnknownProd;

	@FXML
	private Button btnCloseunknownAP;

	@FXML
	private Button btnUnknownProd;

	final String iPodURL = "http://example.com";
	private ArrayList<String> unknownProducts = new ArrayList<String>();
	private String invoiceNumber;
	private String html;
	private String searchlink;
	private String invoiceHtml;
	private String orderNumber;
	private String customerName;
	private int occurance = 0;
	private int occuranceTotal = 0;
	private String checkHtml;

	@FXML
	void closeunknownAP(ActionEvent event) {
		aPUnknownProd.setVisible(false);
	}

	@FXML
	void printUnknownProd(ActionEvent event) {
		String filePath = "C:\\ColetaiPod\\Lotes não encontrados.txt";
		String toPrint = StringUtils.substringBetween(checkHtml, "\"/customer/index/index/\">", "</a>") + "n/"
				+ tAUnknownProd.getText();

		PrinterToFile ptf = new PrinterToFile(filePath, toPrint);
		ptf.printToTXTFile();

		PrinterPC printer = new PrinterPC();
		printer.print(filePath);
		unknownProducts.clear();
		iPodWeb.getEngine().load(iPodURL + "customer/select/invoice/");
	}

	@FXML
	void uncnownProdPanel(ActionEvent event) {
		aPUnknownProd.setVisible(true);

		ArrayList<String> unknownProductsLots = new ArrayList<String>();

		unknownProductsProcessor();

		for (String string : unknownProducts) {
			unknownProductsLots.add(StringUtils.substringAfter(string, "\"details\">"));

		}

		Map<String, Long> counts = unknownProductsLots.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		StringBuilder str = new StringBuilder();
		for (String key : counts.keySet()) {
			str.append(key).append("=").append(counts.get(key)).append("\n");
		}

		tAUnknownProd.setText(str.toString());

	}

	@FXML
	void logOut(ActionEvent event) {
		iPodWeb.getEngine().load(iPodURL + "login/index/logout/");
		conditions();
	}

	@FXML
	void returnToScanTab(ActionEvent event) {
		iPodWeb.getEngine().load(iPodURL + "scan/index/index/");
	}

	@FXML
	void printScreen(ActionEvent event) {

		iPodWeb.getEngine().load(iPodURL + "customer/select/invoice/");
		btnPrintOrder.setText("Escolhe o pedido");

	}

	@FXML
	void scanInput(ActionEvent event) {

		if (ipodTextField.getText().startsWith("L0")) {
			actionOnBarcodeScan(ipodTextField.getText());
			apFormat("green");
		} else if (ipodTextField.getText().length() == 6) {
			actionLotTypeIn(ipodTextField.getText());
			apFormat("green");
		} else {
			apFormat("red");
		}
		ipodTextField.clear();
		iPodWeb.getEngine().executeScript("window.scrollTo(0, document.body.scrollHeight);");
		checkHtml = (String) iPodWeb.getEngine().executeScript("document.documentElement.innerHTML");
		setOccurance(StringUtils.countMatches(checkHtml, "scan_entry processed error"));

		System.out.println(checkHtml);

		if (occuranceTotal < occurance) {
			setOccuranceTotal(occurance);
			Toolkit.getDefaultToolkit().beep();
		}

		unknownProductsProcessor();

	}

	private void unknownProductsProcessor() {
		checkHtml = (String) iPodWeb.getEngine().executeScript("document.documentElement.innerHTML");
		if (checkHtml.contains("div onclick=")) {

			String[] lineSeparator = checkHtml.toString().split("div onclick=");

			for (String line : lineSeparator) {

				if (line.contains("Lote não encontrado")
						&& !unknownProducts.contains(StringUtils.substringBetween(line, "id=", "</span>"))) {

					unknownProducts.add(StringUtils.substringBetween(line, "id=", "</span>"));

				}

			}

		}

		System.out.println("unknownProducts" + unknownProducts);
		conditions();
	}

	private void actionOnBarcodeScan(String input) {

		iPodWeb.getEngine()
				.executeScript("queueScanEntry('/scan/index/index/barcode/" + input + "/scanner/true', '...');");

	}

	private void actionLotTypeIn(String input) {

		iPodWeb.getEngine().load(iPodURL + "scan/index/index/STI_ID/" + input + "/");

	}

	@FXML
	void printIndicatedOrder(ActionEvent event) {

		if (!btnPrintOrder.getText().equals("Escolhe o pedido para imprimir")) {

			try {
				checklistPrepareAndPrint();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		HTMLKeyboardController keyBoard = new HTMLKeyboardController(iPodWeb.getEngine());
		ipodTextField.requestFocus();
		iPodWeb.setZoom(1.5);

		pbMain.progressProperty().bind(iPodWeb.getEngine().getLoadWorker().progressProperty());
		pbMain.visibleProperty().bind(iPodWeb.getEngine().getLoadWorker().runningProperty());

		iPodWeb.getEngine().load(iPodURL + "login/index/index/");

		iPodWeb.getEngine().getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {

			if (newValue == Worker.State.SUCCEEDED) {
				html = (String) iPodWeb.getEngine().executeScript("document.documentElement.outerHTML");
				conditions();
				hoverOveraction();

			}

		});
		// text field focus
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				ipodTextField.requestFocus();
			}
		});
//keyboard event
		iPodWeb.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {

				if (iPodWeb.getEngine().getLocation().contains("product/index/index/")
						|| iPodWeb.getEngine().getLocation().contains("customer/index/index/"))

				{
//call keyboard controller
					keyBoard.keyBoard(ke);

				}

			}

		});

	}

	private void conditions() {
		// unknown product panel button
		if (!unknownProducts.isEmpty()) {
			btnUnknownProd.setVisible(true);
		} else {
			btnUnknownProd.setVisible(false);
		}

		// drop unknown product counter
		if (!iPodWeb.getEngine().getLocation().equals(iPodURL + "scan/index/index/")) {
			setOccuranceTotal(0);
		}
		// on scan tab
		if (iPodWeb.getEngine().getLocation().contains("scan")) {
			btnPrintScreen.setVisible(true);
			ipodTextField.setVisible(true);
			btnScanTab.setVisible(false);
			apPrint.setVisible(false);
		}
		// on customer tab
		else if (iPodWeb.getEngine().getLocation().contains("customer/select/invoice/")) {
			apPrint.setVisible(true);
			btnPrintScreen.setVisible(false);
			// on login screen
		} else if (iPodWeb.getEngine().getLocation().contains("login")) {
			hBoxBtn.setVisible(false);
			apPrint.setVisible(false);
			btnPrintScreen.setVisible(false);
			ipodTextField.setVisible(false);
		} else {
			btnScanTab.setVisible(true);
			hBoxBtn.setVisible(true);
			apPrint.setVisible(false);
			ipodTextField.setVisible(false);
		}

		if (html.contains("\"userMessage\":\"Klik om te prijzen\"") || html.contains("sem estoque")) {
			iPodWeb.getEngine().load(iPodURL + "scan/index/index/");
		}
	}

	private void hoverOveraction() {
		EventListener mouseOverEventListener = new EventListener() {
			@Override
			public void handleEvent(Event ev) {
				String href = ((Element) ev.getTarget()).getAttribute("href");
				String orderTag = ((Element) ev.getTarget()).getTextContent();

				System.out.println(href);
				System.out.println(orderTag);
				setCustomerName(StringUtils.substringBetween(html, "<h2>", "</2>"));
				setInvoiceNumber(StringUtils.substringBetween(href, "/INV_ID/", "/"));
				if (StringUtils.substringBetween(orderTag, "(", ")") != null) {
					orderNumber = StringUtils.substringBetween(orderTag, "(", ")");
					btnPrintOrder.setText("Imprimir pedido " + orderNumber);

				}
			}
		};

		Document document = iPodWeb.getEngine().getDocument();
		NodeList nodeList = document.getElementsByTagName("a");
		for (int i = 0; i < nodeList.getLength(); i++) {
			((EventTarget) nodeList.item(i)).addEventListener("mouseover", mouseOverEventListener, false);

		}

	}

	private void apFormat(String changingColor) {
		String changingStyle = "-fx-background-color:" + changingColor + ";";
		String defoultStyle = "-fx-background-color:#f0f0f0;";
		aPane.setStyle(changingStyle);
		PauseTransition delay = new PauseTransition(Duration.seconds(0.2));
		delay.setOnFinished(event -> {
			aPane.setStyle(defoultStyle);
		});
		delay.play();

	}

	private void checklistPrepareAndPrint() throws InterruptedException {
		Task<Void> task = new Task<Void>() {
			public Void call() throws Exception {
				pIndPrint.setVisible(true);
				updateProgress(1, 100);

				try {

					updateProgress(20, 100);

					// mark as printed
					searchlink = "https://850153b.freshportal.com.br/packing_list/print/index/INV_ID/" + invoiceNumber
							+ "/";
					htmlContent(searchlink);
					updateProgress(40, 100);

					// get invoice html to

					searchlink = "https://850153b.freshportal.com.br/invoice/invoice/details/INV_ID/" + invoiceNumber
							+ "/";
					setInvoiceHtml(htmlContent(searchlink));
					updateProgress(50, 100);

					// Create CheckList Object from invoice HTML
					ChecklistBean checkList = CheckList.createChecklistfromHTML(invoiceHtml);

					// complete checklist Information from order
					updateProgress(60, 100);

					System.out.println(invoiceNumber + " " + orderNumber);
					checkList.setCheckListId(invoiceNumber);
					checkList.setOrderNumber(orderNumber);

					// create content to print
					String contentToPrint = FileToPrint.createContentfromHTML(checkList);
					updateProgress(70, 100);

					// print to file

					String filePath = "C:\\ColetaiPod\\CUPOM#" + invoiceNumber + ".txt";

					PrinterToFile printToFile = new PrinterToFile(filePath, contentToPrint);
					printToFile.printToTXTFile();
					updateProgress(80, 100);

					// print it on a printer
					PrinterPC printer = new PrinterPC();

					printer.print(filePath);
					printer.print(filePath);
					updateProgress(100, 100);
					pIndPrint.setVisible(false);

				} catch (Exception e) {
					e.getStackTrace();
					System.out.println(e.toString());
					Platform.runLater(() -> {
						btnPrintOrder.setText("Aconteceu um erro..");
						pIndPrint.setVisible(false);
					});

				}
				return null;
			}
		};
		pIndPrint.progressProperty().bind(task.progressProperty());
		Thread t = new Thread(task);
		t.start();

	}

	private String htmlContent(String searchlink) {
		String htmlContent = null;
		try {
			htmlContent = PageContentHTML.retriveHTML(searchlink, "ERPusername", "ERPuserpassword");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//if an error happened on retrieving html content
		if (htmlContent.contains("Failed") || htmlContent.contains("Error") || htmlContent.isEmpty()
				|| htmlContent == null) {
			Platform.runLater(() -> {
				btnPrintOrder.setText("Aconteceu um erro.");
				pIndPrint.setVisible(false);
			});

		}

		return htmlContent;

	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getInvoiceHtml() {
		return invoiceHtml;
	}

	public void setInvoiceHtml(String invoiceHtml) {
		this.invoiceHtml = invoiceHtml;
	}

	public int getOccurance() {
		return occurance;
	}

	public void setOccurance(int occurance) {
		this.occurance = occurance;
	}

	public int getOccuranceTotal() {
		return occuranceTotal;
	}

	public void setOccuranceTotal(int occuranceTotal) {
		this.occuranceTotal = occuranceTotal;
	}

	public ArrayList<String> getUnknownProducts() {
		return unknownProducts;
	}

	public void setUnknownProducts(ArrayList<String> unknownProducts) {
		this.unknownProducts = unknownProducts;
	}

}
