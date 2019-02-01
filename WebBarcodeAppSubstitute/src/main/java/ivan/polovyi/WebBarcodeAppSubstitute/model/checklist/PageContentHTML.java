package ivan.polovyi.WebBarcodeAppSubstitute.model.checklist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class PageContentHTML {

	// Variables to hold the URL object and its connection to that URL.
	private static URL URLObj;
	private static URLConnection connect;

	public static String retriveHTML(String urlLinkToGetText, String username, String password)
			throws InterruptedException {
		System.out.println("Requesting page source from ...");
		System.out.println(urlLinkToGetText);
		StringBuilder sb = new StringBuilder();
		String pageHTML = "";
		try {
			// Establish a URL and open a connection to it. Set it to output mode.
			URLObj = new URL(urlLinkToGetText);
			connect = URLObj.openConnection();
			connect.setDoOutput(true);
		} catch (MalformedURLException ex) {
			pageHTML = "Failed";
		} catch (Exception ex) {
			System.out.println("An exception occurred. " + ex.getMessage());
			pageHTML = "Failed";
		}

		try {
			// Create a buffered writer to the URLConnection's output stream and write our
			// forms parameters.
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream()));

			writer.write("USE_Username=" + username + "&USE_Password=" + password + "&submit=Login");
			writer.close();

			// Now establish a buffered reader to read the URLConnection's input stream.
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(connect.getInputStream(), StandardCharsets.UTF_8));

			String lineRead = "";

			// Read all available lines of data from the URL and print them to screen.
			while ((lineRead = reader.readLine()) != null) {
				sb.append(lineRead);
			}

			reader.close();

			pageHTML = sb.toString();
		} catch (Exception ex) {
			System.out.println("There was an error reading or writing to the URL: " + ex.getMessage());

			pageHTML = "Failed";

		}

		return pageHTML;
	}

}
