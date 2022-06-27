package man.iab.session;

import java.io.IOException;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import man.common.ReadPropertyValue;

import man.iab.entities.Bejacn;

@Stateless(name = "BejacnSession", mappedName = "Mandiri-BrokerModel-BejacnSession")
@WebService(name = "BejacnSessionBeanService", portName = "BejacnSessionBeanServicePort")
public class BejacnSessionBean {
    @PersistenceContext(unitName="BrokerModel")
    private EntityManager em;

    public BejacnSessionBean() {
    }

    /** <code>select o from Bejacn o where o.flag = 'N' and o.rownum <= 100</code> */
    @WebMethod
    public List<Bejacn> getBejacnFindByLimit(@WebParam(name="partid") String partid) {
        
        return em.createNamedQuery("Bejacn.findByLimit")
            .setParameter("partid", partid)
            .setMaxResults(getLimit())
            .getResultList();
    }

    @WebMethod
    public int updateBejacnSetFlag(@WebParam(name="partid") String partid, 
                                   @WebParam(name="acctno") Long acctno,
                                   @WebParam(name="bjvald") Long bjvald, 
                                   @WebParam(name="bjvtme") Long bjvtme
                                   ){
        return em.createNamedQuery("Bejacn.setFlag")
            .setParameter("partid", partid)
            .setParameter("acctno", acctno)
            .setParameter("bjvald", bjvald)
            .setParameter("bjvtme", bjvtme)
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
                                                "iab.requestInvestorAcctBalance.responseMessage.Limit"));
            if(limitTemp>0){
                limit = limitTemp;
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return limit;
    }
}
