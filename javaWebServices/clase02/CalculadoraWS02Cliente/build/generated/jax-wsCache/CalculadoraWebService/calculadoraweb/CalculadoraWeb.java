
package calculadoraweb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculadoraWeb", targetNamespace = "http://calculadoraweb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculadoraWeb {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.SumarResponse")
    @Action(input = "http://calculadoraweb/CalculadoraWeb/sumarRequest", output = "http://calculadoraweb/CalculadoraWeb/sumarResponse")
    public Double sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Double> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restar", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.Restar")
    @ResponseWrapper(localName = "restarResponse", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.RestarResponse")
    @Action(input = "http://calculadoraweb/CalculadoraWeb/restarRequest", output = "http://calculadoraweb/CalculadoraWeb/restarResponse")
    public Double restar(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Double> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicar", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.Multiplicar")
    @ResponseWrapper(localName = "multiplicarResponse", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.MultiplicarResponse")
    @Action(input = "http://calculadoraweb/CalculadoraWeb/multiplicarRequest", output = "http://calculadoraweb/CalculadoraWeb/multiplicarResponse")
    public Double multiplicar(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Double> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dividir", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.Dividir")
    @ResponseWrapper(localName = "dividirResponse", targetNamespace = "http://calculadoraweb/", className = "calculadoraweb.DividirResponse")
    @Action(input = "http://calculadoraweb/CalculadoraWeb/dividirRequest", output = "http://calculadoraweb/CalculadoraWeb/dividirResponse")
    public Double dividir(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Double> arg0);

}
