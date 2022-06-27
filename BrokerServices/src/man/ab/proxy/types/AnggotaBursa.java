
package man.ab.proxy.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anggotaBursa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anggotaBursa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direktory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftpPasswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftpUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeAb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaAb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextSchd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noRekening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sendMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsPasswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anggotaBursa", namespace = "http://session.ab.man/types", propOrder = {
    "direktory",
    "emailAddress",
    "excp1",
    "excp2",
    "fileFormat",
    "fileSize",
    "ftpPasswd",
    "ftpUser",
    "interval",
    "ipAddress",
    "kodeAb",
    "namaAb",
    "nextSchd",
    "noRekening",
    "port",
    "sendMethod",
    "serialNo",
    "wsPasswd",
    "wsUser"
})
public class AnggotaBursa {

    protected String direktory;
    protected String emailAddress;
    protected String excp1;
    protected String excp2;
    protected String fileFormat;
    protected String fileSize;
    protected String ftpPasswd;
    protected String ftpUser;
    protected Long interval;
    protected String ipAddress;
    protected String kodeAb;
    protected String namaAb;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextSchd;
    protected String noRekening;
    protected Long port;
    protected String sendMethod;
    protected String serialNo;
    protected String wsPasswd;
    protected String wsUser;

    /**
     * Gets the value of the direktory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirektory() {
        return direktory;
    }

    /**
     * Sets the value of the direktory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirektory(String value) {
        this.direktory = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the excp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcp1() {
        return excp1;
    }

    /**
     * Sets the value of the excp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcp1(String value) {
        this.excp1 = value;
    }

    /**
     * Gets the value of the excp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcp2() {
        return excp2;
    }

    /**
     * Sets the value of the excp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcp2(String value) {
        this.excp2 = value;
    }

    /**
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSize(String value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the ftpPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPasswd() {
        return ftpPasswd;
    }

    /**
     * Sets the value of the ftpPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPasswd(String value) {
        this.ftpPasswd = value;
    }

    /**
     * Gets the value of the ftpUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUser() {
        return ftpUser;
    }

    /**
     * Sets the value of the ftpUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUser(String value) {
        this.ftpUser = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
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
     * Gets the value of the namaAb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaAb() {
        return namaAb;
    }

    /**
     * Sets the value of the namaAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaAb(String value) {
        this.namaAb = value;
    }

    /**
     * Gets the value of the nextSchd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextSchd() {
        return nextSchd;
    }

    /**
     * Sets the value of the nextSchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextSchd(XMLGregorianCalendar value) {
        this.nextSchd = value;
    }

    /**
     * Gets the value of the noRekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRekening() {
        return noRekening;
    }

    /**
     * Sets the value of the noRekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRekening(String value) {
        this.noRekening = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPort(Long value) {
        this.port = value;
    }

    /**
     * Gets the value of the sendMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendMethod() {
        return sendMethod;
    }

    /**
     * Sets the value of the sendMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendMethod(String value) {
        this.sendMethod = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the wsPasswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPasswd() {
        return wsPasswd;
    }

    /**
     * Sets the value of the wsPasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPasswd(String value) {
        this.wsPasswd = value;
    }

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
