
package man.ias.proxy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.ias.proxy.types package. 
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

    private final static QName _UpdateStmtBrokerSetFlag_QNAME = new QName("http://session.ias.man/", "updateStmtBrokerSetFlag");
    private final static QName _UpdateStmtBrokerSetFlagResponse_QNAME = new QName("http://session.ias.man/", "updateStmtBrokerSetFlagResponse");
    private final static QName _GetStmtBrokerFindByLimit_QNAME = new QName("http://session.ias.man/", "getStmtBrokerFindByLimit");
    private final static QName _GetStmtBrokerFindByLimitResponse_QNAME = new QName("http://session.ias.man/", "getStmtBrokerFindByLimitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.ias.proxy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStmtBrokerFindByLimitResponse }
     * 
     */
    public GetStmtBrokerFindByLimitResponse createGetStmtBrokerFindByLimitResponse() {
        return new GetStmtBrokerFindByLimitResponse();
    }

    /**
     * Create an instance of {@link UpdateStmtBrokerSetFlagResponse }
     * 
     */
    public UpdateStmtBrokerSetFlagResponse createUpdateStmtBrokerSetFlagResponse() {
        return new UpdateStmtBrokerSetFlagResponse();
    }

    /**
     * Create an instance of {@link UpdateStmtBrokerSetFlag }
     * 
     */
    public UpdateStmtBrokerSetFlag createUpdateStmtBrokerSetFlag() {
        return new UpdateStmtBrokerSetFlag();
    }

    /**
     * Create an instance of {@link GetStmtBrokerFindByLimit }
     * 
     */
    public GetStmtBrokerFindByLimit createGetStmtBrokerFindByLimit() {
        return new GetStmtBrokerFindByLimit();
    }

    /**
     * Create an instance of {@link StmtBroker }
     * 
     */
    public StmtBroker createStmtBroker() {
        return new StmtBroker();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStmtBrokerSetFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ias.man/", name = "updateStmtBrokerSetFlag")
    public JAXBElement<UpdateStmtBrokerSetFlag> createUpdateStmtBrokerSetFlag(UpdateStmtBrokerSetFlag value) {
        return new JAXBElement<UpdateStmtBrokerSetFlag>(_UpdateStmtBrokerSetFlag_QNAME, UpdateStmtBrokerSetFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStmtBrokerSetFlagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ias.man/", name = "updateStmtBrokerSetFlagResponse")
    public JAXBElement<UpdateStmtBrokerSetFlagResponse> createUpdateStmtBrokerSetFlagResponse(UpdateStmtBrokerSetFlagResponse value) {
        return new JAXBElement<UpdateStmtBrokerSetFlagResponse>(_UpdateStmtBrokerSetFlagResponse_QNAME, UpdateStmtBrokerSetFlagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStmtBrokerFindByLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ias.man/", name = "getStmtBrokerFindByLimit")
    public JAXBElement<GetStmtBrokerFindByLimit> createGetStmtBrokerFindByLimit(GetStmtBrokerFindByLimit value) {
        return new JAXBElement<GetStmtBrokerFindByLimit>(_GetStmtBrokerFindByLimit_QNAME, GetStmtBrokerFindByLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStmtBrokerFindByLimitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.ias.man/", name = "getStmtBrokerFindByLimitResponse")
    public JAXBElement<GetStmtBrokerFindByLimitResponse> createGetStmtBrokerFindByLimitResponse(GetStmtBrokerFindByLimitResponse value) {
        return new JAXBElement<GetStmtBrokerFindByLimitResponse>(_GetStmtBrokerFindByLimitResponse_QNAME, GetStmtBrokerFindByLimitResponse.class, null, value);
    }

}
