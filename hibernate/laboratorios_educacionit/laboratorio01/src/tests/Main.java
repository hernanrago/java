package tests;

import connections.HibernateUtil;
import entities.Auto;
import methods.AutoMethod;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();

        try{
            Auto auto1 = new Auto("Chevrolet","Camaro",1969,"2015-10-13",49000);
            Auto auto2 = new Auto("Ford","Mustang",1973,"2016-10-13",35425);
            Auto auto3 = new Auto("Pontiac","Firebird",1974,"2016-10-13",68500);
            AutoMethod autoMethod=new AutoMethod(sessionFactory);
            autoMethod.insertar(auto1);
            autoMethod.insertar(auto2);
            autoMethod.insertar(auto3);
            autoMethod.borrar(auto1);

            List<Auto> autos=autoMethod.getAll();
            for(Auto auto:autos) System.out.println(auto);

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessionFactory.close();
        }

    }
}
