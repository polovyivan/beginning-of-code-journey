
package fc.florecom.xml.codelist.draft.imagesubject._1._0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ImageSubjectCodeContentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageSubjectCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Plant"/>
 *     &lt;enumeration value="Tray"/>
 *     &lt;enumeration value="LoadCarrier"/>
 *     &lt;enumeration value="Branch"/>
 *     &lt;enumeration value="Flower"/>
 *     &lt;enumeration value="Box"/>
 *     &lt;enumeration value="Bunch"/>
 *     &lt;enumeration value="Bucket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageSubjectCodeContentType", namespace = "urn:fc:florecom:xml:codelist:draft:ImageSubject:1:0")
@XmlEnum
public enum ImageSubjectCodeContentType {

    @XmlEnumValue("Plant")
    PLANT("Plant"),
    @XmlEnumValue("Tray")
    TRAY("Tray"),
    @XmlEnumValue("LoadCarrier")
    LOAD_CARRIER("LoadCarrier"),
    @XmlEnumValue("Branch")
    BRANCH("Branch"),
    @XmlEnumValue("Flower")
    FLOWER("Flower"),
    @XmlEnumValue("Box")
    BOX("Box"),
    @XmlEnumValue("Bunch")
    BUNCH("Bunch"),
    @XmlEnumValue("Bucket")
    BUCKET("Bucket");
    private final String value;

    ImageSubjectCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageSubjectCodeContentType fromValue(String v) {
        for (ImageSubjectCodeContentType c: ImageSubjectCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
