
package fec.florecom.xml.data.draft.orderstandardmessage._7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.AgentPartyType;
import fec.florecom.xml.data.draft.reusableaggregatebusinessinformationentity._6.OrderTradeLineItemType;


/**
 * <p>Classe Java de OrderType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentParty" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}AgentPartyType" minOccurs="0"/>
 *         &lt;element name="OrderTradeLineItem" type="{urn:fec:florecom:xml:data:draft:ReusableAggregateBusinessInformationEntity:6}OrderTradeLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "agentParty",
    "orderTradeLineItem"
})
public class OrderType {

    @XmlElement(name = "AgentParty")
    protected AgentPartyType agentParty;
    @XmlElement(name = "OrderTradeLineItem")
    protected List<OrderTradeLineItemType> orderTradeLineItem;

    /**
     * Obtém o valor da propriedade agentParty.
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
     * Gets the value of the orderTradeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderTradeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderTradeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderTradeLineItemType }
     * 
     * 
     */
    public List<OrderTradeLineItemType> getOrderTradeLineItem() {
        if (orderTradeLineItem == null) {
            orderTradeLineItem = new ArrayList<OrderTradeLineItemType>();
        }
        return this.orderTradeLineItem;
    }

}
