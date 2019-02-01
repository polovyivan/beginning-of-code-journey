package ivan.polovyi.SelfCheckoutMaven.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PageContentFromURL {

	// Variables to hold the URL object and its connection to that URL.
	private static URL URLObj;
	private static URLConnection connect;

	public static String retriveHTML(String urlLinkToGetText, String username, String password)
			throws InterruptedException {

		StringBuilder sb = new StringBuilder();
		String pageHTML = null;
		try {
			// Establish a URL and open a connection to it. Set it to output mode.
			URLObj = new URL(urlLinkToGetText);
			connect = URLObj.openConnection();
			connect.setDoOutput(true);
		} catch (MalformedURLException ex) {
			pageHTML = "Connection error";
		} catch (Exception ex) {
			pageHTML = "Connection error";
		}

		try {
			// Create a buffered writer to the URLConnection's output stream and write our
			// forms parameters.
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream()));

			writer.write("WEU_Username=" + username + "&WEU_Password=" + password + "&submit=Login");
			writer.close();

			// Now establish a buffered reader to read the URLConnection's input stream.
			BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));

			String lineRead = "";

			// Read all available lines of data from the URL and print them to screen.
			while ((lineRead = reader.readLine()) != null) {
				sb.append(lineRead);
			}

			reader.close();

			pageHTML = sb.toString();

		} catch (Exception ex) {
			pageHTML = "Connection error";
		}

		return pageHTML;
	}

}
