
package fec.florecom.xml.data.draft.supplystandardmessage._7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.AgentPartyType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.SupplyTradeLineItemType;


/**
 * <p>Classe Java de SupplyType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SupplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}AgentPartyType" minOccurs="0"/>
 *         &lt;element name="SupplyTradeLineItem" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}SupplyTradeLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyType", propOrder = {
    "agentParty",
    "supplyTradeLineItem"
})
public class SupplyType {

    @XmlElement(name = "AgentParty")
    protected AgentPartyType agentParty;
    @XmlElement(name = "SupplyTradeLineItem")
    protected List<SupplyTradeLineItemType> supplyTradeLineItem;

    /**
     * Obt�m o valor da propriedade agentParty.
     * 
     * @return
     *     possible object is
     *     {@link AgentPartyType }
     *     
     */
    public AgentPartyType getAgentParty() {
        return agentParty;
    }

    /**
     * Define o valor da propriedade agentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPartyType }
     *     
     */
    public void setAgentParty(AgentPartyType value) {
        this.agentParty = value;
    }

    /**
     * Gets the value of the supplyTradeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyTradeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyTradeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyTradeLineItemType }
     * 
     * 
     */
    public List<SupplyTradeLineItemType> getSupplyTradeLineItem() {
        if (supplyTradeLineItem == null) {
            supplyTradeLineItem = new ArrayList<SupplyTradeLineItemType>();
        }
        return this.supplyTradeLineItem;
    }

}
