
package fc.florecom.xml.codelist.draft.imagecategory._1._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImageCategoryCodeContentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageCategoryCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="Batch"/>
 *     &lt;enumeration value="Manufacturer"/>
 *     &lt;enumeration value="Supplier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageCategoryCodeContentType", namespace = "urn:fc:florecom:xml:codelist:draft:ImageCategory:1:0")
@XmlEnum
public enum ImageCategoryCodeContentType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),
    @XmlEnumValue("Batch")
    BATCH("Batch"),
    @XmlEnumValue("Manufacturer")
    MANUFACTURER("Manufacturer"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier");
    private final String value;

    ImageCategoryCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageCategoryCodeContentType fromValue(String v) {
        for (ImageCategoryCodeContentType c: ImageCategoryCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
