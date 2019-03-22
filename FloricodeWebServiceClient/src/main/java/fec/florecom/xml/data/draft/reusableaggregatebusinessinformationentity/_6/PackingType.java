
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.ReferencedDocumentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.MeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de PackingType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PackingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="ReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}ReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Package" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackageType" minOccurs="0"/>
 *         &lt;element name="PackingInstructions" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InformationInstructionsType" minOccurs="0"/>
 *         &lt;element name="PackingPosition" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackingPositionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackingPrice" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PriceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="PhysicalShippingMarks" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="InnerPackageQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="InnerPacking" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PackingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaximumStackability" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackingType", propOrder = {
    "id",
    "referencedDocument",
    "_package",
    "packingInstructions",
    "packingPosition",
    "packingPrice",
    "packingIndicator",
    "weightMeasure",
    "physicalShippingMarks",
    "innerPackageQuantity",
    "innerPacking",
    "maximumStackability"
})
public class PackingType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "ReferencedDocument")
    protected List<ReferencedDocumentType> referencedDocument;
    @XmlElement(name = "Package")
    protected PackageType _package;
    @XmlElement(name = "PackingInstructions")
    protected InformationInstructionsType packingInstructions;
    @XmlElement(name = "PackingPosition")
    protected List<PackingPositionType> packingPosition;
    @XmlElement(name = "PackingPrice")
    protected List<PriceType> packingPrice;
    @XmlElement(name = "PackingIndicator")
    protected Boolean packingIndicator;
    @XmlElement(name = "WeightMeasure")
    protected MeasureType weightMeasure;
    @XmlElement(name = "PhysicalShippingMarks")
    protected TextType physicalShippingMarks;
    @XmlElement(name = "InnerPackageQuantity")
    protected QuantityType innerPackageQuantity;
    @XmlElement(name = "InnerPacking")
    protected List<PackingType> innerPacking;
    @XmlElement(name = "MaximumStackability")
    protected QuantityType maximumStackability;

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
     * Obtém o valor da propriedade package.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackage() {
        return _package;
    }

    /**
     * Define o valor da propriedade package.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackage(PackageType value) {
        this._package = value;
    }

    /**
     * Obtém o valor da propriedade packingInstructions.
     * 
     * @return
     *     possible object is
     *     {@link InformationInstructionsType }
     *     
     */
    public InformationInstructionsType getPackingInstructions() {
        return packingInstructions;
    }

    /**
     * Define o valor da propriedade packingInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationInstructionsType }
     *     
     */
    public void setPackingInstructions(InformationInstructionsType value) {
        this.packingInstructions = value;
    }

    /**
     * Gets the value of the packingPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingPositionType }
     * 
     * 
     */
    public List<PackingPositionType> getPackingPosition() {
        if (packingPosition == null) {
            packingPosition = new ArrayList<PackingPositionType>();
        }
        return this.packingPosition;
    }

    /**
     * Gets the value of the packingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getPackingPrice() {
        if (packingPrice == null) {
            packingPrice = new ArrayList<PriceType>();
        }
        return this.packingPrice;
    }

    /**
     * Obtém o valor da propriedade packingIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackingIndicator() {
        return packingIndicator;
    }

    /**
     * Define o valor da propriedade packingIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackingIndicator(Boolean value) {
        this.packingIndicator = value;
    }

    /**
     * Obtém o valor da propriedade weightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMeasure() {
        return weightMeasure;
    }

    /**
     * Define o valor da propriedade weightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMeasure(MeasureType value) {
        this.weightMeasure = value;
    }

    /**
     * Obtém o valor da propriedade physicalShippingMarks.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPhysicalShippingMarks() {
        return physicalShippingMarks;
    }

    /**
     * Define o valor da propriedade physicalShippingMarks.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPhysicalShippingMarks(TextType value) {
        this.physicalShippingMarks = value;
    }

    /**
     * Obtém o valor da propriedade innerPackageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getInnerPackageQuantity() {
        return innerPackageQuantity;
    }

    /**
     * Define o valor da propriedade innerPackageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setInnerPackageQuantity(QuantityType value) {
        this.innerPackageQuantity = value;
    }

    /**
     * Gets the value of the innerPacking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerPacking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerPacking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingType }
     * 
     * 
     */
    public List<PackingType> getInnerPacking() {
        if (innerPacking == null) {
            innerPacking = new ArrayList<PackingType>();
        }
        return this.innerPacking;
    }

    /**
     * Obtém o valor da propriedade maximumStackability.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getMaximumStackability() {
        return maximumStackability;
    }

    /**
     * Define o valor da propriedade maximumStackability.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setMaximumStackability(QuantityType value) {
        this.maximumStackability = value;
    }

}
