
package fec.florecom.xml.data.draft.orderstandardmessage._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderResponseMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Body" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderResponse" type="{urn:fec:florecom:xml:data:draft:OrderStandardMessage:7}OrderResponseType" minOccurs="0"/>
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
@XmlType(name = "OrderResponseMessage", propOrder = {
    "body"
})
public class OrderResponseMessage {

    @XmlElement(name = "Body")
    protected OrderResponseMessage.Body body;

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseMessage.Body }
     *     
     */
    public OrderResponseMessage.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseMessage.Body }
     *     
     */
    public void setBody(OrderResponseMessage.Body value) {
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
     *         &lt;element name="OrderResponse" type="{urn:fec:florecom:xml:data:draft:OrderStandardMessage:7}OrderResponseType" minOccurs="0"/>
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
        "orderResponse"
    })
    public static class Body {

        @XmlElement(name = "OrderResponse")
        protected OrderResponseType orderResponse;

        /**
         * Obtém o valor da propriedade orderResponse.
         * 
         * @return
         *     possible object is
         *     {@link OrderResponseType }
         *     
         */
        public OrderResponseType getOrderResponse() {
            return orderResponse;
        }

        /**
         * Define o valor da propriedade orderResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderResponseType }
         *     
         */
        public void setOrderResponse(OrderResponseType value) {
            this.orderResponse = value;
        }

    }

}
