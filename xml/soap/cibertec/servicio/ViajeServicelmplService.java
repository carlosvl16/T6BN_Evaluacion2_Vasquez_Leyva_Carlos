
package soap.cibertec.servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ViajeServicelmplService", targetNamespace = "http://servicio.cibertec.soap/", wsdlLocation = "http://localhost:8030/servicioViaje?wsdl")
public class ViajeServicelmplService
    extends Service
{

    private final static URL VIAJESERVICELMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException VIAJESERVICELMPLSERVICE_EXCEPTION;
    private final static QName VIAJESERVICELMPLSERVICE_QNAME = new QName("http://servicio.cibertec.soap/", "ViajeServicelmplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8030/servicioViaje?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIAJESERVICELMPLSERVICE_WSDL_LOCATION = url;
        VIAJESERVICELMPLSERVICE_EXCEPTION = e;
    }

    public ViajeServicelmplService() {
        super(__getWsdlLocation(), VIAJESERVICELMPLSERVICE_QNAME);
    }

    public ViajeServicelmplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIAJESERVICELMPLSERVICE_QNAME, features);
    }

    public ViajeServicelmplService(URL wsdlLocation) {
        super(wsdlLocation, VIAJESERVICELMPLSERVICE_QNAME);
    }

    public ViajeServicelmplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIAJESERVICELMPLSERVICE_QNAME, features);
    }

    public ViajeServicelmplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ViajeServicelmplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Servicio
     */
    @WebEndpoint(name = "servicioViajePort")
    public Servicio getServicioViajePort() {
        return super.getPort(new QName("http://servicio.cibertec.soap/", "servicioViajePort"), Servicio.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Servicio
     */
    @WebEndpoint(name = "servicioViajePort")
    public Servicio getServicioViajePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.cibertec.soap/", "servicioViajePort"), Servicio.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIAJESERVICELMPLSERVICE_EXCEPTION!= null) {
            throw VIAJESERVICELMPLSERVICE_EXCEPTION;
        }
        return VIAJESERVICELMPLSERVICE_WSDL_LOCATION;
    }

}
