
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.CountryIDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de TradeLocationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradeLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}CountryIDType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLocationType", propOrder = {
    "countryID",
    "countryName",
    "id",
    "name",
    "countrySubDivisionName"
})
public class TradeLocationType {

    @XmlElement(name = "CountryID")
    protected CountryIDType countryID;
    @XmlElement(name = "CountryName")
    protected TextType countryName;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "CountrySubDivisionName")
    protected TextType countrySubDivisionName;

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
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade countrySubDivisionName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    /**
     * Define o valor da propriedade countrySubDivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountrySubDivisionName(TextType value) {
        this.countrySubDivisionName = value;
    }

}
