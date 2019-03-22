
package fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InspectionRequestType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InspectionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InspectingParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InspectingPartyType" minOccurs="0"/>
 *         &lt;element name="InspectingInstructions" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}InformationInstructionsType" minOccurs="0"/>
 *         &lt;element name="InspectionCharacteristic" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}CharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InspectionStatus" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}StatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionRequestType", propOrder = {
    "inspectingParty",
    "inspectingInstructions",
    "inspectionCharacteristic",
    "inspectionStatus"
})
public class InspectionRequestType {

    @XmlElement(name = "InspectingParty")
    protected InspectingPartyType inspectingParty;
    @XmlElement(name = "InspectingInstructions")
    protected InformationInstructionsType inspectingInstructions;
    @XmlElement(name = "InspectionCharacteristic")
    protected List<CharacteristicType> inspectionCharacteristic;
    @XmlElement(name = "InspectionStatus")
    protected StatusType inspectionStatus;

    /**
     * Obtém o valor da propriedade inspectingParty.
     * 
     * @return
     *     possible object is
     *     {@link InspectingPartyType }
     *     
     */
    public InspectingPartyType getInspectingParty() {
        return inspectingParty;
    }

    /**
     * Define o valor da propriedade inspectingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectingPartyType }
     *     
     */
    public void setInspectingParty(InspectingPartyType value) {
        this.inspectingParty = value;
    }

    /**
     * Obtém o valor da propriedade inspectingInstructions.
     * 
     * @return
     *     possible object is
     *     {@link InformationInstructionsType }
     *     
     */
    public InformationInstructionsType getInspectingInstructions() {
        return inspectingInstructions;
    }

    /**
     * Define o valor da propriedade inspectingInstructions.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationInstructionsType }
     *     
     */
    public void setInspectingInstructions(InformationInstructionsType value) {
        this.inspectingInstructions = value;
    }

    /**
     * Gets the value of the inspectionCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getInspectionCharacteristic() {
        if (inspectionCharacteristic == null) {
            inspectionCharacteristic = new ArrayList<CharacteristicType>();
        }
        return this.inspectionCharacteristic;
    }

    /**
     * Obtém o valor da propriedade inspectionStatus.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getInspectionStatus() {
        return inspectionStatus;
    }

    /**
     * Define o valor da propriedade inspectionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setInspectionStatus(StatusType value) {
        this.inspectionStatus = value;
    }

}
