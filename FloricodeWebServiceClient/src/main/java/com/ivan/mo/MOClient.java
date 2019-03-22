package com.ivan.mo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import nl.match_online.webservice.customer.v0p7.CommercialCustomer;

public class MOClient {

	private static String user;
	private static String password;

	public MOClient(String user, String password) {

		MOClient.user = user;
		MOClient.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		MOClient.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		MOClient.password = password;
	}

	private static final String WEBSERVICE_NAME = "XXXXXXXXXXXXXustomers";
	private static final String WEBSERVICE_URL = "http://webservice.xxxxx-xxxxxx.nl/Customer/v0p7";
	private static final String WEBSERVICE_WSDL_URL = "http://web11.veilingholambra.xxxxx-xxxxxx.nl/Webservice/CCVMP/v0p7/Customer.asmx?wsdl";

	public CommercialCustomer wsClient() throws MalformedURLException, InterruptedException {

		// settings to display request/response detail
		systemSetingsProperty();

		// authentication to WebService
		authentication();

		// create a service
		CommercialCustomer moWebServiceClient = startService();

		return moWebServiceClient;

	}

	private static void systemSetingsProperty() {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "9999");

	}

	private static CommercialCustomer startService() {
		URL url = null;
		try {
			url = new URL(WEBSERVICE_WSDL_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName qname = new QName(WEBSERVICE_URL, WEBSERVICE_NAME);

		Service service = Service.create(url, qname);

		return service.getPort(CommercialCustomer.class);

	}

	private static void authentication() {

		java.net.Authenticator.setDefault(new java.net.Authenticator() {
			@Override
			protected java.net.PasswordAuthentication getPasswordAuthentication() {
				return new java.net.PasswordAuthentication(user, password.toCharArray());
			}
		});

	}

}
