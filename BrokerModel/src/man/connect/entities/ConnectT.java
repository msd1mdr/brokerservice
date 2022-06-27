package man.connect.entities;

import java.io.Serializable;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import man.common.SqlTimestampAdapter;

@Entity
@NamedQueries( { @NamedQuery(name = "ConnectT.findAll",
                             query = "select o from ConnectT o") })
@Table(name = "CONNECT_T")
public class ConnectT implements Serializable {
    @Id
    @Column(nullable = false, length = 20)
    private String brokerid;
    @Column(name = "LAST_CONNECT")
    private Timestamp lastConnect;

    public ConnectT() {
    }

    public ConnectT(String brokerid, Timestamp lastConnect) {
        this.brokerid = brokerid;
        this.lastConnect = lastConnect;
    }

    public String getBrokerid() {
        return brokerid;
    }

    public void setBrokerid(String brokerid) {
        this.brokerid = brokerid;
    }

    @XmlJavaTypeAdapter(value = SqlTimestampAdapter.class,
                        type = Timestamp.class)
    public Timestamp getLastConnect() {
        return lastConnect;
    }

    public void setLastConnect(Timestamp lastConnect) {
        this.lastConnect = lastConnect;
    }
}
