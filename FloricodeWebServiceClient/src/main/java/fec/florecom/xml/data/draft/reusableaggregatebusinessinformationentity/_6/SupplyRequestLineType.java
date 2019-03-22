
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
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeLocationType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeNoteType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de SupplyRequestLineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SupplyRequestLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentStatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentStatusCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MutationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TradingTerms" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TradingTermsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalInformationTradeNote" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SellerPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}BuyerPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SupplierPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}CustomerPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndUserParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}EndUserPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotifyParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}NotifyPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Price" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PriceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Packing" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Delivery" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}DeliveryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSampleLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}StatusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyRequestLineType", propOrder = {
    "id",
    "documentType",
    "documentStatusCode",
    "mutationDateTime",
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
    "productSampleLocation",
    "status",
    "physicalLocation"
})
public class SupplyRequestLineType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "DocumentType")
    protected List<DocumentCodeType> documentType;
    @XmlElement(name = "DocumentStatusCode")
    protected List<DocumentStatusCodeType> documentStatusCode;
    @XmlElement(name = "MutationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mutationDateTime;
    @XmlElement(name = "TradingTerms")
    protected List<TradingTermsType> tradingTerms;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;
    @XmlElement(name = "AdditionalInformationTradeNote")
    protected List<TradeNoteType> additionalInformationTradeNote;
    @XmlElement(name = "SellerParty")
    protected List<SellerPartyType> sellerParty;
    @XmlElement(name = "BuyerParty")
    protected List<BuyerPartyType> buyerParty;
    @XmlElement(name = "SupplierParty")
    protected List<SupplierPartyType> supplierParty;
    @XmlElement(name = "CustomerParty")
    protected List<CustomerPartyType> customerParty;
    @XmlElement(name = "EndUserParty")
    protected List<EndUserPartyType> endUserParty;
    @XmlElement(name = "NotifyParty")
    protected List<NotifyPartyType> notifyParty;
    @XmlElement(name = "Product")
    protected List<ProductType> product;
    @XmlElement(name = "Quantity")
    protected List<QuantityType> quantity;
    @XmlElement(name = "Price")
    protected List<PriceType> price;
    @XmlElement(name = "Packing")
    protected List<PackingType> packing;
    @XmlElement(name = "Delivery")
    protected List<DeliveryType> delivery;
    @XmlElement(name = "ProductSampleLocation")
    protected List<TradeLocationType> productSampleLocation;
    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "PhysicalLocation")
    protected List<LocationType> physicalLocation;

    /**
     * Obtém o valor da propriedade id.
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
     * Gets the value of the documentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentCodeType }
     * 
     * 
     */
    public List<DocumentCodeType> getDocumentType() {
        if (documentType == null) {
            documentType = new ArrayList<DocumentCodeType>();
        }
        return this.documentType;
    }

    /**
     * Gets the value of the documentStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentStatusCodeType }
     * 
     * 
     */
    public List<DocumentStatusCodeType> getDocumentStatusCode() {
        if (documentStatusCode == null) {
            documentStatusCode = new ArrayList<DocumentStatusCodeType>();
        }
        return this.documentStatusCode;
    }

    /**
     * Obtém o valor da propriedade mutationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMutationDateTime() {
        return mutationDateTime;
    }

    /**
     * Define o valor da propriedade mutationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMutationDateTime(XMLGregorianCalendar value) {
        this.mutationDateTime = value;
    }

    /**
     * Gets the value of the tradingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingTermsType }
     * 
     * 
     */
    public List<TradingTermsType> getTradingTerms() {
        if (tradingTerms == null) {
            tradingTerms = new ArrayList<TradingTermsType>();
        }
        return this.tradingTerms;
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
     * Gets the value of the sellerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellerPartyType }
     * 
     * 
     */
    public List<SellerPartyType> getSellerParty() {
        if (sellerParty == null) {
            sellerParty = new ArrayList<SellerPartyType>();
        }
        return this.sellerParty;
    }

    /**
     * Gets the value of the buyerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPartyType }
     * 
     * 
     */
    public List<BuyerPartyType> getBuyerParty() {
        if (buyerParty == null) {
            buyerParty = new ArrayList<BuyerPartyType>();
        }
        return this.buyerParty;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierPartyType }
     * 
     * 
     */
    public List<SupplierPartyType> getSupplierParty() {
        if (supplierParty == null) {
            supplierParty = new ArrayList<SupplierPartyType>();
        }
        return this.supplierParty;
    }

    /**
     * Gets the value of the customerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPartyType }
     * 
     * 
     */
    public List<CustomerPartyType> getCustomerParty() {
        if (customerParty == null) {
            customerParty = new ArrayList<CustomerPartyType>();
        }
        return this.customerParty;
    }

    /**
     * Gets the value of the endUserParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endUserParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndUserParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndUserPartyType }
     * 
     * 
     */
    public List<EndUserPartyType> getEndUserParty() {
        if (endUserParty == null) {
            endUserParty = new ArrayList<EndUserPartyType>();
        }
        return this.endUserParty;
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
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<ProductType>();
        }
        return this.product;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityType>();
        }
        return this.quantity;
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
     * Gets the value of the packing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingType }
     * 
     * 
     */
    public List<PackingType> getPacking() {
        if (packing == null) {
            packing = new ArrayList<PackingType>();
        }
        return this.packing;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryType }
     * 
     * 
     */
    public List<DeliveryType> getDelivery() {
        if (delivery == null) {
            delivery = new ArrayList<DeliveryType>();
        }
        return this.delivery;
    }

    /**
     * Gets the value of the productSampleLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSampleLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSampleLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLocationType }
     * 
     * 
     */
    public List<TradeLocationType> getProductSampleLocation() {
        if (productSampleLocation == null) {
            productSampleLocation = new ArrayList<TradeLocationType>();
        }
        return this.productSampleLocation;
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
     * Gets the value of the physicalLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getPhysicalLocation() {
        if (physicalLocation == null) {
            physicalLocation = new ArrayList<LocationType>();
        }
        return this.physicalLocation;
    }

}
