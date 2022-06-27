package man.heartbeat;

import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.WebServiceRef;

import man.ab.proxy.AnggotaBursaSessionBeanService;
import man.ab.proxy.AnggotaBursaSessionBeanService_Service;

import man.ab.proxy.types.AnggotaBursa;

import man.connect.proxy.ConnectTSessionBeanService;
import man.connect.proxy.ConnectTSessionBeanService_Service;

import man.connect.proxy.types.ConnectT;

import man.heartbeat.types.HeartbeatRequest;
import man.heartbeat.types.HeartbeatResponse;
import man.heartbeat.types.ObjectFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlSeeAlso( { ObjectFactory.class })
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.DOCUMENT,
                            parameterStyle =
                            javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
@WebService(name = "HeartbeatService", serviceName = "HeartbeatService",
            targetNamespace = "http://www.mandiri.co.id/services/Heartbeat",
            portName = "HeartbeatServicePort",
            wsdlLocation = "/WEB-INF/wsdl/Heartbeat.wsdl")
public class HeartbeatServiceImpl {
    public HeartbeatServiceImpl() {
    }
    
    public static Logger logger = LoggerFactory.getLogger(HeartbeatServiceImpl.class);

    @WebServiceRef
    private static ConnectTSessionBeanService_Service connectTSessionBeanService_Service;
    private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

    @javax.jws.soap.SOAPBinding(parameterStyle =
                                javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
    @Action(input =
            "http://www.mandiri.co.id/services/Heartbeat/sendHeartbeat",
            output =
            "http://www.mandiri.co.id/services/Heartbeat/HeartbeatService/sendHeartbeatResponse")
    @WebMethod(action =
               "http://www.mandiri.co.id/services/Heartbeat/sendHeartbeat")
    @WebResult(name = "HeartbeatResponse",
               targetNamespace = "http://www.mandiri.co.id/schema/Heartbeat",
               partName = "part")
    public HeartbeatResponse sendHeartbeat(@WebParam(name = "HeartbeatRequest",
                                                  partName = "part",
                                                  targetNamespace =
                                                  "http://www.mandiri.co.id/schema/Heartbeat")
        HeartbeatRequest part) {

        if (isAuthenticated(part)) {

            logger.info("User " + part.getUsername() +
                         " authenticated");

            try {
                updateConnect(part);
                HeartbeatResponse reply = new HeartbeatResponse();
                assignReply(part, reply);
                logger.info("Received heartbeat from user " +
                             part.getUsername());

                return reply;
            } catch (Exception e) {
                logger.error(e.getMessage());
                throw new RuntimeException();
            }

        } else {
            logger.debug("Authentication failed");
            throw new SecurityException();
        }

    }
    
    private boolean isAuthenticated(HeartbeatRequest part) {

        anggotaBursaSessionBeanService_Service =
                new AnggotaBursaSessionBeanService_Service();
        AnggotaBursaSessionBeanService abws =
            anggotaBursaSessionBeanService_Service.getAnggotaBursaSessionBeanServicePort();

        List<AnggotaBursa> ab =
            abws.getAnggotaBursaFindByUsrSendMethod(part.getUsername());
        boolean isPassed = false;
        for(int i=0; i<ab.size(); i++) {
            if(part.getPassword().trim().equals(ab.get(i).getWsPasswd().trim())){
                isPassed = true;
            }
        }

        return isPassed;
    }

    private void updateConnect(HeartbeatRequest part) throws DatatypeConfigurationException {
        GregorianCalendar gc = new GregorianCalendar();
        XMLGregorianCalendar xgcNow =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);

        connectTSessionBeanService_Service =
                new ConnectTSessionBeanService_Service();
        ConnectTSessionBeanService cws =
            connectTSessionBeanService_Service.getConnectTSessionBeanServicePort();
        ConnectT ct = new ConnectT();

        ct.setBrokerid(part.getUsername());
        ct.setLastConnect(xgcNow);
        cws.mergeConnectT(ct);
    }
    
    private HeartbeatResponse assignReply(HeartbeatRequest part, HeartbeatResponse reply){
        
        reply.setStatus("ok");
        
        return reply;
    }
}
