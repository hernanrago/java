package net.helvault.hibernate.main;

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
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
            
            Auto auto = new Auto("Tesla", "Model S P85D");
            Auto auto1 = new Auto("Chevy","Volt Premier");        
            Auto auto2 = new Auto("Ford","Fusion Hybrid"); 

            session.save(auto);
            session.save(auto1);
            session.save(auto2);
            
            transaction.commit();
        }
        
        catch (HibernateException he){
            
            transaction.rollback();
        }   
        
        finally {
            
            session.close();
            sessionFactory.close();
        }

            
    }
                  
}
    

