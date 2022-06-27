
package man.iab.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateBejacnSetFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateBejacnSetFlag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bjvald" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bjvtme" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBejacnSetFlag", propOrder = {
    "partid",
    "acctno",
    "bjvald",
    "bjvtme"
})
public class UpdateBejacnSetFlag {

    @XmlElement(required = true)
    protected String partid;
    protected long acctno;
    protected long bjvald;
    protected long bjvtme;

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

    /**
     * Gets the value of the acctno property.
     * 
     */
    public long getAcctno() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     */
    public void setAcctno(long value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the bjvald property.
     * 
     */
    public long getBjvald() {
        return bjvald;
    }

    /**
     * Sets the value of the bjvald property.
     * 
     */
    public void setBjvald(long value) {
        this.bjvald = value;
    }

    /**
     * Gets the value of the bjvtme property.
     * 
     */
    public long getBjvtme() {
        return bjvtme;
    }

    /**
     * Sets the value of the bjvtme property.
     * 
     */
    public void setBjvtme(long value) {
        this.bjvtme = value;
    }

}
