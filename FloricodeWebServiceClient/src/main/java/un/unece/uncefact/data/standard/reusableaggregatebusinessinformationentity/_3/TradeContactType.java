
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de TradeContactType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradeContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="DepartmentName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="TelephoneSpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *         &lt;element name="DirectTelephoneSpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *         &lt;element name="MobileTelephoneSpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *         &lt;element name="FaxSpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *         &lt;element name="TelexSpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *         &lt;element name="EmailURISpecifiedCommunication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:3}SpecifiedCommunicationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeContactType", propOrder = {
    "id",
    "personName",
    "departmentName",
    "typeCode",
    "telephoneSpecifiedCommunication",
    "directTelephoneSpecifiedCommunication",
    "mobileTelephoneSpecifiedCommunication",
    "faxSpecifiedCommunication",
    "telexSpecifiedCommunication",
    "emailURISpecifiedCommunication"
})
public class TradeContactType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "PersonName")
    protected TextType personName;
    @XmlElement(name = "DepartmentName")
    protected TextType departmentName;
    @XmlElement(name = "TypeCode")
    protected CodeType typeCode;
    @XmlElement(name = "TelephoneSpecifiedCommunication")
    protected SpecifiedCommunicationType telephoneSpecifiedCommunication;
    @XmlElement(name = "DirectTelephoneSpecifiedCommunication")
    protected SpecifiedCommunicationType directTelephoneSpecifiedCommunication;
    @XmlElement(name = "MobileTelephoneSpecifiedCommunication")
    protected SpecifiedCommunicationType mobileTelephoneSpecifiedCommunication;
    @XmlElement(name = "FaxSpecifiedCommunication")
    protected SpecifiedCommunicationType faxSpecifiedCommunication;
    @XmlElement(name = "TelexSpecifiedCommunication")
    protected SpecifiedCommunicationType telexSpecifiedCommunication;
    @XmlElement(name = "EmailURISpecifiedCommunication")
    protected SpecifiedCommunicationType emailURISpecifiedCommunication;

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
     * Obtém o valor da propriedade personName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPersonName() {
        return personName;
    }

    /**
     * Define o valor da propriedade personName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPersonName(TextType value) {
        this.personName = value;
    }

    /**
     * Obtém o valor da propriedade departmentName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDepartmentName() {
        return departmentName;
    }

    /**
     * Define o valor da propriedade departmentName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDepartmentName(TextType value) {
        this.departmentName = value;
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
     * Obtém o valor da propriedade telephoneSpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getTelephoneSpecifiedCommunication() {
        return telephoneSpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade telephoneSpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setTelephoneSpecifiedCommunication(SpecifiedCommunicationType value) {
        this.telephoneSpecifiedCommunication = value;
    }

    /**
     * Obtém o valor da propriedade directTelephoneSpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getDirectTelephoneSpecifiedCommunication() {
        return directTelephoneSpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade directTelephoneSpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setDirectTelephoneSpecifiedCommunication(SpecifiedCommunicationType value) {
        this.directTelephoneSpecifiedCommunication = value;
    }

    /**
     * Obtém o valor da propriedade mobileTelephoneSpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getMobileTelephoneSpecifiedCommunication() {
        return mobileTelephoneSpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade mobileTelephoneSpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setMobileTelephoneSpecifiedCommunication(SpecifiedCommunicationType value) {
        this.mobileTelephoneSpecifiedCommunication = value;
    }

    /**
     * Obtém o valor da propriedade faxSpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getFaxSpecifiedCommunication() {
        return faxSpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade faxSpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setFaxSpecifiedCommunication(SpecifiedCommunicationType value) {
        this.faxSpecifiedCommunication = value;
    }

    /**
     * Obtém o valor da propriedade telexSpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getTelexSpecifiedCommunication() {
        return telexSpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade telexSpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setTelexSpecifiedCommunication(SpecifiedCommunicationType value) {
        this.telexSpecifiedCommunication = value;
    }

    /**
     * Obtém o valor da propriedade emailURISpecifiedCommunication.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public SpecifiedCommunicationType getEmailURISpecifiedCommunication() {
        return emailURISpecifiedCommunication;
    }

    /**
     * Define o valor da propriedade emailURISpecifiedCommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCommunicationType }
     *     
     */
    public void setEmailURISpecifiedCommunication(SpecifiedCommunicationType value) {
        this.emailURISpecifiedCommunication = value;
    }

}
