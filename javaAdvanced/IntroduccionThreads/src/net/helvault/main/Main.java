package net.helvault.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.helvault.threads.MyThread;
import net.helvault.threads.MyThread2;

/**
 *
 * @author hernan
 */
public class Main {

    public static void main(String[] args) throws InterruptedException{
//        MyThread mt1 = new MyThread("mt1");
//        mt1.start();
//        MyThread mt2 = new MyThread("mt2");
//        mt2.start();
//        
//        MyThread2 mt21 = new MyThread2("mt21");
//        Thread thread = new Thread(mt21);
//        thread.start();
//        MyThread2 mt22 = new MyThread2("mt22");
//        Thread thread2 = new Thread(mt22);
//        thread2.start();

        Thread juan = new Thread (new Alumno("Juan"));
        Thread pepe = new Thread (new Alumno ("Pepe"));
        Thread andres = new Thread (new Alumno ("Andres"));
 
        
        try {
            juan.start();
            juan.join();
            pepe.start();
            pepe.join();
            andres.start();
            andres.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    static class Alumno implements Runnable {
        String mensaje;
        public Alumno(String nombre) {
            mensaje = "Hola, soy "+nombre+" y este es mi mensaje ";
        }

        public void run() {
            for (int i=1; i<6; i++) {
                String msg = mensaje+i;
                System.out.println(msg);

            }

        }

    }
    
}
