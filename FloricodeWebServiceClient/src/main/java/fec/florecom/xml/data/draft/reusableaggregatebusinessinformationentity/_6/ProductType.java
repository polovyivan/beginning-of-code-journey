
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.TradeItemCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.CountryIDType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.EndUserPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ManufacturerPartyType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.MeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de ProductType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="CustomerAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="SupplierAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="ManufacturerAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="CustomsAssignedTariffID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="ManufacturerAssignedLotID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}TradeItemCodeType" minOccurs="0"/>
 *         &lt;element name="AdditionalDescriptionText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfigurableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubstituteIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetWeight" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="GrossWeight" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="ProductGroupID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="ApplicableCharacteristics" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicableGoodsCharacteristics" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DesignatedClassification" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubstituteProduct" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubstitutedProduct" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedProduct" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicablePackaging" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginCountry" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType" minOccurs="0"/>
 *         &lt;element name="SuppliedFromCountry" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinearDimension" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}DimensionType" minOccurs="0"/>
 *         &lt;element name="ManufacturerParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ManufacturerPartyType" minOccurs="0"/>
 *         &lt;element name="EndUserParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}EndUserPartyType" minOccurs="0"/>
 *         &lt;element name="ApplicableTotal" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "id",
    "industryAssignedID",
    "customerAssignedID",
    "supplierAssignedID",
    "manufacturerAssignedID",
    "customsAssignedTariffID",
    "manufacturerAssignedLotID",
    "descriptionText",
    "typeCode",
    "additionalDescriptionText",
    "configurableIndicator",
    "optionIndicator",
    "substituteIndicator",
    "netWeight",
    "grossWeight",
    "productGroupID",
    "statusCode",
    "applicableCharacteristics",
    "applicableGoodsCharacteristics",
    "designatedClassification",
    "substituteProduct",
    "substitutedProduct",
    "includedProduct",
    "applicablePackaging",
    "referencedDocument",
    "originCountry",
    "suppliedFromCountry",
    "linearDimension",
    "manufacturerParty",
    "endUserParty",
    "applicableTotal"
})
public class ProductType {

    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "IndustryAssignedID")
    protected IDType industryAssignedID;
    @XmlElement(name = "CustomerAssignedID")
    protected IDType customerAssignedID;
    @XmlElement(name = "SupplierAssignedID")
    protected IDType supplierAssignedID;
    @XmlElement(name = "ManufacturerAssignedID")
    protected IDType manufacturerAssignedID;
    @XmlElement(name = "CustomsAssignedTariffID")
    protected IDType customsAssignedTariffID;
    @XmlElement(name = "ManufacturerAssignedLotID")
    protected IDType manufacturerAssignedLotID;
    @XmlElement(name = "DescriptionText")
    protected TextType descriptionText;
    @XmlElement(name = "TypeCode")
    protected TradeItemCodeType typeCode;
    @XmlElement(name = "AdditionalDescriptionText")
    protected List<TextType> additionalDescriptionText;
    @XmlElement(name = "ConfigurableIndicator")
    protected Boolean configurableIndicator;
    @XmlElement(name = "OptionIndicator")
    protected Boolean optionIndicator;
    @XmlElement(name = "SubstituteIndicator")
    protected Boolean substituteIndicator;
    @XmlElement(name = "NetWeight")
    protected MeasureType netWeight;
    @XmlElement(name = "GrossWeight")
    protected MeasureType grossWeight;
    @XmlElement(name = "ProductGroupID")
    protected IDType productGroupID;
    @XmlElement(name = "StatusCode")
    protected CodeType statusCode;
    @XmlElement(name = "ApplicableCharacteristics")
    protected List<CharacteristicType> applicableCharacteristics;
    @XmlElement(name = "ApplicableGoodsCharacteristics")
    protected List<CharacteristicType> applicableGoodsCharacteristics;
    @XmlElement(name = "DesignatedClassification")
    protected List<ProductClassificationType> designatedClassification;
    @XmlElement(name = "SubstituteProduct")
    protected List<ProductType> substituteProduct;
    @XmlElement(name = "SubstitutedProduct")
    protected List<ProductType> substitutedProduct;
    @XmlElement(name = "IncludedProduct")
    protected List<ProductType> includedProduct;
    @XmlElement(name = "ApplicablePackaging")
    protected List<PackageType> applicablePackaging;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;
    @XmlElement(name = "OriginCountry")
    protected CountryIDType originCountry;
    @XmlElement(name = "SuppliedFromCountry")
    protected List<CountryIDType> suppliedFromCountry;
    @XmlElement(name = "LinearDimension")
    protected DimensionType linearDimension;
    @XmlElement(name = "ManufacturerParty")
    protected ManufacturerPartyType manufacturerParty;
    @XmlElement(name = "EndUserParty")
    protected EndUserPartyType endUserParty;
    @XmlElement(name = "ApplicableTotal")
    protected TotalType applicableTotal;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getID() {
        if (id == null) {
            id = new ArrayList<IDType>();
        }
        return this.id;
    }

    /**
     * Obtém o valor da propriedade industryAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getIndustryAssignedID() {
        return industryAssignedID;
    }

    /**
     * Define o valor da propriedade industryAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setIndustryAssignedID(IDType value) {
        this.industryAssignedID = value;
    }

    /**
     * Obtém o valor da propriedade customerAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCustomerAssignedID() {
        return customerAssignedID;
    }

    /**
     * Define o valor da propriedade customerAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCustomerAssignedID(IDType value) {
        this.customerAssignedID = value;
    }

    /**
     * Obtém o valor da propriedade supplierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSupplierAssignedID() {
        return supplierAssignedID;
    }

    /**
     * Define o valor da propriedade supplierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSupplierAssignedID(IDType value) {
        this.supplierAssignedID = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getManufacturerAssignedID() {
        return manufacturerAssignedID;
    }

    /**
     * Define o valor da propriedade manufacturerAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setManufacturerAssignedID(IDType value) {
        this.manufacturerAssignedID = value;
    }

    /**
     * Obtém o valor da propriedade customsAssignedTariffID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCustomsAssignedTariffID() {
        return customsAssignedTariffID;
    }

    /**
     * Define o valor da propriedade customsAssignedTariffID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCustomsAssignedTariffID(IDType value) {
        this.customsAssignedTariffID = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerAssignedLotID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getManufacturerAssignedLotID() {
        return manufacturerAssignedLotID;
    }

    /**
     * Define o valor da propriedade manufacturerAssignedLotID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setManufacturerAssignedLotID(IDType value) {
        this.manufacturerAssignedLotID = value;
    }

    /**
     * Obtém o valor da propriedade descriptionText.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescriptionText() {
        return descriptionText;
    }

    /**
     * Define o valor da propriedade descriptionText.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescriptionText(TextType value) {
        this.descriptionText = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemCodeType }
     *     
     */
    public TradeItemCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemCodeType }
     *     
     */
    public void setTypeCode(TradeItemCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the additionalDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getAdditionalDescriptionText() {
        if (additionalDescriptionText == null) {
            additionalDescriptionText = new ArrayList<TextType>();
        }
        return this.additionalDescriptionText;
    }

    /**
     * Obtém o valor da propriedade configurableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfigurableIndicator() {
        return configurableIndicator;
    }

    /**
     * Define o valor da propriedade configurableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfigurableIndicator(Boolean value) {
        this.configurableIndicator = value;
    }

    /**
     * Obtém o valor da propriedade optionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionIndicator() {
        return optionIndicator;
    }

    /**
     * Define o valor da propriedade optionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionIndicator(Boolean value) {
        this.optionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade substituteIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstituteIndicator() {
        return substituteIndicator;
    }

    /**
     * Define o valor da propriedade substituteIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstituteIndicator(Boolean value) {
        this.substituteIndicator = value;
    }

    /**
     * Obtém o valor da propriedade netWeight.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWeight() {
        return netWeight;
    }

    /**
     * Define o valor da propriedade netWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWeight(MeasureType value) {
        this.netWeight = value;
    }

    /**
     * Obtém o valor da propriedade grossWeight.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Define o valor da propriedade grossWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeight(MeasureType value) {
        this.grossWeight = value;
    }

    /**
     * Obtém o valor da propriedade productGroupID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getProductGroupID() {
        return productGroupID;
    }

    /**
     * Define o valor da propriedade productGroupID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setProductGroupID(IDType value) {
        this.productGroupID = value;
    }

    /**
     * Obtém o valor da propriedade statusCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Define o valor da propriedade statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatusCode(CodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the applicableCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getApplicableCharacteristics() {
        if (applicableCharacteristics == null) {
            applicableCharacteristics = new ArrayList<CharacteristicType>();
        }
        return this.applicableCharacteristics;
    }

    /**
     * Gets the value of the applicableGoodsCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableGoodsCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableGoodsCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getApplicableGoodsCharacteristics() {
        if (applicableGoodsCharacteristics == null) {
            applicableGoodsCharacteristics = new ArrayList<CharacteristicType>();
        }
        return this.applicableGoodsCharacteristics;
    }

    /**
     * Gets the value of the designatedClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designatedClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignatedClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductClassificationType }
     * 
     * 
     */
    public List<ProductClassificationType> getDesignatedClassification() {
        if (designatedClassification == null) {
            designatedClassification = new ArrayList<ProductClassificationType>();
        }
        return this.designatedClassification;
    }

    /**
     * Gets the value of the substituteProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getSubstituteProduct() {
        if (substituteProduct == null) {
            substituteProduct = new ArrayList<ProductType>();
        }
        return this.substituteProduct;
    }

    /**
     * Gets the value of the substitutedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substitutedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstitutedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getSubstitutedProduct() {
        if (substitutedProduct == null) {
            substitutedProduct = new ArrayList<ProductType>();
        }
        return this.substitutedProduct;
    }

    /**
     * Gets the value of the includedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getIncludedProduct() {
        if (includedProduct == null) {
            includedProduct = new ArrayList<ProductType>();
        }
        return this.includedProduct;
    }

    /**
     * Gets the value of the applicablePackaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicablePackaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicablePackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getApplicablePackaging() {
        if (applicablePackaging == null) {
            applicablePackaging = new ArrayList<PackageType>();
        }
        return this.applicablePackaging;
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
     * Obtém o valor da propriedade originCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryIDType }
     *     
     */
    public CountryIDType getOriginCountry() {
        return originCountry;
    }

    /**
     * Define o valor da propriedade originCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIDType }
     *     
     */
    public void setOriginCountry(CountryIDType value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the suppliedFromCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppliedFromCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppliedFromCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryIDType }
     * 
     * 
     */
    public List<CountryIDType> getSuppliedFromCountry() {
        if (suppliedFromCountry == null) {
            suppliedFromCountry = new ArrayList<CountryIDType>();
        }
        return this.suppliedFromCountry;
    }

    /**
     * Obtém o valor da propriedade linearDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getLinearDimension() {
        return linearDimension;
    }

    /**
     * Define o valor da propriedade linearDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setLinearDimension(DimensionType value) {
        this.linearDimension = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerParty.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerPartyType }
     *     
     */
    public ManufacturerPartyType getManufacturerParty() {
        return manufacturerParty;
    }

    /**
     * Define o valor da propriedade manufacturerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerPartyType }
     *     
     */
    public void setManufacturerParty(ManufacturerPartyType value) {
        this.manufacturerParty = value;
    }

    /**
     * Obtém o valor da propriedade endUserParty.
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
     * Obtém o valor da propriedade applicableTotal.
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getApplicableTotal() {
        return applicableTotal;
    }

    /**
     * Define o valor da propriedade applicableTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setApplicableTotal(TotalType value) {
        this.applicableTotal = value;
    }

}
