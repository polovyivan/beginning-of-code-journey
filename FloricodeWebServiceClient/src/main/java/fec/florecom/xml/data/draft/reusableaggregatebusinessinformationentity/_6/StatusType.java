
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import fec.florecom.xml.data.draft.qualifieddatatype._7.StatusConditionCodeType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.StatusReasonCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de StatusType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}StatusConditionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferenceDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}StatusReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReasonText" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
    "conditionCode",
    "referenceDateTime",
    "descriptionText",
    "reasonCode",
    "reasonText",
    "sequenceNumber",
    "validityPeriod"
})
public class StatusType {

    @XmlElement(name = "ConditionCode")
    protected List<StatusConditionCodeType> conditionCode;
    @XmlElement(name = "ReferenceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> referenceDateTime;
    @XmlElement(name = "DescriptionText")
    protected List<TextType> descriptionText;
    @XmlElement(name = "ReasonCode")
    protected List<StatusReasonCodeType> reasonCode;
    @XmlElement(name = "ReasonText")
    protected List<TextType> reasonText;
    @XmlElement(name = "SequenceNumber")
    protected List<BigDecimal> sequenceNumber;
    @XmlElement(name = "ValidityPeriod")
    protected List<PeriodType> validityPeriod;

    /**
     * Gets the value of the conditionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusConditionCodeType }
     * 
     * 
     */
    public List<StatusConditionCodeType> getConditionCode() {
        if (conditionCode == null) {
            conditionCode = new ArrayList<StatusConditionCodeType>();
        }
        return this.conditionCode;
    }

    /**
     * Gets the value of the referenceDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getReferenceDateTime() {
        if (referenceDateTime == null) {
            referenceDateTime = new ArrayList<XMLGregorianCalendar>();
        }
        return this.referenceDateTime;
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

    /**
     * Gets the value of the reasonCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonCodeType }
     * 
     * 
     */
    public List<StatusReasonCodeType> getReasonCode() {
        if (reasonCode == null) {
            reasonCode = new ArrayList<StatusReasonCodeType>();
        }
        return this.reasonCode;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getReasonText() {
        if (reasonText == null) {
            reasonText = new ArrayList<TextType>();
        }
        return this.reasonText;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getSequenceNumber() {
        if (sequenceNumber == null) {
            sequenceNumber = new ArrayList<BigDecimal>();
        }
        return this.sequenceNumber;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodType>();
        }
        return this.validityPeriod;
    }

}
