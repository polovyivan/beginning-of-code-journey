
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.CountryIDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de ProductClassificationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="SystemName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="ClassName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType" minOccurs="0"/>
 *         &lt;element name="ClassCharacteristic" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicableStandard" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}StandardType" minOccurs="0"/>
 *         &lt;element name="ReleatedClassification" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}ProductClassificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassificationType", propOrder = {
    "systemID",
    "systemName",
    "classCode",
    "className",
    "countryID",
    "classCharacteristic",
    "applicableStandard",
    "releatedClassification"
})
public class ProductClassificationType {

    @XmlElement(name = "SystemID")
    protected IDType systemID;
    @XmlElement(name = "SystemName")
    protected List<TextType> systemName;
    @XmlElement(name = "ClassCode")
    protected CodeType classCode;
    @XmlElement(name = "ClassName")
    protected List<TextType> className;
    @XmlElement(name = "CountryID")
    protected CountryIDType countryID;
    @XmlElement(name = "ClassCharacteristic")
    protected List<CharacteristicType> classCharacteristic;
    @XmlElement(name = "ApplicableStandard")
    protected StandardType applicableStandard;
    @XmlElement(name = "ReleatedClassification")
    protected ProductClassificationType releatedClassification;

    /**
     * Obtém o valor da propriedade systemID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSystemID() {
        return systemID;
    }

    /**
     * Define o valor da propriedade systemID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSystemID(IDType value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getSystemName() {
        if (systemName == null) {
            systemName = new ArrayList<TextType>();
        }
        return this.systemName;
    }

    /**
     * Obtém o valor da propriedade classCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClassCode() {
        return classCode;
    }

    /**
     * Define o valor da propriedade classCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClassCode(CodeType value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the className property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getClassName() {
        if (className == null) {
            className = new ArrayList<TextType>();
        }
        return this.className;
    }

    /**
     * Obtém o valor da propriedade countryID.
     * 
     * @return
     *     possible object is
     *     {@link CountryIDType }
     *     
     */
    public CountryIDType getCountryID() {
        return countryID;
    }

    /**
     * Define o valor da propriedade countryID.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryIDType }
     *     
     */
    public void setCountryID(CountryIDType value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the classCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getClassCharacteristic() {
        if (classCharacteristic == null) {
            classCharacteristic = new ArrayList<CharacteristicType>();
        }
        return this.classCharacteristic;
    }

    /**
     * Obtém o valor da propriedade applicableStandard.
     * 
     * @return
     *     possible object is
     *     {@link StandardType }
     *     
     */
    public StandardType getApplicableStandard() {
        return applicableStandard;
    }

    /**
     * Define o valor da propriedade applicableStandard.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardType }
     *     
     */
    public void setApplicableStandard(StandardType value) {
        this.applicableStandard = value;
    }

    /**
     * Obtém o valor da propriedade releatedClassification.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassificationType }
     *     
     */
    public ProductClassificationType getReleatedClassification() {
        return releatedClassification;
    }

    /**
     * Define o valor da propriedade releatedClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassificationType }
     *     
     */
    public void setReleatedClassification(ProductClassificationType value) {
        this.releatedClassification = value;
    }

}
