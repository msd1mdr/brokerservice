
package man.connect.proxy.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.connect.proxy.types package. 
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

    private final static QName _MergeConnectT_QNAME = new QName("http://session.connect.man/", "mergeConnectT");
    private final static QName _MergeConnectTResponse_QNAME = new QName("http://session.connect.man/", "mergeConnectTResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.connect.proxy.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MergeConnectT }
     * 
     */
    public MergeConnectT createMergeConnectT() {
        return new MergeConnectT();
    }

    /**
     * Create an instance of {@link MergeConnectTResponse }
     * 
     */
    public MergeConnectTResponse createMergeConnectTResponse() {
        return new MergeConnectTResponse();
    }

    /**
     * Create an instance of {@link ConnectT }
     * 
     */
    public ConnectT createConnectT() {
        return new ConnectT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeConnectT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.connect.man/", name = "mergeConnectT")
    public JAXBElement<MergeConnectT> createMergeConnectT(MergeConnectT value) {
        return new JAXBElement<MergeConnectT>(_MergeConnectT_QNAME, MergeConnectT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeConnectTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://session.connect.man/", name = "mergeConnectTResponse")
    public JAXBElement<MergeConnectTResponse> createMergeConnectTResponse(MergeConnectTResponse value) {
        return new JAXBElement<MergeConnectTResponse>(_MergeConnectTResponse_QNAME, MergeConnectTResponse.class, null, value);
    }

}
