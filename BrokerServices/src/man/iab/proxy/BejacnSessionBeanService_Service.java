package man.iab.proxy;

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

@WebServiceClient(wsdlLocation="http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl",
  targetNamespace="http://session.iab.man/", name="BejacnSessionBeanService")
public class BejacnSessionBeanService_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("man.iab.proxy.BejacnSessionBeanService_Service");
      URL baseUrl =
        BejacnSessionBeanService_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            BejacnSessionBeanService_Service.class.getResource("http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://10.204.6.247:8100/BejacnSessionBean/BejacnSessionBeanService/#%7Bhttp%3A%2F%2Fsession.iab.man%2F%7DBejacnSessionBeanService?wsdl",
          e);
    }
  }

  public BejacnSessionBeanService_Service()
  {
    super(wsdlLocationURL,
          new QName("http://session.iab.man/", "BejacnSessionBeanService"));
  }

  public BejacnSessionBeanService_Service(URL wsdlLocation,
                                          QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="BejacnSessionBeanServicePort")
  public man.iab.proxy.BejacnSessionBeanService getBejacnSessionBeanServicePort()
  {
    return (man.iab.proxy.BejacnSessionBeanService) super.getPort(new QName("http://session.iab.man/",
                                                                            "BejacnSessionBeanServicePort"),
                                                                  man.iab.proxy.BejacnSessionBeanService.class);
  }

  @WebEndpoint(name="BejacnSessionBeanServicePort")
  public man.iab.proxy.BejacnSessionBeanService getBejacnSessionBeanServicePort(WebServiceFeature... features)
  {
    return (man.iab.proxy.BejacnSessionBeanService) super.getPort(new QName("http://session.iab.man/",
                                                                            "BejacnSessionBeanServicePort"),
                                                                  man.iab.proxy.BejacnSessionBeanService.class,
                                                                  features);
  }
}
