
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.MarketFormCodeType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradePaymentTermsType;


/**
 * <p>Classe Java de TradingTermsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradingTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketPlace" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}MarketPlaceType" minOccurs="0"/>
 *         &lt;element name="MarketFormCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}MarketFormCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradePaymentTermsType" minOccurs="0"/>
 *         &lt;element name="PaymentAgentParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}AgentPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradePeriod" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PeriodType" minOccurs="0"/>
 *         &lt;element name="TradeSequence" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Condition" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ConditionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingTermsType", propOrder = {
    "marketPlace",
    "marketFormCode",
    "paymentTerms",
    "paymentAgentParty",
    "tradePeriod",
    "tradeSequence",
    "condition"
})
public class TradingTermsType {

    @XmlElement(name = "MarketPlace")
    protected MarketPlaceType marketPlace;
    @XmlElement(name = "MarketFormCode")
    protected MarketFormCodeType marketFormCode;
    @XmlElement(name = "PaymentTerms")
    protected TradePaymentTermsType paymentTerms;
    @XmlElement(name = "PaymentAgentParty")
    protected List<AgentPartyType> paymentAgentParty;
    @XmlElement(name = "TradePeriod")
    protected PeriodType tradePeriod;
    @XmlElement(name = "TradeSequence")
    protected BigDecimal tradeSequence;
    @XmlElement(name = "Condition")
    protected List<ConditionType> condition;

    /**
     * Obtém o valor da propriedade marketPlace.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceType }
     *     
     */
    public MarketPlaceType getMarketPlace() {
        return marketPlace;
    }

    /**
     * Define o valor da propriedade marketPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceType }
     *     
     */
    public void setMarketPlace(MarketPlaceType value) {
        this.marketPlace = value;
    }

    /**
     * Obtém o valor da propriedade marketFormCode.
     * 
     * @return
     *     possible object is
     *     {@link MarketFormCodeType }
     *     
     */
    public MarketFormCodeType getMarketFormCode() {
        return marketFormCode;
    }

    /**
     * Define o valor da propriedade marketFormCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketFormCodeType }
     *     
     */
    public void setMarketFormCode(MarketFormCodeType value) {
        this.marketFormCode = value;
    }

    /**
     * Obtém o valor da propriedade paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link TradePaymentTermsType }
     *     
     */
    public TradePaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Define o valor da propriedade paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePaymentTermsType }
     *     
     */
    public void setPaymentTerms(TradePaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the paymentAgentParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentAgentParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentAgentParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentPartyType }
     * 
     * 
     */
    public List<AgentPartyType> getPaymentAgentParty() {
        if (paymentAgentParty == null) {
            paymentAgentParty = new ArrayList<AgentPartyType>();
        }
        return this.paymentAgentParty;
    }

    /**
     * Obtém o valor da propriedade tradePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTradePeriod() {
        return tradePeriod;
    }

    /**
     * Define o valor da propriedade tradePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTradePeriod(PeriodType value) {
        this.tradePeriod = value;
    }

    /**
     * Obtém o valor da propriedade tradeSequence.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeSequence() {
        return tradeSequence;
    }

    /**
     * Define o valor da propriedade tradeSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeSequence(BigDecimal value) {
        this.tradeSequence = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
    }

}
