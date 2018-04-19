
package my.yes.ecservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ecNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ecNotificationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageKeyValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="message" type="{http://www.yes.my/ecservices}messagePair" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="toAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yesId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ecNotificationRequest", propOrder = {

})
public class EcNotificationRequest {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String messageType;
    @XmlElement(required = true)
    protected String templateId;
    @XmlElement(required = true)
    protected EcNotificationRequest.MessageKeyValues messageKeyValues;
    @XmlElement(required = true)
    protected String toAddress;
    @XmlElement(required = true)
    protected String fromAddress;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String yesId;
    @XmlElement(required = true)
    protected String partnerId;
    @XmlElement(required = true)
    protected String serviceId;
    @XmlElement(required = true)
    protected String passcode;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the messageKeyValues property.
     * 
     * @return
     *     possible object is
     *     {@link EcNotificationRequest.MessageKeyValues }
     *     
     */
    public EcNotificationRequest.MessageKeyValues getMessageKeyValues() {
        return messageKeyValues;
    }

    /**
     * Sets the value of the messageKeyValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcNotificationRequest.MessageKeyValues }
     *     
     */
    public void setMessageKeyValues(EcNotificationRequest.MessageKeyValues value) {
        this.messageKeyValues = value;
    }

    /**
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress(String value) {
        this.toAddress = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the yesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYesId() {
        return yesId;
    }

    /**
     * Sets the value of the yesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYesId(String value) {
        this.yesId = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the passcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasscode() {
        return passcode;
    }

    /**
     * Sets the value of the passcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasscode(String value) {
        this.passcode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="message" type="{http://www.yes.my/ecservices}messagePair" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "message"
    })
    public static class MessageKeyValues {

        @XmlElement(required = true)
        protected List<MessagePair> message;

        /**
         * Gets the value of the message property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MessagePair }
         * 
         * 
         */
        public List<MessagePair> getMessage() {
            if (message == null) {
                message = new ArrayList<MessagePair>();
            }
            return this.message;
        }

    }

}
