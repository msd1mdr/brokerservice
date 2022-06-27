
package man.dsi.proxy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.dsi.proxy.types package. 
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

    private final static QName _GetStaticMsgFindByLimitResponse_QNAME = new QName("http://session.dsi.man/", "getStaticMsgFindByLimitResponse");
    private final static QName _GetStaticMsgFindByLimit_QNAME = new QName("http://session.dsi.man/", "getStaticMsgFindByLimit");
    private final static QName _UpdateStaticMsgSetFlagResponse_QNAME = new QName("http://session.dsi.man/", "updateStaticMsgSetFlagResponse");
    private final static QName _UpdateStaticMsgSetFlag_QNAME = new QName("http://session.dsi.man/", "updateStaticMsgSetFlag");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.dsi.proxy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StaticMsg }
     * 
     */
    public StaticMsg createStaticMsg() {
        return new StaticMsg();
    }

    /**
     * Create an instance of {@link UpdateStaticMsgSetFlag }
     * 
     */
    public UpdateStaticMsgSetFlag createUpdateStaticMsgSetFlag() {
        return new UpdateStaticMsgSetFlag();
    }

    /**
     * Create an instance of {@link UpdateStaticMsgSetFlagResponse }
     * 
     */
    public UpdateStaticMsgSetFlagResponse createUpdateStaticMsgSetFlagResponse() {
        return new UpdateStaticMsgSetFlagResponse();
    }

    /**
     * Create an instance of {@link GetStaticMsgFindByLimit }
     * 
     */
    public GetStaticMsgFindByLimit createGetStaticMsgFindByLimit() {
        return new GetStaticMsgFindByLimit();
    }

    /**
     * Create an instance of {@link GetStaticMsgFindByLimitResponse }
     * 
     */
    public GetStaticMsgFindByLimitResponse createGetStaticMsgFindByLimitResponse() {
        return new GetStaticMsgFindByLimitResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaticMsgFindByLimitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.dsi.man/", name = "getStaticMsgFindByLimitResponse")
    public JAXBElement<GetStaticMsgFindByLimitResponse> createGetStaticMsgFindByLimitResponse(GetStaticMsgFindByLimitResponse value) {
        return new JAXBElement<GetStaticMsgFindByLimitResponse>(_GetStaticMsgFindByLimitResponse_QNAME, GetStaticMsgFindByLimitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaticMsgFindByLimit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.dsi.man/", name = "getStaticMsgFindByLimit")
    public JAXBElement<GetStaticMsgFindByLimit> createGetStaticMsgFindByLimit(GetStaticMsgFindByLimit value) {
        return new JAXBElement<GetStaticMsgFindByLimit>(_GetStaticMsgFindByLimit_QNAME, GetStaticMsgFindByLimit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStaticMsgSetFlagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.dsi.man/", name = "updateStaticMsgSetFlagResponse")
    public JAXBElement<UpdateStaticMsgSetFlagResponse> createUpdateStaticMsgSetFlagResponse(UpdateStaticMsgSetFlagResponse value) {
        return new JAXBElement<UpdateStaticMsgSetFlagResponse>(_UpdateStaticMsgSetFlagResponse_QNAME, UpdateStaticMsgSetFlagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStaticMsgSetFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.dsi.man/", name = "updateStaticMsgSetFlag")
    public JAXBElement<UpdateStaticMsgSetFlag> createUpdateStaticMsgSetFlag(UpdateStaticMsgSetFlag value) {
        return new JAXBElement<UpdateStaticMsgSetFlag>(_UpdateStaticMsgSetFlag_QNAME, UpdateStaticMsgSetFlag.class, null, value);
    }

}
