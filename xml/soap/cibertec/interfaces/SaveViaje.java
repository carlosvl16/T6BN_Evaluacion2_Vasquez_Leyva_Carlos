
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveViaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveViaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viaje" type="{http://interfaces.cibertec.soap/}viaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveViaje", propOrder = {
    "viaje"
})
public class SaveViaje {

    protected Viaje viaje;

    /**
     * Obtiene el valor de la propiedad viaje.
     * 
     * @return
     *     possible object is
     *     {@link Viaje }
     *     
     */
    public Viaje getViaje() {
        return viaje;
    }

    /**
     * Define el valor de la propiedad viaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Viaje }
     *     
     */
    public void setViaje(Viaje value) {
        this.viaje = value;
    }

}
