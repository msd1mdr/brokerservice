package man.connect.session;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import man.connect.entities.ConnectT;

@Stateless(name = "ConnectTSession", mappedName = "Mandiri-BrokerModel-ConnectTSession")
@WebService(name = "ConnectTSessionBeanService", portName = "ConnectTSessionBeanServicePort")
public class ConnectTSessionBean {
    @PersistenceContext(unitName="BrokerModel")
    private EntityManager em;

    public ConnectTSessionBean() {
    }

    @WebMethod
    public ConnectT mergeConnectT(ConnectT connectT) {
        return em.merge(connectT);
    }
}
