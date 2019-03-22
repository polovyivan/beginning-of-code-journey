
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.DeliveryTermsCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de TradeDeliveryTermsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradeDeliveryTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}DeliveryTermsCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="RelevantTradeLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDeliveryTermsType", propOrder = {
    "deliveryTypeCode",
    "description",
    "relevantTradeLocation"
})
public class TradeDeliveryTermsType {

    @XmlElement(name = "DeliveryTypeCode")
    protected DeliveryTermsCodeType deliveryTypeCode;
    @XmlElement(name = "Description")
    protected TextType description;
    @XmlElement(name = "RelevantTradeLocation")
    protected TradeLocationType relevantTradeLocation;

    /**
     * Obtém o valor da propriedade deliveryTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public DeliveryTermsCodeType getDeliveryTypeCode() {
        return deliveryTypeCode;
    }

    /**
     * Define o valor da propriedade deliveryTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public void setDeliveryTypeCode(DeliveryTermsCodeType value) {
        this.deliveryTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade relevantTradeLocation.
     * 
     * @return
     *     possible object is
     *     {@link TradeLocationType }
     *     
     */
    public TradeLocationType getRelevantTradeLocation() {
        return relevantTradeLocation;
    }

    /**
     * Define o valor da propriedade relevantTradeLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLocationType }
     *     
     */
    public void setRelevantTradeLocation(TradeLocationType value) {
        this.relevantTradeLocation = value;
    }

}
