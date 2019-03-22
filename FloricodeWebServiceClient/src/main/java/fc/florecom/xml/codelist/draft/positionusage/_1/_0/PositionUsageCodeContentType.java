
package fc.florecom.xml.codelist.draft.positionusage._1._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PositionUsageCodeContentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionUsageCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Stacked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionUsageCodeContentType", namespace = "urn:fc:florecom:xml:codelist:draft:PositionUsage:1:0")
@XmlEnum
public enum PositionUsageCodeContentType {

    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Stacked")
    STACKED("Stacked");
    private final String value;

    PositionUsageCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionUsageCodeContentType fromValue(String v) {
        for (PositionUsageCodeContentType c: PositionUsageCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
