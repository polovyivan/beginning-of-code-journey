
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fc.florecom.xml.data.draft.unqualifieddatatype._1.QuantityType;
import fec.florecom.xml.data.draft.qualifieddatatype._7.TotalTypeCodeType;


/**
 * <p>Classe Java de TotalType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductQuantity" type="{urn:fc:florecom:xml:data:draft:UnqualifiedDataType:1}QuantityType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:fec:florecom:xml:data:draft:QualifiedDataType:7}TotalTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalType", propOrder = {
    "productQuantity",
    "typeCode"
})
public class TotalType {

    @XmlElement(name = "ProductQuantity")
    protected QuantityType productQuantity;
    @XmlElement(name = "TypeCode")
    protected TotalTypeCodeType typeCode;

    /**
     * Obtém o valor da propriedade productQuantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getProductQuantity() {
        return productQuantity;
    }

    /**
     * Define o valor da propriedade productQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setProductQuantity(QuantityType value) {
        this.productQuantity = value;
    }

    /**
     * Obtém o valor da propriedade typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TotalTypeCodeType }
     *     
     */
    public TotalTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Define o valor da propriedade typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTypeCodeType }
     *     
     */
    public void setTypeCode(TotalTypeCodeType value) {
        this.typeCode = value;
    }

}
