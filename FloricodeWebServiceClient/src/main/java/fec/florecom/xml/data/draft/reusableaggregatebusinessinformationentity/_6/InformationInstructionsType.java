
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de InformationInstructionsType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InformationInstructionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandlingCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HandlingText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequirementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcedureText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemNameText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationInstructionsType", propOrder = {
    "handlingCode",
    "handlingText",
    "requirementIndicator",
    "procedureText",
    "typeText",
    "itemNameText",
    "descriptionText"
})
public class InformationInstructionsType {

    @XmlElement(name = "HandlingCode")
    protected List<CodeType> handlingCode;
    @XmlElement(name = "HandlingText")
    protected List<TextType> handlingText;
    @XmlElement(name = "RequirementIndicator", type = Boolean.class)
    protected List<Boolean> requirementIndicator;
    @XmlElement(name = "ProcedureText")
    protected List<TextType> procedureText;
    @XmlElement(name = "TypeText")
    protected List<TextType> typeText;
    @XmlElement(name = "ItemNameText")
    protected List<TextType> itemNameText;
    @XmlElement(name = "DescriptionText")
    protected List<TextType> descriptionText;

    /**
     * Gets the value of the handlingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getHandlingCode() {
        if (handlingCode == null) {
            handlingCode = new ArrayList<CodeType>();
        }
        return this.handlingCode;
    }

    /**
     * Gets the value of the handlingText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getHandlingText() {
        if (handlingText == null) {
            handlingText = new ArrayList<TextType>();
        }
        return this.handlingText;
    }

    /**
     * Gets the value of the requirementIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirementIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirementIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getRequirementIndicator() {
        if (requirementIndicator == null) {
            requirementIndicator = new ArrayList<Boolean>();
        }
        return this.requirementIndicator;
    }

    /**
     * Gets the value of the procedureText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedureText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedureText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getProcedureText() {
        if (procedureText == null) {
            procedureText = new ArrayList<TextType>();
        }
        return this.procedureText;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getTypeText() {
        if (typeText == null) {
            typeText = new ArrayList<TextType>();
        }
        return this.typeText;
    }

    /**
     * Gets the value of the itemNameText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNameText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNameText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getItemNameText() {
        if (itemNameText == null) {
            itemNameText = new ArrayList<TextType>();
        }
        return this.itemNameText;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<TextType>();
        }
        return this.descriptionText;
    }

}
