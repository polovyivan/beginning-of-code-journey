
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.MeasureType;


/**
 * <p>Classe Java de GeographicalCoordinateType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeographicalCoordinateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Altitude" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}MeasureType" minOccurs="0"/>
 *         &lt;element name="LatitudeDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LongitudeDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalCoordinateType", propOrder = {
    "altitude",
    "latitude",
    "longitude",
    "latitudeDirection",
    "longitudeDirection",
    "systemID"
})
public class GeographicalCoordinateType {

    @XmlElement(name = "Altitude")
    protected MeasureType altitude;
    @XmlElement(name = "Latitude")
    protected MeasureType latitude;
    @XmlElement(name = "Longitude")
    protected MeasureType longitude;
    @XmlElement(name = "LatitudeDirection")
    protected Boolean latitudeDirection;
    @XmlElement(name = "LongitudeDirection")
    protected Boolean longitudeDirection;
    @XmlElement(name = "SystemID")
    protected IDType systemID;

    /**
     * Obtém o valor da propriedade altitude.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAltitude() {
        return altitude;
    }

    /**
     * Define o valor da propriedade altitude.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAltitude(MeasureType value) {
        this.altitude = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLatitude(MeasureType value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLongitude(MeasureType value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade latitudeDirection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatitudeDirection() {
        return latitudeDirection;
    }

    /**
     * Define o valor da propriedade latitudeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatitudeDirection(Boolean value) {
        this.latitudeDirection = value;
    }

    /**
     * Obtém o valor da propriedade longitudeDirection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLongitudeDirection() {
        return longitudeDirection;
    }

    /**
     * Define o valor da propriedade longitudeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongitudeDirection(Boolean value) {
        this.longitudeDirection = value;
    }

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

}
