//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per LocationsType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POT"/>
 *     &lt;enumeration value="STATION"/>
 *     &lt;enumeration value="CRIB"/>
 *     &lt;enumeration value="STANDBY"/>
 *     &lt;enumeration value="SPINDLE"/>
 *     &lt;enumeration value="REJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationsType")
@XmlEnum
public enum LocationsType {

    POT,
    STATION,
    CRIB,
    STANDBY,
    SPINDLE,
    REJECT;

    public String value() {
        return name();
    }

    public static LocationsType fromValue(String v) {
        return valueOf(v);
    }

}
