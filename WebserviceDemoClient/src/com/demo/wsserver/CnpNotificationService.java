
package com.demo.wsserver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CnpNotificationService", targetNamespace = "http://wsserver.demo.com/", wsdlLocation = "http://localhost:8080/WebserviceDemo?wsdl")
public class CnpNotificationService
    extends Service
{

    private final static URL CNPNOTIFICATIONSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.demo.wsserver.CnpNotificationService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.demo.wsserver.CnpNotificationService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/WebserviceDemo?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/WebserviceDemo?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CNPNOTIFICATIONSERVICE_WSDL_LOCATION = url;
    }

    public CnpNotificationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CnpNotificationService() {
        super(CNPNOTIFICATIONSERVICE_WSDL_LOCATION, new QName("http://wsserver.demo.com/", "CnpNotificationService"));
    }

    /**
     * 
     * @return
     *     returns CnpNotification
     */
    @WebEndpoint(name = "CnpNotificationPort")
    public CnpNotification getCnpNotificationPort() {
        return super.getPort(new QName("http://wsserver.demo.com/", "CnpNotificationPort"), CnpNotification.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CnpNotification
     */
    @WebEndpoint(name = "CnpNotificationPort")
    public CnpNotification getCnpNotificationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsserver.demo.com/", "CnpNotificationPort"), CnpNotification.class, features);
    }

}
