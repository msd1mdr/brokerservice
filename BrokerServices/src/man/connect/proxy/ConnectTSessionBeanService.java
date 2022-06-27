package man.connect.proxy;

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

@WebService(wsdlLocation="http://10.204.6.247:8100/ConnectTSessionBean/ConnectTSessionBeanService/#%7Bhttp%3A%2F%2Fsession.connect.man%2F%7DConnectTSessionBeanService?wsdl",
  targetNamespace="http://session.connect.man/", name="ConnectTSessionBeanService")
@XmlSeeAlso(
  { man.connect.proxy.types.ObjectFactory.class })
public interface ConnectTSessionBeanService
{
  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="mergeConnectTResponse", targetNamespace="http://session.connect.man/",
    className="man.connect.proxy.types.MergeConnectTResponse")
  @RequestWrapper(localName="mergeConnectT", targetNamespace="http://session.connect.man/",
    className="man.connect.proxy.types.MergeConnectT")
  @WebResult(targetNamespace="")
  public man.connect.proxy.types.ConnectT mergeConnectT(@WebParam(targetNamespace="",
      name="arg0")
    man.connect.proxy.types.ConnectT arg0);
}