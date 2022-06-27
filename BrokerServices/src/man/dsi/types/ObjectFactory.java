
package man.dsi.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the man.dsi.types package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: man.dsi.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link DataStaticInvestorRequest }
     * 
     */
    public DataStaticInvestorRequest createDataStaticInvestorRequest() {
        return new DataStaticInvestorRequest();
    }

    /**
     * Create an instance of {@link DataStaticInvestorResponse }
     * 
     */
    public DataStaticInvestorResponse createDataStaticInvestorResponse() {
        return new DataStaticInvestorResponse();
    }

    /**
     * Create an instance of {@link RecordType.Field }
     * 
     */
    public RecordType.Field createRecordTypeField() {
        return new RecordType.Field();
    }

    /**
     * Create an instance of {@link MessageType.Field }
     * 
     */
    public MessageType.Field createMessageTypeField() {
        return new MessageType.Field();
    }

    /**
     * Create an instance of {@link MessageType.List }
     * 
     */
    public MessageType.List createMessageTypeList() {
        return new MessageType.List();
    }

}
