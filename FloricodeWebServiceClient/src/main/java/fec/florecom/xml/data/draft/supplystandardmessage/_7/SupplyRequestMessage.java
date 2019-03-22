
package fec.florecom.xml.data.draft.supplystandardmessage._7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de SupplyRequestMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SupplyRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *                   &lt;element name="Password" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *                   &lt;element name="MessageID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *                   &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="MessageSerial" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Body" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SupplyRequestDetails" type="{urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7}SupplyRequestType" minOccurs="0"/>
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
@XmlType(name = "SupplyRequestMessage", propOrder = {
    "header",
    "body"
})
public class SupplyRequestMessage {

    @XmlElement(name = "Header")
    protected SupplyRequestMessage.Header header;
    @XmlElement(name = "Body")
    protected SupplyRequestMessage.Body body;

    /**
     * Obtém o valor da propriedade header.
     * 
     * @return
     *     possible object is
     *     {@link SupplyRequestMessage.Header }
     *     
     */
    public SupplyRequestMessage.Header getHeader() {
        return header;
    }

    /**
     * Define o valor da propriedade header.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequestMessage.Header }
     *     
     */
    public void setHeader(SupplyRequestMessage.Header value) {
        this.header = value;
    }

    /**
     * Obtém o valor da propriedade body.
     * 
     * @return
     *     possible object is
     *     {@link SupplyRequestMessage.Body }
     *     
     */
    public SupplyRequestMessage.Body getBody() {
        return body;
    }

    /**
     * Define o valor da propriedade body.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyRequestMessage.Body }
     *     
     */
    public void setBody(SupplyRequestMessage.Body value) {
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
     *         &lt;element name="SupplyRequestDetails" type="{urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7}SupplyRequestType" minOccurs="0"/>
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
        "supplyRequestDetails"
    })
    public static class Body {

        @XmlElement(name = "SupplyRequestDetails")
        protected SupplyRequestType supplyRequestDetails;

        /**
         * Obtém o valor da propriedade supplyRequestDetails.
         * 
         * @return
         *     possible object is
         *     {@link SupplyRequestType }
         *     
         */
        public SupplyRequestType getSupplyRequestDetails() {
            return supplyRequestDetails;
        }

        /**
         * Define o valor da propriedade supplyRequestDetails.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyRequestType }
         *     
         */
        public void setSupplyRequestDetails(SupplyRequestType value) {
            this.supplyRequestDetails = value;
        }

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
     *         &lt;element name="UserName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
     *         &lt;element name="Password" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
     *         &lt;element name="MessageID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
     *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="MessageSerial" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "userName",
        "password",
        "messageID",
        "messageDateTime",
        "messageSerial",
        "referencedDocument"
    })
    public static class Header {

        @XmlElement(name = "UserName")
        protected TextType userName;
        @XmlElement(name = "Password")
        protected TextType password;
        @XmlElement(name = "MessageID")
        protected IDType messageID;
        @XmlElement(name = "MessageDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar messageDateTime;
        @XmlElement(name = "MessageSerial", required = true)
        protected BigDecimal messageSerial;
        @XmlElement(name = "ReferencedDocument")
        protected List<ReferencedDocumentType> referencedDocument;

        /**
         * Obtém o valor da propriedade userName.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getUserName() {
            return userName;
        }

        /**
         * Define o valor da propriedade userName.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setUserName(TextType value) {
            this.userName = value;
        }

        /**
         * Obtém o valor da propriedade password.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getPassword() {
            return password;
        }

        /**
         * Define o valor da propriedade password.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setPassword(TextType value) {
            this.password = value;
        }

        /**
         * Obtém o valor da propriedade messageID.
         * 
         * @return
         *     possible object is
         *     {@link IDType }
         *     
         */
        public IDType getMessageID() {
            return messageID;
        }

        /**
         * Define o valor da propriedade messageID.
         * 
         * @param value
         *     allowed object is
         *     {@link IDType }
         *     
         */
        public void setMessageID(IDType value) {
            this.messageID = value;
        }

        /**
         * Obtém o valor da propriedade messageDateTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMessageDateTime() {
            return messageDateTime;
        }

        /**
         * Define o valor da propriedade messageDateTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMessageDateTime(XMLGregorianCalendar value) {
            this.messageDateTime = value;
        }

        /**
         * Obtém o valor da propriedade messageSerial.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMessageSerial() {
            return messageSerial;
        }

        /**
         * Define o valor da propriedade messageSerial.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMessageSerial(BigDecimal value) {
            this.messageSerial = value;
        }

        /**
         * Gets the value of the referencedDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referencedDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferencedDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferencedDocumentType }
         * 
         * 
         */
        public List<ReferencedDocumentType> getReferencedDocument() {
            if (referencedDocument == null) {
                referencedDocument = new ArrayList<ReferencedDocumentType>();
            }
            return this.referencedDocument;
        }

    }

}
