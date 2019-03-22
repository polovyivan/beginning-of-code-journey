
package fec.florecom.xml.data.draft.supplystandardmessage._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SupplyResponseMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SupplyResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Body" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SupplyResponseDetails" type="{urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7}SupplyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyResponseMessage", propOrder = {
    "body"
})
public class SupplyResponseMessage {

    @XmlElement(name = "Body")
    protected SupplyResponseMessage.Body body;

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link SupplyResponseMessage.Body }
     *     
     */
    public SupplyResponseMessage.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResponseMessage.Body }
     *     
     */
    public void setBody(SupplyResponseMessage.Body value) {
        this.body = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SupplyResponseDetails" type="{urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7}SupplyType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "supplyResponseDetails"
    })
    public static class Body {

        @XmlElement(name = "SupplyResponseDetails")
        protected SupplyType supplyResponseDetails;

        /**
         * Obtém o valor da propriedade supplyResponseDetails.
         * 
         * @return
         *     possible object is
         *     {@link SupplyType }
         *     
         */
        public SupplyType getSupplyResponseDetails() {
            return supplyResponseDetails;
        }

        /**
         * Define o valor da propriedade supplyResponseDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyType }
         *     
         */
        public void setSupplyResponseDetails(SupplyType value) {
            this.supplyResponseDetails = value;
        }

    }

}
