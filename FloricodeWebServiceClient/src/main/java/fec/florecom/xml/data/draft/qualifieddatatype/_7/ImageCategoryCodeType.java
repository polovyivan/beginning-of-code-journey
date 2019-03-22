
package fec.florecom.xml.data.draft.qualifieddatatype._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import fc.florecom.xml.codelist.draft.imagecategory._1._0.ImageCategoryCodeContentType;


/**
 * <p>Classe Java de ImageCategoryCodeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImageCategoryCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:fc:florecom:xml:codelist:draft:ImageCategory:1:0>ImageCategoryCodeContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCategoryCodeType", propOrder = {
    "value"
})
public class ImageCategoryCodeType {

    @XmlValue
    protected ImageCategoryCodeContentType value;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link ImageCategoryCodeContentType }
     *     
     */
    public ImageCategoryCodeContentType getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCategoryCodeContentType }
     *     
     */
    public void setValue(ImageCategoryCodeContentType value) {
        this.value = value;
    }

}
