//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ControllerModeValueType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ControllerModeValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOMATIC"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="MANUAL_DATA_INPUT"/>
 *     &lt;enumeration value="SEMI_AUTOMATIC"/>
 *     &lt;enumeration value="EDIT"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ControllerModeValueType")
@XmlEnum
public enum ControllerModeValueType {

    AUTOMATIC,
    MANUAL,
    MANUAL_DATA_INPUT,
    SEMI_AUTOMATIC,
    EDIT,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static ControllerModeValueType fromValue(String v) {
        return valueOf(v);
    }

}
