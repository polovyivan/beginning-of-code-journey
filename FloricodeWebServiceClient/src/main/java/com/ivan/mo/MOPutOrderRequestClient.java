package com.ivan.mo;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import com.ivan.mo.dao.DBProducts;
import com.ivan.mo.messages.creators.MOPutOrderRequestMessCreator;

import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderRequestMessage;
import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderResponseMessage;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.OrderTradeLineItemType;
import nl.match_online.webservice.customer.v0p7.CommercialCustomer;

public class MOPutOrderRequestClient {

	private static final String USERNAME = "xxxxxxxxxxxx";
	private static final String PASSWORD = "xxxxxxxxxxxx";

	public static void main(String[] args) throws SQLException, ParseException, DatatypeConfigurationException {

		DBProducts dbProduct = new DBProducts();

		Product product = dbProduct.executeQueryFetchData("exampple");
		product.setChave("xxx");
		String quantity = "1";
		
		MOClient moClient = new MOClient(USERNAME, PASSWORD);
		CommercialCustomer wsClient = null;
		try {
			wsClient = moClient.wsClient();
		} catch (MalformedURLException | InterruptedException e) {
			e.printStackTrace();
		}

		// create supply request message
		MOPutOrderRequestMessCreator putRequestMessage = new MOPutOrderRequestMessCreator(product, quantity,USERNAME, PASSWORD);

		OrderRequestMessage putOrderRequest = putRequestMessage.putOrderRequestMessageCreate();

		// get supply response message
		OrderResponseMessage supplyResponseMessage = wsClient.putOrder(putOrderRequest);
		List<OrderTradeLineItemType> orderResponseTradeLineItems = supplyResponseMessage.getBody().getOrderResponse()
				.getOrderResponseTradeLineItem();

		for (OrderTradeLineItemType orderTradeLineItemType : orderResponseTradeLineItems) {
			orderTradeLineItemType.getID();
			
		}
	}

}
