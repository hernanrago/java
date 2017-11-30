package net.helvault.javatutoriales.main;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.logging.Level;
import net.helvault.javatutoriales.conexiones.SessionManager;
import net.helvault.javatutoriales.entities.Estudiante;
import net.helvault.javatutoriales.entities.Materia;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

/**
 *
 * @author hernan
 */
public class Main {

    public static void main(String[] args)
    {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("estudiante1");

        Materia materia1 = new Materia();
        materia1.setNombre("materia1");
        Materia materia2 = new Materia();
        materia2.setNombre("materia2");
        Materia materia3 = new Materia();
        materia3.setNombre("materia3");

        estudiante1.addMateria(materia1);
        estudiante1.addMateria(materia2);
        estudiante1.addMateria(materia3);


        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("estudiante2");

        Materia materia4 = new Materia();
        materia4.setNombre("materia4");
        Materia materia5 = new Materia();
        materia5.setNombre("materia5");
        Materia materia6 = new Materia();
        materia6.setNombre("materia6");

        estudiante2.addMateria(materia4);
        estudiante2.addMateria(materia5);
        estudiante2.addMateria(materia6);

        Session sesion = new SessionManager().getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(estudiante1);
        sesion.save(estudiante2);
        sesion.getTransaction().commit();
//        sesion.close();

//        sesion = new SessionManager().getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.delete(estudiante1);
        sesion.getTransaction().commit();
        sesion.close();
            System.exit(0);
        }
    
    }
