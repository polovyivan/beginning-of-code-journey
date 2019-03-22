
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.PaymentTermsEventTimeReferenceCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.PaymentTermsIDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.MeasureType;


/**
 * <p>Classe Java de TradePaymentTermsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradePaymentTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}PaymentTermsIDType" minOccurs="0"/>
 *         &lt;element name="FromEventCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}PaymentTermsEventTimeReferenceCodeType" minOccurs="0"/>
 *         &lt;element name="SettlementPeriodMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePaymentTermsType", propOrder = {
    "id",
    "fromEventCode",
    "settlementPeriodMeasure"
})
public class TradePaymentTermsType {

    @XmlElement(name = "ID")
    protected PaymentTermsIDType id;
    @XmlElement(name = "FromEventCode")
    protected PaymentTermsEventTimeReferenceCodeType fromEventCode;
    @XmlElement(name = "SettlementPeriodMeasure")
    protected MeasureType settlementPeriodMeasure;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsIDType }
     *     
     */
    public PaymentTermsIDType getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsIDType }
     *     
     */
    public void setID(PaymentTermsIDType value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade fromEventCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsEventTimeReferenceCodeType }
     *     
     */
    public PaymentTermsEventTimeReferenceCodeType getFromEventCode() {
        return fromEventCode;
    }

    /**
     * Define o valor da propriedade fromEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsEventTimeReferenceCodeType }
     *     
     */
    public void setFromEventCode(PaymentTermsEventTimeReferenceCodeType value) {
        this.fromEventCode = value;
    }

    /**
     * Obtém o valor da propriedade settlementPeriodMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSettlementPeriodMeasure() {
        return settlementPeriodMeasure;
    }

    /**
     * Define o valor da propriedade settlementPeriodMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSettlementPeriodMeasure(MeasureType value) {
        this.settlementPeriodMeasure = value;
    }

}
