
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ConsigneePartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ConsignorPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.CustomerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.InvoiceePartyType;


/**
 * <p>Classe Java de ConsignmentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderedByParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="LogisticAgentParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}AgentPartyType" minOccurs="0"/>
 *         &lt;element name="ConsignorParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ConsignorPartyType" minOccurs="0"/>
 *         &lt;element name="ConsigneeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ConsigneePartyType" minOccurs="0"/>
 *         &lt;element name="InvoiceeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}InvoiceePartyType" minOccurs="0"/>
 *         &lt;element name="NotifyParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}NotifyPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedDespatchLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedDeliveryLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" minOccurs="0"/>
 *         &lt;element name="ConsignmentInstruction" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InformationInstructionsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConsignmentType", propOrder = {
    "orderedByParty",
    "logisticAgentParty",
    "consignorParty",
    "consigneeParty",
    "invoiceeParty",
    "notifyParty",
    "specifiedDespatchLocation",
    "specifiedDeliveryLocation",
    "consignmentInstruction",
    "earliestDespatchDateTime",
    "latestDespatchDateTime",
    "earliestDeliveryDateTime",
    "latestDeliveryDateTime"
})
public class ConsignmentType {

    @XmlElement(name = "OrderedByParty")
    protected CustomerPartyType orderedByParty;
    @XmlElement(name = "LogisticAgentParty")
    protected AgentPartyType logisticAgentParty;
    @XmlElement(name = "ConsignorParty")
    protected ConsignorPartyType consignorParty;
    @XmlElement(name = "ConsigneeParty")
    protected ConsigneePartyType consigneeParty;
    @XmlElement(name = "InvoiceeParty")
    protected InvoiceePartyType invoiceeParty;
    @XmlElement(name = "NotifyParty")
    protected List<NotifyPartyType> notifyParty;
    @XmlElement(name = "SpecifiedDespatchLocation")
    protected LocationType specifiedDespatchLocation;
    @XmlElement(name = "SpecifiedDeliveryLocation")
    protected LocationType specifiedDeliveryLocation;
    @XmlElement(name = "ConsignmentInstruction")
    protected List<InformationInstructionsType> consignmentInstruction;
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
     * Obtém o valor da propriedade orderedByParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getOrderedByParty() {
        return orderedByParty;
    }

    /**
     * Define o valor da propriedade orderedByParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setOrderedByParty(CustomerPartyType value) {
        this.orderedByParty = value;
    }

    /**
     * Obtém o valor da propriedade logisticAgentParty.
     * 
     * @return
     *     possible object is
     *     {@link AgentPartyType }
     *     
     */
    public AgentPartyType getLogisticAgentParty() {
        return logisticAgentParty;
    }

    /**
     * Define o valor da propriedade logisticAgentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPartyType }
     *     
     */
    public void setLogisticAgentParty(AgentPartyType value) {
        this.logisticAgentParty = value;
    }

    /**
     * Obtém o valor da propriedade consignorParty.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorPartyType }
     *     
     */
    public ConsignorPartyType getConsignorParty() {
        return consignorParty;
    }

    /**
     * Define o valor da propriedade consignorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorPartyType }
     *     
     */
    public void setConsignorParty(ConsignorPartyType value) {
        this.consignorParty = value;
    }

    /**
     * Obtém o valor da propriedade consigneeParty.
     * 
     * @return
     *     possible object is
     *     {@link ConsigneePartyType }
     *     
     */
    public ConsigneePartyType getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Define o valor da propriedade consigneeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneePartyType }
     *     
     */
    public void setConsigneeParty(ConsigneePartyType value) {
        this.consigneeParty = value;
    }

    /**
     * Obtém o valor da propriedade invoiceeParty.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceePartyType }
     *     
     */
    public InvoiceePartyType getInvoiceeParty() {
        return invoiceeParty;
    }

    /**
     * Define o valor da propriedade invoiceeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceePartyType }
     *     
     */
    public void setInvoiceeParty(InvoiceePartyType value) {
        this.invoiceeParty = value;
    }

    /**
     * Gets the value of the notifyParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotifyPartyType }
     * 
     * 
     */
    public List<NotifyPartyType> getNotifyParty() {
        if (notifyParty == null) {
            notifyParty = new ArrayList<NotifyPartyType>();
        }
        return this.notifyParty;
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
     * Gets the value of the consignmentInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignmentInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignmentInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationInstructionsType }
     * 
     * 
     */
    public List<InformationInstructionsType> getConsignmentInstruction() {
        if (consignmentInstruction == null) {
            consignmentInstruction = new ArrayList<InformationInstructionsType>();
        }
        return this.consignmentInstruction;
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
