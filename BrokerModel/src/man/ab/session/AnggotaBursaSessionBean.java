package man.ab.session;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import man.ab.entities.AnggotaBursa;

@Stateless(name = "AnggotaBursaSession", mappedName = "Mandiri-BrokerModel-AnggotaBursaSession")
@WebService(name = "AnggotaBursaSessionBeanService", portName = "AnggotaBursaSessionBeanServicePort")
public class AnggotaBursaSessionBean {
    @PersistenceContext(unitName="BrokerModel")
    private EntityManager em;

    public AnggotaBursaSessionBean() {
    }

    /** <code>select o from AnggotaBursa o where o.kodeAb = :kodeAb and o.sendMethod = 'WS'</code> */
    @WebMethod
    public List<AnggotaBursa> getAnggotaBursaFindByUsrSendMethod(
                        @WebParam(name = "wsUser") String wsUser) {
        return em.createNamedQuery("AnggotaBursa.findByUsrSendMethod")
            .setParameter("wsUser", wsUser)
            .getResultList();
    }
    
    @WebMethod
    public List<AnggotaBursa> getAnggotaBursaFindByUsrSerial(
                                            @WebParam(name = "kodeAb") String kodeAb,
                                            @WebParam(name = "serialNo") String serialNo
                                        ) {
        return em.createNamedQuery("AnggotaBursa.findByUsrSerial")
            .setParameter("kodeAb", kodeAb)
            .setParameter("serialNo", serialNo)
            .getResultList();
    }
}
