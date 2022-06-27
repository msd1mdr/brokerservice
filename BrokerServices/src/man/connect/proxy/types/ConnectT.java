
package man.connect.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for connectT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastConnect" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectT", namespace = "http://session.connect.man/types", propOrder = {
    "brokerid",
    "lastConnect"
})
public class ConnectT {

    protected String brokerid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastConnect;

    /**
     * Gets the value of the brokerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrokerid() {
        return brokerid;
    }

    /**
     * Sets the value of the brokerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrokerid(String value) {
        this.brokerid = value;
    }

    /**
     * Gets the value of the lastConnect property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastConnect() {
        return lastConnect;
    }

    /**
     * Sets the value of the lastConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastConnect(XMLGregorianCalendar value) {
        this.lastConnect = value;
    }

}
