package net.helvault.javatutoriales.conexiones;

import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author hernan
 */
public class SessionManager {

    public SessionManager() {
    }
       
    public SessionFactory getSessionFactory(){   
        
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(getConfiguration().getProperties());
        
        SessionFactory sessionFactory = this.getConfiguration().buildSessionFactory(standardServiceRegistryBuilder.build());
       
        return sessionFactory;
    }
    
    private Configuration getConfiguration(){
        
        Configuration configuration = new Configuration();
        
        configuration.addAnnotatedClass(net.helvault.javatutoriales.entities.CadenaTelevisiva.class);
        
        configuration.addAnnotatedClass(net.helvault.javatutoriales.entities.Televidente.class);
        
        configuration.setProperties(getProperties());
        
        return configuration;
    }
    
    private Properties getProperties(){
        
        Properties properties = new Properties();
       
        properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

        properties.put("hibernate.connection.url", "jdbc:mysql://localhost/hibernate");

        properties.put("hibernate.connection.username", "root");

        properties.put("hibernate.connection.password", "admin");

        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        
        properties.put("hibernate.show_sql", "true");
        
        properties.put("hibernate.hbm2ddl.auto","create");
        
        return properties;
    }
}
