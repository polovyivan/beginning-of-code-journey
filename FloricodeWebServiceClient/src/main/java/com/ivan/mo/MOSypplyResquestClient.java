package com.ivan.mo;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;

import com.ivan.mo.dao.DBProducts;
import com.ivan.mo.messages.creators.MOSupplyRequestMessCreator;
import com.ivan.mo.messages.parsers.MOSupplyResponseMessageParser;

import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyRequestMessage;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyResponseMessage;
import nl.match_online.webservice.customer.v0p7.CommercialCustomer;

public class MOSypplyResquestClient {
	private static final String USERNAME = "xxxxxxxxxxxx";
	private static final String PASSWORD = "xxxxxxxxxxxx";

	public static void main(String[] args) {

		MOClient moClient = new MOClient(USERNAME, PASSWORD);
		CommercialCustomer wsClient = null;
		try {
			wsClient = moClient.wsClient();
		} catch (MalformedURLException | InterruptedException e) {
			e.printStackTrace();
		}

		// create supply request message
		MOSupplyRequestMessCreator supplyRequestMessage = new MOSupplyRequestMessCreator(USERNAME, PASSWORD);

		SupplyRequestMessage supplyRequest = supplyRequestMessage.requestMessageCreate();

		// get supply response message
		SupplyResponseMessage supplyResponseMessage = wsClient.getSupply(supplyRequest);

		// parse response message
		MOSupplyResponseMessageParser moResponseMessageParser = new MOSupplyResponseMessageParser();

		// Create list of products
		List<Product> products = moResponseMessageParser.parseSupplyResponseMessage(supplyResponseMessage);

		// Save product list to DB
		DBProducts dbProducts = new DBProducts();
		try {
			dbProducts.executeQueryUpdateData(products);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
