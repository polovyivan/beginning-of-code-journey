
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._4.TextType;


/**
 * <p>Classe Java de TradeNoteType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TradeNoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *         &lt;element name="Content" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}TextType" minOccurs="0"/>
 *         &lt;element name="ContentCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:4}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeNoteType", propOrder = {
    "subjectCode",
    "content",
    "contentCode"
})
public class TradeNoteType {

    @XmlElement(name = "SubjectCode")
    protected CodeType subjectCode;
    @XmlElement(name = "Content")
    protected TextType content;
    @XmlElement(name = "ContentCode")
    protected CodeType contentCode;

    /**
     * Obtém o valor da propriedade subjectCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSubjectCode() {
        return subjectCode;
    }

    /**
     * Define o valor da propriedade subjectCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSubjectCode(CodeType value) {
        this.subjectCode = value;
    }

    /**
     * Obtém o valor da propriedade content.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getContent() {
        return content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setContent(TextType value) {
        this.content = value;
    }

    /**
     * Obtém o valor da propriedade contentCode.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContentCode() {
        return contentCode;
    }

    /**
     * Define o valor da propriedade contentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContentCode(CodeType value) {
        this.contentCode = value;
    }

}
