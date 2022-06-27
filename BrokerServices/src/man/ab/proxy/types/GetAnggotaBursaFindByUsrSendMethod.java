
package man.ab.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAnggotaBursaFindByUsrSendMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAnggotaBursaFindByUsrSendMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAnggotaBursaFindByUsrSendMethod", propOrder = {
    "wsUser"
})
public class GetAnggotaBursaFindByUsrSendMethod {

    @XmlElement(required = true)
    protected String wsUser;

    /**
     * Gets the value of the wsUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsUser() {
        return wsUser;
    }

    /**
     * Sets the value of the wsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsUser(String value) {
        this.wsUser = value;
    }

}
