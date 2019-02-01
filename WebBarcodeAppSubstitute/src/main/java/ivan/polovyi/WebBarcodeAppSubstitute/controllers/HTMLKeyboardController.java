package ivan.polovyi.WebBarcodeAppSubstitute.controllers;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;

public class HTMLKeyboardController {

	private WebEngine we;

	public HTMLKeyboardController(WebEngine we) {

		this.we = we;
	}

	public void keyBoard(KeyEvent ke) {

		if (ke.getCode().isLetterKey()) {

			executeJavaScript("$('#input_search').html($('#input_search').html() + '" + ke.getCode() + "');");

		} else if (ke.getCode().isDigitKey()) {
			String inputNumber = ke.getCode().toString().replaceAll("[a-zA-Z]", "");
			executeJavaScript("$('#input_search').html($('#input_search').html() + '" + inputNumber + "');");

		} else if (ke.getCode() == KeyCode.SPACE) {

			executeJavaScript("$('#input_search').html($('#input_search').html() + ' ');");

		} else if (ke.getCode() == KeyCode.ENTER) {
			executeJavaScript("document.getElementsByClassName('results')[0].click()");

		} else if (ke.getCode() == KeyCode.DELETE) {
			executeJavaScript(
					"$('#input_search').html($('#input_search').html().substring(0, ($('#input_search').html().length > 0 ? $('#input_search').html().length - 1 : 0)));");

		} else if (ke.getCode() == KeyCode.STAR) {
			executeJavaScript("$('#input_search').html($('#input_search').html() + '*');");

		}
		executeJavaScript(" search(module, 0, 'results', $(\"#input_search\").html().split('</div>')[1]);");

		return;
	}

	private void executeJavaScript(String script) {
		try {
			we.executeScript(script);
		} catch (Exception e) {
			e.getStackTrace();
			// when TypeError: undefined is not an object
		}

	}

	public WebEngine getWe() {
		return we;
	}

	public void setWe(WebEngine we) {
		this.we = we;
	}
}
