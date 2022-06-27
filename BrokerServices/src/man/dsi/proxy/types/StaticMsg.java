
package man.dsi.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for staticMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackAccountnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackParticipantid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackSidnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activitydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankaccnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sidnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staticMsg", namespace = "http://session.dsi.man/types", propOrder = {
    "accountnumber",
    "ackAccountnumber",
    "ackActivity",
    "ackParticipantid",
    "ackSidnumber",
    "ackStatus",
    "ackTime",
    "activity",
    "activitydate",
    "bankaccnumber",
    "bankcode",
    "createTime",
    "extref",
    "flag",
    "investorname",
    "participantid",
    "participantname",
    "sidnumber"
})
public class StaticMsg {

    protected String accountnumber;
    protected String ackAccountnumber;
    protected String ackActivity;
    protected String ackParticipantid;
    protected String ackSidnumber;
    protected String ackStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ackTime;
    protected String activity;
    protected String activitydate;
    protected String bankaccnumber;
    protected String bankcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String extref;
    protected String flag;
    protected String investorname;
    protected String participantid;
    protected String participantname;
    protected String sidnumber;

    /**
     * Gets the value of the accountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountnumber() {
        return accountnumber;
    }

    /**
     * Sets the value of the accountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountnumber(String value) {
        this.accountnumber = value;
    }

    /**
     * Gets the value of the ackAccountnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckAccountnumber() {
        return ackAccountnumber;
    }

    /**
     * Sets the value of the ackAccountnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckAccountnumber(String value) {
        this.ackAccountnumber = value;
    }

    /**
     * Gets the value of the ackActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckActivity() {
        return ackActivity;
    }

    /**
     * Sets the value of the ackActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckActivity(String value) {
        this.ackActivity = value;
    }

    /**
     * Gets the value of the ackParticipantid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckParticipantid() {
        return ackParticipantid;
    }

    /**
     * Sets the value of the ackParticipantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckParticipantid(String value) {
        this.ackParticipantid = value;
    }

    /**
     * Gets the value of the ackSidnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckSidnumber() {
        return ackSidnumber;
    }

    /**
     * Sets the value of the ackSidnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckSidnumber(String value) {
        this.ackSidnumber = value;
    }

    /**
     * Gets the value of the ackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckStatus() {
        return ackStatus;
    }

    /**
     * Sets the value of the ackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckStatus(String value) {
        this.ackStatus = value;
    }

    /**
     * Gets the value of the ackTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckTime() {
        return ackTime;
    }

    /**
     * Sets the value of the ackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckTime(XMLGregorianCalendar value) {
        this.ackTime = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the activitydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivitydate() {
        return activitydate;
    }

    /**
     * Sets the value of the activitydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivitydate(String value) {
        this.activitydate = value;
    }

    /**
     * Gets the value of the bankaccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankaccnumber() {
        return bankaccnumber;
    }

    /**
     * Sets the value of the bankaccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankaccnumber(String value) {
        this.bankaccnumber = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankcode(String value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
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
     * Gets the value of the investorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestorname() {
        return investorname;
    }

    /**
     * Sets the value of the investorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestorname(String value) {
        this.investorname = value;
    }

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
     * Gets the value of the participantname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantname() {
        return participantname;
    }

    /**
     * Sets the value of the participantname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantname(String value) {
        this.participantname = value;
    }

    /**
     * Gets the value of the sidnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidnumber() {
        return sidnumber;
    }

    /**
     * Sets the value of the sidnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidnumber(String value) {
        this.sidnumber = value;
    }

}
