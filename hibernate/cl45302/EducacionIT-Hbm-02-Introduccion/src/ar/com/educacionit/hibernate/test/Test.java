/*
 * Test.java
 *
 */
package ar.com.educacionit.hibernate.test;

import ar.com.educacionit.hibernate.entities.Concesionario;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@gmail.com>
 */
public class Test {

    

    
    static {
        System.out.println("Before log4j configuration");
        DOMConfigurator.configure("log4j.xml");
        System.out.println("After log4j configuration");
    }

    private static Logger logger = Logger.getLogger(Test.class);
    
    public Test() {
    }

    public static void main(String[] args) {
        // CASO #1 -- Inserta varios concesionarios

     
         Concesionario c1 = new Concesionario("Sport Cars", "Av. Cabildo 1485");
         Concesionario c2 = new Concesionario("SS Cars", "Av. Monroe 2546");
         Concesionario c3 = new Concesionario("DyS Cars", "Av. Santa Fe 5879");
         Concesionario c4 = new Concesionario("Huge Cars", "Av. Alem 1598");
         c1.insertar();
         c2.insertar();
         c3.insertar();
         c4.insertar();
        
//        CASO #2 -- Consulta los concesionarios
//        Iterator<Concesionario> losConcesionarios = Concesionario.consultar().iterator();
//        while (losConcesionarios.hasNext()) {
//            Concesionario c = losConcesionarios.next();
//            logger.info(c);
//            System.out.println(c);
//        }

        // CASO #3 -- Consulta por un concesionario en particular
//         System.out.println(Concesionario.obtenerPorPK(1L) );
        // CASO #4 -- Obtiene y actualiza un concesionario

         Concesionario cA = Concesionario.obtenerPorPK(1L);
         cA.setNombre("Sport Cars Callao");
         cA.setDireccion("Av. Callao 2489");
         cA.actualizar();

        // CASO #5 -- Obtiene y elimina un concesionario
        /*
         Concesionario cB = Concesionario.obtenerPorPK(1L);
         if(cB != null)
         cB.eliminar();
         */
    }
}
