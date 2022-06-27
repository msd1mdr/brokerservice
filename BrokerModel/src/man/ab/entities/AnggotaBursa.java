package man.ab.entities;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import man.common.SqlTimestampAdapter;

@Entity
@NamedQueries( { @NamedQuery(name = "AnggotaBursa.findByUsrSendMethod",
                             query = "select o from AnggotaBursa o where o.wsUser = :wsUser " +
                             "and o.sendMethod = 'WS' and o.excp1 = 'ACTIVE'"),
                 @NamedQuery(name = "AnggotaBursa.findByUsrSerial",
                             query = "select o from AnggotaBursa o where o.kodeAb = :kodeAb and o.serialNo = :serialNo " +
                             "and o.sendMethod = 'WS' and o.excp1 = 'ACTIVE'") })
@Table(name = "ANGGOTA_BURSA")
public class AnggotaBursa implements Serializable {
    @Column(length = 50)
    private String direktory;
    @Column(name = "EMAIL_ADDRESS", length = 200)
    private String emailAddress;
    @Column(length = 20)
    private String excp1;
    @Column(length = 20)
    private String excp2;
    @Column(name = "FILE_FORMAT", length = 5)
    private String fileFormat;
    @Column(name = "FILE_SIZE", length = 10)
    private String fileSize;
    @Column(name = "FTP_PASSWD", length = 50)
    private String ftpPasswd;
    @Column(name = "FTP_USER", length = 50)
    private String ftpUser;
    private Long interval;
    @Column(name = "IP_ADDRESS", length = 20)
    private String ipAddress;
    @Id
    @Column(name = "KODE_AB", nullable = false, length = 5)
    private String kodeAb;
    @Column(name = "NAMA_AB", length = 100)
    private String namaAb;
    @Column(name = "NEXT_SCHD")
    private Timestamp nextSchd;
    @Column(name = "NO_REKENING", length = 50)
    private String noRekening;
    private Long port;
    @Column(name = "SEND_METHOD", length = 10)
    private String sendMethod;
    @Column(name = "SERIAL_NO", length = 50)
    private String serialNo;
    @Column(name = "WS_PASSWD", length = 50)
    private String wsPasswd;
    @Column(name = "WS_USER", length = 50)
    private String wsUser;

    public AnggotaBursa() {
    }

    public AnggotaBursa(String direktory, String emailAddress, String excp1,
                        String excp2, String fileFormat, String fileSize,
                        String ftpPasswd, String ftpUser, Long interval,
                        String ipAddress, String kodeAb, String namaAb,
                        Timestamp nextSchd, String noRekening, Long port,
                        String sendMethod, String serialNo, String wsPasswd,
                        String wsUser) {
        this.direktory = direktory;
        this.emailAddress = emailAddress;
        this.excp1 = excp1;
        this.excp2 = excp2;
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
        this.ftpPasswd = ftpPasswd;
        this.ftpUser = ftpUser;
        this.interval = interval;
        this.ipAddress = ipAddress;
        this.kodeAb = kodeAb;
        this.namaAb = namaAb;
        this.nextSchd = nextSchd;
        this.noRekening = noRekening;
        this.port = port;
        this.sendMethod = sendMethod;
        this.serialNo = serialNo;
        this.wsPasswd = wsPasswd;
        this.wsUser = wsUser;
    }

    public String getDirektory() {
        return direktory;
    }

    public void setDirektory(String direktory) {
        this.direktory = direktory;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getExcp1() {
        return excp1;
    }

    public void setExcp1(String excp1) {
        this.excp1 = excp1;
    }

    public String getExcp2() {
        return excp2;
    }

    public void setExcp2(String excp2) {
        this.excp2 = excp2;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFtpPasswd() {
        return ftpPasswd;
    }

    public void setFtpPasswd(String ftpPasswd) {
        this.ftpPasswd = ftpPasswd;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getKodeAb() {
        return kodeAb;
    }

    public void setKodeAb(String kodeAb) {
        this.kodeAb = kodeAb;
    }

    public String getNamaAb() {
        return namaAb;
    }

    public void setNamaAb(String namaAb) {
        this.namaAb = namaAb;
    }

    public Timestamp getNextSchd() {
        return nextSchd;
    }

    @XmlJavaTypeAdapter(value = SqlTimestampAdapter.class,
                        type = Timestamp.class)
    public void setNextSchd(Timestamp nextSchd) {
        this.nextSchd = nextSchd;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getWsPasswd() {
        return wsPasswd;
    }

    public void setWsPasswd(String wsPasswd) {
        this.wsPasswd = wsPasswd;
    }

    public String getWsUser() {
        return wsUser;
    }

    public void setWsUser(String wsUser) {
        this.wsUser = wsUser;
    }
}
