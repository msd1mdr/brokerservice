
package man.iab.proxy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.iab.proxy.types package. 
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

    private final static QName _GetBejacnFindByLimitResponse_QNAME = new QName("http://session.iab.man/", "getBejacnFindByLimitResponse");
    private final static QName _UpdateBejacnSetFlag_QNAME = new QName("http://session.iab.man/", "updateBejacnSetFlag");
    private final static QName _GetBejacnFindByLimit_QNAME = new QName("http://session.iab.man/", "getBejacnFindByLimit");
    private final static QName _UpdateBejacnSetFlagResponse_QNAME = new QName("http://session.iab.man/", "updateBejacnSetFlagResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.iab.proxy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bejacn }
     * 
     */
    public Bejacn createBejacn() {
        return new Bejacn();
    }

    /**
     * Create an instance of {@link UpdateBejacnSetFlag }
     * 
     */
    public UpdateBejacnSetFlag createUpdateBejacnSetFlag() {
        return new UpdateBejacnSetFlag();
    }

    /**
     * Create an instance of {@link GetBejacnFindByLimitResponse }
     * 
     */
    public GetBejacnFindByLimitResponse createGetBejacnFindByLimitResponse() {
        return new GetBejacnFindByLimitResponse();
    }

    /**
     * Create an instance of {@link GetBejacnFindByLimit }
     * 
     */
    public GetBejacnFindByLimit createGetBejacnFindByLimit() {
        return new GetBejacnFindByLimit();
    }

    /**
     * Create an instance of {@link UpdateBejacnSetFlagResponse }
     * 
     */
    public UpdateBejacnSetFlagResponse createUpdateBejacnSetFlagResponse() {
        return new UpdateBejacnSetFlagResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBejacnFindByLimitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.iab.man/", name = "getBejacnFindByLimitResponse")
    public JAXBElement<GetBejacnFindByLimitResponse> createGetBejacnFindByLimitResponse(GetBejacnFindByLimitResponse value) {
        return new JAXBElement<GetBejacnFindByLimitResponse>(_GetBejacnFindByLimitResponse_QNAME, GetBejacnFindByLimitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBejacnSetFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.iab.man/", name = "updateBejacnSetFlag")
    public JAXBElement<UpdateBejacnSetFlag> createUpdateBejacnSetFlag(UpdateBejacnSetFlag value) {
        return new JAXBElement<UpdateBejacnSetFlag>(_UpdateBejacnSetFlag_QNAME, UpdateBejacnSetFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBejacnFindByLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.iab.man/", name = "getBejacnFindByLimit")
    public JAXBElement<GetBejacnFindByLimit> createGetBejacnFindByLimit(GetBejacnFindByLimit value) {
        return new JAXBElement<GetBejacnFindByLimit>(_GetBejacnFindByLimit_QNAME, GetBejacnFindByLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBejacnSetFlagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.iab.man/", name = "updateBejacnSetFlagResponse")
    public JAXBElement<UpdateBejacnSetFlagResponse> createUpdateBejacnSetFlagResponse(UpdateBejacnSetFlagResponse value) {
        return new JAXBElement<UpdateBejacnSetFlagResponse>(_UpdateBejacnSetFlagResponse_QNAME, UpdateBejacnSetFlagResponse.class, null, value);
    }

}
