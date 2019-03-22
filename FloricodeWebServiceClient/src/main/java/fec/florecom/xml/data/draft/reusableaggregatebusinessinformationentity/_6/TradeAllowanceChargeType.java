
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.AllowanceChargeCurrencyExchangeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de TradeAllowanceChargeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradeAllowanceChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="SequenceNumeric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CalculationPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BasisAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}AmountType" minOccurs="0"/>
 *         &lt;element name="BasisQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="PrepaidIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActualAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualAllowanceChargeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}AllowanceChargeCurrencyExchangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAllowanceChargeType", propOrder = {
    "chargeIndicator",
    "id",
    "sequenceNumeric",
    "calculationPercent",
    "basisAmount",
    "basisQuantity",
    "prepaidIndicator",
    "actualAmount",
    "actualAllowanceChargeCurrencyExchange"
})
public class TradeAllowanceChargeType {

    @XmlElement(name = "ChargeIndicator")
    protected Boolean chargeIndicator;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "SequenceNumeric")
    protected BigDecimal sequenceNumeric;
    @XmlElement(name = "CalculationPercent")
    protected BigDecimal calculationPercent;
    @XmlElement(name = "BasisAmount")
    protected AmountType basisAmount;
    @XmlElement(name = "BasisQuantity")
    protected QuantityType basisQuantity;
    @XmlElement(name = "PrepaidIndicator")
    protected Boolean prepaidIndicator;
    @XmlElement(name = "ActualAmount")
    protected AmountType actualAmount;
    @XmlElement(name = "ActualAllowanceChargeCurrencyExchange")
    protected AllowanceChargeCurrencyExchangeType actualAllowanceChargeCurrencyExchange;

    /**
     * Obtém o valor da propriedade chargeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Define o valor da propriedade chargeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeIndicator(Boolean value) {
        this.chargeIndicator = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Define o valor da propriedade sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSequenceNumeric(BigDecimal value) {
        this.sequenceNumeric = value;
    }

    /**
     * Obtém o valor da propriedade calculationPercent.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculationPercent() {
        return calculationPercent;
    }

    /**
     * Define o valor da propriedade calculationPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculationPercent(BigDecimal value) {
        this.calculationPercent = value;
    }

    /**
     * Obtém o valor da propriedade basisAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBasisAmount() {
        return basisAmount;
    }

    /**
     * Define o valor da propriedade basisAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBasisAmount(AmountType value) {
        this.basisAmount = value;
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
     * Obtém o valor da propriedade prepaidIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Define o valor da propriedade prepaidIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrepaidIndicator(Boolean value) {
        this.prepaidIndicator = value;
    }

    /**
     * Obtém o valor da propriedade actualAmount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualAmount() {
        return actualAmount;
    }

    /**
     * Define o valor da propriedade actualAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualAmount(AmountType value) {
        this.actualAmount = value;
    }

    /**
     * Obtém o valor da propriedade actualAllowanceChargeCurrencyExchange.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeCurrencyExchangeType }
     *     
     */
    public AllowanceChargeCurrencyExchangeType getActualAllowanceChargeCurrencyExchange() {
        return actualAllowanceChargeCurrencyExchange;
    }

    /**
     * Define o valor da propriedade actualAllowanceChargeCurrencyExchange.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeCurrencyExchangeType }
     *     
     */
    public void setActualAllowanceChargeCurrencyExchange(AllowanceChargeCurrencyExchangeType value) {
        this.actualAllowanceChargeCurrencyExchange = value;
    }

}
