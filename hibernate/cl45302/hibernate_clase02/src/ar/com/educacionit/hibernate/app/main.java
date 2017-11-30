package ar.com.educacionit.hibernate.app;

import ar.com.educacionit.hibernate.entities.Auto;
import ar.com.educacionit.hibernate.entities.Cliente;
import ar.com.educacionit.hibernate.entities.Empleado;
import ar.com.educacionit.hibernate.entities.Persona;
import ar.com.educacionit.hibernate.manager.SessionManager;
import ar.com.educacionit.hibernate.repository.AutoRepository;
import ar.com.educacionit.hibernate.repository.PersonaRepository;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class main {
    public static void main(String[] args) {
        //Auto fiat = new Auto("Fiat","Duna");
        //fiat.setId(1L);
        SessionFactory sf = SessionManager.getSessionFactory();
        Session s = sf.openSession();
//        Query q = s.createQuery("from Auto a where a.marca = :ma and a.modelo =:mo order by a.id desc"); //no concatenar tipo de dato
//        q.setParameter("ma", "Fiat");
//        q.setParameter("mo", "Duna");
//        List<Auto> autos = q.list();
//        autos.forEach(System.out::println);
//        q=s.createQuery("from Auto a where a.modelo in (:modelos)");
//        List<String> modelos = new ArrayList<String>();
//        modelos.add("Fiat");
//        modelos.add("BMW");
//        q.setParameterList("modelos", modelos);
//        autos = q.list();
//        autos.forEach(System.out::println);

//        Query q = s.createQuery("select count(a) from Auto a ");
//        Long count =(Long) q.uniqueResult();
//        System.out.println(count);
//        
//        q = s.createQuery("select max(a.id) from Auto a ");
//        Long max =(Long) q.uniqueResult();
//        System.out.println(max);
//        
//        Auto auto2=(Auto)s.get(Auto.class,3L);
//        System.out.println(auto2);
//        Transaction tx = s.beginTransaction();
//        try {
//        s.update(fiat);
//        tx.commit(); //cierra la transacci�n
//        } catch (HibernateException ex){
//          tx.rollback();
//        } finally {

        try {
//            AutoRepository ar = new AutoRepository(sf);
//            Auto a = new Auto("BMW","M3",53500);
//            long id=ar.save(a);
//            a.setId(id);
//            a.setModelo("ZZ");
//            ar.update(a);
//            System.out.println(ar.getById(id));
//            ar.getAll().forEach(System.out::println);
//            ar.getModelos().forEach(System.out::println);
//            ar.getPrecioMaxByMarca().forEach(System.out::println);
//            ar.delete(a);
            
//            PersonaRepository pr = new PersonaRepository(sf);
//            Persona juan = new Persona("Juan",1111);
//            Cliente coco = new Cliente(100F,"Coco",2222);
//            Empleado susana = new Empleado(100F,"Susana",333);
//            pr.save(juan);
//            pr.save(coco);
//            pr.save(susana);
//            List<Persona> personas = pr.getAll();
//            personas.forEach(System.out::println);

              AutoRepository ar = new AutoRepository(sf);
              Auto auto = new Auto("Ford", "F-Series", 4000);
              Auto auto1 = new Auto("Chevrolet","Silverado",8500);
              Auto auto2 = new Auto("Toyota","Camry",6995);
              
              auto.setFechaVenta(Date.valueOf("2002-03-12"));
              auto1.setFechaVenta(Date.valueOf("2002-10-13"));
              auto2.setFechaVenta(Date.valueOf("2002-11-17"));
              
              ar.save(auto);
              ar.save(auto1);
              ar.save(auto2);
              
              List autos = ar.getAutosByPrecioDesc();
              autos.forEach(System.out::println);
            
        }

        
        finally {
            sf.close();
        }


       }
}

