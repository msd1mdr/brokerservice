package man.ab.proxy;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

public class AnggotaBursaSessionBeanServicePortClient
{
  @WebServiceRef
  private static AnggotaBursaSessionBeanService_Service anggotaBursaSessionBeanService_Service;

  public static void main(String [] args)
  {
    anggotaBursaSessionBeanService_Service = new AnggotaBursaSessionBeanService_Service();
    AnggotaBursaSessionBeanService anggotaBursaSessionBeanService = anggotaBursaSessionBeanService_Service.getAnggotaBursaSessionBeanServicePort();
    // Add your code to call the desired methods.
  }
}
