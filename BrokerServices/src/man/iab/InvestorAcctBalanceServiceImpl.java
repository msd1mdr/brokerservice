package man.iab;

import java.math.BigDecimal;

import java.text.DecimalFormat;
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

import man.iab.proxy.BejacnSessionBeanService;
import man.iab.proxy.BejacnSessionBeanServicePortClient;
import man.iab.proxy.BejacnSessionBeanService_Service;
import man.iab.proxy.types.Bejacn;
import man.iab.type.InvestorAcctBalanceRequest;
import man.iab.type.InvestorAcctBalanceResponse;
import man.iab.type.InvestorAcctBalanceResponse.InvestorAcctBalance;
import man.iab.type.ObjectFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
             parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(name = "InvestorAcctBalanceService",
            serviceName = "InvestorAcctBalanceService",
            targetNamespace = "http://www.mandiri.co.id/services/InvestorAcctBalance",
            portName = "InvestorAcctBalanceServicePort",
            wsdlLocation = "/WEB-INF/wsdl/InvestorAcctBalance.wsdl")
public class InvestorAcctBalanceServiceImpl {
    public InvestorAcctBalanceServiceImpl() {
    }

    public static Logger logger =
        LoggerFactory.getLogger(InvestorAcctBalanceServiceImpl.class);

    @WebServiceRef
    private static BejacnSessionBeanService_Service bejacnSessionBeanService_Service;
    private static ConnectTSessionBeanService_Service connectTSessionBeanService_Service;
    private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input =
            "http://www.mandiri.co.id/services/InvestorAcctBalance/requestBalance",
            output =
            "http://www.mandiri.co.id/services/InvestorAcctBalance/InvestorAcctBalanceService/requestBalanceResponse")
    @WebMethod(action =
               "http://www.mandiri.co.id/services/InvestorAcctBalance/requestBalance")
    @WebResult(name = "InvestorAcctBalanceResponse",
               targetNamespace = "http://www.mandiri.co.id/schema/InvestorAcctBalance",
               partName = "part")
    public InvestorAcctBalanceResponse requestBalance(@WebParam(name =
                                                                "InvestorAcctBalanceRequest",
                                                                partName =
                                                                "part",
                                                                targetNamespace =
                                                                "http://www.mandiri.co.id/schema/InvestorAcctBalance")
        InvestorAcctBalanceRequest part) {


        if (isAuthenticated(part)) {

            logger.info("User " + part.getUsername() +
                         " authenticated");

            try {
                updateConnect(part);
                InvestorAcctBalanceResponse reply =
                    new InvestorAcctBalanceResponse();
                reply = assignReplyAndSetFlag(part.getUsername(), reply);

                logger.info("Service invocation completed for user " +
                             part.getUsername() + " , returned " +
                             reply.getInvestorAcctBalance().size() +
                             " records.");

                return reply;
            } catch (Exception e) {
                logger.error(e.toString());
                throw new RuntimeException();
            }

        } else {
            logger.debug("Authentication failed");
            throw new SecurityException();
        }
    }

    private boolean isAuthenticated(InvestorAcctBalanceRequest part) {

        anggotaBursaSessionBeanService_Service =
                new AnggotaBursaSessionBeanService_Service();
        AnggotaBursaSessionBeanService abws =
            anggotaBursaSessionBeanService_Service.getAnggotaBursaSessionBeanServicePort();

        List<AnggotaBursa> ab =
            abws.getAnggotaBursaFindByUsrSendMethod(part.getUsername());
        boolean isPassed = false;
        for (int i = 0; i < ab.size(); i++) {
            if (part.getPassword().trim().equals(ab.get(i).getWsPasswd().trim())) {
                isPassed = true;
            }
        }

        return isPassed;
    }

    private void updateConnect(InvestorAcctBalanceRequest part) throws DatatypeConfigurationException {
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

    private InvestorAcctBalanceResponse assignReplyAndSetFlag(String username, InvestorAcctBalanceResponse reply) {

        bejacnSessionBeanService_Service =
                new BejacnSessionBeanService_Service();
        BejacnSessionBeanService bws =
            bejacnSessionBeanService_Service.getBejacnSessionBeanServicePort();
        List<Bejacn> bejacnByLimit = bws.getBejacnFindByLimit(username);

        for (int i = 0; i < bejacnByLimit.size(); i++) {

            Bejacn bejacn = bejacnByLimit.get(i);

            InvestorAcctBalanceResponse.InvestorAcctBalance iab;
            iab = new InvestorAcctBalance();

            DecimalFormat df = new DecimalFormat("###.##");
            BigDecimal bal = new BigDecimal(df.format(bejacn.getBjcbal()));

            String vald = String.valueOf(bejacn.getBjvald());
            String vtme = "000000";
            if (bejacn.getBjvtme() != 0) {
                vtme = String.valueOf(bejacn.getBjvtme());
            }

            iab.setBankCode("BMAN2");
            iab.setInvestorName(bejacn.getIvstnm());
            iab.setAcctno(String.valueOf(bejacn.getAcctno()));
            iab.setCurrencyCode("IDR");
            iab.setBalance(bal);
            iab.setValDate(vald);
            iab.setTimeStamp(vald + vtme);
            iab.setInvestorID(bejacn.getIvstid());
            iab.setSubAccount(bejacn.getSubacn());
            reply.getInvestorAcctBalance().add(iab);

            int updateFlag = bws.updateBejacnSetFlag(username, bejacn.getAcctno(), 
                                                     bejacn.getBjvald(), bejacn.getBjvtme()); //set flag
            
            if(updateFlag!=1){
                logger.warn("Update Flag with username: " + username + 
                            ", acctno: " + bejacn.getAcctno() +
                            ", bjvald: " + bejacn.getBjvald() + 
                            ", and bjvtme: " + bejacn.getBjvtme() +
                            " has " + updateFlag + " affected rows");
            }
        }

        return reply;
    }
}
