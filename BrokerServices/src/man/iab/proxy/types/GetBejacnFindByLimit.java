
package man.iab.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBejacnFindByLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBejacnFindByLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBejacnFindByLimit", propOrder = {
    "partid"
})
public class GetBejacnFindByLimit {

    @XmlElement(required = true)
    protected String partid;

    /**
     * Gets the value of the partid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartid() {
        return partid;
    }

    /**
     * Sets the value of the partid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartid(String value) {
        this.partid = value;
    }

}
