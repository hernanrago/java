/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.hibernate.test;

import ar.com.educacionit.hibernate.entities.Concesionario;
import ar.com.educacionit.hibernate.manager.EducacionITSessionManager;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rdurante
 */
public class TestHQL {

    public static void main(String[] args) {

        Session session = EducacionITSessionManager.getSession();

        /*
         String strQuery = "FROM ar.com.educacionit.hibernate.entities.Concesionario";
         Query qry = session.createQuery(strQuery);
         List<Concesionario> lista = qry.list();
         Iterator<Concesionario> it = lista.iterator();
         while (it.hasNext()) {
         Concesionario c = it.next();
         System.out.println("Campo1: " + c.getNombre());
         System.out.println("Campo2: " + c.getDireccion());
         }
         */

        /*
         String strQuery = "SELECT c1.atrib, c2.atrib FROM paquete.Clasec1, paquete.Clase2 c2";
         Query qry = session.createQuery(strQuery);
         Iterator it = qry.iterate();
         while (it.hasNext()) {
         Object[] row = (Object[]) it.next();
         System.out.println("Atrib_c1: " + row[0]);
         System.out.println("Atrib_c2: " + row[1]);
         }*/

        /*
         String strQuery =
         "FROM ar.com.educacionit.hibernate.entities.Concesionario c1 WHERE c1.concesionarioid = 10";
         Query qry = session.createQuery(strQuery);
         Iterator<Concesionario> it = qry.iterate();
         while (it.hasNext()) {
         Concesionario unaClase = it.next();
         System.out.println("Atrib: " + unaClase.getNombre());
         }*/

        /*
         String strQuery =
         "FROM paquete.Clase c1 WHERE c1.atrib LIKE ÔA%Õ ";
         Query qry = session.createQuery(strQuery);
         Iterator<Concesionario> it = qry.iterate();
         while (it.hasNext()) {
         Concesionario unaClase = it.next();
         System.out.println("Atrib: " + unaClase.getNombre());
         }*/

        String strQuery = "SELECT sum(c1.id), 'pepe' as descr FROM ar.com.educacionit.hibernate.entities.Concesionario c1";
        Query qry = session.createQuery(strQuery);
        Iterator it = qry.iterate();
        while (it.hasNext()) {
            Object[] row = (Object[]) it.next();
            System.out.println("Suma: " + row[0] + "-" + row[1]);
        }


        List losAutos = session
                .createSQLQuery("SELECT * FROM concesionarios")
                .addEntity(Concesionario.class)
                .list();
        
        


    }
}
