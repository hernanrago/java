package tests;

import connections.HibernateUtil;
import entities.Auto;
import methods.GenericMethod;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();

        try{
            Auto auto1 = new Auto("Chevrolet","Camaro",2015,"2016-10-13",250000);
            GenericMethod genericMethod=new GenericMethod(sessionFactory);
            genericMethod.insertar(auto1);
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessionFactory.close();
        }

    }
}
