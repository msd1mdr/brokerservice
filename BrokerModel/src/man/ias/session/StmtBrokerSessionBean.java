package man.ias.session;

import java.io.IOException;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;

import javax.jws.WebParam;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import man.common.ReadPropertyValue;

import man.ias.entities.StmtBroker;

@Stateless(name = "StmtBrokerSession", mappedName = "Mandiri-BrokerModel-StmtBrokerSession")
@WebService(name = "StmtBrokerSessionBeanService", portName = "StmtBrokerSessionBeanServicePort")
public class StmtBrokerSessionBean {
    @PersistenceContext(unitName="BrokerModel")
    private EntityManager em;

    public StmtBrokerSessionBean() {
    }

    /** <code>select o from StmtBroker o where o.flag = 'N'</code> */
    @WebMethod
    public List<StmtBroker> getStmtBrokerFindByLimit(@WebParam(name="kodeAb") String kodeAb) {
        
        return em.createNamedQuery("StmtBroker.findByLimit")
            .setParameter("kodeAb",kodeAb)
            .setMaxResults(getLimit())
            .getResultList();
    }

    @WebMethod
    public int updateStmtBrokerSetFlag(
                                    @WebParam(name="kodeAb") String kodeAb, 
                                    @WebParam(name="extref") String extref, 
                                    @WebParam(name="acctno") String acctno, 
                                    @WebParam(name="valdate") String valdate, 
                                    @WebParam(name="seqnum") Long seqnum, 
                                    @WebParam(name="trnref") String trnref) { 
        return em.createNamedQuery("StmtBroker.setFlag")
            .setParameter("kodeAb", kodeAb)
            .setParameter("extref", extref)
            .setParameter("acctno", acctno)
            .setParameter("valdate", valdate)
            .setParameter("seqnum", seqnum)
            .setParameter("trnref", trnref)
            .executeUpdate();
    }
    
    private int getLimit(){
        ReadPropertyValue prop = new ReadPropertyValue();
        int limit = 100;
        try {
            
            String path = prop.getPropertyValue("/Resources/config.properties", 
                                                "brokerservices.config.File")
                                                .trim();
            
            int limitTemp = Integer.valueOf(prop.getPropertyValueFromFile(
                                                path, 
                                                "ias.requestInvestorAcctStatement.responseMessage.Limit"));
            if(limitTemp>0){
                limit = limitTemp;
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return limit;
    }
}
