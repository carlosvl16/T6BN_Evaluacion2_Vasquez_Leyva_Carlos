
package soap.cibertec.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.cibertec.interfaces package. 
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

    private final static QName _SaveViaje_QNAME = new QName("http://interfaces.cibertec.soap/", "saveViaje");
    private final static QName _ListAllViajeResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllViajeResponse");
    private final static QName _ListAllViaje_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllViaje");
    private final static QName _SaveViajeResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "saveViajeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.cibertec.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAllViajeResponse }
     * 
     */
    public ListAllViajeResponse createListAllViajeResponse() {
        return new ListAllViajeResponse();
    }

    /**
     * Create an instance of {@link ListAllViaje }
     * 
     */
    public ListAllViaje createListAllViaje() {
        return new ListAllViaje();
    }

    /**
     * Create an instance of {@link SaveViajeResponse }
     * 
     */
    public SaveViajeResponse createSaveViajeResponse() {
        return new SaveViajeResponse();
    }

    /**
     * Create an instance of {@link SaveViaje }
     * 
     */
    public SaveViaje createSaveViaje() {
        return new SaveViaje();
    }

    /**
     * Create an instance of {@link Viaje }
     * 
     */
    public Viaje createViaje() {
        return new Viaje();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveViaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveViaje")
    public JAXBElement<SaveViaje> createSaveViaje(SaveViaje value) {
        return new JAXBElement<SaveViaje>(_SaveViaje_QNAME, SaveViaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllViajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllViajeResponse")
    public JAXBElement<ListAllViajeResponse> createListAllViajeResponse(ListAllViajeResponse value) {
        return new JAXBElement<ListAllViajeResponse>(_ListAllViajeResponse_QNAME, ListAllViajeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllViaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllViaje")
    public JAXBElement<ListAllViaje> createListAllViaje(ListAllViaje value) {
        return new JAXBElement<ListAllViaje>(_ListAllViaje_QNAME, ListAllViaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveViajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveViajeResponse")
    public JAXBElement<SaveViajeResponse> createSaveViajeResponse(SaveViajeResponse value) {
        return new JAXBElement<SaveViajeResponse>(_SaveViajeResponse_QNAME, SaveViajeResponse.class, null, value);
    }

}
