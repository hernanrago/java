package net.helvault.javatutoriales.main;

import net.helvault.javatutoriales.conexiones.SessionManager;
import net.helvault.javatutoriales.entities.Presidente;
import net.helvault.javatutoriales.entities.Pais;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class Main {
    

    public static void main(String[] args) {  
        
        Pais pais1 = new Pais();  
        pais1.setNombre("China");   

        Pais pais2 = new Pais();  
        pais2.setNombre("Corea");    

        Presidente presidente1 = new Presidente();  
        presidente1.setNombre("Jiang Zemin");   

        Presidente presidente2 = new Presidente();  
        presidente2.setNombre("Kim Dae-Jung");   

        pais1.setPresidente(presidente1);  
        pais2.setPresidente(presidente2);   

        presidente1.setPais(pais1);  
        presidente2.setPais(pais2);   

        Session sesion = new SessionManager().getSessionFactory().openSession();

        /*Este pais se agrega para comprobar que los presidentes tomen el mismo  
        identificador que los paises*/  
        Pais p = new Pais();  
        p.setNombre("Chipre");    

        /*En la primer sesion a la base de datos almacenamos los dos objetos Pais  
        los objetos Presidente se almacenaran en cascada*/  
        Transaction transaction = sesion.beginTransaction();   

        sesion.persist(p);  
        sesion.persist(pais1);  
        sesion.persist(pais2);   

        transaction.commit();     

        /*En la segunda sesion eliminamos el objeto pais1,  
        el presidente1 sera borrado en cascada*/  
        
        transaction=sesion.beginTransaction();

        sesion.delete(pais1);   

    
        transaction.commit();
        
        sesion.close(); 
        System.exit(0);
    }
    
    
}
