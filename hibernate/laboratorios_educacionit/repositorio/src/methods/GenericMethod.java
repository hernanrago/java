package methods;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GenericMethod <E>{

    private SessionFactory sessionFactory;

    public GenericMethod(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    public void insertar(E e){
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(e);
            transaction.commit();
        } catch (HibernateException he){
            transaction.rollback();
            he.printStackTrace();
        }

    }

}
