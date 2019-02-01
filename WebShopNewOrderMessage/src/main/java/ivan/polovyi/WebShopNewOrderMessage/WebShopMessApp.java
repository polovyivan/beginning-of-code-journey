package ivan.polovyi.WebShopNewOrderMessage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import ivan.polovyi.WebShopNewOrderMessage.utilities.LoginAndGetPageContent;
import ivan.polovyi.WebShopNewOrderMessage.utilities.PlaySound;
import ivan.polovyi.WebShopNewOrderMessage.utilities.PrintToFile;

public class WebShopMessApp {

	static String orderNumber;
	static String customer;
	static String print;
	static char orderCharSecond;

	static String urlLinkToCheckLists = "https://example1.com";
	static String linkDirectlyFromGrower = "https://example2.com";

	static String username = "username";
	static String password = "password";

	// file system
	static String directory = "C:\\TELA GF\\Telas\\";

	static String tableFile = directory + "TELAS_HTML\\Tabela.html";
	static String totalFile = directory + "TELAS_HTML\\Total.html";

	static String geckodriverPath = "C:\\geckodriver.exe";
	static String urlLogo = "file:\\\\" + directory + "TELAS_HTML\\holambelo_logo_02.jpg";
	static String soundPath = directory + "TELAS_HTML\\solemn.mp3";

	static String totalFilePath = "file:\\\\" + directory + "TELAS_HTML\\Total.html";
	static String tablePath = "file:\\\\" + directory + "TELAS_HTML\\Tabela.html";
	static String newOrderPath = "file:\\\\" + directory + "TELAS_HTML\\Novo_Pedido.html";

	static StringBuilder sbTotal = new StringBuilder();
	static StringBuilder sbheader = new StringBuilder();
	static StringBuilder sbloop = new StringBuilder();
	static StringBuilder sbfooter = new StringBuilder();
	static StringBuilder sbscreenTotal = new StringBuilder();
	static StringBuilder sbDirectlyfromgrower = new StringBuilder();
	static StringBuilder sbFooterEnd = new StringBuilder();
	static FirefoxDriver resultDriver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", geckodriverPath);
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		FirefoxOptions opt = new FirefoxOptions();
		opt.setProfile(profile);

		resultDriver = new FirefoxDriver(opt);

		for (int j = 1; j >= 1; j++) {

			runProgram();

			TimeUnit.SECONDS.sleep(180);

		}
	}

	private static void runProgram() throws IOException, InterruptedException {

		DirectlyFromGrowerCheck();

		divideCheck();

	}

	private static StringBuilder DirectlyFromGrowerCheck() {
		try {
			String urlLinkToGetText = linkDirectlyFromGrower;
			String resultText = null;

			resultText = LoginAndGetPageContent.retriveHTML(urlLinkToGetText, username, password);

			int occurance = StringUtils.countMatches(resultText, "SOB ENCOMENDA");

			if (occurance > 0) {

				sbDirectlyfromgrower.append(
						"<h3 class=\"directlyFromGrower\">Produtos direto do produtor:" + (occurance / 2) + "</h3>");

			}
		} catch (Exception e) {
			DirectlyFromGrowerCheck();
			e.printStackTrace();
		}

		return sbDirectlyfromgrower;

	}

	private static void divideCheck() throws IOException, InterruptedException {
		try {

			String urlLinkToGetText = urlLinkToCheckLists;
			String resultText = null;

			resultText = LoginAndGetPageContent.retriveHTML(urlLinkToGetText, username, password);

			int quantytyOfOrdersToPrint = 0;
			int quantytyOfOrdersPrinted = 0;

			// get rows from table
			String substringBetween = StringUtils.substringBetween(resultText, "<tbody>", "</table>");

			String[] row = substringBetween.split("</tr>");

			for (String rowText : row) {

				String[] rowInfo = rowText.replaceAll("<td>", "").split("</td>");

				if (rowText.contains("<tr class=\"crud_table_line\"")) {

					String customerName = rowInfo[4];
					customer = customerName.replaceAll("Ã", "&Atilde");

					orderNumber = rowInfo[3];

					print = StringUtils.substringAfter(rowInfo[0], "\">");

				}
				// check if order number has more than 1 char
				if (orderNumber.length() > 1) {
					System.out.println("Incide more than one" + orderNumber.length());
					orderCharSecond = orderNumber.charAt(1);
				}

				// check numbers of printed orders
				if ((((orderNumber.startsWith("W") || orderNumber.startsWith("A") || orderNumber.startsWith("E"))
						&& (Character.isDigit(orderCharSecond) || orderCharSecond == '-'))
						&& print.equals("<img src=\"/images/icons/accept.png\" alt=\"\" />")))

				{

					quantytyOfOrdersPrinted++;

				}

				if ((((orderNumber.startsWith("W") || orderNumber.startsWith("A") || orderNumber.startsWith("E"))
						&& (Character.isDigit(orderCharSecond) || orderCharSecond == '-'))
						&& print.equals("<img src=\"/images/icons/accept_disabled.png\" alt=\"\" />"))) {

					if (orderNumber.startsWith("A")) {

						orderNumber = orderNumber + "   (Oferta)";
					}

					else if (orderNumber.startsWith("E")) {

						orderNumber = orderNumber + "   (Pedido CD)";
					}
					// Loop part

					sbloop.append("<tr>\r\n" + "				<td>" + customer + "</td>\r\n" + "				<td>"
							+ orderNumber + "</td>\r\n" + "			</tr>");

					quantytyOfOrdersToPrint++;

				}

			}

			// Header
			// first line

			sbheader.append("<html>\r\n" + "<head></head>\r\n" + "<body>\r\n" + "	<style>\r\n" + "body, html {\r\n"
					+ "	background-color: white;\r\n" + "}\r\n" + "\r\n" + "h1 {\r\n"
					+ "	font-family: \"Helvetica Neue\", Helvetica, sans-serif;\r\n"
					+ "	font-style: italic, oblique;\r\n" + "	font-size: 380%;\r\n" + "	color: #00000;\r\n"
					+ "	position: relative;\r\n" + "	text-align: center;\r\n" + "	letter-spacing: -2px;\r\n"
					+ "	margin: 1\r\n" + "}\r\n" + "\r\n" + "h2 {\r\n" + "	background-image: .bg;\r\n"
					+ "	font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;;\r\n"
					+ "	font-style: italic, oblique;\r\n" + "	font-size: 300%;\r\n" + "	color: #00000;\r\n"
					+ "	position: relative;\r\n" + "	text-align: center;\r\n" + "	letter-spacing: -2px;\r\n"
					+ "	margin: 1;\r\n" + "}\r\n" + "\r\n" + "h3 {\r\n" + "	background-image: .bg;\r\n"
					+ "	font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;;\r\n"
					+ "	font-style: italic, oblique;\r\n" + "	font-size: 200%;\r\n" + "	color: green;\r\n"
					+ "	position: relative;\r\n" + "	text-align: center;\r\n" + "	letter-spacing: 7px;\r\n"
					+ "	margin: 1;\r\n" + "}\r\n" + "\r\n" + ".directlyFromGrower {\r\n"
					+ "    animation:blinkingText 3s infinite;\r\n" + "}\r\n" + "@keyframes blinkingText{\r\n"
					+ "    0%{     color: green;    }\r\n" + "    49%{    color: transparent; }\r\n"
					+ "    50%{    color: transparent; }\r\n" + "    99%{    color:transparent;  }\r\n"
					+ "    100%{   color: green;    }\r\n" + "}\r\n" + "hr {\r\n" + "	margin-top: auto;\r\n"
					+ "	margin-bottom: auto;\r\n" + "	margin-left: auto;\r\n" + "	margin-right: auto;\r\n"
					+ "	height: 4px;\r\n" + "	width: 97%;\r\n" + "	background-color: FFA500;\r\n"
					+ "	margin: 18\r\n" + "}\r\n" + "\r\n" + "table {\r\n" + "	border-collapse: collapse;\r\n"
					+ "	width: 95%;\r\n" + "	font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;;\r\n"
					+ "	font-style: italic;\r\n" + "	font-size: 150%;\r\n" + "	position: absolute;\r\n"
					+ "	top: 200px;\r\n" + "}\r\n" + "\r\n" + "th, td {\r\n" + "	padding: 8px;\r\n"
					+ "	text-align: Center;\r\n" + "}\r\n" + "\r\n" + "th {\r\n" + "	padding: 8px;\r\n"
					+ "	text-align: Center;\r\n" + "}\r\n" + "\r\n" + ".center {\r\n" + "	display: block;\r\n"
					+ "	margin-left: auto;\r\n" + "	margin-right: auto;\r\n" + "	position: relative;\r\n"
					+ "	bottom: -390;\r\n" + "	vertical-align: middle;\r\n" + "}\r\n" + "</style>\r\n" + "<body>\r\n"
					+ "\r\n" + "	<table>\r\n" + "\r\n" + "		<tr>\r\n"
					+ "			<th>NOME DO CLIENTE</th>\r\n" + "			<th># DO PEDIDO</th>\r\n"
					+ "		</tr>\r\n" + "		<tr>");

			// footer
			sbfooter.append("</table>");

			sbfooter.append("</body>\r\n" + "<div class=\"bg\"></div>\r\n" + "<div class=\"total\">\r\n"
					+ "	<h1>Total de Pedidos:" + (quantytyOfOrdersPrinted + quantytyOfOrdersToPrint) + "</h1>\r\n"
					+ "</div>\r\n" + "<div class=\"toPrint\">\r\n" + "	\r\n" + "	\r\n"
					+ "	<h2>Pedidos para Separa&ccedil&atildeo:" + quantytyOfOrdersToPrint + "</h2>\r\n" + "</div>\r\n"
					+ "");

			sbFooterEnd.append("<div class=\"hr\">\r\n" + "	<hr>\r\n" + "</div>\r\n" + "<div class=\"table\"></div>\r\n"
					+ "<img SRC=\"" + urlLogo + "\"\r\n" + "	WIDTH=300 HEIGHT=150 class=\"center\">\r\n" + "\r\n"
					+ "</html>");

			// Screen total

			sbscreenTotal.append("<html>\r\n" + "<head></head>\r\n" + "<body>\r\n" + "	<script>\r\n"
					+ "		function startTime() {\r\n" + "			var today = new Date();\r\n"
					+ "			var h = today.getHours();\r\n" + "			var m = today.getMinutes();\r\n"
					+ "			var s = today.getSeconds();\r\n" + "			m = checkTime(m);\r\n"
					+ "			s = checkTime(s);\r\n"
					+ "			document.getElementById('txt').innerHTML = h + \":\" + m + \":\" + s;\r\n"
					+ "			var t = setTimeout(startTime, 500);\r\n" + "		}\r\n"
					+ "		function checkTime(i) {\r\n" + "			if (i < 10) {\r\n"
					+ "				i = \"0\" + i\r\n" + "			}\r\n"
					+ "			; // add zero in front of numbers < 10\r\n" + "			return i;\r\n" + "		}\r\n"
					+ "	</script>\r\n" + "	<style>\r\n" + "body, html {\r\n" + "	background-color: white;\r\n"
					+ "}\r\n" + "#txt {\r\n" + "	font-family: \"Helvetica Neue\", Helvetica, sans-serif;\r\n"
					+ "	font-style: italic, oblique;\r\n" + "	font-size: 10000%;\r\n" + "	color: #00000;\r\n"
					+ "	position: relative;\r\n" + "	text-align: center;\r\n" + "	letter-spacing: 5px;\r\n"
					+ "	bottom: 250;\r\n" + "	color: black;\r\n"
					+ "	font: bold 290px Helvetica, Arial, Sans-Serif;\r\n"
					+ "	text-shadow: 0 1px 0 #ccc, 0 2px 0 #000000, 0 3px 0 #000000, 0 4px 0\r\n"
					+ "		#000000, 0 5px 0 #000000, 0 6px 1px rgba(0, 0, 0, .1), 0 0 5px\r\n"
					+ "		rgba(0, 0, 0, .1), 0 1px 3px rgba(0, 0, 0, .3), 0 3px 5px\r\n"
					+ "		rgba(0, 0, 0, .2), 0 5px 10px rgba(0, 0, 0, .25), 0 10px 10px\r\n"
					+ "		rgba(0, 0, 0, .2), 0 20px 20px rgba(0, 0, 0, .15);\r\n" + "}\r\n" + "h1 {\r\n"
					+ "	font-family: \"Helvetica Neue\", Helvetica, sans-serif;\r\n"
					+ "	font-style: italic, oblique;\r\n" + "	font-size: 300%;\r\n" + "	color: #00000;\r\n"
					+ "	position: relative;\r\n" + "	text-align: center;\r\n" + "	letter-spacing: -2px;\r\n"
					+ "	margin: -5\r\n" + "}\r\n" + ".center {\r\n" + "	display: block;\r\n"
					+ "	margin-left: auto;\r\n" + "	margin-right: auto;\r\n" + "	position: relative;\r\n"
					+ "	bottom: -300;\r\n" + "	vertical-align: middle;\r\n" + "}\r\n" + ".toPrint{\r\n"
					+ "	text-align: center;\r\n" + "	background-image: .bg;\r\n"
					+ "	font-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;;\r\n"
					+ "	font-style: oblique;\r\n" + "	font-size: 460%;\r\n" + "	color: #00000;\r\n"
					+ "	letter-spacing: 5px;\r\n" + "	margin: 50;\r\n" + "}\r\n" + "/* DEMO-SPECIFIC STYLES */\r\n"
					+ ".toPrint h2 {\r\n" + "   font-family: monospace;\r\n"
					+ "  overflow: hidden; /* Ensures the content is not revealed until the animation */\r\n" + "\r\n"
					+ "  white-space: nowrap; /* Keeps the content on a single line */\r\n"
					+ "  margin: 0 auto; /* Gives that scrolling effect as the typing happens */\r\n"
					+ "  letter-spacing: .15em; /* Adjust as needed */\r\n" + "  animation: \r\n"
					+ "    typing 3.5s steps(30, end),\r\n" + "    blink-caret .5s step-end infinite;\r\n" + "}\r\n"
					+ "/* The typing effect */\r\n" + "@keyframes typing {\r\n" + "  from { width: 0 }\r\n"
					+ "  to { width: 100% }\r\n" + "}\r\n" + "/* The typewriter cursor effect */\r\n"
					+ "@keyframes blink-caret {\r\n" + "  from, to { border-color: transparent }\r\n"
					+ "  50% { border-color: orange }\r\n" + "}\r\n" + "</style>\r\n" + "<body>\r\n" + "\r\n"
					+ "</body>\r\n" + "<div class=\"bg\"></div>\r\n" + "<div class=\"total\">\r\n"
					+ "	<h1>Total de Pedidos:" + (quantytyOfOrdersPrinted + quantytyOfOrdersToPrint) + "</h1>\r\n"
					+ "</div>\r\n" + "<div class=\"toPrint\">\r\n" + "	<h2>www.webshop.com</h2>\r\n" + "</div>\r\n"
					+ "\r\n" + "<div class=\"table\"></div>\r\n" + "<img SRC=\"" + urlLogo + "\"\r\n"
					+ "	WIDTH=300 HEIGHT=150 class=\"center\">\r\n" + "<body onload=\"startTime()\">\r\n" + "\r\n"
					+ "	<div id=\"txt\"></div>\r\n" + "</html>\r\n" + "\r\n" + "\r\n" + "");

			if (quantytyOfOrdersToPrint > 0) {

				resultDriver.get(newOrderPath);

				PlaySound.playSound(soundPath);

				if (sbDirectlyfromgrower == null) {
					
					sbTotal.append(
							sbheader.toString() + sbloop.toString() + sbfooter.toString() + sbFooterEnd.toString());

				}

				sbTotal.append(sbheader.toString() + sbloop.toString() + sbfooter.toString()
						+ sbDirectlyfromgrower.toString() + sbFooterEnd.toString());

				PrintToFile.printToFile(tableFile, sbTotal);

				resultDriver.get(tablePath);

			}

			else {

				PrintToFile.printToFile(sbscreenTotal, totalFile);
				resultDriver.get(totalFilePath);
			}

			// flash string builders
			sbheader.setLength(0);
			sbloop.setLength(0);
			sbfooter.setLength(0);
			sbscreenTotal.setLength(0);
			sbDirectlyfromgrower.setLength(0);
			sbFooterEnd.setLength(0);
			sbTotal.setLength(0);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}// divide_Check end

}
