
package man.ias.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStmtBrokerFindByLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStmtBrokerFindByLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStmtBrokerFindByLimit", propOrder = {
    "kodeAb"
})
public class GetStmtBrokerFindByLimit {

    @XmlElement(required = true)
    protected String kodeAb;

    /**
     * Gets the value of the kodeAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAb() {
        return kodeAb;
    }

    /**
     * Sets the value of the kodeAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAb(String value) {
        this.kodeAb = value;
    }

}
