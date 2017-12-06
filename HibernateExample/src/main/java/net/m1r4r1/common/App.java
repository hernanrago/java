package net.m1r4r1.common;


import net.m1r4r1.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        DBUser user = new DBUser();

        user.setUserId(100);
        user.setUsername("superman");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());

        session.save(user);
        session.getTransaction().commit();
    }
}