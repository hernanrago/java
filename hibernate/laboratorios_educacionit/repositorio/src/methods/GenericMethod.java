package methods;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericMethod <E>{

    private SessionFactory sessionFactory;

    public GenericMethod(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    public void insertar(E e) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(e);
            transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
            he.printStackTrace();
        }
    }

    public void modificar(long id, E e){
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(e);
            transaction.commit();
        } catch (HibernateException he){
            transaction.rollback();
            he.printStackTrace();
        }
    }

    public void borrar(E e) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(e);
            transaction.commit();
        } catch (HibernateException he) {
            transaction.rollback();
            he.printStackTrace();
        }
    }

    public List<E> getAll(){
        List<E> list=new ArrayList<>();
        Session session=sessionFactory.openSession();

        try {
            list = session.createQuery("from "+getType().getName()).list();
        } catch (HibernateException he){he.printStackTrace();
        }
        return list;
    }

    protected Class getType() {
        Class clazz = this.getClass();
        ParameterizedType superClass = (ParameterizedType) clazz.getGenericSuperclass();
        Type[] generics = superClass.getActualTypeArguments();
        return (Class) generics[0];
    }
}

