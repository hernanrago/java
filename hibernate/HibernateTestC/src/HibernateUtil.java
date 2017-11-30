
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hernan
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    
    static
    {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + ex); 
           throw new ExceptionInInitializerError(ex);
        }
            
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
