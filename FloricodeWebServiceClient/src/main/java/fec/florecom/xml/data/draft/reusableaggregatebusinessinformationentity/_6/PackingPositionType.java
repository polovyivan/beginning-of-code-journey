
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.PositionUsageCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;


/**
 * <p>Classe Java de PackingPositionType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PackingPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurfacePartitioningCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="HorizontalOrientationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HorizontalPositionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VerticalPositionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurfaceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PositionUsageCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}PositionUsageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackingPositionType", propOrder = {
    "surfacePartitioningCode",
    "horizontalOrientationIndicator",
    "horizontalPositionNumber",
    "verticalPositionNumber",
    "surfaceNumber",
    "positionUsageCode"
})
public class PackingPositionType {

    @XmlElement(name = "SurfacePartitioningCode")
    protected CodeType surfacePartitioningCode;
    @XmlElement(name = "HorizontalOrientationIndicator")
    protected Boolean horizontalOrientationIndicator;
    @XmlElement(name = "HorizontalPositionNumber")
    protected List<BigDecimal> horizontalPositionNumber;
    @XmlElement(name = "VerticalPositionNumber")
    protected List<BigDecimal> verticalPositionNumber;
    @XmlElement(name = "SurfaceNumber")
    protected List<BigDecimal> surfaceNumber;
    @XmlElement(name = "PositionUsageCode")
    protected List<PositionUsageCodeType> positionUsageCode;

    /**
     * Obtém o valor da propriedade surfacePartitioningCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSurfacePartitioningCode() {
        return surfacePartitioningCode;
    }

    /**
     * Define o valor da propriedade surfacePartitioningCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSurfacePartitioningCode(CodeType value) {
        this.surfacePartitioningCode = value;
    }

    /**
     * Obtém o valor da propriedade horizontalOrientationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHorizontalOrientationIndicator() {
        return horizontalOrientationIndicator;
    }

    /**
     * Define o valor da propriedade horizontalOrientationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHorizontalOrientationIndicator(Boolean value) {
        this.horizontalOrientationIndicator = value;
    }

    /**
     * Gets the value of the horizontalPositionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horizontalPositionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorizontalPositionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHorizontalPositionNumber() {
        if (horizontalPositionNumber == null) {
            horizontalPositionNumber = new ArrayList<BigDecimal>();
        }
        return this.horizontalPositionNumber;
    }

    /**
     * Gets the value of the verticalPositionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalPositionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalPositionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getVerticalPositionNumber() {
        if (verticalPositionNumber == null) {
            verticalPositionNumber = new ArrayList<BigDecimal>();
        }
        return this.verticalPositionNumber;
    }

    /**
     * Gets the value of the surfaceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getSurfaceNumber() {
        if (surfaceNumber == null) {
            surfaceNumber = new ArrayList<BigDecimal>();
        }
        return this.surfaceNumber;
    }

    /**
     * Gets the value of the positionUsageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionUsageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionUsageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionUsageCodeType }
     * 
     * 
     */
    public List<PositionUsageCodeType> getPositionUsageCode() {
        if (positionUsageCode == null) {
            positionUsageCode = new ArrayList<PositionUsageCodeType>();
        }
        return this.positionUsageCode;
    }

}
