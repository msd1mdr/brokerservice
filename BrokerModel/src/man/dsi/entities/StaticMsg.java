package man.dsi.entities;

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
@NamedQueries( { @NamedQuery(name = "StaticMsg.findByLimit",
                             query = "select o from StaticMsg o where o.participantid = :participantid and " +
                                        "o.ackStatus in ('VALID', 'NOTVALID') and" +
                                        "(o.flag = 'N' or o.flag is NULL)"),
                 @NamedQuery(name = "StaticMsg.setFlag",
                             query = "update StaticMsg o set o.flag = 'Y' " +
                                        "where o.participantid = :participantid and o.extref = :extref") 
                 })
@Table(name = "STATIC_MSG")
public class StaticMsg implements Serializable {
    @Column(length = 14)
    private String accountnumber;
    @Column(name = "ACK_ACCOUNTNUMBER", length = 15)
    private String ackAccountnumber;
    @Column(name = "ACK_ACTIVITY", length = 8)
    private String ackActivity;
    @Column(name = "ACK_PARTICIPANTID", length = 8)
    private String ackParticipantid;
    @Column(name = "ACK_SIDNUMBER", length = 15)
    private String ackSidnumber;
    @Column(name = "ACK_STATUS", length = 25)
    private String ackStatus;
    @Column(name = "ACK_TIME")
    private Timestamp ackTime;
    @Column(length = 1)
    private String activity;
    @Column(length = 8)
    private String activitydate;
    @Column(length = 40)
    private String bankaccnumber;
    @Column(length = 5)
    private String bankcode;
    @Column(name = "CREATE_TIME")
    private Timestamp createTime;
    @Id
    @Column(nullable = false, length = 50)
    private String extref;
    @Column(nullable = false, length = 1)
    private String flag;
    @Column(length = 40)
    private String investorname;
    @Column(length = 5)
    private String participantid;
    @Column(length = 100)
    private String participantname;
    @Column(length = 15)
    private String sidnumber;

    public StaticMsg() {
    }

    public StaticMsg(String accountnumber, String ackAccountnumber,
                     String ackActivity, String ackParticipantid,
                     String ackSidnumber, String ackStatus, Timestamp ackTime,
                     String activity, String activitydate,
                     String bankaccnumber, String bankcode,
                     Timestamp createTime, String extref, String flag,
                     String investorname, String participantid,
                     String participantname, String sidnumber) {
        this.accountnumber = accountnumber;
        this.ackAccountnumber = ackAccountnumber;
        this.ackActivity = ackActivity;
        this.ackParticipantid = ackParticipantid;
        this.ackSidnumber = ackSidnumber;
        this.ackStatus = ackStatus;
        this.ackTime = ackTime;
        this.activity = activity;
        this.activitydate = activitydate;
        this.bankaccnumber = bankaccnumber;
        this.bankcode = bankcode;
        this.createTime = createTime;
        this.extref = extref;
        this.flag = flag;
        this.investorname = investorname;
        this.participantid = participantid;
        this.participantname = participantname;
        this.sidnumber = sidnumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAckAccountnumber() {
        return ackAccountnumber;
    }

    public void setAckAccountnumber(String ackAccountnumber) {
        this.ackAccountnumber = ackAccountnumber;
    }

    public String getAckActivity() {
        return ackActivity;
    }

    public void setAckActivity(String ackActivity) {
        this.ackActivity = ackActivity;
    }

    public String getAckParticipantid() {
        return ackParticipantid;
    }

    public void setAckParticipantid(String ackParticipantid) {
        this.ackParticipantid = ackParticipantid;
    }

    public String getAckSidnumber() {
        return ackSidnumber;
    }

    public void setAckSidnumber(String ackSidnumber) {
        this.ackSidnumber = ackSidnumber;
    }

    public String getAckStatus() {
        return ackStatus;
    }

    public void setAckStatus(String ackStatus) {
        this.ackStatus = ackStatus;
    }

    @XmlJavaTypeAdapter(value = SqlTimestampAdapter.class,
                        type = Timestamp.class)
    public Timestamp getAckTime() {
        return ackTime;
    }

    public void setAckTime(Timestamp ackTime) {
        this.ackTime = ackTime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivitydate() {
        return activitydate;
    }

    public void setActivitydate(String activitydate) {
        this.activitydate = activitydate;
    }

    public String getBankaccnumber() {
        return bankaccnumber;
    }

    public void setBankaccnumber(String bankaccnumber) {
        this.bankaccnumber = bankaccnumber;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @XmlJavaTypeAdapter(value = SqlTimestampAdapter.class,
                        type = Timestamp.class)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getExtref() {
        return extref;
    }

    public void setExtref(String extref) {
        this.extref = extref;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getInvestorname() {
        return investorname;
    }

    public void setInvestorname(String investorname) {
        this.investorname = investorname;
    }

    public String getParticipantid() {
        return participantid;
    }

    public void setParticipantid(String participantid) {
        this.participantid = participantid;
    }

    public String getParticipantname() {
        return participantname;
    }

    public void setParticipantname(String participantname) {
        this.participantname = participantname;
    }

    public String getSidnumber() {
        return sidnumber;
    }

    public void setSidnumber(String sidnumber) {
        this.sidnumber = sidnumber;
    }
}
