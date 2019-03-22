package com.ivan.mo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {
	private String tradeLineItemId;
	private String referencedDocumentIssuerAssignedID;
	private String uriidURI;
	private String chave;
	private String productNumber;
	private String productGroupID;
	private String s1;
	private String s1Value;
	private String s2;
	private String s2Value;
	private String s3;
	private String s3Value;
	private String s4;
	private String s4Value;
	private String manufacturerPartyPrimaryID;
	private String manufacturerPartyName;
	private BigDecimal elementQuantityNumber;
	private BigDecimal chargeAmountValue;
	private BigDecimal bQuantityValue;
	private BigDecimal mQuantityValue;
	private String schemeAgencyNamePP1;
	private String valuePP2;
	private String listIDPP3;
	private String listAgencyNamePP4;
	private String valuePP5;
	private String unitCodePP6;
	private BigDecimal valuePP7;
	private String unitCodePP8;
	private BigDecimal valuePP9;
	private String listIDPP10;
	private String listAgencyNameP11;
	private String valuePP12;
	private String unitCodePP13;
	private BigDecimal valuePP14;
	private String unitCodePP15;
	private BigDecimal valuePP16;
	private String listIDPP17;
	private String listAgencyName18;
	private String valuePP19;
	private String unitCode20;
	private BigDecimal value21;
	private String unitCode22;
	private BigDecimal value23;
	private ArrayList<String> latestOrderDateTime;

	public Product(String tradeLineItemId, String referencedDocumentIssuerAssignedID, String uriidURI, String chave,
			String productNumber, String productGroupID, String s1, String s1Value, String s2, String s2Value,
			String s3, String s3Value, String s4, String s4Value, String manufacturerPartyPrimaryID,
			String manufacturerPartyName, BigDecimal elementQuantityNumber, BigDecimal chargeAmountValue,
			BigDecimal bQuantityValue, BigDecimal mQuantityValue, String schemeAgencyNamePP1, String valuePP2,
			String listIDPP3, String listAgencyNamePP4, String valuePP5, String unitCodePP6, BigDecimal valuePP7,
			String unitCodePP8, BigDecimal valuePP9, String listIDPP10, String listAgencyNameP11, String valuePP12,
			String unitCodePP13, BigDecimal valuePP14, String unitCodePP15, BigDecimal valuePP16, String listIDPP17,
			String listAgencyName18, String valuePP19, String unitCode20, BigDecimal value21, String unitCode22,
			BigDecimal value23, ArrayList<String> latestOrderDateTime) {
		super();
		this.tradeLineItemId = tradeLineItemId;
		this.referencedDocumentIssuerAssignedID = referencedDocumentIssuerAssignedID;
		this.uriidURI = uriidURI;
		this.chave = chave;
		this.productNumber = productNumber;
		this.productGroupID = productGroupID;
		this.s1 = s1;
		this.s1Value = s1Value;
		this.s2 = s2;
		this.s2Value = s2Value;
		this.s3 = s3;
		this.s3Value = s3Value;
		this.s4 = s4;
		this.s4Value = s4Value;
		this.manufacturerPartyPrimaryID = manufacturerPartyPrimaryID;
		this.manufacturerPartyName = manufacturerPartyName;
		this.elementQuantityNumber = elementQuantityNumber;
		this.chargeAmountValue = chargeAmountValue;
		this.bQuantityValue = bQuantityValue;
		this.mQuantityValue = mQuantityValue;
		this.schemeAgencyNamePP1 = schemeAgencyNamePP1;
		this.valuePP2 = valuePP2;
		this.listIDPP3 = listIDPP3;
		this.listAgencyNamePP4 = listAgencyNamePP4;
		this.valuePP5 = valuePP5;
		this.unitCodePP6 = unitCodePP6;
		this.valuePP7 = valuePP7;
		this.unitCodePP8 = unitCodePP8;
		this.valuePP9 = valuePP9;
		this.listIDPP10 = listIDPP10;
		this.listAgencyNameP11 = listAgencyNameP11;
		this.valuePP12 = valuePP12;
		this.unitCodePP13 = unitCodePP13;
		this.valuePP14 = valuePP14;
		this.unitCodePP15 = unitCodePP15;
		this.valuePP16 = valuePP16;
		this.listIDPP17 = listIDPP17;
		this.listAgencyName18 = listAgencyName18;
		this.valuePP19 = valuePP19;
		this.unitCode20 = unitCode20;
		this.value21 = value21;
		this.unitCode22 = unitCode22;
		this.value23 = value23;
		this.latestOrderDateTime = latestOrderDateTime;
	}

	public String getTradeLineItemId() {
		return tradeLineItemId;
	}

	public void setTradeLineItemId(String tradeLineItemId) {
		this.tradeLineItemId = tradeLineItemId;
	}

	public String getReferencedDocumentIssuerAssignedID() {
		return referencedDocumentIssuerAssignedID;
	}

	public void setReferencedDocumentIssuerAssignedID(String referencedDocumentIssuerAssignedID) {
		this.referencedDocumentIssuerAssignedID = referencedDocumentIssuerAssignedID;
	}

	public String getUriidURI() {
		return uriidURI;
	}

	public void setUriidURI(String uriidURI) {
		this.uriidURI = uriidURI;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductGroupID() {
		return productGroupID;
	}

	public void setProductGroupID(String productGroupID) {
		this.productGroupID = productGroupID;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS1Value() {
		return s1Value;
	}

	public void setS1Value(String s1Value) {
		this.s1Value = s1Value;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getS2Value() {
		return s2Value;
	}

	public void setS2Value(String s2Value) {
		this.s2Value = s2Value;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getS3Value() {
		return s3Value;
	}

	public void setS3Value(String s3Value) {
		this.s3Value = s3Value;
	}

	public String getS4() {
		return s4;
	}

	public void setS4(String s4) {
		this.s4 = s4;
	}

	public String getS4Value() {
		return s4Value;
	}

	public void setS4Value(String s4Value) {
		this.s4Value = s4Value;
	}

	public String getManufacturerPartyPrimaryID() {
		return manufacturerPartyPrimaryID;
	}

	public void setManufacturerPartyPrimaryID(String manufacturerPartyPrimaryID) {
		this.manufacturerPartyPrimaryID = manufacturerPartyPrimaryID;
	}

	public String getManufacturerPartyName() {
		return manufacturerPartyName;
	}

	public void setManufacturerPartyName(String manufacturerPartyName) {
		this.manufacturerPartyName = manufacturerPartyName;
	}

	public BigDecimal getElementQuantityNumber() {
		return elementQuantityNumber;
	}

	public void setElementQuantityNumber(BigDecimal elementQuantityNumber) {
		this.elementQuantityNumber = elementQuantityNumber;
	}

	public BigDecimal getChargeAmountValue() {
		return chargeAmountValue;
	}

	public void setChargeAmountValue(BigDecimal chargeAmountValue) {
		this.chargeAmountValue = chargeAmountValue;
	}

	public BigDecimal getbQuantityValue() {
		return bQuantityValue;
	}

	public void setbQuantityValue(BigDecimal bQuantityValue) {
		this.bQuantityValue = bQuantityValue;
	}

	public BigDecimal getmQuantityValue() {
		return mQuantityValue;
	}

	public void setmQuantityValue(BigDecimal mQuantityValue) {
		this.mQuantityValue = mQuantityValue;
	}

	public String getSchemeAgencyNamePP1() {
		return schemeAgencyNamePP1;
	}

	public void setSchemeAgencyNamePP1(String schemeAgencyNamePP1) {
		this.schemeAgencyNamePP1 = schemeAgencyNamePP1;
	}

	public String getValuePP2() {
		return valuePP2;
	}

	public void setValuePP2(String valuePP2) {
		this.valuePP2 = valuePP2;
	}

	public String getListIDPP3() {
		return listIDPP3;
	}

	public void setListIDPP3(String listIDPP3) {
		this.listIDPP3 = listIDPP3;
	}

	public String getListAgencyNamePP4() {
		return listAgencyNamePP4;
	}

	public void setListAgencyNamePP4(String listAgencyNamePP4) {
		this.listAgencyNamePP4 = listAgencyNamePP4;
	}

	public String getValuePP5() {
		return valuePP5;
	}

	public void setValuePP5(String valuePP5) {
		this.valuePP5 = valuePP5;
	}

	public String getUnitCodePP6() {
		return unitCodePP6;
	}

	public void setUnitCodePP6(String unitCodePP6) {
		this.unitCodePP6 = unitCodePP6;
	}

	public BigDecimal getValuePP7() {
		return valuePP7;
	}

	public void setValuePP7(BigDecimal valuePP7) {
		this.valuePP7 = valuePP7;
	}

	public String getUnitCodePP8() {
		return unitCodePP8;
	}

	public void setUnitCodePP8(String unitCodePP8) {
		this.unitCodePP8 = unitCodePP8;
	}

	public BigDecimal getValuePP9() {
		return valuePP9;
	}

	public void setValuePP9(BigDecimal valuePP9) {
		this.valuePP9 = valuePP9;
	}

	public String getListIDPP10() {
		return listIDPP10;
	}

	public void setListIDPP10(String listIDPP10) {
		this.listIDPP10 = listIDPP10;
	}

	public String getListAgencyNameP11() {
		return listAgencyNameP11;
	}

	public void setListAgencyNameP11(String listAgencyNameP11) {
		this.listAgencyNameP11 = listAgencyNameP11;
	}

	public String getValuePP12() {
		return valuePP12;
	}

	public void setValuePP12(String valuePP12) {
		this.valuePP12 = valuePP12;
	}

	public String getUnitCodePP13() {
		return unitCodePP13;
	}

	public void setUnitCodePP13(String unitCodePP13) {
		this.unitCodePP13 = unitCodePP13;
	}

	public BigDecimal getValuePP14() {
		return valuePP14;
	}

	public void setValuePP14(BigDecimal valuePP14) {
		this.valuePP14 = valuePP14;
	}

	public String getUnitCodePP15() {
		return unitCodePP15;
	}

	public void setUnitCodePP15(String unitCodePP15) {
		this.unitCodePP15 = unitCodePP15;
	}

	public BigDecimal getValuePP16() {
		return valuePP16;
	}

	public void setValuePP16(BigDecimal valuePP16) {
		this.valuePP16 = valuePP16;
	}

	public String getListIDPP17() {
		return listIDPP17;
	}

	public void setListIDPP17(String listIDPP17) {
		this.listIDPP17 = listIDPP17;
	}

	public String getListAgencyName18() {
		return listAgencyName18;
	}

	public void setListAgencyName18(String listAgencyName18) {
		this.listAgencyName18 = listAgencyName18;
	}

	public String getValuePP19() {
		return valuePP19;
	}

	public void setValuePP19(String valuePP19) {
		this.valuePP19 = valuePP19;
	}

	public String getUnitCode20() {
		return unitCode20;
	}

	public void setUnitCode20(String unitCode20) {
		this.unitCode20 = unitCode20;
	}

	public BigDecimal getValue21() {
		return value21;
	}

	public void setValue21(BigDecimal value21) {
		this.value21 = value21;
	}

	public String getUnitCode22() {
		return unitCode22;
	}

	public void setUnitCode22(String unitCode22) {
		this.unitCode22 = unitCode22;
	}

	public BigDecimal getValue23() {
		return value23;
	}

	public void setValue23(BigDecimal value23) {
		this.value23 = value23;
	}

	public ArrayList<String> getLatestOrderDateTime() {
		return latestOrderDateTime;
	}

	public void setLatestOrderDateTime(ArrayList<String> latestOrderDateTime) {
		this.latestOrderDateTime = latestOrderDateTime;
	}

}
