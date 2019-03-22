
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeTransportMeansType;


/**
 * <p>Classe Java de LegType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CarrierPartyType" minOccurs="0"/>
 *         &lt;element name="TransportMeans" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeTransportMeansType" minOccurs="0"/>
 *         &lt;element name="SpecifiedLoadingLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedUnloadingLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedTransshipLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="EarliestLoadingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestLoadingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EarliestUnloadingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestUnloadingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "LegType", propOrder = {
    "carrierParty",
    "transportMeans",
    "specifiedLoadingLocation",
    "specifiedUnloadingLocation",
    "specifiedTransshipLocation",
    "earliestLoadingDateTime",
    "latestLoadingDateTime",
    "earliestUnloadingDateTime",
    "latestUnloadingDateTime",
    "referencedDocument"
})
public class LegType {

    @XmlElement(name = "CarrierParty")
    protected CarrierPartyType carrierParty;
    @XmlElement(name = "TransportMeans")
    protected TradeTransportMeansType transportMeans;
    @XmlElement(name = "SpecifiedLoadingLocation")
    protected LocationType specifiedLoadingLocation;
    @XmlElement(name = "SpecifiedUnloadingLocation")
    protected LocationType specifiedUnloadingLocation;
    @XmlElement(name = "SpecifiedTransshipLocation")
    protected LocationType specifiedTransshipLocation;
    @XmlElement(name = "EarliestLoadingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestLoadingDateTime;
    @XmlElement(name = "LatestLoadingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestLoadingDateTime;
    @XmlElement(name = "EarliestUnloadingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestUnloadingDateTime;
    @XmlElement(name = "LatestUnloadingDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestUnloadingDateTime;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;

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
     * Obtém o valor da propriedade transportMeans.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransportMeansType }
     *     
     */
    public TradeTransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /**
     * Define o valor da propriedade transportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransportMeansType }
     *     
     */
    public void setTransportMeans(TradeTransportMeansType value) {
        this.transportMeans = value;
    }

    /**
     * Obtém o valor da propriedade specifiedLoadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedLoadingLocation() {
        return specifiedLoadingLocation;
    }

    /**
     * Define o valor da propriedade specifiedLoadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedLoadingLocation(LocationType value) {
        this.specifiedLoadingLocation = value;
    }

    /**
     * Obtém o valor da propriedade specifiedUnloadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedUnloadingLocation() {
        return specifiedUnloadingLocation;
    }

    /**
     * Define o valor da propriedade specifiedUnloadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedUnloadingLocation(LocationType value) {
        this.specifiedUnloadingLocation = value;
    }

    /**
     * Obtém o valor da propriedade specifiedTransshipLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getSpecifiedTransshipLocation() {
        return specifiedTransshipLocation;
    }

    /**
     * Define o valor da propriedade specifiedTransshipLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setSpecifiedTransshipLocation(LocationType value) {
        this.specifiedTransshipLocation = value;
    }

    /**
     * Obtém o valor da propriedade earliestLoadingDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestLoadingDateTime() {
        return earliestLoadingDateTime;
    }

    /**
     * Define o valor da propriedade earliestLoadingDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestLoadingDateTime(XMLGregorianCalendar value) {
        this.earliestLoadingDateTime = value;
    }

    /**
     * Obtém o valor da propriedade latestLoadingDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestLoadingDateTime() {
        return latestLoadingDateTime;
    }

    /**
     * Define o valor da propriedade latestLoadingDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestLoadingDateTime(XMLGregorianCalendar value) {
        this.latestLoadingDateTime = value;
    }

    /**
     * Obtém o valor da propriedade earliestUnloadingDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestUnloadingDateTime() {
        return earliestUnloadingDateTime;
    }

    /**
     * Define o valor da propriedade earliestUnloadingDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestUnloadingDateTime(XMLGregorianCalendar value) {
        this.earliestUnloadingDateTime = value;
    }

    /**
     * Obtém o valor da propriedade latestUnloadingDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestUnloadingDateTime() {
        return latestUnloadingDateTime;
    }

    /**
     * Define o valor da propriedade latestUnloadingDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestUnloadingDateTime(XMLGregorianCalendar value) {
        this.latestUnloadingDateTime = value;
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
