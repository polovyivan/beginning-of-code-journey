
package fec.florecom.xml.data.draft.qualifieddatatype._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import fc.florecom.xml.codelist.draft.imagesubject._1._0.ImageSubjectCodeContentType;


/**
 * <p>Classe Java de ImageSubjectCodeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImageSubjectCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:fc:florecom:xml:codelist:draft:ImageSubject:1:0>ImageSubjectCodeContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageSubjectCodeType", propOrder = {
    "value"
})
public class ImageSubjectCodeType {

    @XmlValue
    protected ImageSubjectCodeContentType value;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link ImageSubjectCodeContentType }
     *     
     */
    public ImageSubjectCodeContentType getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSubjectCodeContentType }
     *     
     */
    public void setValue(ImageSubjectCodeContentType value) {
        this.value = value;
    }

}
