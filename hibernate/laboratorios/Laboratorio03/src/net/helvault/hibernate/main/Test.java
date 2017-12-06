package net.helvault.hibernate.main;

import java.sql.Date;
import java.util.List;

import net.helvault.hibernate.sessionmanager.SessionManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class Test {
          
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = new SessionManager().getSessionFactory();

            Auto auto = new Auto("Ford","Eco Sport");
            Auto auto1 = new Auto("Volkswagen","Up!");        
            Auto auto2 = new Auto("Peugeot","307");
            
            auto.setFechaVenta("1999-11-17");
            auto1.setFechaVenta("2001-10-13");
            auto2.setFechaVenta("2003-03-12");
            
            auto.insertarAuto(sessionFactory, auto);
            auto1.insertarAuto(sessionFactory, auto1);
            auto2.insertarAuto(sessionFactory, auto2);
            
            List<Auto> autos = Auto.getAutosOrderByFechaVentaDesc(sessionFactory);
            autos.forEach(System.out::println);
            
            autos=Auto.getAutosBetweenDates(sessionFactory, "2000-01-01", "2003-01-01");
            autos.forEach(System.out::println);
            
            auto.setAnoModelo(1998);
            auto1.setAnoModelo(2000);
            auto2.setAnoModelo(2002);
            
            auto.actualizarAuto(sessionFactory, auto);
            auto1.actualizarAuto(sessionFactory, auto1);
            auto2.actualizarAuto(sessionFactory, auto2);
            
            System.out.println("Lista de autos por año del modelo");
            autos=Auto.getAutosByAnoModelo(sessionFactory, 2000);
            autos.forEach(System.out::println);
            
            System.out.println("Lista de autos por inicial");
            autos=Auto.getAutosByPrimeraLetra(sessionFactory, 'f');
            autos.forEach(System.out::println);
            
            
            auto.setPrecio(10000);
            auto1.setPrecio(20000);
            auto2.setPrecio(30000);
            
            auto.actualizarAuto(sessionFactory, auto);
            auto1.actualizarAuto(sessionFactory, auto1);
            auto2.actualizarAuto(sessionFactory, auto2);
            
            autos=Auto.getAutosByPrecioMayorA(sessionFactory, 15000f);
            System.out.println("Autos con precio mayor a $15000:");
            autos.forEach(System.out::println);
            
            System.out.println("Cantidad de autos: "+Auto.getAutosTotal(sessionFactory));
            
            System.out.println("Cantidad de marcas: "+Auto.getCantidadMarcas(sessionFactory));
            
            System.out.println("Precio más alto: "+Auto.getPrecioMasAlto(sessionFactory));
            
            System.out.println("Precio promedio: "+Auto.getPrecioPromedio(sessionFactory));
            
            
            
            sessionFactory.close();
            
            System.exit(0);

    }        
}
    

