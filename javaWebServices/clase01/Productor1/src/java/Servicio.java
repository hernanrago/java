
import javax.jws.WebService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */

@WebService(targetNamespace = "http://my.org/ns/")
public class Servicio {
    public String saludar(String alumno){
        return "Hola ".concat(alumno);
    }
    
    public String despedir(){
        return "Chau!";
    }
    public String registrar(String nombre, String mail){
        // conexión con db mágica
        if(1==2)
            return "usuario creado";
        else
            return "error";
    }
}
