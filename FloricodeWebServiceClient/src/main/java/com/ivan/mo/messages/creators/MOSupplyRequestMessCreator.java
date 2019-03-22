package com.ivan.mo.messages.creators;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;

import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.AgentPartyType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.SupplyRequestLineType;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyRequestMessage;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyRequestMessage.Body;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyRequestMessage.Header;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyRequestType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;

public class MOSupplyRequestMessCreator {

	private static  String wsUsernames;
	private static  String wsPassword;

	public MOSupplyRequestMessCreator(String wsUsernames, String wsPassword) {
		
		MOSupplyRequestMessCreator.wsUsernames = wsUsernames;
		MOSupplyRequestMessCreator.wsPassword = wsPassword;
	}

	public static String getWsUsernames() {
		return wsUsernames;
	}

	public static void setWsUsernames(String wsUsernames) {
		MOSupplyRequestMessCreator.wsUsernames = wsUsernames;
	}

	public static String getWsPassword() {
		return wsPassword;
	}

	public static void setWsPassword(String wsPassword) {
		MOSupplyRequestMessCreator.wsPassword = wsPassword;
	}

	public SupplyRequestMessage requestMessageCreate() {

		SupplyRequestMessage supplyRequest = new SupplyRequestMessage();

		supplyRequest.setHeader(createHeader());

		supplyRequest.setBody(createBody());

		return supplyRequest;

	}

	// HEADER
	private Header createHeader() {
		Header header = new Header();
		setUsernameonHeader(header);

		setPasswordonHeader(header);

		setMessageIdonHeader(header);

		header.setMessageDateTime(getDateandTime());

		header.setMessageSerial(new BigDecimal("1"));

		return header;
	}

	private static void setUsernameonHeader(Header header) {

		TextType username = new TextType();
		username.setValue(wsUsernames);
		header.setUserName(username);

	}

	private static void setPasswordonHeader(Header header) {

		TextType password = new TextType();
		password.setValue(wsPassword);
		header.setPassword(password);

	}

	private static void setMessageIdonHeader(Header header) {
		// mess id
		IDType msID = new IDType();
		String messageId = StringUtils.substringBefore(getDateandTime().toString(), ".");
		msID.setValue(messageId.replaceAll("[^\\d]", ""));
		header.setMessageID(msID);

	}

	// BODY

	private Body createBody() {

		Body body = new Body();

		body.setSupplyRequestDetails(createSupplyRequestDetails());

		return body;
	}

	private SupplyRequestType createSupplyRequestDetails() {

		SupplyRequestType supplyRequestDetails = new SupplyRequestType();

		// AgentParty
		supplyRequestDetails.setAgentParty(createAgentParty());

		// SupplyRequestLine
		List<SupplyRequestLineType> supplyRequestLines = supplyRequestDetails.getSupplyRequestLine();
		supplyRequestLines.add(createSupplyRequestLine());

		return supplyRequestDetails;
	}

	private AgentPartyType createAgentParty() {

		AgentPartyType agentParty = new AgentPartyType();

		// Primary ID

		agentParty.setPrimaryID(createPrimaryID());

		// AdditianalID

		// TaxID

		// Name

		// PostalStructuredAddress

		// PostalUnstructuredAddress

		// PostalPostBoxAddress

		// DefinedTradeContact

		return agentParty;
	}

	private IDType createPrimaryID() {
		IDType primaryID = new IDType();

		primaryID.setSchemeID("1");
		primaryID.setSchemeAgencyName("FEC");
		primaryID.setValue("8733333322222");

		return primaryID;
	}

	private SupplyRequestLineType createSupplyRequestLine() {

		SupplyRequestLineType supplyRequestLine = new SupplyRequestLineType();

		// ID

		// DocumentType

		// DocumentStatusCode

		// MutationDateTime

		// TradingTerms

		// ReferencedDocument

		// AdditionalInformationTradeNote

		// SelerParty

		// BuyerParty

		// BuyerParty

		// SupplierParty

		// CustomerParty

		// EndUserParty

		// NotifyParty

		// Product

		// Quantity

		// Price

		// Packing

		// Delivery

		// ProductSampleLocation

		// Status

		// PhysicalLocation

		return supplyRequestLine;
	}

	private static XMLGregorianCalendar getDateandTime() {

		XMLGregorianCalendar dateandtime = null;
		try {
			dateandtime = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return dateandtime;
	}

}
