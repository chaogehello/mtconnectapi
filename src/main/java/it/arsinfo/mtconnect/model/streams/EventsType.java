//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A collection of events and alarms for this component
 *       
 * 
 * <p>Classe Java per EventsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectStreams:1.4}Event" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsType", propOrder = {
    "event"
})
public class EventsType {

    @XmlElementRef(name = "Event", namespace = "urn:mtconnect.org:MTConnectStreams:1.4", type = JAXBElement.class)
    protected List<JAXBElement<? extends EventType>> event;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CoupledAxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmergencyStopType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolNumberDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActiveAxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialLoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkOffsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenChuckType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolAssetIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockCountType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolIdDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramCommentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseDoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialRetractType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link EndOfBarType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolAssetIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenDoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramHeaderType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolOffsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link WorkholdingIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link WireType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialChangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link MessageType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLabelType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link AlarmType }{@code >}
     * {@link JAXBElement }{@code <}{@link HardnessType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialFeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetChangedType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositionStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerModeOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateOverrideType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramEditType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockDiscreteType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartCountType }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityType }{@code >}
     * {@link JAXBElement }{@code <}{@link SerialNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolNumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProgramType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialUnloadType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActuatorStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PalletIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceStateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisInterlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetRemovedType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxesCouplingType }{@code >}
     * {@link JAXBElement }{@code <}{@link CloseChuckType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends EventType>> getEvent() {
        if (event == null) {
            event = new ArrayList<JAXBElement<? extends EventType>>();
        }
        return this.event;
    }

}
