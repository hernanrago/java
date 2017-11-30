
package helvault;

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
@WebService(name = "Calculator", targetNamespace = "http://helvault/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://helvault/", className = "helvault.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://helvault/", className = "helvault.OperationResponse")
    @Action(input = "http://helvault/Calculator/operationRequest", output = "http://helvault/Calculator/operationResponse")
    public Integer operation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

}
