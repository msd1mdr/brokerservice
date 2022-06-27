
package man.dsi.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStaticMsgSetFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStaticMsgSetFlag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStaticMsgSetFlag", propOrder = {
    "participantid",
    "extref"
})
public class UpdateStaticMsgSetFlag {

    @XmlElement(required = true)
    protected String participantid;
    @XmlElement(required = true)
    protected String extref;

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

    /**
     * Gets the value of the extref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtref() {
        return extref;
    }

    /**
     * Sets the value of the extref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtref(String value) {
        this.extref = value;
    }

}
