
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.PriceTypeCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.AmountType;


/**
 * <p>Classe Java de PriceType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}PriceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}AmountType" minOccurs="0"/>
 *         &lt;element name="BasisQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="NetPriceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumChargeAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumChargeAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="MaximumQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PeriodType" minOccurs="0"/>
 *         &lt;element name="AppliedTradeAllowanceCharge" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedTradeAllowanceCharge" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginMarketplace" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}MarketPlaceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "typeCode",
    "chargeAmount",
    "basisQuantity",
    "netPriceIndicator",
    "minimumChargeAmount",
    "maximumChargeAmount",
    "minimumQuantity",
    "maximumQuantity",
    "validityPeriod",
    "appliedTradeAllowanceCharge",
    "relatedTradeAllowanceCharge",
    "originMarketplace"
})
public class PriceType {

    @XmlElement(name = "TypeCode")
    protected PriceTypeCodeType typeCode;
    @XmlElement(name = "ChargeAmount")
    protected AmountType chargeAmount;
    @XmlElement(name = "BasisQuantity")
    protected QuantityType basisQuantity;
    @XmlElement(name = "NetPriceIndicator")
    protected Boolean netPriceIndicator;
    @XmlElement(name = "MinimumChargeAmount")
    protected AmountType minimumChargeAmount;
    @XmlElement(name = "MaximumChargeAmount")
    protected AmountType maximumChargeAmount;
    @XmlElement(name = "MinimumQuantity")
    protected QuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity")
    protected QuantityType maximumQuantity;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "AppliedTradeAllowanceCharge")
    protected List<TradeAllowanceChargeType> appliedTradeAllowanceCharge;
    @XmlElement(name = "RelatedTradeAllowanceCharge")
    protected List<TradeAllowanceChargeType> relatedTradeAllowanceCharge;
    @XmlElement(name = "OriginMarketplace")
    protected MarketPlaceType originMarketplace;

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeCodeType }
     *     
     */
    public PriceTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeCodeType }
     *     
     */
    public void setTypeCode(PriceTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade chargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define o valor da propriedade chargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargeAmount(AmountType value) {
        this.chargeAmount = value;
    }

    /**
     * Obtém o valor da propriedade basisQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getBasisQuantity() {
        return basisQuantity;
    }

    /**
     * Define o valor da propriedade basisQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setBasisQuantity(QuantityType value) {
        this.basisQuantity = value;
    }

    /**
     * Obtém o valor da propriedade netPriceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetPriceIndicator() {
        return netPriceIndicator;
    }

    /**
     * Define o valor da propriedade netPriceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetPriceIndicator(Boolean value) {
        this.netPriceIndicator = value;
    }

    /**
     * Obtém o valor da propriedade minimumChargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumChargeAmount() {
        return minimumChargeAmount;
    }

    /**
     * Define o valor da propriedade minimumChargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumChargeAmount(AmountType value) {
        this.minimumChargeAmount = value;
    }

    /**
     * Obtém o valor da propriedade maximumChargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumChargeAmount() {
        return maximumChargeAmount;
    }

    /**
     * Define o valor da propriedade maximumChargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumChargeAmount(AmountType value) {
        this.maximumChargeAmount = value;
    }

    /**
     * Obtém o valor da propriedade minimumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Define o valor da propriedade minimumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMinimumQuantity(QuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * Obtém o valor da propriedade maximumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Define o valor da propriedade maximumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMaximumQuantity(QuantityType value) {
        this.maximumQuantity = value;
    }

    /**
     * Obtém o valor da propriedade validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Define o valor da propriedade validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the appliedTradeAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedTradeAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedTradeAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeAllowanceChargeType }
     * 
     * 
     */
    public List<TradeAllowanceChargeType> getAppliedTradeAllowanceCharge() {
        if (appliedTradeAllowanceCharge == null) {
            appliedTradeAllowanceCharge = new ArrayList<TradeAllowanceChargeType>();
        }
        return this.appliedTradeAllowanceCharge;
    }

    /**
     * Gets the value of the relatedTradeAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTradeAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTradeAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeAllowanceChargeType }
     * 
     * 
     */
    public List<TradeAllowanceChargeType> getRelatedTradeAllowanceCharge() {
        if (relatedTradeAllowanceCharge == null) {
            relatedTradeAllowanceCharge = new ArrayList<TradeAllowanceChargeType>();
        }
        return this.relatedTradeAllowanceCharge;
    }

    /**
     * Obtém o valor da propriedade originMarketplace.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceType }
     *     
     */
    public MarketPlaceType getOriginMarketplace() {
        return originMarketplace;
    }

    /**
     * Define o valor da propriedade originMarketplace.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceType }
     *     
     */
    public void setOriginMarketplace(MarketPlaceType value) {
        this.originMarketplace = value;
    }

}
