package ar.com.educacionit.hibernate.repository;

import ar.com.educacionit.autoreport.AutoReport;
import ar.com.educacionit.hibernate.entities.Auto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */
public class AutoRepository {
    
    private SessionFactory sf;

    public AutoRepository(SessionFactory sf) {
        if (sf==null) {
            throw new NullPointerException("SessionFactory is mandatory");
        }
        this.sf = sf;
    }
    
    public long save (Auto a) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            long id=(long)s.save(a);
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
    
    public void update (Auto a) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            s.update(a);
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
    
    public void delete (Auto a) {
         
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        try {
            s.delete(a);
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
    
    public Auto getById(long id) {
        Session s = sf.openSession();
        Auto a = (Auto)s.get(Auto.class, id);
        s.close();
        return a;
    }
    
    public List<Auto> getAll(){
        Session s = sf.openSession();
        List<Auto> autos = s.createQuery("from Auto").list();
        s.close();
        return autos;
    }
    
    public List<String> getModelos() {
        Session s = sf.openSession();
        List<String> modelos = s.createQuery("SELECT DISTINCT a.modelo from Auto a").list();
        s.close();
        return modelos;
    }
    
    public List<AutoReport> getPrecioMaxByMarca() {
        Session s = sf.openSession();
        List<AutoReport> data = s.createQuery("SELECT new ar.com.educacionit.autoreport.AutoReport(max(a.precio),a.marca) from Auto a GROUP BY a.marca").list();
        s.close();
        return data;
    }
    
    public List<Auto> getAutosByPrecioDesc() {
        Session s = sf.openSession();
        List<Auto> autos = s.createQuery("FROM Auto a ORDER BY a.fechaVenta DESC").list();
        s.close();
        return autos;
    }
}
