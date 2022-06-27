package man.dsi.proxy;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

@WebServiceClient(wsdlLocation="http://10.204.6.247:8100/StaticMsgSessionBean/StaticMsgSessionBeanService/#%7Bhttp%3A%2F%2Fsession.dsi.man%2F%7DStaticMsgSessionBeanService?wsdl",
  targetNamespace="http://session.dsi.man/", name="StaticMsgSessionBeanService")
public class StaticMsgSessionBeanService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("man.dsi.proxy.StaticMsgSessionBeanService_Service");
      URL baseUrl =
        StaticMsgSessionBeanService_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            StaticMsgSessionBeanService_Service.class.getResource("http://10.204.6.247:8100/StaticMsgSessionBean/StaticMsgSessionBeanService/#%7Bhttp%3A%2F%2Fsession.dsi.man%2F%7DStaticMsgSessionBeanService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://10.204.6.247:8100/StaticMsgSessionBean/StaticMsgSessionBeanService/#%7Bhttp%3A%2F%2Fsession.dsi.man%2F%7DStaticMsgSessionBeanService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://10.204.6.247:8100/StaticMsgSessionBean/StaticMsgSessionBeanService/#%7Bhttp%3A%2F%2Fsession.dsi.man%2F%7DStaticMsgSessionBeanService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://10.204.6.247:8100/StaticMsgSessionBean/StaticMsgSessionBeanService/#%7Bhttp%3A%2F%2Fsession.dsi.man%2F%7DStaticMsgSessionBeanService?wsdl",
          e);
    }
  }

  public StaticMsgSessionBeanService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://session.dsi.man/", "StaticMsgSessionBeanService"));
  }

  public StaticMsgSessionBeanService_Service(URL wsdlLocation,
                                             QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="StaticMsgSessionBeanServicePort")
  public StaticMsgSessionBeanService getStaticMsgSessionBeanServicePort()
  {
    return (StaticMsgSessionBeanService) super.getPort(new QName("http://session.dsi.man/",
                                                                 "StaticMsgSessionBeanServicePort"),
                                                       StaticMsgSessionBeanService.class);
  }

  @WebEndpoint(name="StaticMsgSessionBeanServicePort")
  public StaticMsgSessionBeanService getStaticMsgSessionBeanServicePort(WebServiceFeature... features)
  {
    return (StaticMsgSessionBeanService) super.getPort(new QName("http://session.dsi.man/",
                                                                 "StaticMsgSessionBeanServicePort"),
                                                       StaticMsgSessionBeanService.class,
                                                       features);
  }
}
