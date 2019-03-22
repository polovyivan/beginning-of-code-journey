
package un.unece.uncefact.codelist.standard.unece.pricetypecode.d09a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PriceTypeCodeContentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PU"/>
 *     &lt;enumeration value="PV"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="QT"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="TB"/>
 *     &lt;enumeration value="TU"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="WH"/>
 *     &lt;enumeration value="WI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceTypeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:PriceTypeCode:D09A")
@XmlEnum
public enum PriceTypeCodeContentType {

    AA,
    AB,
    AC,
    AD,
    AE,
    AI,
    AQ,
    CA,
    CT,
    CU,
    DI,
    EC,
    NW,
    PC,
    PE,
    PK,
    PL,
    PT,
    PU,
    PV,
    PW,
    QT,
    SR,
    TB,
    TU,
    TW,
    WH,
    WI;

    public String value() {
        return name();
    }

    public static PriceTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
