
package com.demo.wsserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.demo.wsserver package. 
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

    private final static QName _SendNotification_QNAME = new QName("http://wsserver.demo.com/", "sendNotification");
    private final static QName _SendNotificationResponse_QNAME = new QName("http://wsserver.demo.com/", "sendNotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.demo.wsserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendNotificationResponse }
     * 
     */
    public SendNotificationResponse createSendNotificationResponse() {
        return new SendNotificationResponse();
    }

    /**
     * Create an instance of {@link SendNotification }
     * 
     */
    public SendNotification createSendNotification() {
        return new SendNotification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver.demo.com/", name = "sendNotification")
    public JAXBElement<SendNotification> createSendNotification(SendNotification value) {
        return new JAXBElement<SendNotification>(_SendNotification_QNAME, SendNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsserver.demo.com/", name = "sendNotificationResponse")
    public JAXBElement<SendNotificationResponse> createSendNotificationResponse(SendNotificationResponse value) {
        return new JAXBElement<SendNotificationResponse>(_SendNotificationResponse_QNAME, SendNotificationResponse.class, null, value);
    }

}
