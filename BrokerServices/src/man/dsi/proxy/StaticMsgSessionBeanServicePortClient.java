package man.dsi.proxy;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

public class StaticMsgSessionBeanServicePortClient
{
  @WebServiceRef
  private static StaticMsgSessionBeanService_Service staticMsgSessionBeanService_Service;

  public static void main(String [] args)
  {
    staticMsgSessionBeanService_Service = new StaticMsgSessionBeanService_Service();
    StaticMsgSessionBeanService staticMsgSessionBeanService = staticMsgSessionBeanService_Service.getStaticMsgSessionBeanServicePort();
    // Add your code to call the desired methods.
  }
}
