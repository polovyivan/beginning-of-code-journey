package com.ivan.mo.messages.creators;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;

import com.ivan.mo.Product;

import fc.florecom.xml.data.draft.unqualifieddatatype._1.MeasureType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderRequestMessage;
import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderRequestMessage.Body;
import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderRequestMessage.Header;
import fec.florecom.xml.data.draft.orderstandardmessage._7.OrderType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.MarketFormCodeType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.TradeConditionCodeType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.TradeItemCodeType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.AgentPartyType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.CharacteristicType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.ConditionType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.DeliveryType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.MarketPlaceType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.OrderTradeLineItemType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.PackageType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.PackingType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.PriceType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.ProductType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.TradingTermsType;
import un.unece.uncefact.codelist.standard._5.iso42173a._2007_06_18.ISO3AlphaCurrencyCodeContentType;
import un.unece.uncefact.codelist.standard.unece.pricetypecode.d09a.PriceTypeCodeContentType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.DeliveryTermsCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DocumentCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.PriceTypeCodeType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.CustomerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ManufacturerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.SupplierPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeDeliveryTermsType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;

public class MOPutOrderRequestMessCreator {

	private Product product;
	private String productQuantity;
	private XMLGregorianCalendar invoiceDateAndTime;
	private static String wsUsername;
	private static String wsPassword;

	public MOPutOrderRequestMessCreator(Product product, String productQuantity, String wsUsername, String wsPassword) {
		this.product = product;
		this.productQuantity = productQuantity;
		MOPutOrderRequestMessCreator.wsUsername = wsUsername;
		MOPutOrderRequestMessCreator.wsPassword = wsPassword;
	}

	public static String getWsUsername() {
		return wsUsername;
	}

	public static void setWsUsername(String wsUsername) {
		MOPutOrderRequestMessCreator.wsUsername = wsUsername;
	}

	public static String getWsPassword() {
		return wsPassword;
	}

	public static void setWsPassword(String wsPassword) {
		MOPutOrderRequestMessCreator.wsPassword = wsPassword;
	}

	public XMLGregorianCalendar getInvoiceDateAndTime() {
		return invoiceDateAndTime;
	}

	public void setInvoiceDateAndTime(XMLGregorianCalendar invoiceDateAndTime) {
		this.invoiceDateAndTime = invoiceDateAndTime;
	}

	public OrderRequestMessage putOrderRequestMessageCreate() throws ParseException, DatatypeConfigurationException {

		setInvoiceDateAndTime(convertTime(product.getLatestOrderDateTime().get(0)));

		OrderRequestMessage putOrderRequest = new OrderRequestMessage();

		putOrderRequest.setHeader(createHeader());

		putOrderRequest.setBody(createBody());

		return putOrderRequest;

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
		username.setValue(wsUsername);
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
	private Body createBody() throws ParseException {
		Body body = new Body();
		try {
			body.setOrder(createOrder());
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return body;
	}

	private OrderType createOrder() throws DatatypeConfigurationException, ParseException {
		OrderType order = new OrderType();
		List<OrderTradeLineItemType> orderTradeLineItems = order.getOrderTradeLineItem();
		orderTradeLineItems.add(createOrderTradeLineItem());
		return order;
	}

	private OrderTradeLineItemType createOrderTradeLineItem() throws DatatypeConfigurationException, ParseException {
		OrderTradeLineItemType orderTradeLineItem = new OrderTradeLineItemType();
		// ID
		orderTradeLineItem.setID(createIdOnOrderTradeLineItem());
		// DocumentType
		orderTradeLineItem.setDocumentType(createDocumentTypeOnOrderTradeLineItem());
		// LineDateTime
		orderTradeLineItem.setLineDateTime(createLineDateTime());// invoicing date with default time 12:00:00
		// TradingTerms
		orderTradeLineItem.setTradingTerms(createTradingTermsOnOrderTradeLineItem());
		// ReferencedDocument x 2
		List<ReferencedDocumentType> referencedDocuments = orderTradeLineItem.getReferencedDocument();
		referencedDocuments.add(createreferencedDocumentOnorderTradeLineItem1());
		referencedDocuments.add(createreferencedDocumentOnorderTradeLineItem2());
		// SupplierParty
		orderTradeLineItem.setSupplierParty(createSupplierPartyOnorderTradeLineItem());
		// CustomerParty
		orderTradeLineItem.setCustomerParty(createCustomerPartyOnorderTradeLineItem());
		// Product
		orderTradeLineItem.setProduct(createProductOnorderTradeLineItem());
		// Quantity
		orderTradeLineItem.setQuantity(createQuantityOnorderTradeLineItem());
		// Price
		List<PriceType> prices = orderTradeLineItem.getPrice();
		prices.add(createPriceOnorderTradeLineItem());
		// Packing
		orderTradeLineItem.setPacking(createPackingOnorderTradeLineItem());
		// Delivery
		orderTradeLineItem.setDelivery(createDeliveryOnorderTradeLineItem());
		return orderTradeLineItem;
	}

	// ID
	private IDType createIdOnOrderTradeLineItem() {
		IDType id = new IDType();
		id.setSchemeName("ON");
		id.setSchemeDataURI("8733333322222");
		id.setSchemeURI("8733333322222");
		id.setValue(product.getTradeLineItemId());
		return id;
	}

//DocumentCode
	private DocumentCodeType createDocumentTypeOnOrderTradeLineItem() {
		DocumentCodeType documentCodeType = new DocumentCodeType();
		documentCodeType.setValue("9");
		return documentCodeType;
	}

//LineDateTime
	private XMLGregorianCalendar createLineDateTime() throws ParseException, DatatypeConfigurationException {
		XMLGregorianCalendar dateAndTime = null;

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat formatterHour = new SimpleDateFormat("HH");
		SimpleDateFormat formatterMinute = new SimpleDateFormat("mm");

		Date date = new Date();

		if (StringUtils.substringBefore(invoiceDateAndTime.toString(), "T").equals(formatter.format(date))
				&& Integer.valueOf(formatterHour.format(date)) <= 10
				&& Integer.valueOf(formatterMinute.format(date)) <= 59) {
			dateAndTime = convertTime(invoiceDateAndTime.toString());
			dateAndTime.setTime(12, 0, 0);
			System.out.println("invoice date is today " + dateAndTime);
		} else {
			setInvoiceDateAndTime(convertTime(product.getLatestOrderDateTime().get(1)));
			dateAndTime = convertTime(invoiceDateAndTime.toString());
			dateAndTime.setTime(12, 0, 0);
			System.out.println("invoice date is tomorrow " + dateAndTime);
		}
		return dateAndTime;
	}

//TradingTerms
	private TradingTermsType createTradingTermsOnOrderTradeLineItem() {
		TradingTermsType tradingTermsType = new TradingTermsType();
		// MarcetPlace
		tradingTermsType.setMarketPlace(createMarketPlaseOnTTT());
		// MarketFormCode
		MarketFormCodeType marketFC = new MarketFormCodeType();
		marketFC.setValue("002");
		tradingTermsType.setMarketFormCode(marketFC);
		// PaymentAgentParty
		List<AgentPartyType> paymentAgentPartys = tradingTermsType.getPaymentAgentParty();
		paymentAgentPartys.add(createAgentPartyOnTTT());
		// Condition
		List<ConditionType> conditions = tradingTermsType.getCondition();
		conditions.add(createConditionOnTTT());
		return tradingTermsType;
	}

	private MarketPlaceType createMarketPlaseOnTTT() {
		MarketPlaceType marketPlace = new MarketPlaceType();
		IDType iD = new IDType();
		iD.setSchemeID("1");
		iD.setSchemeAgencyName("FEC");
		iD.setValue("8733333322222");
		marketPlace.setID(iD);
		return marketPlace;
	}

	private AgentPartyType createAgentPartyOnTTT() {
		AgentPartyType agentParty = new AgentPartyType();
		IDType iD = new IDType();
		iD.setSchemeID("1");
		iD.setSchemeAgencyName("FEC");
		iD.setValue("8733333322222");
		agentParty.setPrimaryID(iD);
		return agentParty;
	}

	private ConditionType createConditionOnTTT() {
		ConditionType condition = new ConditionType();
		// TypeCode
		List<TradeConditionCodeType> typeCodes = condition.getTypeCode();
		TradeConditionCodeType typeCode = new TradeConditionCodeType();
		typeCode.setValue("303");
		typeCodes.add(typeCode);
		List<MeasureType> valueMeasures = condition.getValueMeasure();
		// ValueMesure
		MeasureType valueMeasure = new MeasureType();
		valueMeasure.setValue(new BigDecimal("1"));
		valueMeasures.add(valueMeasure);
		return condition;

	}

//ReferencedDocument
	private ReferencedDocumentType createreferencedDocumentOnorderTradeLineItem1() {
		ReferencedDocumentType referencedDocumentType = new ReferencedDocumentType();
		// IssuerAssignetID
		IDType id = new IDType();
		id.setSchemeName("AAG");
		id.setSchemeDataURI("8733333322222");
		id.setSchemeURI("8733333322222");
		id.setValue(product.getTradeLineItemId());
		referencedDocumentType.setIssuerAssignedID(id);
		// URIID
		IDType uriid = new IDType();
		uriid.setValue(product.getUriidURI());
		referencedDocumentType.setURIID(uriid);
		// LineID
		IDType lineID = new IDType();
		lineID.setValue("001");
		referencedDocumentType.setLineID(lineID);
		return referencedDocumentType;
	}

	private ReferencedDocumentType createreferencedDocumentOnorderTradeLineItem2() {
		// duplicated :(
		ReferencedDocumentType referencedDocumentType = new ReferencedDocumentType();
		// IssuerAssignetID
		IDType id = new IDType();
		id.setSchemeName("IRN");
		id.setSchemeDataURI("8733333322222");
		id.setSchemeURI("8733333322222");
		id.setValue(product.getReferencedDocumentIssuerAssignedID());
		referencedDocumentType.setIssuerAssignedID(id);
		return referencedDocumentType;
	}

	private SupplierPartyType createSupplierPartyOnorderTradeLineItem() {
		SupplierPartyType supplierParty = new SupplierPartyType();
		// PrimariID
		IDType id = new IDType();
		id.setSchemeID("1");
		id.setSchemeAgencyName("FEC");
		id.setValue("8733333322222");
		supplierParty.setPrimaryID(id);
		// Name
		TextType name = new TextType();
		name.setValue("Cooperativa Veiling Holambra");
		supplierParty.setName(name);
		return supplierParty;
	}

	// CustomerPartyType
	private CustomerPartyType createCustomerPartyOnorderTradeLineItem() {
		CustomerPartyType customerParty = new CustomerPartyType();
		// PrimaryID
		IDType id = new IDType();
		id.setSchemeID("1");
		id.setSchemeAgencyName("FEC");
		id.setValue(product.getChave());
		customerParty.setPrimaryID(id);
		return customerParty;
	}

	// Product
	private ProductType createProductOnorderTradeLineItem() {
		ProductType productOnTL = new ProductType();
		// IndustryAssignedID
		IDType id = new IDType();
		id.setSchemeID("1");
		id.setSchemeAgencyName("VBN");
		id.setValue(new Integer(StringUtils.substringBefore(product.getProductNumber(), ".")).toString());// truncate
																											// leading
																											// 00
		productOnTL.setIndustryAssignedID(id);
		// SupplierAssignedID
		IDType supplierId = new IDType();
		supplierId.setValue(product.getProductNumber());
		productOnTL.setSupplierAssignedID(supplierId);
		// TypeCode
		TradeItemCodeType typeCode = new TradeItemCodeType();
		typeCode.setValue("57");
		productOnTL.setTypeCode(typeCode);
		// ProductGroupID
		IDType productGrup = new IDType();
		productGrup.setSchemeID("16");
		productGrup.setSchemeAgencyName("VBN");
		productGrup.setValue(product.getProductGroupID());
		productOnTL.setProductGroupID(productGrup);
		// ApplicableGoodsCharacteristics 4
		List<CharacteristicType> applicableGoodsCharacteristics = productOnTL.getApplicableGoodsCharacteristics();
		applicableGoodsCharacteristics.add(createApplicableGoodsCharacteristic(product.getS1(), product.getS1Value()));
		applicableGoodsCharacteristics.add(createApplicableGoodsCharacteristic(product.getS2(), product.getS2Value()));
		applicableGoodsCharacteristics.add(createApplicableGoodsCharacteristic(product.getS3(), product.getS3Value()));
		applicableGoodsCharacteristics.add(createApplicableGoodsCharacteristic(product.getS4(), product.getS4Value()));
		// ManufacturerParty
		ManufacturerPartyType manufParty = new ManufacturerPartyType();
		// PrimaryID
		IDType manufPartyID = new IDType();
		manufPartyID.setSchemeID("1");
		manufPartyID.setSchemeAgencyName("FEC");
		manufPartyID.setValue(product.getManufacturerPartyPrimaryID());
		manufParty.setPrimaryID(manufPartyID);
		// Name
		TextType name = new TextType();
		name.setValue(product.getManufacturerPartyName());
		manufParty.setName(name);
		productOnTL.setManufacturerParty(manufParty);
		return productOnTL;
	}

	private CharacteristicType createApplicableGoodsCharacteristic(String typeValue, String valueValue) {
		CharacteristicType characteristic = new CharacteristicType();
		// Type code
		List<CodeType> typeCodes = characteristic.getTypeCode();
		CodeType typeCode = new CodeType();
		typeCode.setListID("8");
		typeCode.setListAgencyName("VBN");
		typeCode.setValue(typeValue);
		typeCodes.add(typeCode);
		// ValueCode
		CodeType valueCode = new CodeType();
		valueCode.setListID("9");
		valueCode.setListAgencyName("VBN");
		valueCode.setValue(valueValue);
		characteristic.setValueCode(valueCode);
		return characteristic;
	}

	// Quantity
	private QuantityType createQuantityOnorderTradeLineItem() {
		BigDecimal multiplyQuantity = new BigDecimal(productQuantity);
		QuantityType quantity = new QuantityType();
		quantity.setUnitCode("1");
		quantity.setValue(multiplyQuantity.multiply(product.getValue23()).multiply(product.getValuePP9()));
		return quantity;
	}

	// Price
	private PriceType createPriceOnorderTradeLineItem() {
		PriceType price = new PriceType();
		// TypeCode
		PriceTypeCodeType typeCode = new PriceTypeCodeType();
		typeCode.setValue(PriceTypeCodeContentType.PV);
		price.setTypeCode(typeCode);
		// ChargeAmount
		AmountType amountType = new AmountType();
		amountType.setCurrencyCode(ISO3AlphaCurrencyCodeContentType.BRL);
		amountType.setValue(product.getChargeAmountValue());
		price.setChargeAmount(amountType);
		// BasisQuantity
		QuantityType bQuantity = new QuantityType();
		bQuantity.setUnitCode("1");
		bQuantity.setValue(product.getbQuantityValue());
		price.setBasisQuantity(bQuantity);
		// NetPriceIndicator
		price.setNetPriceIndicator(true);
		// MinimumQuantity
		QuantityType mQuantity = new QuantityType();
		mQuantity.setUnitCode("4");
		mQuantity.setValue(product.getmQuantityValue());
		price.setMinimumQuantity(mQuantity);
		return price;
	}

//PACKING
	private PackingType createPackingOnorderTradeLineItem() {
		PackingType packing = new PackingType();
		// ID
		IDType packingId = new IDType();
		packingId.setSchemeName(product.getSchemeAgencyNamePP1());
		packingId.setValue(product.getValuePP2());
		packing.setID(packingId);
		// Package
		PackageType packingPackge = new PackageType();
		List<CodeType> typeCodes = packingPackge.getTypeCode();
		CodeType typeCode = new CodeType();
		typeCode.setListID(product.getListIDPP3());
		typeCode.setListAgencyName(product.getListAgencyNamePP4());
		typeCode.setValue(product.getValuePP5());
		typeCodes.add(typeCode);
		// Quantity
		QuantityType ppQuantity = new QuantityType();
		ppQuantity.setUnitCode(product.getUnitCodePP6());
		ppQuantity.setValue(product.getValuePP7());
		packingPackge.setQuantity(ppQuantity);
		packing.setPackage(packingPackge);
		// InnerPackageQuantity
		QuantityType innerPackQty = new QuantityType();
		innerPackQty.setUnitCode(product.getUnitCodePP8());
		innerPackQty.setValue(product.getValuePP9());
		packing.setInnerPackageQuantity(innerPackQty);
		// InnerPacking
		List<PackingType> innerPackings = packing.getInnerPacking();
		innerPackings.add(createInnerPackingOnInnerPacking());
		return packing;
	}

	private PackingType createInnerPackingOnInnerPacking() {
		PackingType packing = new PackingType();
		// Package
		PackageType pPackage = new PackageType();
		// TypeCodes
		List<CodeType> pPackageTypeCodes = pPackage.getTypeCode();
		CodeType pPackageTypeCode = new CodeType();
		pPackageTypeCode.setListID(product.getListIDPP10());
		pPackageTypeCode.setListAgencyName(product.getListAgencyNameP11());
		pPackageTypeCode.setValue(product.getValuePP12());
		pPackageTypeCodes.add(pPackageTypeCode);
		// Quantity
		QuantityType pPackageQty = new QuantityType();
		pPackageQty.setUnitCode(product.getUnitCodePP13());
		pPackageQty.setValue(product.getValuePP14());// plate
		pPackage.setQuantity(pPackageQty);
		packing.setPackage(pPackage);
		// InnerPackageQuantity
		QuantityType innerPackageQty = new QuantityType();
		innerPackageQty.setUnitCode(product.getUnitCodePP15());
		innerPackageQty.setValue(product.getValuePP16());
		packing.setInnerPackageQuantity(innerPackageQty);
		// InnerPacking
		List<PackingType> iPInnerPackings = packing.getInnerPacking();
		PackingType iPInnerPacking = new PackingType();
		// Package
		PackageType iPIpPackage = new PackageType();
		List<CodeType> iPTypeCodes = iPIpPackage.getTypeCode();
		CodeType iPTypeCode = new CodeType();
		iPTypeCode.setListID(product.getListIDPP17());
		iPTypeCode.setListAgencyName(product.getListAgencyName18());
		iPTypeCode.setValue(product.getValuePP19());
		iPTypeCodes.add(iPTypeCode);
		// Quantity
		QuantityType iPIpPackageQty = new QuantityType();
		iPIpPackageQty.setUnitCode(product.getUnitCode20());
		iPIpPackageQty.setValue(product.getValue21());
		iPIpPackage.setQuantity(iPIpPackageQty);
		iPInnerPacking.setPackage(iPIpPackage);
		// InnerPackadgeQuantity
		QuantityType ipIpIPackadgeQty = new QuantityType();
		ipIpIPackadgeQty.setUnitCode(product.getUnitCode22());
		ipIpIPackadgeQty.setValue(product.getValue23());
		iPInnerPacking.setInnerPackageQuantity(ipIpIPackadgeQty);
		iPInnerPackings.add(iPInnerPacking);
		return packing;
	}

	private DeliveryType createDeliveryOnorderTradeLineItem() throws DatatypeConfigurationException, ParseException {
		DeliveryType delivery = new DeliveryType();
		// Terms
		TradeDeliveryTermsType delTerms = new TradeDeliveryTermsType();
		DeliveryTermsCodeType delTypeCode = new DeliveryTermsCodeType();
		delTypeCode.setValue("EXW");
		delTerms.setDeliveryTypeCode(delTypeCode);
		delivery.setDeliveryTerms(delTerms);
		// Earliest
		XMLGregorianCalendar arliestDeliveryDateTime = invoiceDateAndTime;
		if (arliestDeliveryDateTime.getDay() == 7) {
			arliestDeliveryDateTime.setTime(15, 0, 0);
		} else {
			arliestDeliveryDateTime.setTime(16, 0, 0);
		}
		delivery.setEarliestDeliveryDateTime(arliestDeliveryDateTime);

		// Latest
		XMLGregorianCalendar latestDeliveryDateTime = invoiceDateAndTime;
		latestDeliveryDateTime.setTime(19, 0, 0);
		delivery.setLatestDeliveryDateTime(latestDeliveryDateTime);
		return delivery;
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

	private static XMLGregorianCalendar convertTime(String datetoFormat)
			throws ParseException, DatatypeConfigurationException {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = format.parse(datetoFormat);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		return xmlGregCal;
	}

}
