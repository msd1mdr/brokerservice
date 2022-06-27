
package man.ias.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStmtBrokerSetFlag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStmtBrokerSetFlag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seqnum" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trnref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStmtBrokerSetFlag", propOrder = {
    "kodeAb",
    "extref",
    "acctno",
    "valdate",
    "seqnum",
    "trnref"
})
public class UpdateStmtBrokerSetFlag {

    @XmlElement(required = true)
    protected String kodeAb;
    @XmlElement(required = true)
    protected String extref;
    @XmlElement(required = true)
    protected String acctno;
    @XmlElement(required = true)
    protected String valdate;
    protected long seqnum;
    @XmlElement(required = true)
    protected String trnref;

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

    /**
     * Gets the value of the acctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctno() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctno(String value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the valdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValdate() {
        return valdate;
    }

    /**
     * Sets the value of the valdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValdate(String value) {
        this.valdate = value;
    }

    /**
     * Gets the value of the seqnum property.
     * 
     */
    public long getSeqnum() {
        return seqnum;
    }

    /**
     * Sets the value of the seqnum property.
     * 
     */
    public void setSeqnum(long value) {
        this.seqnum = value;
    }

    /**
     * Gets the value of the trnref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnref() {
        return trnref;
    }

    /**
     * Sets the value of the trnref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnref(String value) {
        this.trnref = value;
    }

}
