package net.helvault.hibernate.etc;

import net.helvault.hibernate.entities.Auto;
import net.helvault.hibernate.sessionmanager.SessionManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ConcesionarioService {

    private static SessionFactory sessionFactory=new SessionManager().getSessionFactory();
    private static Session session=sessionFactory.openSession();

    public static void agregarAutos(Long idConcesionario, List<Auto> autos) {
        Transaction transaction=session.beginTransaction();
        for (Auto auto:autos) {
            session.save(auto);
        }
        transaction.commit();
        session.close();
    }

    public static void informarAutos(Long idConcesionario){

    }

    public static void informarAutosMayorAPrecio(Double unPrecio){

    }

    public static void eliminar(Long idConcesionario){

    }
}
