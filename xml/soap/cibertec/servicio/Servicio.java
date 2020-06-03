
package soap.cibertec.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import soap.cibertec.interfaces.ObjectFactory;
import soap.cibertec.interfaces.Viaje;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicio", targetNamespace = "http://interfaces.cibertec.soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicio {


    /**
     * 
     * @param viaje
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveViaje", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.SaveViaje")
    @ResponseWrapper(localName = "saveViajeResponse", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.SaveViajeResponse")
    @Action(input = "http://interfaces.cibertec.soap/servicio/saveViajeRequest", output = "http://interfaces.cibertec.soap/servicio/saveViajeResponse")
    public int saveViaje(
        @WebParam(name = "viaje", targetNamespace = "")
        Viaje viaje);

    /**
     * 
     * @param precio
     * @param precioUno
     * @return
     *     returns java.util.List<soap.cibertec.interfaces.Viaje>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAllViaje", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.ListAllViaje")
    @ResponseWrapper(localName = "listAllViajeResponse", targetNamespace = "http://interfaces.cibertec.soap/", className = "soap.cibertec.interfaces.ListAllViajeResponse")
    @Action(input = "http://interfaces.cibertec.soap/servicio/listAllViajeRequest", output = "http://interfaces.cibertec.soap/servicio/listAllViajeResponse")
    public List<Viaje> listAllViaje(
        @WebParam(name = "precio", targetNamespace = "")
        double precio,
        @WebParam(name = "precioUno", targetNamespace = "")
        double precioUno);

}