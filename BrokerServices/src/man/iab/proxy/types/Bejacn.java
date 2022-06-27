
package man.iab.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bejacn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bejacn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejfl1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejfl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejsc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejsc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejsc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bejsc4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bjcbal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bjcrt8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bjseqn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bjstat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bjvald" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bjvdt8" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bjvtme" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bjvusr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivstid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ivstnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subacn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bejacn", namespace = "http://session.iab.man/types", propOrder = {
    "acctno",
    "actype",
    "bejfl1",
    "bejfl2",
    "bejsc1",
    "bejsc2",
    "bejsc3",
    "bejsc4",
    "bjcbal",
    "bjcrt8",
    "bjseqn",
    "bjstat",
    "bjvald",
    "bjvdt8",
    "bjvtme",
    "bjvusr",
    "flag",
    "ivstid",
    "ivstnm",
    "partid",
    "partnm",
    "subacn"
})
public class Bejacn {

    protected Long acctno;
    protected String actype;
    protected String bejfl1;
    protected String bejfl2;
    protected String bejsc1;
    protected String bejsc2;
    protected String bejsc3;
    protected String bejsc4;
    protected Double bjcbal;
    protected Long bjcrt8;
    protected Long bjseqn;
    protected String bjstat;
    protected Long bjvald;
    protected Long bjvdt8;
    protected Long bjvtme;
    protected String bjvusr;
    protected String flag;
    protected String ivstid;
    protected String ivstnm;
    protected String partid;
    protected String partnm;
    protected String subacn;

    /**
     * Gets the value of the acctno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctno() {
        return acctno;
    }

    /**
     * Sets the value of the acctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctno(Long value) {
        this.acctno = value;
    }

    /**
     * Gets the value of the actype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActype() {
        return actype;
    }

    /**
     * Sets the value of the actype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActype(String value) {
        this.actype = value;
    }

    /**
     * Gets the value of the bejfl1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejfl1() {
        return bejfl1;
    }

    /**
     * Sets the value of the bejfl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejfl1(String value) {
        this.bejfl1 = value;
    }

    /**
     * Gets the value of the bejfl2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejfl2() {
        return bejfl2;
    }

    /**
     * Sets the value of the bejfl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejfl2(String value) {
        this.bejfl2 = value;
    }

    /**
     * Gets the value of the bejsc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejsc1() {
        return bejsc1;
    }

    /**
     * Sets the value of the bejsc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejsc1(String value) {
        this.bejsc1 = value;
    }

    /**
     * Gets the value of the bejsc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejsc2() {
        return bejsc2;
    }

    /**
     * Sets the value of the bejsc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejsc2(String value) {
        this.bejsc2 = value;
    }

    /**
     * Gets the value of the bejsc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejsc3() {
        return bejsc3;
    }

    /**
     * Sets the value of the bejsc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejsc3(String value) {
        this.bejsc3 = value;
    }

    /**
     * Gets the value of the bejsc4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBejsc4() {
        return bejsc4;
    }

    /**
     * Sets the value of the bejsc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBejsc4(String value) {
        this.bejsc4 = value;
    }

    /**
     * Gets the value of the bjcbal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBjcbal() {
        return bjcbal;
    }

    /**
     * Sets the value of the bjcbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBjcbal(Double value) {
        this.bjcbal = value;
    }

    /**
     * Gets the value of the bjcrt8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBjcrt8() {
        return bjcrt8;
    }

    /**
     * Sets the value of the bjcrt8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBjcrt8(Long value) {
        this.bjcrt8 = value;
    }

    /**
     * Gets the value of the bjseqn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBjseqn() {
        return bjseqn;
    }

    /**
     * Sets the value of the bjseqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBjseqn(Long value) {
        this.bjseqn = value;
    }

    /**
     * Gets the value of the bjstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBjstat() {
        return bjstat;
    }

    /**
     * Sets the value of the bjstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBjstat(String value) {
        this.bjstat = value;
    }

    /**
     * Gets the value of the bjvald property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBjvald() {
        return bjvald;
    }

    /**
     * Sets the value of the bjvald property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBjvald(Long value) {
        this.bjvald = value;
    }

    /**
     * Gets the value of the bjvdt8 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBjvdt8() {
        return bjvdt8;
    }

    /**
     * Sets the value of the bjvdt8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBjvdt8(Long value) {
        this.bjvdt8 = value;
    }

    /**
     * Gets the value of the bjvtme property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBjvtme() {
        return bjvtme;
    }

    /**
     * Sets the value of the bjvtme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBjvtme(Long value) {
        this.bjvtme = value;
    }

    /**
     * Gets the value of the bjvusr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBjvusr() {
        return bjvusr;
    }

    /**
     * Sets the value of the bjvusr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBjvusr(String value) {
        this.bjvusr = value;
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
     * Gets the value of the ivstid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvstid() {
        return ivstid;
    }

    /**
     * Sets the value of the ivstid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvstid(String value) {
        this.ivstid = value;
    }

    /**
     * Gets the value of the ivstnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvstnm() {
        return ivstnm;
    }

    /**
     * Sets the value of the ivstnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvstnm(String value) {
        this.ivstnm = value;
    }

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
     * Gets the value of the partnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnm() {
        return partnm;
    }

    /**
     * Sets the value of the partnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnm(String value) {
        this.partnm = value;
    }

    /**
     * Gets the value of the subacn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubacn() {
        return subacn;
    }

    /**
     * Sets the value of the subacn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubacn(String value) {
        this.subacn = value;
    }

}
