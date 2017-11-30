package net.helvault.hibernate.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hernan
 */

@Entity
@Table(name="autos")
public class Auto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String marca;
    private String modelo;
    @Column(name="fecha_venta")
    private Date fechaVenta;
    @Column(name="año_modelo")
    private int anoModelo;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca, String modelo, int anoModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = Date.valueOf(fechaVenta);
    }
    
    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
    
    public static List<Auto> getAutos(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<Auto> autos=session.createQuery("from Auto").list();
        session.close();
        
        return autos;
        
    }
    
    public static Auto getAutoById(SessionFactory sessionFactory,long id){
        Session session = sessionFactory.openSession();
        Auto auto = new Auto();
        auto=(Auto)session.createQuery("from Auto where id ="+id);
        session.close();
        return auto;
    }
    
    public static List<Auto> getAutosOrderByFechaVentaDesc(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        List<Auto> autos=session.createQuery("from Auto ORDER BY fechaVenta DESC").list();
        session.close();
        
        return autos;
        
    }
    
    public static List<Auto> getAutosBetweenDates(SessionFactory sessionFactory, String fecha1, String fecha2) {
        
        Session session = sessionFactory.openSession();
        Date fechaDe=Date.valueOf(fecha1);
        Date fechaHasta=Date.valueOf(fecha2);
        List<Auto> autos=session.createQuery("from Auto WHERE fechaVenta BETWEEN "
                + fechaDe + " AND " + fechaHasta).list();
        session.close();
        
        return autos;
        
    }
    
    public static List<Auto> getAutosByAnoModelo(SessionFactory sessionFactory, int anoModelo) {
        Session session = sessionFactory.openSession();
        List<Auto> autos=session.createQuery("from Auto WHERE anoModelo="+anoModelo).list();
        session.close();
        
        return autos;
        
    }
    
    public static List<Auto> getAutosByPrecioMayorA(SessionFactory sessionFactory, double precioBase) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Auto where precio >= :precio");
        query.setParameter("precio", precioBase);
        List<Auto> autos = query.list();
        session.close();
        
        return autos;
        
    }    
    
    public static List<Auto> getAutosByPrimeraLetra(SessionFactory sessionFactory, char letra) {
        Session session = sessionFactory.openSession();
        List<Auto> autos=session.createQuery("from Auto WHERE marca like '"+letra+"%'").list();
        session.close();
        
        return autos;
        
    }
    public static long getAutosTotal(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        long cantAutos=(long)session.createQuery("select count(*) from Auto").uniqueResult();
        session.close();
        
        return cantAutos;
        
    }

    public static long getCantidadMarcas(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        long cantMarcas=(long)session.createQuery("select count(marca) from Auto").uniqueResult();
        session.close();
        
        return cantMarcas;
        
    }

    public static double getPrecioMasAlto(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        double precio=(double)session.createQuery("select max(precio) from Auto").uniqueResult();
        session.close();
        
        return precio;
        
    }

    public static double getPrecioPromedio(SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        double precio=(double)session.createQuery("select avg(precio) from Auto").uniqueResult();
        session.close();
        
        return precio;
        
    }
    
    public void insertarAuto(SessionFactory sessionFactory, Auto auto){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(auto);
            transaction.commit();
        }
        catch (HibernateException he) {
            transaction.rollback();
        } finally {
            session.close();
        }
        
    }
    
    public void actualizarAuto(SessionFactory sessionFactory, Auto auto) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(auto);
        transaction.commit();
        session.close();
    }
    
    public void eliminarAuto(SessionFactory sessionFactory, Auto auto) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(auto);
        transaction.commit();
        session.close();
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", fechaVenta=" + fechaVenta + ", anoModelo=" + anoModelo + ", precio=" + precio + '}';
    }
    
    

    
}
