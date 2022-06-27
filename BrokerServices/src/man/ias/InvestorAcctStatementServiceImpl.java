package man.ias;

import java.util.GregorianCalendar;

import java.util.List;

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

import man.ias.proxy.StmtBrokerSessionBeanService;
import man.ias.proxy.StmtBrokerSessionBeanService_Service;
import man.ias.proxy.types.StmtBroker;

import man.ias.types.InvestorAcctStatementRequest;
import man.ias.types.InvestorAcctStatementResponse;
import man.ias.types.MessageType;
import man.ias.types.ObjectFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
             parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(name = "InvestorAcctStatementService",
            serviceName = "InvestorAcctStatementService",
            targetNamespace = "http://www.mandiri.co.id/services/InvestorAcctStatement",
            portName = "InvestorAcctStatementServicePort",
            wsdlLocation = "/WEB-INF/wsdl/InvestorAcctStatement.wsdl")
public class InvestorAcctStatementServiceImpl {
    public InvestorAcctStatementServiceImpl() {
    }

    public static Logger logger =
        LoggerFactory.getLogger(InvestorAcctStatementServiceImpl.class);

    @WebServiceRef
    private static StmtBrokerSessionBeanService_Service stmtBrokerSessionBeanService_Service;
    private static ConnectTSessionBeanService_Service connectTSessionBeanService_Service;
    private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input =
            "http://www.mandiri.co.id/services/InvestorAcctStatement/requestStatement",
            output =
            "http://www.mandiri.co.id/services/InvestorAcctStatement/InvestorAcctStatementService/requestStatementResponse")
    @WebMethod(action =
               "http://www.mandiri.co.id/services/InvestorAcctStatement/requestStatement")
    @WebResult(name = "InvestorAcctStatementResponse",
               targetNamespace = "http://www.mandiri.co.id/schema/InvestorAcctStatement",
               partName = "part")
    public InvestorAcctStatementResponse requestStatement(@WebParam(name =
                                                  "InvestorAcctStatementRequest",
                                                  partName = "part",
                                                  targetNamespace =
                                                  "http://www.mandiri.co.id/schema/InvestorAcctStatement")
        InvestorAcctStatementRequest part) {

        if (isAuthenticated(part)) {

            logger.info("User " + part.getUsername() + " authenticated");

            try {
                updateConnect(part);
                InvestorAcctStatementResponse reply = new InvestorAcctStatementResponse();
                reply = assignReplyAndSetFlag(part.getUsername(), reply);

                logger.info("Service invocation completed for user " +
                            part.getUsername() + " , returned " + reply.getMessage().size() +
                            " records.");

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


    private boolean isAuthenticated(InvestorAcctStatementRequest part) {

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

    private void updateConnect(InvestorAcctStatementRequest part) throws DatatypeConfigurationException {
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

    private InvestorAcctStatementResponse assignReplyAndSetFlag(String username, InvestorAcctStatementResponse reply) {

        stmtBrokerSessionBeanService_Service =
                new StmtBrokerSessionBeanService_Service();
        StmtBrokerSessionBeanService sbws =
            stmtBrokerSessionBeanService_Service.getStmtBrokerSessionBeanServicePort();
        List<StmtBroker> sbByLimit = sbws.getStmtBrokerFindByLimit(username);

        String[] fields =
        { "ExtRef", "SeqNum", "AC", "CurCod", "ValDate", "OpenBal", "ExtRef",
          "TrxType", "DC", "CashVal", "Description", "CloseBal", "Notes",
          "Kode_AB" };

        for (int i = 0; i < sbByLimit.size(); i++) {

            StmtBroker sb = sbByLimit.get(i);
            
            MessageType mt = new MessageType();
            mt.setName("InvestorAcctStatement");

            for (int k = 0; k < fields.length; k++) {
                MessageType.Field field;
                field = new MessageType.Field();
                field.setName(fields[k]);
                if (fields[k].equals("ExtRef")) {
                    field.setValue(sb.getExtref());
                } else if (fields[k].equals("SeqNum")) {
                    field.setValue(String.valueOf(sb.getSeqnum()));
                } else if (fields[k].equals("AC")) {
                    field.setValue(sb.getAcctno());
                } else if (fields[k].equals("CurCod")) {
                    field.setValue(sb.getCurcod());
                } else if (fields[k].equals("ValDate")) {
                    field.setValue(sb.getValdate());
                } else if (fields[k].equals("OpenBal")) {
                    field.setValue(String.valueOf(sb.getOpnbal()));
                } else if (fields[k].equals("TrxType")) {
                    field.setValue(sb.getTrntyp());
                } else if (fields[k].equals("DC")) {
                    field.setValue(sb.getDrorcr());
                } else if (fields[k].equals("CashVal")) {
                    field.setValue(String.valueOf(sb.getTrnamt()));
                } else if (fields[k].equals("Description")) {
                    field.setValue(sb.getTrndsc());
                } else if (fields[k].equals("CloseBal")) {
                    field.setValue(String.valueOf(sb.getClsbal()));
                } else if (fields[k].equals("Notes")) {
                    field.setValue(sb.getAcnote());
                } else if (fields[k].equals("Kode_AB")) {
                    field.setValue(sb.getKodeAb());
                }
                mt.getField().add(field);
            }
            reply.getMessage().add(mt);

            int updateFlag = sbws.updateStmtBrokerSetFlag(
                                username, sb.getExtref(), sb.getAcctno(),
                                sb.getValdate(), sb.getSeqnum(), sb.getTrnref()); //update flag
            
            if(updateFlag!=1){
                logger.warn("Update Statement with username: " + username + 
                            ", extref: " + sb.getExtref()  + ", acctno: " + sb.getAcctno() +
                            ", valdate: " + sb.getValdate() + ", seqnum: " + sb.getSeqnum() +
                            ", and trnref: " + sb.getTrnref() +
                            " has " + updateFlag + " affected rows");
            }
        }

        return reply;

    }
}
