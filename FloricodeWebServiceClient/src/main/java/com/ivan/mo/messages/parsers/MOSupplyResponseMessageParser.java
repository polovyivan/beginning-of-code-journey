package com.ivan.mo.messages.parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.ivan.mo.Product;

import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.AgentPartyType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.CharacteristicType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.DeliveryType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.PackageType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.PackingType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.ProductType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.SupplyTradeLineItemType;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyResponseMessage;
import fec.florecom.xml.data.draft.supplystandardmessage._7.SupplyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;

public class MOSupplyResponseMessageParser {

	public List<Product> parseSupplyResponseMessage(SupplyResponseMessage supply) {
		
		List<Product> products = new ArrayList<>();
		String referencedDocumentIssuerAssignedID = null;
		String uriidURI = null;
		String productNumber = null;
		String productGroupID = null;
		String s1 = null;
		String s1Value = null;
		String s2 = null;
		String s2Value = null;
		String s3 = null;
		String s3Value = null;
		String s4 = null;
		String s4Value = null;
		String manufacturerPartyPrimaryID = null;
		String manufacturerPartyName = null;
		BigDecimal elementQuantityNumber = null;
		BigDecimal chargeAmountValue = null;
		BigDecimal bQuantityValue = null;
		BigDecimal mQuantityValue = null;
		String schemeAgencyNamePP1 = null;
		String valuePP2 = null;
		String listIDPP3 = null;
		String listAgencyNamePP4 = null;
		String valuePP5 = null;
		String unitCodePP6 = null;
		BigDecimal valuePP7 = null;
		String unitCodePP8 = null;
		BigDecimal valuePP9 = null;
		String listIDPP10 = null;
		String listAgencyNameP11 = null;
		String valuePP12 = null;
		String unitCodePP13 = null;
		BigDecimal valuePP14 = null;
		String unitCodePP15 = null;
		BigDecimal valuePP16 = null;
		String listIDPP17 = null;
		String listAgencyName18 = null;
		String valuePP19 = null;
		String unitCode20 = null;
		BigDecimal value21 = null;
		String unitCode22 = null;
		BigDecimal value23 = null;

		SupplyType supplyResponseDetails = supply.getBody().getSupplyResponseDetails();

		// AgentParty
		AgentPartyType agentParty = supplyResponseDetails.getAgentParty();
		// PrimaryID
		IDType primaryID = agentParty.getPrimaryID();
		primaryID.getSchemeID();
		primaryID.getSchemeName();
		primaryID.getValue();

		// SupplyTradeLineItems
		List<SupplyTradeLineItemType> supplyTradeLineItems = supplyResponseDetails.getSupplyTradeLineItem();

		int productNum = 1;
		for (SupplyTradeLineItemType supplyTradeLineItemType : supplyTradeLineItems) {

			System.out.println(productNum++);
			// ID
			String tradeLineItemId = supplyTradeLineItemType.getID().getValue();

			// DocumentType
			List<ReferencedDocumentType> referencedDocuments = supplyTradeLineItemType.getReferencedDocument();

			for (ReferencedDocumentType referencedDocument : referencedDocuments) {

				referencedDocumentIssuerAssignedID = referencedDocument.getIssuerAssignedID().getValue();
				uriidURI = referencedDocument.getURIID().getValue();

				System.out.println(referencedDocumentIssuerAssignedID);
			}

			productNumber = supplyTradeLineItemType.getProduct().getSupplierAssignedID().getValue();


			List<CharacteristicType> applicableGoodsCharacteristics = supplyTradeLineItemType.getProduct()
					.getApplicableGoodsCharacteristics();

			s1 = applicableGoodsCharacteristics.get(0).getTypeCode().get(0).getValue();
			s1Value = applicableGoodsCharacteristics.get(0).getValueCode().getValue();

			s2 = applicableGoodsCharacteristics.get(1).getTypeCode().get(0).getValue();
			s2Value = applicableGoodsCharacteristics.get(1).getValueCode().getValue();

			s3 = applicableGoodsCharacteristics.get(2).getTypeCode().get(0).getValue();
			s3Value = applicableGoodsCharacteristics.get(2).getValueCode().getValue();
			try {
				s4 = applicableGoodsCharacteristics.get(3).getTypeCode().get(0).getValue();
				s4Value = applicableGoodsCharacteristics.get(3).getValueCode().getValue();
			} catch (Exception e) {
			}

			manufacturerPartyPrimaryID = supplyTradeLineItemType.getProduct().getManufacturerParty().getPrimaryID()
					.getValue();
			manufacturerPartyName = supplyTradeLineItemType.getProduct().getManufacturerParty().getName().getValue();

			elementQuantityNumber = supplyTradeLineItemType.getQuantity().getValue();

			chargeAmountValue = supplyTradeLineItemType.getPrice().get(0).getChargeAmount().getValue();

			bQuantityValue = supplyTradeLineItemType.getPrice().get(0).getBasisQuantity().getValue();

			mQuantityValue = supplyTradeLineItemType.getPrice().get(0).getMinimumQuantity().getValue();

			// Packing
			List<PackingType> listOfPacking = supplyTradeLineItemType.getPacking();

			for (PackingType packing : listOfPacking) {
				// ID
				IDType packingId = packing.getID();
				schemeAgencyNamePP1 = packingId.getSchemeName();
				valuePP2 = packingId.getValue();

				// Package
				// TypeCode
				PackageType packingPackage = packing.getPackage();

				List<CodeType> ListOfPackageTypeCode = packingPackage.getTypeCode();

				for (CodeType packageTypeCode : ListOfPackageTypeCode) {

					listIDPP3 = packageTypeCode.getListID();
					listAgencyNamePP4 = packageTypeCode.getListAgencyName();
					valuePP5 = packageTypeCode.getValue();

				}

				// TypeCode
				unitCodePP6 = packingPackage.getQuantity().getUnitCode();
				valuePP7 = packingPackage.getQuantity().getValue();

				// InnerPackageQuantity
				unitCodePP8 = packing.getInnerPackageQuantity().getUnitCode();
				valuePP9 = packing.getInnerPackageQuantity().getValue();

				// InnerPacking
				List<PackingType> listOfInnerPacking = packing.getInnerPacking();

				for (PackingType innerPacking : listOfInnerPacking) {

					List<CodeType> listOfInnerPackingTypeCode = innerPacking.getPackage().getTypeCode();
					for (CodeType innerPackingTypeCode : listOfInnerPackingTypeCode) {

						listIDPP10 = innerPackingTypeCode.getListID();
						listAgencyNameP11 = innerPackingTypeCode.getListAgencyName();
						valuePP12 = innerPackingTypeCode.getValue();

					}
					unitCodePP13 = innerPacking.getPackage().getQuantity().getUnitCode();
					valuePP14 = innerPacking.getPackage().getQuantity().getValue();

					unitCodePP15 = innerPacking.getInnerPackageQuantity().getUnitCode();
					valuePP16 = innerPacking.getInnerPackageQuantity().getValue();

					// innerPacking
					List<PackingType> listOfInnerPackingPackage = innerPacking.getInnerPacking();
					for (PackingType innerPackingPackage : listOfInnerPackingPackage) {

						List<CodeType> listOfinnerPackingPackagePackageTypeCode = innerPackingPackage.getPackage()
								.getTypeCode();

						for (CodeType innerPackingPackagePackageTypeCode : listOfinnerPackingPackagePackageTypeCode) {

							listIDPP17 = innerPackingPackagePackageTypeCode.getListID();
							listAgencyName18 = innerPackingPackagePackageTypeCode.getListAgencyName();
							valuePP19 = innerPackingPackagePackageTypeCode.getValue();

						}
						unitCode20 = innerPackingPackage.getPackage().getQuantity().getUnitCode();
						value21 = innerPackingPackage.getPackage().getQuantity().getValue();

						unitCode22 = innerPackingPackage.getInnerPackageQuantity().getUnitCode();
						value23 = innerPackingPackage.getInnerPackageQuantity().getValue();

					}

				}

			}

			// LineDateTime

			// TradingTerms

			// ReferencedDocument

			// SupplierParty

			// Product
			ProductType product = supplyTradeLineItemType.getProduct();

			// Quantity

			// Price

			// Packing

			// Delivery
			ArrayList<String> latestOrderDateTimes = new ArrayList<String>();
			List<DeliveryType> deliverys = supplyTradeLineItemType.getDelivery();
			int dat = 1;
			for (DeliveryType delivery : deliverys) {
				System.out.println(dat++);
				XMLGregorianCalendar latestOrderDateTime = delivery.getLatestOrderDateTime();
				System.out.println("latestOrderDateTime" + latestOrderDateTime);

				if (latestOrderDateTime != null) {
					latestOrderDateTimes.add(latestOrderDateTime.toString());

				}
			}

			// Status

			products.add(new Product(tradeLineItemId, referencedDocumentIssuerAssignedID, uriidURI, null, productNumber,
					productGroupID, s1, s1Value, s2, s2Value, s3, s3Value, s4, s4Value, manufacturerPartyPrimaryID,
					manufacturerPartyName, elementQuantityNumber, chargeAmountValue, bQuantityValue, mQuantityValue,
					schemeAgencyNamePP1, valuePP2, listIDPP3, listAgencyNamePP4, valuePP5, unitCodePP6, valuePP7,
					unitCodePP8, valuePP9, listIDPP10, listAgencyNameP11, valuePP12, unitCodePP13, valuePP14,
					unitCodePP15, valuePP16, listIDPP17, listAgencyName18, valuePP19, unitCode20, value21, unitCode22,
					value23, latestOrderDateTimes));

//			if (productNum > 50) {
//				break;
//			}
		}
		return products;
	}

}
