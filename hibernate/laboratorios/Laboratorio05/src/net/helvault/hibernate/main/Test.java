package net.helvault.hibernate.main;

import java.sql.Date;
import java.util.List;
import net.helvault.hibernate.entities.Auto;
import net.helvault.hibernate.entities.Cliente;
import net.helvault.hibernate.entities.Concesionario;
import net.helvault.hibernate.entities.Persona;
import net.helvault.hibernate.entities.Vendedor;
import net.helvault.hibernate.etc.TestPaginacion;
import net.helvault.hibernate.etc.TestQueriesParametrizadas;
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
        Session session=sessionFactory.openSession();
        
        Vendedor vendedor = new Vendedor("000", "2002-12-12", "Roberto", "Gómez", "Pareja 111");
        Vendedor vendedor1 = new Vendedor("001", "2002-12-12", "Arnaldo", "Robles", "Boliva 222");
        Vendedor vendedor2 = new Vendedor("003", "2002-12-12", "Roberto", "Gómez", "Pareja 111");
        
        Cliente cliente = new Cliente("000", 1, "José", "Rodriguez", "Pje. Famaillá 2954");
        Cliente cliente1 = new Cliente("001", 2, "Maximiliano", "Smith", "Llavallol 4365");
        Cliente cliente2 = new Cliente("002", 3, "Paola", "Suárez", "Caracas 952");
        
        session.save(vendedor);
        session.save(vendedor1);
        session.save(vendedor2);
        session.save(cliente);
        session.save(cliente1);
        session.save(cliente2);
        
        Transaction transaction = session.beginTransaction();
        transaction.commit();

        List<Persona> personas = session.createQuery("from Persona").list();
        
        personas.forEach(System.out::println);
        
        session.close();
        sessionFactory.close();
            
            
            
            System.exit(0);

    }        
}
    

