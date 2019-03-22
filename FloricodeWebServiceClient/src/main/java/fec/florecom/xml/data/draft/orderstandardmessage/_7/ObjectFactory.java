
package fec.florecom.xml.data.draft.orderstandardmessage._7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fec.florecom.xml.data.draft.orderstandardmessage._7 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PutOrderResponse_QNAME = new QName("urn:fec:florecom:xml:data:draft:OrderStandardMessage:7", "PutOrderResponse");
    private final static QName _PutOrderRequest_QNAME = new QName("urn:fec:florecom:xml:data:draft:OrderStandardMessage:7", "PutOrderRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fec.florecom.xml.data.draft.orderstandardmessage._7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderRequestMessage }
     * 
     */
    public OrderRequestMessage createOrderRequestMessage() {
        return new OrderRequestMessage();
    }

    /**
     * Create an instance of {@link OrderResponseMessage }
     * 
     */
    public OrderResponseMessage createOrderResponseMessage() {
        return new OrderResponseMessage();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link OrderResponseType }
     * 
     */
    public OrderResponseType createOrderResponseType() {
        return new OrderResponseType();
    }

    /**
     * Create an instance of {@link OrderRequestMessage.Header }
     * 
     */
    public OrderRequestMessage.Header createOrderRequestMessageHeader() {
        return new OrderRequestMessage.Header();
    }

    /**
     * Create an instance of {@link OrderRequestMessage.Body }
     * 
     */
    public OrderRequestMessage.Body createOrderRequestMessageBody() {
        return new OrderRequestMessage.Body();
    }

    /**
     * Create an instance of {@link OrderResponseMessage.Body }
     * 
     */
    public OrderResponseMessage.Body createOrderResponseMessageBody() {
        return new OrderResponseMessage.Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fec:florecom:xml:data:draft:OrderStandardMessage:7", name = "PutOrderResponse")
    public JAXBElement<OrderResponseMessage> createPutOrderResponse(OrderResponseMessage value) {
        return new JAXBElement<OrderResponseMessage>(_PutOrderResponse_QNAME, OrderResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fec:florecom:xml:data:draft:OrderStandardMessage:7", name = "PutOrderRequest")
    public JAXBElement<OrderRequestMessage> createPutOrderRequest(OrderRequestMessage value) {
        return new JAXBElement<OrderRequestMessage>(_PutOrderRequest_QNAME, OrderRequestMessage.class, null, value);
    }

}
