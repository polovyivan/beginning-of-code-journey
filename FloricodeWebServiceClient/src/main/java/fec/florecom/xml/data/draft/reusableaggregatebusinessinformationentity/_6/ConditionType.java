
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.MeasureType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.TradeConditionCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de ConditionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}TradeConditionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueMeasure" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}MeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueMinimumMeasure" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="ValueMaximumMeasure" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="NameText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "typeCode",
    "valueMeasure",
    "valueMinimumMeasure",
    "valueMaximumMeasure",
    "actionCode",
    "nameText"
})
public class ConditionType {

    @XmlElement(name = "TypeCode")
    protected List<TradeConditionCodeType> typeCode;
    @XmlElement(name = "ValueMeasure")
    protected List<MeasureType> valueMeasure;
    @XmlElement(name = "ValueMinimumMeasure")
    protected MeasureType valueMinimumMeasure;
    @XmlElement(name = "ValueMaximumMeasure")
    protected MeasureType valueMaximumMeasure;
    @XmlElement(name = "ActionCode")
    protected CodeType actionCode;
    @XmlElement(name = "NameText")
    protected List<TextType> nameText;

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
     * {@link TradeConditionCodeType }
     * 
     * 
     */
    public List<TradeConditionCodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<TradeConditionCodeType>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the valueMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getValueMeasure() {
        if (valueMeasure == null) {
            valueMeasure = new ArrayList<MeasureType>();
        }
        return this.valueMeasure;
    }

    /**
     * Obtém o valor da propriedade valueMinimumMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValueMinimumMeasure() {
        return valueMinimumMeasure;
    }

    /**
     * Define o valor da propriedade valueMinimumMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setValueMinimumMeasure(MeasureType value) {
        this.valueMinimumMeasure = value;
    }

    /**
     * Obtém o valor da propriedade valueMaximumMeasure.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValueMaximumMeasure() {
        return valueMaximumMeasure;
    }

    /**
     * Define o valor da propriedade valueMaximumMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setValueMaximumMeasure(MeasureType value) {
        this.valueMaximumMeasure = value;
    }

    /**
     * Obtém o valor da propriedade actionCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getActionCode() {
        return actionCode;
    }

    /**
     * Define o valor da propriedade actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setActionCode(CodeType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the nameText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getNameText() {
        if (nameText == null) {
            nameText = new ArrayList<TextType>();
        }
        return this.nameText;
    }

}
