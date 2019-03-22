
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._3.DocumentCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;


/**
 * <p>Classe Java de ReferencedDocumentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReferencedDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuerAssignedID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="URIID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="CopyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LineID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="LineStatusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:3}DocumentCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencedDocumentType", propOrder = {
    "issuerAssignedID",
    "uriid",
    "issueDateTime",
    "statusCode",
    "copyIndicator",
    "lineID",
    "lineStatusCode",
    "typeCode"
})
public class ReferencedDocumentType {

    @XmlElement(name = "IssuerAssignedID")
    protected IDType issuerAssignedID;
    @XmlElement(name = "URIID")
    protected IDType uriid;
    @XmlElement(name = "IssueDateTime")
    protected String issueDateTime;
    @XmlElement(name = "StatusCode")
    protected CodeType statusCode;
    @XmlElement(name = "CopyIndicator")
    protected Boolean copyIndicator;
    @XmlElement(name = "LineID")
    protected IDType lineID;
    @XmlElement(name = "LineStatusCode")
    protected CodeType lineStatusCode;
    @XmlElement(name = "TypeCode")
    protected DocumentCodeType typeCode;

    /**
     * Obtém o valor da propriedade issuerAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getIssuerAssignedID() {
        return issuerAssignedID;
    }

    /**
     * Define o valor da propriedade issuerAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setIssuerAssignedID(IDType value) {
        this.issuerAssignedID = value;
    }

    /**
     * Obtém o valor da propriedade uriid.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getURIID() {
        return uriid;
    }

    /**
     * Define o valor da propriedade uriid.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setURIID(IDType value) {
        this.uriid = value;
    }

    /**
     * Obtém o valor da propriedade issueDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Define o valor da propriedade issueDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDateTime(String value) {
        this.issueDateTime = value;
    }

    /**
     * Obtém o valor da propriedade statusCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Define o valor da propriedade statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatusCode(CodeType value) {
        this.statusCode = value;
    }

    /**
     * Obtém o valor da propriedade copyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Define o valor da propriedade copyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyIndicator(Boolean value) {
        this.copyIndicator = value;
    }

    /**
     * Obtém o valor da propriedade lineID.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getLineID() {
        return lineID;
    }

    /**
     * Define o valor da propriedade lineID.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setLineID(IDType value) {
        this.lineID = value;
    }

    /**
     * Obtém o valor da propriedade lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Define o valor da propriedade lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLineStatusCode(CodeType value) {
        this.lineStatusCode = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCodeType }
     *     
     */
    public DocumentCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCodeType }
     *     
     */
    public void setTypeCode(DocumentCodeType value) {
        this.typeCode = value;
    }

}
