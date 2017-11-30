package net.helvault.hibernate.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import net.helvault.hibernate.sessionmanager.SessionManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */

@Entity
@Table(name="concesionarios")
public class Concesionario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String direccion;

    public Concesionario() {
    }

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Concesionario{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    public static List<Concesionario> getConcesionarios(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<Concesionario> concesionarios=session.createQuery("from Concesionario").list();
        session.close();
        
        return concesionarios;
        
    }
    
    public static Concesionario getConcesionarioById(SessionFactory sessionFactory,long id){
        Session session = sessionFactory.openSession();
        Concesionario concesionario = new Concesionario();
        concesionario=(Concesionario)session.createQuery("from Concesionario where id ="+id);
        session.close();
        return concesionario;
    }
    
    public void insertarConcesionario(SessionFactory sessionFactory, Concesionario concesionario){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(concesionario);
        transaction.commit();
        session.close();
    }
    
    public void actualizarConcesionario(SessionFactory sessionFactory, Concesionario concesionario) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(concesionario);
        transaction.commit();
        session.close();
    }
    
    public void eliminarConcesionario(SessionFactory sessionFactory, Concesionario concesionario) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(concesionario);
        transaction.commit();
        session.close();
    }
    
    
    
}
