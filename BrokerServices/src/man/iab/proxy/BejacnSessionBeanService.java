package man.iab.proxy;

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

@WebService(wsdlLocation="http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl",
  targetNamespace="http://session.iab.man/", name="BejacnSessionBeanService")
@XmlSeeAlso(
  { man.iab.proxy.types.ObjectFactory.class })
public interface BejacnSessionBeanService
{
  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="getBejacnFindByLimitResponse",
    targetNamespace="http://session.iab.man/", className="man.iab.proxy.types.GetBejacnFindByLimitResponse")
  @RequestWrapper(localName="getBejacnFindByLimit", targetNamespace="http://session.iab.man/",
    className="man.iab.proxy.types.GetBejacnFindByLimit")
  @WebResult(targetNamespace="")
  public List<man.iab.proxy.types.Bejacn> getBejacnFindByLimit(@WebParam(targetNamespace="",
      name="partid")
    String partid);

  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="updateBejacnSetFlagResponse",
    targetNamespace="http://session.iab.man/", className="man.iab.proxy.types.UpdateBejacnSetFlagResponse")
  @RequestWrapper(localName="updateBejacnSetFlag", targetNamespace="http://session.iab.man/",
    className="man.iab.proxy.types.UpdateBejacnSetFlag")
  @WebResult(targetNamespace="")
  public int updateBejacnSetFlag(@WebParam(targetNamespace="", name="partid")
    String partid, @WebParam(targetNamespace="", name="acctno")
    long acctno, @WebParam(targetNamespace="", name="bjvald")
    long bjvald, @WebParam(targetNamespace="", name="bjvtme")
    long bjvtme);
}
