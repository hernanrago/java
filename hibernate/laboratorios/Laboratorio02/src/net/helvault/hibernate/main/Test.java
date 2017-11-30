package net.helvault.hibernate.main;

import java.util.List;
import net.helvault.hibernate.entities.Concesionario;
import net.helvault.hibernate.sessionmanager.SessionManager;
import org.hibernate.SessionFactory;

/**
 *
 * @author hernan
 */
public class Test {
          
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = new SessionManager().getSessionFactory();
                
        Concesionario concesionario = new Concesionario("Carmageddon", "Segurola 666");
        Concesionario concesionario1 = new Concesionario("Los Autos Locos", "Gaona 123");
        concesionario.insertarConcesionario(sessionFactory,concesionario);
        concesionario1.insertarConcesionario(sessionFactory,concesionario1);
        
        List<Concesionario> concesionarios = Concesionario.getConcesionarios(sessionFactory);
        concesionarios.forEach(System.out::println);
        
        concesionario1.setDireccion("San Pedrito 39");
        concesionario1.actualizarConcesionario(sessionFactory, concesionario1);
        
        concesionarios = Concesionario.getConcesionarios(sessionFactory);
        concesionarios.forEach(System.out::println);
        
        
        concesionario.eliminarConcesionario(sessionFactory, concesionario);
        
        concesionarios = Concesionario.getConcesionarios(sessionFactory);
        concesionarios.forEach(System.out::println);
        
        sessionFactory.close();
        
    }
                  
}
    

