package ar.com.educacionit.hibernate.app;

import ar.com.educacionit.hibernate.entities.Auto;
import ar.com.educacionit.hibernate.manager.SessionManager;
import java.util.ArrayList;
import java.util.Iterator;
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
        
//        Auto auto = null;
//         insertarAuto(auto, "Tesla", "Model 3");
        
//        main.consultarAutos();

//        modificarAuto(2, "Tesla", "Model X");
        eliminarAuto(1);
        
//        Auto auto01 = new Auto("Tesla","Model S");
//        SessionFactory factory = SessionManager.getSessionFactory();
//        Session s = factory.openSession();
        
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
        
//        Auto auto2=(Auto)s.get(Auto.class,3L);
//        System.out.println(auto2);
//          Transaction tx = s.beginTransaction();
//          try {
//              s.save(auto01);
//              tx.commit(); //cierra la transacci�n
//          } catch (HibernateException ex){
//              tx.rollback();
//          } finally {
//              s.close();
//              factory.close();
//          }
    }
    
    static void insertarAuto(Auto nombre,String marca,String modelo){
        nombre = new Auto(marca,modelo);
        SessionFactory factory = SessionManager.getSessionFactory();
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
          try {
              s.save(nombre);
              tx.commit(); //cierra la transacción
          } catch (HibernateException ex){
              tx.rollback();
          } finally {
              s.close();
              factory.close();
          }
    }
    
    static void consultarAutos(){
        Iterator<Auto> iterator = main.getAutos().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    static List getAutos(){
        Session session = SessionManager.getSessionFactory().openSession();
        List autos = session.createQuery("FROM entities.Auto").list();
        session.close();
        return autos;
    }
    
    public static void modificarAuto(int id,String marca,String modelo){
        Auto a1 = new Auto(marca,modelo);
        a1.setId(id);
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(a1);
        tx.commit();
        session.close();
    }
    
    public static void eliminarAuto(int id) {
              Auto a1 = new Auto();
              a1.setId(id);
              Session session=SessionManager.getSessionFactory().openSession();
              Transaction tx = session.beginTransaction();
              session.delete(a1);
              tx.commit();
              session.close();
              SessionManager.getSessionFactory().close();

}
    
    
}
