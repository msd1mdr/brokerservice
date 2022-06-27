
package man.ab.proxy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.ab.proxy.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAnggotaBursaFindByUsrSerial_QNAME = new QName("http://session.ab.man/", "getAnggotaBursaFindByUsrSerial");
    private final static QName _GetAnggotaBursaFindByUsrSendMethodResponse_QNAME = new QName("http://session.ab.man/", "getAnggotaBursaFindByUsrSendMethodResponse");
    private final static QName _GetAnggotaBursaFindByUsrSerialResponse_QNAME = new QName("http://session.ab.man/", "getAnggotaBursaFindByUsrSerialResponse");
    private final static QName _GetAnggotaBursaFindByUsrSendMethod_QNAME = new QName("http://session.ab.man/", "getAnggotaBursaFindByUsrSendMethod");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.ab.proxy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAnggotaBursaFindByUsrSerialResponse }
     * 
     */
    public GetAnggotaBursaFindByUsrSerialResponse createGetAnggotaBursaFindByUsrSerialResponse() {
        return new GetAnggotaBursaFindByUsrSerialResponse();
    }

    /**
     * Create an instance of {@link GetAnggotaBursaFindByUsrSendMethodResponse }
     * 
     */
    public GetAnggotaBursaFindByUsrSendMethodResponse createGetAnggotaBursaFindByUsrSendMethodResponse() {
        return new GetAnggotaBursaFindByUsrSendMethodResponse();
    }

    /**
     * Create an instance of {@link GetAnggotaBursaFindByUsrSendMethod }
     * 
     */
    public GetAnggotaBursaFindByUsrSendMethod createGetAnggotaBursaFindByUsrSendMethod() {
        return new GetAnggotaBursaFindByUsrSendMethod();
    }

    /**
     * Create an instance of {@link GetAnggotaBursaFindByUsrSerial }
     * 
     */
    public GetAnggotaBursaFindByUsrSerial createGetAnggotaBursaFindByUsrSerial() {
        return new GetAnggotaBursaFindByUsrSerial();
    }

    /**
     * Create an instance of {@link AnggotaBursa }
     * 
     */
    public AnggotaBursa createAnggotaBursa() {
        return new AnggotaBursa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnggotaBursaFindByUsrSerial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ab.man/", name = "getAnggotaBursaFindByUsrSerial")
    public JAXBElement<GetAnggotaBursaFindByUsrSerial> createGetAnggotaBursaFindByUsrSerial(GetAnggotaBursaFindByUsrSerial value) {
        return new JAXBElement<GetAnggotaBursaFindByUsrSerial>(_GetAnggotaBursaFindByUsrSerial_QNAME, GetAnggotaBursaFindByUsrSerial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnggotaBursaFindByUsrSendMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ab.man/", name = "getAnggotaBursaFindByUsrSendMethodResponse")
    public JAXBElement<GetAnggotaBursaFindByUsrSendMethodResponse> createGetAnggotaBursaFindByUsrSendMethodResponse(GetAnggotaBursaFindByUsrSendMethodResponse value) {
        return new JAXBElement<GetAnggotaBursaFindByUsrSendMethodResponse>(_GetAnggotaBursaFindByUsrSendMethodResponse_QNAME, GetAnggotaBursaFindByUsrSendMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnggotaBursaFindByUsrSerialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ab.man/", name = "getAnggotaBursaFindByUsrSerialResponse")
    public JAXBElement<GetAnggotaBursaFindByUsrSerialResponse> createGetAnggotaBursaFindByUsrSerialResponse(GetAnggotaBursaFindByUsrSerialResponse value) {
        return new JAXBElement<GetAnggotaBursaFindByUsrSerialResponse>(_GetAnggotaBursaFindByUsrSerialResponse_QNAME, GetAnggotaBursaFindByUsrSerialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnggotaBursaFindByUsrSendMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ab.man/", name = "getAnggotaBursaFindByUsrSendMethod")
    public JAXBElement<GetAnggotaBursaFindByUsrSendMethod> createGetAnggotaBursaFindByUsrSendMethod(GetAnggotaBursaFindByUsrSendMethod value) {
        return new JAXBElement<GetAnggotaBursaFindByUsrSendMethod>(_GetAnggotaBursaFindByUsrSendMethod_QNAME, GetAnggotaBursaFindByUsrSendMethod.class, null, value);
    }

}
