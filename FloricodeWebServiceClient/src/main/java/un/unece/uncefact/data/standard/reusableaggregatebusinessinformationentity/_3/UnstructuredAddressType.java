
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de UnstructuredAddressType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="PostcodeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="LineOne" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="LineTwo" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="LineThree" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="LineFour" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="LineFive" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CityName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="CitySubDivisionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredAddressType", propOrder = {
    "id",
    "postcodeCode",
    "lineOne",
    "lineTwo",
    "lineThree",
    "lineFour",
    "lineFive",
    "cityName",
    "countryID",
    "citySubDivisionName",
    "countryName",
    "countrySubDivisionName"
})
public class UnstructuredAddressType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "PostcodeCode")
    protected CodeType postcodeCode;
    @XmlElement(name = "LineOne")
    protected TextType lineOne;
    @XmlElement(name = "LineTwo")
    protected TextType lineTwo;
    @XmlElement(name = "LineThree")
    protected TextType lineThree;
    @XmlElement(name = "LineFour")
    protected TextType lineFour;
    @XmlElement(name = "LineFive")
    protected TextType lineFive;
    @XmlElement(name = "CityName")
    protected TextType cityName;
    @XmlElement(name = "CountryID")
    protected IDType countryID;
    @XmlElement(name = "CitySubDivisionName")
    protected TextType citySubDivisionName;
    @XmlElement(name = "CountryName")
    protected TextType countryName;
    @XmlElement(name = "CountrySubDivisionName")
    protected List<TextType> countrySubDivisionName;

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
     * Obtém o valor da propriedade postcodeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPostcodeCode() {
        return postcodeCode;
    }

    /**
     * Define o valor da propriedade postcodeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPostcodeCode(CodeType value) {
        this.postcodeCode = value;
    }

    /**
     * Obtém o valor da propriedade lineOne.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLineOne() {
        return lineOne;
    }

    /**
     * Define o valor da propriedade lineOne.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLineOne(TextType value) {
        this.lineOne = value;
    }

    /**
     * Obtém o valor da propriedade lineTwo.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLineTwo() {
        return lineTwo;
    }

    /**
     * Define o valor da propriedade lineTwo.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLineTwo(TextType value) {
        this.lineTwo = value;
    }

    /**
     * Obtém o valor da propriedade lineThree.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLineThree() {
        return lineThree;
    }

    /**
     * Define o valor da propriedade lineThree.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLineThree(TextType value) {
        this.lineThree = value;
    }

    /**
     * Obtém o valor da propriedade lineFour.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLineFour() {
        return lineFour;
    }

    /**
     * Define o valor da propriedade lineFour.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLineFour(TextType value) {
        this.lineFour = value;
    }

    /**
     * Obtém o valor da propriedade lineFive.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLineFive() {
        return lineFive;
    }

    /**
     * Define o valor da propriedade lineFive.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLineFive(TextType value) {
        this.lineFive = value;
    }

    /**
     * Obtém o valor da propriedade cityName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCityName() {
        return cityName;
    }

    /**
     * Define o valor da propriedade cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCityName(TextType value) {
        this.cityName = value;
    }

    /**
     * Obtém o valor da propriedade countryID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCountryID() {
        return countryID;
    }

    /**
     * Define o valor da propriedade countryID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCountryID(IDType value) {
        this.countryID = value;
    }

    /**
     * Obtém o valor da propriedade citySubDivisionName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCitySubDivisionName() {
        return citySubDivisionName;
    }

    /**
     * Define o valor da propriedade citySubDivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCitySubDivisionName(TextType value) {
        this.citySubDivisionName = value;
    }

    /**
     * Obtém o valor da propriedade countryName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountryName() {
        return countryName;
    }

    /**
     * Define o valor da propriedade countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountryName(TextType value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countrySubDivisionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubDivisionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubDivisionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCountrySubDivisionName() {
        if (countrySubDivisionName == null) {
            countrySubDivisionName = new ArrayList<TextType>();
        }
        return this.countrySubDivisionName;
    }

}
