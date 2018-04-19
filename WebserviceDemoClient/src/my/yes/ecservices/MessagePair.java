
package my.yes.ecservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messagePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messagePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="messageKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messagePair", propOrder = {

})
public class MessagePair {

    @XmlElement(required = true)
    protected String messageKey;
    @XmlElement(required = true)
    protected String messageValue;

    /**
     * Gets the value of the messageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageKey() {
        return messageKey;
    }

    /**
     * Sets the value of the messageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageKey(String value) {
        this.messageKey = value;
    }

    /**
     * Gets the value of the messageValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageValue() {
        return messageValue;
    }

    /**
     * Sets the value of the messageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageValue(String value) {
        this.messageValue = value;
    }

}
