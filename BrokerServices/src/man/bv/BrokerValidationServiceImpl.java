package man.bv;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

import javax.xml.ws.WebServiceRef;

import man.ab.proxy.AnggotaBursaSessionBeanService;
import man.ab.proxy.AnggotaBursaSessionBeanService_Service;

import man.ab.proxy.types.AnggotaBursa;

import man.bv.types.BrokerValidationRequest;
import man.bv.types.BrokerValidationResponse;
import man.bv.types.ObjectFactory;
import man.bv.types.ValidationType;

import man.dsi.DataStaticInvestorServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlSeeAlso( { ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(name = "BrokerValidationService", serviceName = "BrokerValidationService", targetNamespace = "http://www.mandiri.co.id/services/BrokerValidation", portName = "BrokerValidationServicePort", wsdlLocation = "/WEB-INF/wsdl/BrokerValidation.wsdl")
public class BrokerValidationServiceImpl {
    public BrokerValidationServiceImpl() {
    }
    
    public static Logger logger =
        LoggerFactory.getLogger(BrokerValidationServiceImpl.class);
    
    @WebServiceRef
    private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://www.mandiri.co.id/services/BrokerValidation/requestBrokerValidation", output = "http://www.mandiri.co.id/services/BrokerValidation/BrokerValidationService/requestBrokerValidationResponse")
    @WebMethod(action = "http://www.mandiri.co.id/services/BrokerValidation/requestBrokerValidation")
    @WebResult(name = "BrokerValidationResponse", targetNamespace = "http://www.mandiri.co.id/schema/BrokerValidation", partName = "part")
    public BrokerValidationResponse requestBrokerValidation(@WebParam(name = "BrokerValidationRequest", partName = "part", targetNamespace = "http://www.mandiri.co.id/schema/BrokerValidation")
        BrokerValidationRequest part) {
        
        try {
            
            anggotaBursaSessionBeanService_Service =
                    new AnggotaBursaSessionBeanService_Service();
            AnggotaBursaSessionBeanService abws =
                anggotaBursaSessionBeanService_Service.getAnggotaBursaSessionBeanServicePort();

            BrokerValidationResponse reply = new BrokerValidationResponse();

            java.util.List<AnggotaBursa> ab =
                abws.getAnggotaBursaFindByUsrSerial(part.getUsername(),
                                                    part.getSerialNumber());

            for (int i = 0; i < ab.size(); i++) {

                ValidationType vt = new ValidationType();
                vt.setWsUser(ab.get(i).getWsUser());
                vt.setWsPasswd(ab.get(i).getWsPasswd());
                reply.getValidation().add(vt);

            }
            
            logger.info("User Validation completed for user " +
                        part.getUsername() + " , returned " +
                        reply.getValidation().size() + " records.");

            return reply;
            
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException();
        }
    }
    
}
