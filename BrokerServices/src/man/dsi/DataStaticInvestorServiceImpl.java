package man.dsi;

import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

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

import man.dsi.proxy.StaticMsgSessionBeanService;
import man.dsi.proxy.StaticMsgSessionBeanService_Service;
import man.dsi.proxy.types.StaticMsg;

import man.dsi.types.DataStaticInvestorRequest;
import man.dsi.types.DataStaticInvestorResponse;
import man.dsi.types.MessageType;
import man.dsi.types.ObjectFactory;

import man.dsi.types.RecordType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(name = "DataStaticInvestorService",
            targetNamespace = "http://www.mandiri.co.id/services/DataStaticInvestor",
            serviceName = "DataStaticInvestorService",
            portName = "DataStaticInvestorServicePort",
            wsdlLocation = "/WEB-INF/wsdl/DataStaticInvestor.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
             parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class DataStaticInvestorServiceImpl {
    public DataStaticInvestorServiceImpl() {
    }

    public static Logger logger =
        LoggerFactory.getLogger(DataStaticInvestorServiceImpl.class);

    @WebServiceRef
    private static StaticMsgSessionBeanService_Service staticMsgSessionBeanService_Service;
    private static ConnectTSessionBeanService_Service connectTSessionBeanService_Service;
    private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input =
            "http://www.mandiri.co.id/services/DataStaticInvestor/requestDataStaticInvestor",
            output =
            "http://www.mandiri.co.id/services/DataStaticInvestor/DataStaticInvestorService/requestDataStaticInvestorResponse")
    @WebMethod(action =
               "http://www.mandiri.co.id/services/DataStaticInvestor/requestDataStaticInvestor")
    @WebResult(name = "DataStaticInvestorResponse",
               targetNamespace = "http://www.mandiri.co.id/schema/DataStaticInvestor",
               partName = "part")
    public DataStaticInvestorResponse requestDataStaticInvestor(@WebParam(name =
                                                                          "DataStaticInvestorRequest",
                                                                          partName =
                                                                          "part",
                                                                          targetNamespace =
                                                                          "http://www.mandiri.co.id/schema/DataStaticInvestor")
        DataStaticInvestorRequest part) {

        if (isAuthenticated(part)) {

            logger.info("User " + part.getUsername() + " authenticated");

            try {
                updateConnect(part);
                DataStaticInvestorResponse reply =
                    new DataStaticInvestorResponse();
                reply = assignReplyAndSetFlag(part.getUsername(), reply);

                logger.info("Service invocation completed for user " +
                            part.getUsername() + " , returned " +
                            reply.getMessage().size() + " records.");

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

    private boolean isAuthenticated(DataStaticInvestorRequest part) {

        anggotaBursaSessionBeanService_Service =
                new AnggotaBursaSessionBeanService_Service();
        AnggotaBursaSessionBeanService abws =
            anggotaBursaSessionBeanService_Service.getAnggotaBursaSessionBeanServicePort();

        java.util.List<AnggotaBursa> ab =
            abws.getAnggotaBursaFindByUsrSendMethod(part.getUsername());
        boolean isPassed = false;
        for (int i = 0; i < ab.size(); i++) {
            if (part.getPassword().trim().equals(ab.get(i).getWsPasswd().trim())) {
                isPassed = true;
            }
        }

        return isPassed;
    }

    private void updateConnect(DataStaticInvestorRequest part) throws DatatypeConfigurationException {
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

    private DataStaticInvestorResponse assignReplyAndSetFlag(String username, DataStaticInvestorResponse reply) {

        staticMsgSessionBeanService_Service =
                new StaticMsgSessionBeanService_Service();
        StaticMsgSessionBeanService smws =
            staticMsgSessionBeanService_Service.getStaticMsgSessionBeanServicePort();
        java.util.List<StaticMsg> smByLimit = smws.getStaticMsgFindByLimit(username);

        String[] fields =
        { "externalReference", "participantID", "participantName",
          "investorName", "sidNumber", "accountNumber", "bankAccountNumber",
          "bankCode", "activityDate", "activity", "ackStatus", "ackTime" };

        for(int i = 0; i < smByLimit.size(); i++){
            
            StaticMsg sm = smByLimit.get(i);
            
            MessageType mt;
            mt = new MessageType(); 
            mt.setName("dataStaticInvestor");
            mt.setType("IncomingMessage");
            
            for (int k = 0; k < fields.length; k++) {
                
                MessageType.Field field;
                field = new MessageType.Field();
                field.setName(fields[k]);
                
                if (fields[k].equals("externalReference")) {
                    field.setValue(sm.getExtref());
                } else if (fields[k].equals("participantID")) {
                    field.setValue(sm.getParticipantid());
                } else if (fields[k].equals("participantName")) {
                    field.setValue(sm.getParticipantname());
                } else if (fields[k].equals("investorName")) {
                    field.setValue(sm.getInvestorname());
                } else if (fields[k].equals("sidNumber")) {
                    field.setValue(sm.getSidnumber());
                } else if (fields[k].equals("accountNumber")) {
                    field.setValue(sm.getAccountnumber());
                } else if (fields[k].equals("bankAccountNumber")) {
                    field.setValue(sm.getBankaccnumber());
                } else if (fields[k].equals("bankCode")) {
                    field.setValue(sm.getBankcode());
                } else if (fields[k].equals("activityDate")) {
                    field.setValue(sm.getActivitydate());
                } else if (fields[k].equals("activity")) {
                    field.setValue(String.valueOf(sm.getActivity()));
                } else if (fields[k].equals("ackStatus")) {
                    field.setValue(sm.getAckStatus());
                } else if (fields[k].equals("ackTime")) {
                    field.setValue(String.valueOf(sm.getAckTime()));
                }           
                mt.getField().add(field);
            }          
            reply.getMessage().add(mt);
            
            int updateFlag = smws.updateStaticMsgSetFlag(username, sm.getExtref());  
            
            if(updateFlag!=1){
                logger.warn("Update Statement with username: " + username + 
                            " and extref: " + sm.getExtref() + " has " + updateFlag + " affected rows");
            }
        }
        
        return reply;

    }
}
