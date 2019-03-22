
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de SpecifiedCommunicationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedCommunicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URIID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}IDType" minOccurs="0"/>
 *         &lt;element name="CompleteNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedCommunicationType", propOrder = {
    "uriid",
    "completeNumber"
})
public class SpecifiedCommunicationType {

    @XmlElement(name = "URIID")
    protected IDType uriid;
    @XmlElement(name = "CompleteNumber")
    protected TextType completeNumber;

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
     * Obtém o valor da propriedade completeNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCompleteNumber() {
        return completeNumber;
    }

    /**
     * Define o valor da propriedade completeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCompleteNumber(TextType value) {
        this.completeNumber = value;
    }

}
