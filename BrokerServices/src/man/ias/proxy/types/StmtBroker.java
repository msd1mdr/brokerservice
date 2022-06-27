
package man.ias.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stmtBroker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stmtBroker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acnote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clsbal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="curcod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drorcr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeAb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opnbal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seqnum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trnamt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="trndsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trnref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trntyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stmtBroker", namespace = "http://session.ias.man/types", propOrder = {
    "acctno",
    "acnote",
    "bankid",
    "clsbal",
    "curcod",
    "drorcr",
    "extref",
    "filename",
    "flag",
    "kodeAb",
    "opnbal",
    "seqnum",
    "trnamt",
    "trndsc",
    "trnref",
    "trntyp",
    "valdate"
})
public class StmtBroker {

    protected String acctno;
    protected String acnote;
    protected String bankid;
    protected Double clsbal;
    protected String curcod;
    protected String drorcr;
    protected String extref;
    protected String filename;
    protected String flag;
    protected String kodeAb;
    protected Double opnbal;
    protected Long seqnum;
    protected Double trnamt;
    protected String trndsc;
    protected String trnref;
    protected String trntyp;
    protected String valdate;

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
     * Gets the value of the acnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcnote() {
        return acnote;
    }

    /**
     * Sets the value of the acnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcnote(String value) {
        this.acnote = value;
    }

    /**
     * Gets the value of the bankid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankid() {
        return bankid;
    }

    /**
     * Sets the value of the bankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankid(String value) {
        this.bankid = value;
    }

    /**
     * Gets the value of the clsbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClsbal() {
        return clsbal;
    }

    /**
     * Sets the value of the clsbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClsbal(Double value) {
        this.clsbal = value;
    }

    /**
     * Gets the value of the curcod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurcod() {
        return curcod;
    }

    /**
     * Sets the value of the curcod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurcod(String value) {
        this.curcod = value;
    }

    /**
     * Gets the value of the drorcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrorcr() {
        return drorcr;
    }

    /**
     * Sets the value of the drorcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrorcr(String value) {
        this.drorcr = value;
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
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

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
     * Gets the value of the opnbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpnbal() {
        return opnbal;
    }

    /**
     * Sets the value of the opnbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpnbal(Double value) {
        this.opnbal = value;
    }

    /**
     * Gets the value of the seqnum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqnum() {
        return seqnum;
    }

    /**
     * Sets the value of the seqnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqnum(Long value) {
        this.seqnum = value;
    }

    /**
     * Gets the value of the trnamt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrnamt() {
        return trnamt;
    }

    /**
     * Sets the value of the trnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrnamt(Double value) {
        this.trnamt = value;
    }

    /**
     * Gets the value of the trndsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrndsc() {
        return trndsc;
    }

    /**
     * Sets the value of the trndsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrndsc(String value) {
        this.trndsc = value;
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

    /**
     * Gets the value of the trntyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrntyp() {
        return trntyp;
    }

    /**
     * Sets the value of the trntyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrntyp(String value) {
        this.trntyp = value;
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

}
