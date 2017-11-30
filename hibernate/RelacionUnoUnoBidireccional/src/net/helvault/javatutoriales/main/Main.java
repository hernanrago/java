package net.helvault.javatutoriales.main;

import net.helvault.javatutoriales.conexiones.SessionManager;
import net.helvault.javatutoriales.entities.Direccion;
import net.helvault.javatutoriales.entities.Persona;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class Main {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(); 
        persona1.setNombre("Persona que sera borrada");  

        Persona persona2 = new Persona(); 
        persona2.setNombre("Persona que permanecera");  

        Direccion direccion1 = new Direccion(); 
        direccion1.setCalle("Calle 1"); 
        direccion1.setCodigoPostal("12345");  

        Direccion direccion2 = new Direccion(); 
        direccion2.setCalle("Calle 2"); 
        direccion2.setCodigoPostal("54321");  

        persona1.setDireccion(direccion1); 
        persona2.setDireccion(direccion2);  

        Session sesion = new SessionManager().getSessionFactory().openSession();   

        /*Esta direccion se agrega para comprobar que las personas tomen el mismo 
        identificador que las direcciones*/ 
        Direccion d = new Direccion(); 
        d.setCalle("Calle de Prueba de identificadores"); 
        d.setCodigoPostal("21345");   

        /*En la primer sesion a la base de datos almacenamos los dos objetos Persona 
        los objetos Direccion se almacenaran en cascada*/
        sesion.beginTransaction();

        sesion.persist(d); 
        sesion.persist(persona1); 
        sesion.persist(persona2);  

        sesion.getTransaction().commit();

        /*En la segunda sesion eliminamos el objeto persona1, 
        la direccion1 sera borrada en cascada*/ 

        sesion.beginTransaction();  
    
        sesion.delete(persona1);  
    
        sesion.getTransaction().commit(); 
        
        sesion.close(); 

        System.exit(0);
}
    
}
