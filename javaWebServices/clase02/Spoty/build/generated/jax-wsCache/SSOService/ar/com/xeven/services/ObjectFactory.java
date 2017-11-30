
package ar.com.xeven.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ar.com.xeven.services package. 
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

    private final static QName _Login_QNAME = new QName("http://services.xeven.com.ar/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://services.xeven.com.ar/", "loginResponse");
    private final static QName _ValidateSession_QNAME = new QName("http://services.xeven.com.ar/", "validateSession");
    private final static QName _ValidateSessionResponse_QNAME = new QName("http://services.xeven.com.ar/", "validateSessionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ar.com.xeven.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ValidateSession }
     * 
     */
    public ValidateSession createValidateSession() {
        return new ValidateSession();
    }

    /**
     * Create an instance of {@link ValidateSessionResponse }
     * 
     */
    public ValidateSessionResponse createValidateSessionResponse() {
        return new ValidateSessionResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.xeven.com.ar/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.xeven.com.ar/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.xeven.com.ar/", name = "validateSession")
    public JAXBElement<ValidateSession> createValidateSession(ValidateSession value) {
        return new JAXBElement<ValidateSession>(_ValidateSession_QNAME, ValidateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.xeven.com.ar/", name = "validateSessionResponse")
    public JAXBElement<ValidateSessionResponse> createValidateSessionResponse(ValidateSessionResponse value) {
        return new JAXBElement<ValidateSessionResponse>(_ValidateSessionResponse_QNAME, ValidateSessionResponse.class, null, value);
    }

}
