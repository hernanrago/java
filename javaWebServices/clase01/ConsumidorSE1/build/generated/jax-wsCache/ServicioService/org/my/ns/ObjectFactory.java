
package org.my.ns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.my.ns package. 
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

    private final static QName _Saludar_QNAME = new QName("http://my.org/ns/", "saludar");
    private final static QName _Despedir_QNAME = new QName("http://my.org/ns/", "despedir");
    private final static QName _DespedirResponse_QNAME = new QName("http://my.org/ns/", "despedirResponse");
    private final static QName _SaludarResponse_QNAME = new QName("http://my.org/ns/", "saludarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.my.ns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DespedirResponse }
     * 
     */
    public DespedirResponse createDespedirResponse() {
        return new DespedirResponse();
    }

    /**
     * Create an instance of {@link Saludar }
     * 
     */
    public Saludar createSaludar() {
        return new Saludar();
    }

    /**
     * Create an instance of {@link Despedir }
     * 
     */
    public Despedir createDespedir() {
        return new Despedir();
    }

    /**
     * Create an instance of {@link SaludarResponse }
     * 
     */
    public SaludarResponse createSaludarResponse() {
        return new SaludarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://my.org/ns/", name = "saludar")
    public JAXBElement<Saludar> createSaludar(Saludar value) {
        return new JAXBElement<Saludar>(_Saludar_QNAME, Saludar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Despedir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://my.org/ns/", name = "despedir")
    public JAXBElement<Despedir> createDespedir(Despedir value) {
        return new JAXBElement<Despedir>(_Despedir_QNAME, Despedir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespedirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://my.org/ns/", name = "despedirResponse")
    public JAXBElement<DespedirResponse> createDespedirResponse(DespedirResponse value) {
        return new JAXBElement<DespedirResponse>(_DespedirResponse_QNAME, DespedirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://my.org/ns/", name = "saludarResponse")
    public JAXBElement<SaludarResponse> createSaludarResponse(SaludarResponse value) {
        return new JAXBElement<SaludarResponse>(_SaludarResponse_QNAME, SaludarResponse.class, null, value);
    }

}
