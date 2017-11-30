package net.helvault.hibernate.main;

import net.helvault.hibernate.entities.Proxy;
import net.helvault.hibernate.sessions.SessionManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author hernan
 */
public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            byte x=Double.valueOf(Math.random()*1000).byteValue();
            if (x>0)){
                System.out.print(i+"=");
                System.out.print(x+" ");;
                System.out.println((char)x);
                 }   
        }
    }
    
}
