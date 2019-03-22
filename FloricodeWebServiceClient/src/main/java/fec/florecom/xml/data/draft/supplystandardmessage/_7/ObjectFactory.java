
package fec.florecom.xml.data.draft.supplystandardmessage._7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fec.florecom.xml.data.draft.supplystandardmessage._7 package. 
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

    private final static QName _SupplyRequest_QNAME = new QName("urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7", "SupplyRequest");
    private final static QName _SupplyResponse_QNAME = new QName("urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7", "SupplyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fec.florecom.xml.data.draft.supplystandardmessage._7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupplyRequestMessage }
     * 
     */
    public SupplyRequestMessage createSupplyRequestMessage() {
        return new SupplyRequestMessage();
    }

    /**
     * Create an instance of {@link SupplyResponseMessage }
     * 
     */
    public SupplyResponseMessage createSupplyResponseMessage() {
        return new SupplyResponseMessage();
    }

    /**
     * Create an instance of {@link SupplyRequestType }
     * 
     */
    public SupplyRequestType createSupplyRequestType() {
        return new SupplyRequestType();
    }

    /**
     * Create an instance of {@link SupplyType }
     * 
     */
    public SupplyType createSupplyType() {
        return new SupplyType();
    }

    /**
     * Create an instance of {@link SupplyRequestMessage.Header }
     * 
     */
    public SupplyRequestMessage.Header createSupplyRequestMessageHeader() {
        return new SupplyRequestMessage.Header();
    }

    /**
     * Create an instance of {@link SupplyRequestMessage.Body }
     * 
     */
    public SupplyRequestMessage.Body createSupplyRequestMessageBody() {
        return new SupplyRequestMessage.Body();
    }

    /**
     * Create an instance of {@link SupplyResponseMessage.Body }
     * 
     */
    public SupplyResponseMessage.Body createSupplyResponseMessageBody() {
        return new SupplyResponseMessage.Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7", name = "SupplyRequest")
    public JAXBElement<SupplyRequestMessage> createSupplyRequest(SupplyRequestMessage value) {
        return new JAXBElement<SupplyRequestMessage>(_SupplyRequest_QNAME, SupplyRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fec:florecom:xml:data:draft:SupplyStandardMessage:7", name = "SupplyResponse")
    public JAXBElement<SupplyResponseMessage> createSupplyResponse(SupplyResponseMessage value) {
        return new JAXBElement<SupplyResponseMessage>(_SupplyResponse_QNAME, SupplyResponseMessage.class, null, value);
    }

}
