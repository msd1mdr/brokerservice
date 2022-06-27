package man.ias.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries( { @NamedQuery(name = "StmtBroker.findByLimit",
                             query = "select o from StmtBroker o where o.kodeAb = :kodeAb and " +
                                        "o.flag = 'N' or o.flag is NULL"),
                 @NamedQuery(name = "StmtBroker.setFlag",
                             query = "update StmtBroker o set o.flag = 'Y' " +
                                        "where o.kodeAb = :kodeAb and o.extref = :extref and " +
                                        "o.acctno = :acctno and o.valdate = :valdate " +
                                        "and o.seqnum = :seqnum and o.trnref = :trnref")})
@Table(name = "STMT_BROKER")
public class StmtBroker implements Serializable {
    @Column(length = 19)
    private String acctno;
    @Column(length = 40)
    private String acnote;
    @Column(length = 5)
    private String bankid;
    private Double clsbal;
    @Column(length = 3)
    private String curcod;
    @Column(length = 1)
    private String drorcr;
    @Id
    @Column(length = 40)
    private String extref;
    @Column(length = 50)
    private String filename;
    @Column(length = 10)
    private String flag;
    @Column(name = "KODE_AB", length = 10)
    private String kodeAb;
    private Double opnbal;
    private Long seqnum;
    private Double trnamt;
    @Column(length = 120)
    private String trndsc;
    @Column(length = 40)
    private String trnref;
    @Column(length = 4)
    private String trntyp;
    @Column(length = 8)
    private String valdate;

    public StmtBroker() {
    }

    public StmtBroker(String acctno, String acnote, String bankid,
                      Double clsbal, String curcod, String drorcr,
                      String extref, String filename, String flag,
                      String kodeAb, Double opnbal, Long seqnum, Double trnamt,
                      String trndsc, String trnref, String trntyp,
                      String valdate) {
        this.acctno = acctno;
        this.acnote = acnote;
        this.bankid = bankid;
        this.clsbal = clsbal;
        this.curcod = curcod;
        this.drorcr = drorcr;
        this.extref = extref;
        this.filename = filename;
        this.flag = flag;
        this.kodeAb = kodeAb;
        this.opnbal = opnbal;
        this.seqnum = seqnum;
        this.trnamt = trnamt;
        this.trndsc = trndsc;
        this.trnref = trnref;
        this.trntyp = trntyp;
        this.valdate = valdate;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getAcnote() {
        return acnote;
    }

    public void setAcnote(String acnote) {
        this.acnote = acnote;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public Double getClsbal() {
        return clsbal;
    }

    public void setClsbal(Double clsbal) {
        this.clsbal = clsbal;
    }

    public String getCurcod() {
        return curcod;
    }

    public void setCurcod(String curcod) {
        this.curcod = curcod;
    }

    public String getDrorcr() {
        return drorcr;
    }

    public void setDrorcr(String drorcr) {
        this.drorcr = drorcr;
    }

    public String getExtref() {
        return extref;
    }

    public void setExtref(String extref) {
        this.extref = extref;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getKodeAb() {
        return kodeAb;
    }

    public void setKodeAb(String kodeAb) {
        this.kodeAb = kodeAb;
    }

    public Double getOpnbal() {
        return opnbal;
    }

    public void setOpnbal(Double opnbal) {
        this.opnbal = opnbal;
    }

    public Long getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(Long seqnum) {
        this.seqnum = seqnum;
    }

    public Double getTrnamt() {
        return trnamt;
    }

    public void setTrnamt(Double trnamt) {
        this.trnamt = trnamt;
    }

    public String getTrndsc() {
        return trndsc;
    }

    public void setTrndsc(String trndsc) {
        this.trndsc = trndsc;
    }

    public String getTrnref() {
        return trnref;
    }

    public void setTrnref(String trnref) {
        this.trnref = trnref;
    }

    public String getTrntyp() {
        return trntyp;
    }

    public void setTrntyp(String trntyp) {
        this.trntyp = trntyp;
    }

    public String getValdate() {
        return valdate;
    }

    public void setValdate(String valdate) {
        this.valdate = valdate;
    }
}
