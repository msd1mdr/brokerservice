
package man.dsi.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStaticMsgFindByLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStaticMsgFindByLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStaticMsgFindByLimit", propOrder = {
    "participantid"
})
public class GetStaticMsgFindByLimit {

    @XmlElement(required = true)
    protected String participantid;

    /**
     * Gets the value of the participantid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantid() {
        return participantid;
    }

    /**
     * Sets the value of the participantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantid(String value) {
        this.participantid = value;
    }

}
