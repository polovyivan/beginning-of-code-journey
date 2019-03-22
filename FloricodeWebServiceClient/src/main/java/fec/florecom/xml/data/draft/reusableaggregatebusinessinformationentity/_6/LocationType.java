
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._7.CountryIDType;
import un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3.StructuredAddressType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de LocationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:7}CountryIDType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="Directions" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="DistrictID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="PhysicalGeographicalCoordinate" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}GeographicalCoordinateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PostalAddress" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}StructuredAddressType" minOccurs="0"/>
 *         &lt;element name="SubordinateLocation" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}LocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "countryID",
    "countryName",
    "id",
    "nameText",
    "countrySubDivisionName",
    "typeCode",
    "directions",
    "descriptionText",
    "districtID",
    "physicalGeographicalCoordinate",
    "postalAddress",
    "subordinateLocation"
})
public class LocationType {

    @XmlElement(name = "CountryID")
    protected CountryIDType countryID;
    @XmlElement(name = "CountryName")
    protected TextType countryName;
    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "NameText")
    protected TextType nameText;
    @XmlElement(name = "CountrySubDivisionName")
    protected TextType countrySubDivisionName;
    @XmlElement(name = "TypeCode")
    protected CodeType typeCode;
    @XmlElement(name = "Directions")
    protected TextType directions;
    @XmlElement(name = "DescriptionText")
    protected TextType descriptionText;
    @XmlElement(name = "DistrictID")
    protected IDType districtID;
    @XmlElement(name = "PhysicalGeographicalCoordinate")
    protected List<GeographicalCoordinateType> physicalGeographicalCoordinate;
    @XmlElement(name = "PostalAddress")
    protected StructuredAddressType postalAddress;
    @XmlElement(name = "SubordinateLocation")
    protected List<LocationType> subordinateLocation;

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
     * Obtém o valor da propriedade nameText.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getNameText() {
        return nameText;
    }

    /**
     * Define o valor da propriedade nameText.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setNameText(TextType value) {
        this.nameText = value;
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

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeCode(CodeType value) {
        this.typeCode = value;
    }

    /**
     * Obtém o valor da propriedade directions.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDirections() {
        return directions;
    }

    /**
     * Define o valor da propriedade directions.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDirections(TextType value) {
        this.directions = value;
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
     * Obtém o valor da propriedade districtID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDistrictID() {
        return districtID;
    }

    /**
     * Define o valor da propriedade districtID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDistrictID(IDType value) {
        this.districtID = value;
    }

    /**
     * Gets the value of the physicalGeographicalCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalGeographicalCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalGeographicalCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicalCoordinateType }
     * 
     * 
     */
    public List<GeographicalCoordinateType> getPhysicalGeographicalCoordinate() {
        if (physicalGeographicalCoordinate == null) {
            physicalGeographicalCoordinate = new ArrayList<GeographicalCoordinateType>();
        }
        return this.physicalGeographicalCoordinate;
    }

    /**
     * Obtém o valor da propriedade postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAddressType }
     *     
     */
    public StructuredAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Define o valor da propriedade postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAddressType }
     *     
     */
    public void setPostalAddress(StructuredAddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the subordinateLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getSubordinateLocation() {
        if (subordinateLocation == null) {
            subordinateLocation = new ArrayList<LocationType>();
        }
        return this.subordinateLocation;
    }

}
