
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.DimensionTypeCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.MeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de DimensionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}DimensionTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WidthMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="LengthMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="HeightMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="DiameterMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="UnitQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "valueMeasure",
    "typeCode",
    "description",
    "widthMeasure",
    "lengthMeasure",
    "heightMeasure",
    "id",
    "diameterMeasure",
    "unitQuantity"
})
public class DimensionType {

    @XmlElement(name = "ValueMeasure")
    protected MeasureType valueMeasure;
    @XmlElement(name = "TypeCode")
    protected DimensionTypeCodeType typeCode;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "WidthMeasure")
    protected MeasureType widthMeasure;
    @XmlElement(name = "LengthMeasure")
    protected MeasureType lengthMeasure;
    @XmlElement(name = "HeightMeasure")
    protected MeasureType heightMeasure;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "DiameterMeasure")
    protected MeasureType diameterMeasure;
    @XmlElement(name = "UnitQuantity")
    protected QuantityType unitQuantity;

    /**
     * Obtém o valor da propriedade valueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValueMeasure() {
        return valueMeasure;
    }

    /**
     * Define o valor da propriedade valueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setValueMeasure(MeasureType value) {
        this.valueMeasure = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link DimensionTypeCodeType }
     *     
     */
    public DimensionTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionTypeCodeType }
     *     
     */
    public void setTypeCode(DimensionTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Obtém o valor da propriedade widthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Define o valor da propriedade widthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

    /**
     * Obtém o valor da propriedade lengthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Define o valor da propriedade lengthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLengthMeasure(MeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Obtém o valor da propriedade heightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Define o valor da propriedade heightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

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
     * Obtém o valor da propriedade diameterMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDiameterMeasure() {
        return diameterMeasure;
    }

    /**
     * Define o valor da propriedade diameterMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDiameterMeasure(MeasureType value) {
        this.diameterMeasure = value;
    }

    /**
     * Obtém o valor da propriedade unitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * Define o valor da propriedade unitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setUnitQuantity(QuantityType value) {
        this.unitQuantity = value;
    }

}
