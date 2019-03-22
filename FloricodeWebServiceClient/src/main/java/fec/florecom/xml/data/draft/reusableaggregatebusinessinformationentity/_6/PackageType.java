
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;


/**
 * <p>Classe Java de PackageType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PackageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="PositionObjectCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="MaterialCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="ReturnableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinearDimension" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}DimensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "typeCode",
    "quantity",
    "positionObjectCode",
    "materialCode",
    "returnableIndicator",
    "linearDimension"
})
public class PackageType {

    @XmlElement(name = "TypeCode")
    protected List<CodeType> typeCode;
    @XmlElement(name = "Quantity")
    protected QuantityType quantity;
    @XmlElement(name = "PositionObjectCode")
    protected CodeType positionObjectCode;
    @XmlElement(name = "MaterialCode")
    protected CodeType materialCode;
    @XmlElement(name = "ReturnableIndicator")
    protected Boolean returnableIndicator;
    @XmlElement(name = "LinearDimension")
    protected DimensionType linearDimension;

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<CodeType>();
        }
        return this.typeCode;
    }

    /**
     * Obtém o valor da propriedade quantity.
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
     * Obtém o valor da propriedade positionObjectCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPositionObjectCode() {
        return positionObjectCode;
    }

    /**
     * Define o valor da propriedade positionObjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPositionObjectCode(CodeType value) {
        this.positionObjectCode = value;
    }

    /**
     * Obtém o valor da propriedade materialCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaterialCode() {
        return materialCode;
    }

    /**
     * Define o valor da propriedade materialCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaterialCode(CodeType value) {
        this.materialCode = value;
    }

    /**
     * Obtém o valor da propriedade returnableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnableIndicator() {
        return returnableIndicator;
    }

    /**
     * Define o valor da propriedade returnableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnableIndicator(Boolean value) {
        this.returnableIndicator = value;
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

}
