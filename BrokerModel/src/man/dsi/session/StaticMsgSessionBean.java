package man.dsi.session;

import java.io.IOException;

import java.util.List;

import javax.ejb.Stateless;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import man.common.ReadPropertyValue;

import man.dsi.entities.StaticMsg;

@Stateless(name = "StaticMsgSession", mappedName = "Mandiri-BrokerModel-StaticMsgSession")
@WebService(name = "StaticMsgSessionBeanService", portName = "StaticMsgSessionBeanServicePort")
public class StaticMsgSessionBean {
    @PersistenceContext(unitName="BrokerModel")
    private EntityManager em;

    public StaticMsgSessionBean() {
    }

    /** <code>select o from StaticMsg o where o.flag = 'N'</code> */
    @WebMethod
    public List<StaticMsg> getStaticMsgFindByLimit(@WebParam(name="participantid") String participantid) {
        return em.createNamedQuery("StaticMsg.findByLimit")
            .setParameter("participantid", participantid)
            .setMaxResults(getLimit())
            .getResultList();
    }
    
    @WebMethod
    public int updateStaticMsgSetFlag(
                                        @WebParam(name="participantid") String participantid, 
                                        @WebParam(name="extref") String extref) { 
        return em.createNamedQuery("StaticMsg.setFlag")
            .setParameter("participantid", participantid)
            .setParameter("extref", extref)
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
                                                "dsi.requestDataStaticInvestor.responseMessage.Limit"));
            
            if(limitTemp>0){
                limit = limitTemp;
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return limit;
    }
}
