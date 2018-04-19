
package my.yes.ecservices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.yes.ecservices package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.yes.ecservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EcNotificationRequest }
     * 
     */
    public EcNotificationRequest createEcNotificationRequest() {
        return new EcNotificationRequest();
    }

    /**
     * Create an instance of {@link MessagePair }
     * 
     */
    public MessagePair createMessagePair() {
        return new MessagePair();
    }

    /**
     * Create an instance of {@link EcNotificationResponse }
     * 
     */
    public EcNotificationResponse createEcNotificationResponse() {
        return new EcNotificationResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link EcNotificationRequest.MessageKeyValues }
     * 
     */
    public EcNotificationRequest.MessageKeyValues createEcNotificationRequestMessageKeyValues() {
        return new EcNotificationRequest.MessageKeyValues();
    }

}
