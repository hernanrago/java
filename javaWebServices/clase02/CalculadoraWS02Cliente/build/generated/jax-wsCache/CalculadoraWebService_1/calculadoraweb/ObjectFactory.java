
package calculadoraweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculadoraweb package. 
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

    private final static QName _Dividir_QNAME = new QName("http://calculadoraweb/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://calculadoraweb/", "dividirResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://calculadoraweb/", "multiplicar");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://calculadoraweb/", "multiplicarResponse");
    private final static QName _Potenciar_QNAME = new QName("http://calculadoraweb/", "potenciar");
    private final static QName _Potenciar2_QNAME = new QName("http://calculadoraweb/", "potenciar2");
    private final static QName _Potenciar2Response_QNAME = new QName("http://calculadoraweb/", "potenciar2Response");
    private final static QName _PotenciarResponse_QNAME = new QName("http://calculadoraweb/", "potenciarResponse");
    private final static QName _Restar_QNAME = new QName("http://calculadoraweb/", "restar");
    private final static QName _RestarResponse_QNAME = new QName("http://calculadoraweb/", "restarResponse");
    private final static QName _Sumar_QNAME = new QName("http://calculadoraweb/", "sumar");
    private final static QName _SumarResponse_QNAME = new QName("http://calculadoraweb/", "sumarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculadoraweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link Potenciar }
     * 
     */
    public Potenciar createPotenciar() {
        return new Potenciar();
    }

    /**
     * Create an instance of {@link Potenciar2 }
     * 
     */
    public Potenciar2 createPotenciar2() {
        return new Potenciar2();
    }

    /**
     * Create an instance of {@link Potenciar2Response }
     * 
     */
    public Potenciar2Response createPotenciar2Response() {
        return new Potenciar2Response();
    }

    /**
     * Create an instance of {@link PotenciarResponse }
     * 
     */
    public PotenciarResponse createPotenciarResponse() {
        return new PotenciarResponse();
    }

    /**
     * Create an instance of {@link Restar }
     * 
     */
    public Restar createRestar() {
        return new Restar();
    }

    /**
     * Create an instance of {@link RestarResponse }
     * 
     */
    public RestarResponse createRestarResponse() {
        return new RestarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potenciar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "potenciar")
    public JAXBElement<Potenciar> createPotenciar(Potenciar value) {
        return new JAXBElement<Potenciar>(_Potenciar_QNAME, Potenciar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potenciar2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "potenciar2")
    public JAXBElement<Potenciar2> createPotenciar2(Potenciar2 value) {
        return new JAXBElement<Potenciar2>(_Potenciar2_QNAME, Potenciar2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potenciar2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "potenciar2Response")
    public JAXBElement<Potenciar2Response> createPotenciar2Response(Potenciar2Response value) {
        return new JAXBElement<Potenciar2Response>(_Potenciar2Response_QNAME, Potenciar2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "potenciarResponse")
    public JAXBElement<PotenciarResponse> createPotenciarResponse(PotenciarResponse value) {
        return new JAXBElement<PotenciarResponse>(_PotenciarResponse_QNAME, PotenciarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "restar")
    public JAXBElement<Restar> createRestar(Restar value) {
        return new JAXBElement<Restar>(_Restar_QNAME, Restar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "restarResponse")
    public JAXBElement<RestarResponse> createRestarResponse(RestarResponse value) {
        return new JAXBElement<RestarResponse>(_RestarResponse_QNAME, RestarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadoraweb/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

}
