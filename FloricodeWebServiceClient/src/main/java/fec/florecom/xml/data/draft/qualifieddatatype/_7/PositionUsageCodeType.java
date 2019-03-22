
package fec.florecom.xml.data.draft.qualifieddatatype._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import fc.florecom.xml.codelist.draft.positionusage._1._0.PositionUsageCodeContentType;


/**
 * <p>Classe Java de PositionUsageCodeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PositionUsageCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:fc:florecom:xml:codelist:draft:PositionUsage:1:0>PositionUsageCodeContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionUsageCodeType", propOrder = {
    "value"
})
public class PositionUsageCodeType {

    @XmlValue
    protected PositionUsageCodeContentType value;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link PositionUsageCodeContentType }
     *     
     */
    public PositionUsageCodeContentType getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionUsageCodeContentType }
     *     
     */
    public void setValue(PositionUsageCodeContentType value) {
        this.value = value;
    }

}
