package ar.com.educacionit.hibernate.repository;

import ar.com.educacionit.autoreport.AutoReport;
import ar.com.educacionit.hibernate.entities.Persona;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class PersonaRepository {
    
    private SessionFactory sf;

    public PersonaRepository(SessionFactory sf) {
        if (sf==null) {
            throw new NullPointerException("SessionFactory is mandatory");
        }
        this.sf = sf;
    }
    
    public long save (Persona p) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            long id=(long)s.save(p);
            t.commit();
            return id;
        } catch(HibernateException he) {
            if (t!=null) {
                t.rollback();     
            }
            throw he;
        } finally {
            if (s!=null) {
                s.close();
            }
        }
    }
    
    public void update (Persona p) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            s.update(p);
            t.commit();
        } catch(HibernateException he) {
            if (t!=null) {
                t.rollback();     
            }
            throw he;
        } finally {
            if (s!=null) {
                s.close();
            }
        }
    }
    
    public void delete (Persona p) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            s.delete(p);
            t.commit();
        } catch(HibernateException he) {
            if (t!=null) {
                t.rollback();     
            }
            throw he;
        } finally {
            if (s!=null) {
                s.close();
            }
        }
    }
    
    public Persona getById(long id) {
        Session s = sf.openSession();
        Persona p = (Persona)s.get(Persona.class, id);
        s.close();
        return p;
    }
    
    public List<Persona> getAll(){
        Session s = sf.openSession();
        List<Persona> personas = s.createQuery("from Persona").list();
        s.close();
        return personas;
    }
 
}
