package man.iab.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
  @NamedQuery(name = "Bejacn.findByLimit", query = "select o from Bejacn o " +
                    "where o.partid = :partid and (o.flag = 'N' or o.flag is NULL)"),
  @NamedQuery(name = "Bejacn.setFlag", query = "update Bejacn o set o.flag = 'Y' " +
                    "where " +
                    "o.partid = :partid and " + 
                    "o.acctno = :acctno and " +
                    "o.bjvald = :bjvald and " +
                    "o.bjvtme = :bjvtme"
                )
})
public class Bejacn implements Serializable {
    @Id
    @Column(nullable = false)
    private Long acctno;
    @Column(length = 20)
    private String actype;
    private String bejfl1;
    private String bejfl2;
    private String bejsc1;
    private String bejsc2;
    private String bejsc3;
    private String bejsc4;
    private Double bjcbal;
    private Long bjcrt8;
    private Long bjseqn;
    private String bjstat;
    private Long bjvald;
    private Long bjvdt8;
    private Long bjvtme;
    private String bjvusr;
    @Column(nullable = false, length = 1)
    private String flag;
    private String ivstid;
    @Column(length = 120)
    private String ivstnm;
    @Column(length = 20)
    private String partid;
    @Column(length = 300)
    private String partnm;
    private String subacn;

    public Bejacn() {
    }

    public Bejacn(Long acctno, String actype, String bejfl1, String bejfl2,
                  String bejsc1, String bejsc2, String bejsc3, String bejsc4,
                  Double bjcbal, Long bjcrt8, Long bjseqn, String bjstat,
                  Long bjvald, Long bjvdt8, Long bjvtme, String bjvusr,
                  String flag, String ivstid, String ivstnm, String partid,
                  String partnm, String subacn) {
        this.acctno = acctno;
        this.actype = actype;
        this.bejfl1 = bejfl1;
        this.bejfl2 = bejfl2;
        this.bejsc1 = bejsc1;
        this.bejsc2 = bejsc2;
        this.bejsc3 = bejsc3;
        this.bejsc4 = bejsc4;
        this.bjcbal = bjcbal;
        this.bjcrt8 = bjcrt8;
        this.bjseqn = bjseqn;
        this.bjstat = bjstat;
        this.bjvald = bjvald;
        this.bjvdt8 = bjvdt8;
        this.bjvtme = bjvtme;
        this.bjvusr = bjvusr;
        this.flag = flag;
        this.ivstid = ivstid;
        this.ivstnm = ivstnm;
        this.partid = partid;
        this.partnm = partnm;
        this.subacn = subacn;
    }

    public Long getAcctno() {
        return acctno;
    }

    public void setAcctno(Long acctno) {
        this.acctno = acctno;
    }

    public String getActype() {
        return actype;
    }

    public void setActype(String actype) {
        this.actype = actype;
    }

    public String getBejfl1() {
        return bejfl1;
    }

    public void setBejfl1(String bejfl1) {
        this.bejfl1 = bejfl1;
    }

    public String getBejfl2() {
        return bejfl2;
    }

    public void setBejfl2(String bejfl2) {
        this.bejfl2 = bejfl2;
    }

    public String getBejsc1() {
        return bejsc1;
    }

    public void setBejsc1(String bejsc1) {
        this.bejsc1 = bejsc1;
    }

    public String getBejsc2() {
        return bejsc2;
    }

    public void setBejsc2(String bejsc2) {
        this.bejsc2 = bejsc2;
    }

    public String getBejsc3() {
        return bejsc3;
    }

    public void setBejsc3(String bejsc3) {
        this.bejsc3 = bejsc3;
    }

    public String getBejsc4() {
        return bejsc4;
    }

    public void setBejsc4(String bejsc4) {
        this.bejsc4 = bejsc4;
    }

    public Double getBjcbal() {
        return bjcbal;
    }

    public void setBjcbal(Double bjcbal) {
        this.bjcbal = bjcbal;
    }

    public Long getBjcrt8() {
        return bjcrt8;
    }

    public void setBjcrt8(Long bjcrt8) {
        this.bjcrt8 = bjcrt8;
    }

    public Long getBjseqn() {
        return bjseqn;
    }

    public void setBjseqn(Long bjseqn) {
        this.bjseqn = bjseqn;
    }

    public String getBjstat() {
        return bjstat;
    }

    public void setBjstat(String bjstat) {
        this.bjstat = bjstat;
    }

    public Long getBjvald() {
        return bjvald;
    }

    public void setBjvald(Long bjvald) {
        this.bjvald = bjvald;
    }

    public Long getBjvdt8() {
        return bjvdt8;
    }

    public void setBjvdt8(Long bjvdt8) {
        this.bjvdt8 = bjvdt8;
    }

    public Long getBjvtme() {
        return bjvtme;
    }

    public void setBjvtme(Long bjvtme) {
        this.bjvtme = bjvtme;
    }

    public String getBjvusr() {
        return bjvusr;
    }

    public void setBjvusr(String bjvusr) {
        this.bjvusr = bjvusr;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getIvstid() {
        return ivstid;
    }

    public void setIvstid(String ivstid) {
        this.ivstid = ivstid;
    }

    public String getIvstnm() {
        return ivstnm;
    }

    public void setIvstnm(String ivstnm) {
        this.ivstnm = ivstnm;
    }

    public String getPartid() {
        return partid;
    }

    public void setPartid(String partid) {
        this.partid = partid;
    }

    public String getPartnm() {
        return partnm;
    }

    public void setPartnm(String partnm) {
        this.partnm = partnm;
    }

    public String getSubacn() {
        return subacn;
    }

    public void setSubacn(String subacn) {
        this.subacn = subacn;
    }
}
