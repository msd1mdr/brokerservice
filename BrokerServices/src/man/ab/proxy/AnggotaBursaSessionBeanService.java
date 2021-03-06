package man.ab.proxy;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

@WebService(wsdlLocation="http://10.204.6.247:8100/AnggotaBursaSessionBean/AnggotaBursaSessionBeanService/#%7Bhttp%3A%2F%2Fsession.ab.man%2F%7DAnggotaBursaSessionBeanService?wsdl",
  targetNamespace="http://session.ab.man/", name="AnggotaBursaSessionBeanService")
@XmlSeeAlso(
  { man.ab.proxy.types.ObjectFactory.class })
public interface AnggotaBursaSessionBeanService
{
  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="getAnggotaBursaFindByUsrSendMethodResponse",
    targetNamespace="http://session.ab.man/", className="man.ab.proxy.types.GetAnggotaBursaFindByUsrSendMethodResponse")
  @RequestWrapper(localName="getAnggotaBursaFindByUsrSendMethod",
    targetNamespace="http://session.ab.man/", className="man.ab.proxy.types.GetAnggotaBursaFindByUsrSendMethod")
  @WebResult(targetNamespace="")
  public List<man.ab.proxy.types.AnggotaBursa> getAnggotaBursaFindByUsrSendMethod(@WebParam(targetNamespace="",
      name="wsUser")
    String wsUser);

  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="getAnggotaBursaFindByUsrSerialResponse",
    targetNamespace="http://session.ab.man/", className="man.ab.proxy.types.GetAnggotaBursaFindByUsrSerialResponse")
  @RequestWrapper(localName="getAnggotaBursaFindByUsrSerial",
    targetNamespace="http://session.ab.man/", className="man.ab.proxy.types.GetAnggotaBursaFindByUsrSerial")
  @WebResult(targetNamespace="")
  public List<man.ab.proxy.types.AnggotaBursa> getAnggotaBursaFindByUsrSerial(@WebParam(targetNamespace="",
      name="kodeAb")
    String kodeAb, @WebParam(targetNamespace="", name="serialNo")
    String serialNo);
}
