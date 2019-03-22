
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.PostBoxAddressType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.StructuredAddressType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeContactType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.UnstructuredAddressType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de AgentPartyType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AgentPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="AdditionalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="PostalStructuredAddress" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}StructuredAddressType" minOccurs="0"/>
 *         &lt;element name="PostalUnstructuredAddress" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}UnstructuredAddressType" minOccurs="0"/>
 *         &lt;element name="PostalPostBoxAddress" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}PostBoxAddressType" minOccurs="0"/>
 *         &lt;element name="DefinedTradeContact" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentPartyType", propOrder = {
    "primaryID",
    "additionalID",
    "taxID",
    "name",
    "postalStructuredAddress",
    "postalUnstructuredAddress",
    "postalPostBoxAddress",
    "definedTradeContact"
})
public class AgentPartyType {

    @XmlElement(name = "PrimaryID")
    protected IDType primaryID;
    @XmlElement(name = "AdditionalID")
    protected List<IDType> additionalID;
    @XmlElement(name = "TaxID")
    protected List<IDType> taxID;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "PostalStructuredAddress")
    protected StructuredAddressType postalStructuredAddress;
    @XmlElement(name = "PostalUnstructuredAddress")
    protected UnstructuredAddressType postalUnstructuredAddress;
    @XmlElement(name = "PostalPostBoxAddress")
    protected PostBoxAddressType postalPostBoxAddress;
    @XmlElement(name = "DefinedTradeContact")
    protected List<TradeContactType> definedTradeContact;

    /**
     * Obtém o valor da propriedade primaryID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPrimaryID() {
        return primaryID;
    }

    /**
     * Define o valor da propriedade primaryID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPrimaryID(IDType value) {
        this.primaryID = value;
    }

    /**
     * Gets the value of the additionalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getAdditionalID() {
        if (additionalID == null) {
            additionalID = new ArrayList<IDType>();
        }
        return this.additionalID;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getTaxID() {
        if (taxID == null) {
            taxID = new ArrayList<IDType>();
        }
        return this.taxID;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade postalStructuredAddress.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAddressType }
     *     
     */
    public StructuredAddressType getPostalStructuredAddress() {
        return postalStructuredAddress;
    }

    /**
     * Define o valor da propriedade postalStructuredAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAddressType }
     *     
     */
    public void setPostalStructuredAddress(StructuredAddressType value) {
        this.postalStructuredAddress = value;
    }

    /**
     * Obtém o valor da propriedade postalUnstructuredAddress.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredAddressType }
     *     
     */
    public UnstructuredAddressType getPostalUnstructuredAddress() {
        return postalUnstructuredAddress;
    }

    /**
     * Define o valor da propriedade postalUnstructuredAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredAddressType }
     *     
     */
    public void setPostalUnstructuredAddress(UnstructuredAddressType value) {
        this.postalUnstructuredAddress = value;
    }

    /**
     * Obtém o valor da propriedade postalPostBoxAddress.
     * 
     * @return
     *     possible object is
     *     {@link PostBoxAddressType }
     *     
     */
    public PostBoxAddressType getPostalPostBoxAddress() {
        return postalPostBoxAddress;
    }

    /**
     * Define o valor da propriedade postalPostBoxAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBoxAddressType }
     *     
     */
    public void setPostalPostBoxAddress(PostBoxAddressType value) {
        this.postalPostBoxAddress = value;
    }

    /**
     * Gets the value of the definedTradeContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definedTradeContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedTradeContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeContactType }
     * 
     * 
     */
    public List<TradeContactType> getDefinedTradeContact() {
        if (definedTradeContact == null) {
            definedTradeContact = new ArrayList<TradeContactType>();
        }
        return this.definedTradeContact;
    }

}
