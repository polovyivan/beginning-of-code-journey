
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DocumentCodeType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeDeliveryTermsType;


/**
 * <p>Classe Java de DeliveryType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeDeliveryTermsType" minOccurs="0"/>
 *         &lt;element name="DeliveryPrice" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PriceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CarrierParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CarrierPartyType" minOccurs="0"/>
 *         &lt;element name="SpecifiedDespatchLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedDeliveryLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedTransshipmentLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="DeliveryInstructions" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InformationInstructionsType" minOccurs="0"/>
 *         &lt;element name="RequestedDocument" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EarliestOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestOrderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarliestDespatchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestDespatchDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarliestDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestDeliveryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "deliveryTerms",
    "deliveryPrice",
    "carrierParty",
    "specifiedDespatchLocation",
    "specifiedDeliveryLocation",
    "specifiedTransshipmentLocation",
    "deliveryInstructions",
    "requestedDocument",
    "earliestOrderDateTime",
    "latestOrderDateTime",
    "earliestDespatchDateTime",
    "latestDespatchDateTime",
    "earliestDeliveryDateTime",
    "latestDeliveryDateTime"
})
public class DeliveryType {

    @XmlElement(name = "DeliveryTerms")
    protected TradeDeliveryTermsType deliveryTerms;
    @XmlElement(name = "DeliveryPrice")
    protected List<PriceType> deliveryPrice;
    @XmlElement(name = "CarrierParty")
    protected CarrierPartyType carrierParty;
    @XmlElement(name = "SpecifiedDespatchLocation")
    protected LocationType specifiedDespatchLocation;
    @XmlElement(name = "SpecifiedDeliveryLocation")
    protected LocationType specifiedDeliveryLocation;
    @XmlElement(name = "SpecifiedTransshipmentLocation")
    protected LocationType specifiedTransshipmentLocation;
    @XmlElement(name = "DeliveryInstructions")
    protected InformationInstructionsType deliveryInstructions;
    @XmlElement(name = "RequestedDocument")
    protected List<DocumentCodeType> requestedDocument;
    @XmlElement(name = "EarliestOrderDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestOrderDateTime;
    @XmlElement(name = "LatestOrderDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestOrderDateTime;
    @XmlElement(name = "EarliestDespatchDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDespatchDateTime;
    @XmlElement(name = "LatestDespatchDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDespatchDateTime;
    @XmlElement(name = "EarliestDeliveryDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDeliveryDateTime;
    @XmlElement(name = "LatestDeliveryDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestDeliveryDateTime;

    /**
     * Obtém o valor da propriedade deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link TradeDeliveryTermsType }
     *     
     */
    public TradeDeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Define o valor da propriedade deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDeliveryTermsType }
     *     
     */
    public void setDeliveryTerms(TradeDeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the deliveryPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getDeliveryPrice() {
        if (deliveryPrice == null) {
            deliveryPrice = new ArrayList<PriceType>();
        }
        return this.deliveryPrice;
    }

    /**
     * Obtém o valor da propriedade carrierParty.
     * 
     * @return
     *     possible object is
     *     {@link CarrierPartyType }
     *     
     */
    public CarrierPartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Define o valor da propriedade carrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierPartyType }
     *     
     */
    public void setCarrierParty(CarrierPartyType value) {
        this.carrierParty = value;
    }

    /**
     * Obtém o valor da propriedade specifiedDespatchLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedDespatchLocation() {
        return specifiedDespatchLocation;
    }

    /**
     * Define o valor da propriedade specifiedDespatchLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedDespatchLocation(LocationType value) {
        this.specifiedDespatchLocation = value;
    }

    /**
     * Obtém o valor da propriedade specifiedDeliveryLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedDeliveryLocation() {
        return specifiedDeliveryLocation;
    }

    /**
     * Define o valor da propriedade specifiedDeliveryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedDeliveryLocation(LocationType value) {
        this.specifiedDeliveryLocation = value;
    }

    /**
     * Obtém o valor da propriedade specifiedTransshipmentLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedTransshipmentLocation() {
        return specifiedTransshipmentLocation;
    }

    /**
     * Define o valor da propriedade specifiedTransshipmentLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedTransshipmentLocation(LocationType value) {
        this.specifiedTransshipmentLocation = value;
    }

    /**
     * Obtém o valor da propriedade deliveryInstructions.
     * 
     * @return
     *     possible object is
     *     {@link InformationInstructionsType }
     *     
     */
    public InformationInstructionsType getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Define o valor da propriedade deliveryInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationInstructionsType }
     *     
     */
    public void setDeliveryInstructions(InformationInstructionsType value) {
        this.deliveryInstructions = value;
    }

    /**
     * Gets the value of the requestedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentCodeType }
     * 
     * 
     */
    public List<DocumentCodeType> getRequestedDocument() {
        if (requestedDocument == null) {
            requestedDocument = new ArrayList<DocumentCodeType>();
        }
        return this.requestedDocument;
    }

    /**
     * Obtém o valor da propriedade earliestOrderDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestOrderDateTime() {
        return earliestOrderDateTime;
    }

    /**
     * Define o valor da propriedade earliestOrderDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestOrderDateTime(XMLGregorianCalendar value) {
        this.earliestOrderDateTime = value;
    }

    /**
     * Obtém o valor da propriedade latestOrderDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestOrderDateTime() {
        return latestOrderDateTime;
    }

    /**
     * Define o valor da propriedade latestOrderDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestOrderDateTime(XMLGregorianCalendar value) {
        this.latestOrderDateTime = value;
    }

    /**
     * Obtém o valor da propriedade earliestDespatchDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDespatchDateTime() {
        return earliestDespatchDateTime;
    }

    /**
     * Define o valor da propriedade earliestDespatchDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDespatchDateTime(XMLGregorianCalendar value) {
        this.earliestDespatchDateTime = value;
    }

    /**
     * Obtém o valor da propriedade latestDespatchDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDespatchDateTime() {
        return latestDespatchDateTime;
    }

    /**
     * Define o valor da propriedade latestDespatchDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDespatchDateTime(XMLGregorianCalendar value) {
        this.latestDespatchDateTime = value;
    }

    /**
     * Obtém o valor da propriedade earliestDeliveryDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDeliveryDateTime() {
        return earliestDeliveryDateTime;
    }

    /**
     * Define o valor da propriedade earliestDeliveryDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDeliveryDateTime(XMLGregorianCalendar value) {
        this.earliestDeliveryDateTime = value;
    }

    /**
     * Obtém o valor da propriedade latestDeliveryDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestDeliveryDateTime() {
        return latestDeliveryDateTime;
    }

    /**
     * Define o valor da propriedade latestDeliveryDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestDeliveryDateTime(XMLGregorianCalendar value) {
        this.latestDeliveryDateTime = value;
    }

}
