package net.helvault.javatutoriales.main;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.logging.Level;
import net.helvault.javatutoriales.conexiones.SessionManager;
import net.helvault.javatutoriales.entities.Televidente;
import net.helvault.javatutoriales.entities.CadenaTelevisiva;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hernan
 */
public class Main {
    

    public static void main(String[] args) 
    { 
        CadenaTelevisiva cadena1 = new CadenaTelevisiva();
        cadena1.setNombre("Cadena 1");

        CadenaTelevisiva cadena2 = new CadenaTelevisiva();
        cadena2.setNombre("Cadena 2");

        CadenaTelevisiva cadena3 = new CadenaTelevisiva();
        cadena3.setNombre("Cadena 3");


        /* Guardamos estos tres objetos CadenaTelevisiva en la base de datos */
        Session sesion = new SessionManager().getSessionFactory().openSession();

            sesion.beginTransaction();
            sesion.save(cadena1);
            sesion.save(cadena2);
            sesion.save(cadena3);
            sesion.getTransaction().commit();
       
//        sesion.close();
        
        System.out.println(sesion.isConnected());


        /* Creamos dos objetos Televidente */
        Televidente televidente1 = new Televidente();
        televidente1.setNombre("Televidente 1");
        televidente1.setCadenaFavorita(cadena1);

        Televidente televidente2 = new Televidente();
        televidente2.setNombre("Televidente 2");
        televidente2.setCadenaFavorita(cadena3);

        /* Guardamos los dos objetos Televidente en la base de Datos */
//        sesion = new SessionManager().getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(televidente1);
        sesion.save(televidente2);
        sesion.getTransaction().commit();
        sesion.close();
        System.out.println(sesion.isConnected());


        System.exit(0);
    }
    
    }
