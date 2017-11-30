
package ar.com.xeven;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSRegistrarUsuarioService", targetNamespace = "http://xeven.com.ar/", wsdlLocation = "http://localhost:8080/Productor2/WSRegistrarUsuarioService?wsdl")
public class WSRegistrarUsuarioService
    extends Service
{

    private final static URL WSREGISTRARUSUARIOSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSREGISTRARUSUARIOSERVICE_EXCEPTION;
    private final static QName WSREGISTRARUSUARIOSERVICE_QNAME = new QName("http://xeven.com.ar/", "WSRegistrarUsuarioService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Productor2/WSRegistrarUsuarioService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSREGISTRARUSUARIOSERVICE_WSDL_LOCATION = url;
        WSREGISTRARUSUARIOSERVICE_EXCEPTION = e;
    }

    public WSRegistrarUsuarioService() {
        super(__getWsdlLocation(), WSREGISTRARUSUARIOSERVICE_QNAME);
    }

    public WSRegistrarUsuarioService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSREGISTRARUSUARIOSERVICE_QNAME, features);
    }

    public WSRegistrarUsuarioService(URL wsdlLocation) {
        super(wsdlLocation, WSREGISTRARUSUARIOSERVICE_QNAME);
    }

    public WSRegistrarUsuarioService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSREGISTRARUSUARIOSERVICE_QNAME, features);
    }

    public WSRegistrarUsuarioService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSRegistrarUsuarioService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSRegistrarUsuario
     */
    @WebEndpoint(name = "WSRegistrarUsuarioPort")
    public WSRegistrarUsuario getWSRegistrarUsuarioPort() {
        return super.getPort(new QName("http://xeven.com.ar/", "WSRegistrarUsuarioPort"), WSRegistrarUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSRegistrarUsuario
     */
    @WebEndpoint(name = "WSRegistrarUsuarioPort")
    public WSRegistrarUsuario getWSRegistrarUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xeven.com.ar/", "WSRegistrarUsuarioPort"), WSRegistrarUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSREGISTRARUSUARIOSERVICE_EXCEPTION!= null) {
            throw WSREGISTRARUSUARIOSERVICE_EXCEPTION;
        }
        return WSREGISTRARUSUARIOSERVICE_WSDL_LOCATION;
    }

}
