
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import fec.florecom.xml.data.draft.qualifieddatatype._7.ImageCategoryCodeType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.ImageSubjectCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DocumentStatusCodeType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.SupplierPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.TradeNoteType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.BinaryObjectType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de ImageLineItemType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImageLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}ImageCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="DocumentStatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DocumentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="TakenDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalInformationTradeNote" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}TradeNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="CopyrightOwnerParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}OwnerPartyType" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PeriodType" minOccurs="0"/>
 *         &lt;element name="SubjectCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}ImageSubjectCodeType" minOccurs="0"/>
 *         &lt;element name="DigitalImageBinaryObject" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}BinaryObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageLineItemType", propOrder = {
    "id",
    "categoryCode",
    "documentStatusCode",
    "takenDateTime",
    "referencedDocument",
    "additionalInformationTradeNote",
    "supplierParty",
    "copyrightOwnerParty",
    "product",
    "validityPeriod",
    "subjectCode",
    "digitalImageBinaryObject"
})
public class ImageLineItemType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "CategoryCode")
    protected ImageCategoryCodeType categoryCode;
    @XmlElement(name = "DocumentStatusCode")
    protected DocumentStatusCodeType documentStatusCode;
    @XmlElement(name = "TakenDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takenDateTime;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;
    @XmlElement(name = "AdditionalInformationTradeNote")
    protected List<TradeNoteType> additionalInformationTradeNote;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "CopyrightOwnerParty")
    protected OwnerPartyType copyrightOwnerParty;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "SubjectCode")
    protected ImageSubjectCodeType subjectCode;
    @XmlElement(name = "DigitalImageBinaryObject")
    protected BinaryObjectType digitalImageBinaryObject;

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
     * Obtém o valor da propriedade categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link ImageCategoryCodeType }
     *     
     */
    public ImageCategoryCodeType getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define o valor da propriedade categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCategoryCodeType }
     *     
     */
    public void setCategoryCode(ImageCategoryCodeType value) {
        this.categoryCode = value;
    }

    /**
     * Obtém o valor da propriedade documentStatusCode.
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
     * Obtém o valor da propriedade takenDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakenDateTime() {
        return takenDateTime;
    }

    /**
     * Define o valor da propriedade takenDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakenDateTime(XMLGregorianCalendar value) {
        this.takenDateTime = value;
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
     * Obtém o valor da propriedade supplierParty.
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
     * Obtém o valor da propriedade copyrightOwnerParty.
     * 
     * @return
     *     possible object is
     *     {@link OwnerPartyType }
     *     
     */
    public OwnerPartyType getCopyrightOwnerParty() {
        return copyrightOwnerParty;
    }

    /**
     * Define o valor da propriedade copyrightOwnerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerPartyType }
     *     
     */
    public void setCopyrightOwnerParty(OwnerPartyType value) {
        this.copyrightOwnerParty = value;
    }

    /**
     * Obtém o valor da propriedade product.
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
     * Obtém o valor da propriedade validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Define o valor da propriedade validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Obtém o valor da propriedade subjectCode.
     * 
     * @return
     *     possible object is
     *     {@link ImageSubjectCodeType }
     *     
     */
    public ImageSubjectCodeType getSubjectCode() {
        return subjectCode;
    }

    /**
     * Define o valor da propriedade subjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSubjectCodeType }
     *     
     */
    public void setSubjectCode(ImageSubjectCodeType value) {
        this.subjectCode = value;
    }

    /**
     * Obtém o valor da propriedade digitalImageBinaryObject.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getDigitalImageBinaryObject() {
        return digitalImageBinaryObject;
    }

    /**
     * Define o valor da propriedade digitalImageBinaryObject.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     */
    public void setDigitalImageBinaryObject(BinaryObjectType value) {
        this.digitalImageBinaryObject = value;
    }

}
