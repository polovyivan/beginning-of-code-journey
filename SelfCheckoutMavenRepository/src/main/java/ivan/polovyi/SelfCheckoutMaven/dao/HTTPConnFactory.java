package ivan.polovyi.SelfCheckoutMaven.dao;

public class HTTPConnFactory {
	private final static String USER_NAME = "SelfService";
	private final static String USER_PASSWORD = "gitexamplehttp";

	public static String getHTTPconectionWithCookies(String loginURL, String targetPage) {

		String htmlContent = null;
		try {
			htmlContent = PageHtmlContentfromUrlConnCokies.pageHTMLContent(loginURL, targetPage, USER_NAME,
					USER_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			htmlContent  = "Connection error";
		}

		return htmlContent;
	}

	public static String getHTTPconection(String urlProduct, String userNameCustomer, String passwordCustomer) {

		String htmlContent = null;
		try {
			htmlContent = PageContentFromURL.retriveHTML(urlProduct, userNameCustomer, passwordCustomer);
		} catch (InterruptedException e) {
			e.printStackTrace();
			htmlContent = "Connection error";
		}

		return htmlContent;
	}

}
