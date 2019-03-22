
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import un.unece.uncefact.data.standard.qualifieddatatype._3.CurrencyCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de AllowanceChargeCurrencyExchangeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeCurrencyExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="SourceUnitBasisNumeric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TargetCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="TargetUnitBaseNumeric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarketID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ConversionRateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ApplicableTradeContract" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeContractType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeCurrencyExchangeType", propOrder = {
    "sourceCurrencyCode",
    "sourceUnitBasisNumeric",
    "targetCurrencyCode",
    "targetUnitBaseNumeric",
    "marketID",
    "conversionRate",
    "conversionRateDateTime",
    "applicableTradeContract"
})
public class AllowanceChargeCurrencyExchangeType {

    @XmlElement(name = "SourceCurrencyCode")
    protected CurrencyCodeType sourceCurrencyCode;
    @XmlElement(name = "SourceUnitBasisNumeric")
    protected BigDecimal sourceUnitBasisNumeric;
    @XmlElement(name = "TargetCurrencyCode")
    protected CurrencyCodeType targetCurrencyCode;
    @XmlElement(name = "TargetUnitBaseNumeric")
    protected BigDecimal targetUnitBaseNumeric;
    @XmlElement(name = "MarketID")
    protected IDType marketID;
    @XmlElement(name = "ConversionRate", required = true)
    protected BigDecimal conversionRate;
    @XmlElement(name = "ConversionRateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar conversionRateDateTime;
    @XmlElement(name = "ApplicableTradeContract")
    protected TradeContractType applicableTradeContract;

    /**
     * Obtém o valor da propriedade sourceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Define o valor da propriedade sourceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setSourceCurrencyCode(CurrencyCodeType value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade sourceUnitBasisNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceUnitBasisNumeric() {
        return sourceUnitBasisNumeric;
    }

    /**
     * Define o valor da propriedade sourceUnitBasisNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceUnitBasisNumeric(BigDecimal value) {
        this.sourceUnitBasisNumeric = value;
    }

    /**
     * Obtém o valor da propriedade targetCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Define o valor da propriedade targetCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTargetCurrencyCode(CurrencyCodeType value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Obtém o valor da propriedade targetUnitBaseNumeric.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetUnitBaseNumeric() {
        return targetUnitBaseNumeric;
    }

    /**
     * Define o valor da propriedade targetUnitBaseNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetUnitBaseNumeric(BigDecimal value) {
        this.targetUnitBaseNumeric = value;
    }

    /**
     * Obtém o valor da propriedade marketID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMarketID() {
        return marketID;
    }

    /**
     * Define o valor da propriedade marketID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMarketID(IDType value) {
        this.marketID = value;
    }

    /**
     * Obtém o valor da propriedade conversionRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Define o valor da propriedade conversionRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Obtém o valor da propriedade conversionRateDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConversionRateDateTime() {
        return conversionRateDateTime;
    }

    /**
     * Define o valor da propriedade conversionRateDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConversionRateDateTime(XMLGregorianCalendar value) {
        this.conversionRateDateTime = value;
    }

    /**
     * Obtém o valor da propriedade applicableTradeContract.
     * 
     * @return
     *     possible object is
     *     {@link TradeContractType }
     *     
     */
    public TradeContractType getApplicableTradeContract() {
        return applicableTradeContract;
    }

    /**
     * Define o valor da propriedade applicableTradeContract.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeContractType }
     *     
     */
    public void setApplicableTradeContract(TradeContractType value) {
        this.applicableTradeContract = value;
    }

}
