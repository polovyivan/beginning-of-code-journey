
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DocumentCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DocumentStatusCodeType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.BuyerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.CustomerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.EndUserPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.SellerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.SupplierPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeNoteType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de OrderTradeLineItemType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderTradeLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentCodeType" minOccurs="0"/>
 *         &lt;element name="DocumentStatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LineDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TradingTerms" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TradingTermsType" minOccurs="0"/>
 *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalInformationTradeNote" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SellerPartyType" minOccurs="0"/>
 *         &lt;element name="BuyerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}BuyerPartyType" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="CustomerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}CustomerPartyType" minOccurs="0"/>
 *         &lt;element name="EndUserParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}EndUserPartyType" minOccurs="0"/>
 *         &lt;element name="NotifyParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}NotifyPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PriceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Packing" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackingType" minOccurs="0"/>
 *         &lt;element name="Delivery" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}DeliveryType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}StatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InspectionRequest" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InspectionRequestType" minOccurs="0"/>
 *         &lt;element name="Consignment" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ConsignmentType" minOccurs="0"/>
 *         &lt;element name="Leg" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LegType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradeTotal" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TotalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedImageLine" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ImageLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OnSupplyChainStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubordinateOrderTradeLineItem" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}OrderTradeLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTradeLineItemType", propOrder = {
    "id",
    "documentType",
    "documentStatusCode",
    "lineDateTime",
    "tradingTerms",
    "referencedDocument",
    "additionalInformationTradeNote",
    "sellerParty",
    "buyerParty",
    "supplierParty",
    "customerParty",
    "endUserParty",
    "notifyParty",
    "product",
    "quantity",
    "price",
    "packing",
    "delivery",
    "status",
    "inspectionRequest",
    "consignment",
    "leg",
    "tradeTotal",
    "includedImageLine",
    "onSupplyChainStartDateTime",
    "subordinateOrderTradeLineItem"
})
public class OrderTradeLineItemType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "DocumentType")
    protected DocumentCodeType documentType;
    @XmlElement(name = "DocumentStatusCode")
    protected DocumentStatusCodeType documentStatusCode;
    @XmlElement(name = "LineDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lineDateTime;
    @XmlElement(name = "TradingTerms")
    protected TradingTermsType tradingTerms;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;
    @XmlElement(name = "AdditionalInformationTradeNote")
    protected List<TradeNoteType> additionalInformationTradeNote;
    @XmlElement(name = "SellerParty")
    protected SellerPartyType sellerParty;
    @XmlElement(name = "BuyerParty")
    protected BuyerPartyType buyerParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "CustomerParty")
    protected CustomerPartyType customerParty;
    @XmlElement(name = "EndUserParty")
    protected EndUserPartyType endUserParty;
    @XmlElement(name = "NotifyParty")
    protected List<NotifyPartyType> notifyParty;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Quantity")
    protected QuantityType quantity;
    @XmlElement(name = "Price")
    protected List<PriceType> price;
    @XmlElement(name = "Packing")
    protected PackingType packing;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "InspectionRequest")
    protected InspectionRequestType inspectionRequest;
    @XmlElement(name = "Consignment")
    protected ConsignmentType consignment;
    @XmlElement(name = "Leg")
    protected List<LegType> leg;
    @XmlElement(name = "TradeTotal")
    protected List<TotalType> tradeTotal;
    @XmlElement(name = "IncludedImageLine")
    protected List<ImageLineItemType> includedImageLine;
    @XmlElement(name = "OnSupplyChainStartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onSupplyChainStartDateTime;
    @XmlElement(name = "SubordinateOrderTradeLineItem")
    protected List<OrderTradeLineItemType> subordinateOrderTradeLineItem;

    /**
     * Obt�m o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade documentType.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCodeType }
     *     
     */
    public DocumentCodeType getDocumentType() {
        return documentType;
    }

    /**
     * Define o valor da propriedade documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCodeType }
     *     
     */
    public void setDocumentType(DocumentCodeType value) {
        this.documentType = value;
    }

    /**
     * Obt�m o valor da propriedade documentStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusCodeType }
     *     
     */
    public DocumentStatusCodeType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Define o valor da propriedade documentStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusCodeType }
     *     
     */
    public void setDocumentStatusCode(DocumentStatusCodeType value) {
        this.documentStatusCode = value;
    }

    /**
     * Obt�m o valor da propriedade lineDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLineDateTime() {
        return lineDateTime;
    }

    /**
     * Define o valor da propriedade lineDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLineDateTime(XMLGregorianCalendar value) {
        this.lineDateTime = value;
    }

    /**
     * Obt�m o valor da propriedade tradingTerms.
     * 
     * @return
     *     possible object is
     *     {@link TradingTermsType }
     *     
     */
    public TradingTermsType getTradingTerms() {
        return tradingTerms;
    }

    /**
     * Define o valor da propriedade tradingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingTermsType }
     *     
     */
    public void setTradingTerms(TradingTermsType value) {
        this.tradingTerms = value;
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

    /**
     * Gets the value of the additionalInformationTradeNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformationTradeNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformationTradeNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeNoteType }
     * 
     * 
     */
    public List<TradeNoteType> getAdditionalInformationTradeNote() {
        if (additionalInformationTradeNote == null) {
            additionalInformationTradeNote = new ArrayList<TradeNoteType>();
        }
        return this.additionalInformationTradeNote;
    }

    /**
     * Obt�m o valor da propriedade sellerParty.
     * 
     * @return
     *     possible object is
     *     {@link SellerPartyType }
     *     
     */
    public SellerPartyType getSellerParty() {
        return sellerParty;
    }

    /**
     * Define o valor da propriedade sellerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPartyType }
     *     
     */
    public void setSellerParty(SellerPartyType value) {
        this.sellerParty = value;
    }

    /**
     * Obt�m o valor da propriedade buyerParty.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPartyType }
     *     
     */
    public BuyerPartyType getBuyerParty() {
        return buyerParty;
    }

    /**
     * Define o valor da propriedade buyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPartyType }
     *     
     */
    public void setBuyerParty(BuyerPartyType value) {
        this.buyerParty = value;
    }

    /**
     * Obt�m o valor da propriedade supplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Define o valor da propriedade supplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
    }

    /**
     * Obt�m o valor da propriedade customerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getCustomerParty() {
        return customerParty;
    }

    /**
     * Define o valor da propriedade customerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setCustomerParty(CustomerPartyType value) {
        this.customerParty = value;
    }

    /**
     * Obt�m o valor da propriedade endUserParty.
     * 
     * @return
     *     possible object is
     *     {@link EndUserPartyType }
     *     
     */
    public EndUserPartyType getEndUserParty() {
        return endUserParty;
    }

    /**
     * Define o valor da propriedade endUserParty.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUserPartyType }
     *     
     */
    public void setEndUserParty(EndUserPartyType value) {
        this.endUserParty = value;
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
     * Obt�m o valor da propriedade product.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Define o valor da propriedade product.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * Obt�m o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<PriceType>();
        }
        return this.price;
    }

    /**
     * Obt�m o valor da propriedade packing.
     * 
     * @return
     *     possible object is
     *     {@link PackingType }
     *     
     */
    public PackingType getPacking() {
        return packing;
    }

    /**
     * Define o valor da propriedade packing.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingType }
     *     
     */
    public void setPacking(PackingType value) {
        this.packing = value;
    }

    /**
     * Obt�m o valor da propriedade delivery.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Define o valor da propriedade delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
    }

    /**
     * Obt�m o valor da propriedade inspectionRequest.
     * 
     * @return
     *     possible object is
     *     {@link InspectionRequestType }
     *     
     */
    public InspectionRequestType getInspectionRequest() {
        return inspectionRequest;
    }

    /**
     * Define o valor da propriedade inspectionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionRequestType }
     *     
     */
    public void setInspectionRequest(InspectionRequestType value) {
        this.inspectionRequest = value;
    }

    /**
     * Obt�m o valor da propriedade consignment.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentType }
     *     
     */
    public ConsignmentType getConsignment() {
        return consignment;
    }

    /**
     * Define o valor da propriedade consignment.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentType }
     *     
     */
    public void setConsignment(ConsignmentType value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegType }
     * 
     * 
     */
    public List<LegType> getLeg() {
        if (leg == null) {
            leg = new ArrayList<LegType>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the tradeTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalType }
     * 
     * 
     */
    public List<TotalType> getTradeTotal() {
        if (tradeTotal == null) {
            tradeTotal = new ArrayList<TotalType>();
        }
        return this.tradeTotal;
    }

    /**
     * Gets the value of the includedImageLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedImageLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedImageLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageLineItemType }
     * 
     * 
     */
    public List<ImageLineItemType> getIncludedImageLine() {
        if (includedImageLine == null) {
            includedImageLine = new ArrayList<ImageLineItemType>();
        }
        return this.includedImageLine;
    }

    /**
     * Obt�m o valor da propriedade onSupplyChainStartDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnSupplyChainStartDateTime() {
        return onSupplyChainStartDateTime;
    }

    /**
     * Define o valor da propriedade onSupplyChainStartDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnSupplyChainStartDateTime(XMLGregorianCalendar value) {
        this.onSupplyChainStartDateTime = value;
    }

    /**
     * Gets the value of the subordinateOrderTradeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateOrderTradeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateOrderTradeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderTradeLineItemType }
     * 
     * 
     */
    public List<OrderTradeLineItemType> getSubordinateOrderTradeLineItem() {
        if (subordinateOrderTradeLineItem == null) {
            subordinateOrderTradeLineItem = new ArrayList<OrderTradeLineItemType>();
        }
        return this.subordinateOrderTradeLineItem;
    }

}
