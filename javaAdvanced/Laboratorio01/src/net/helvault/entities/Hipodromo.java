package net.helvault.entities;

/**
 *
 * @author hernan
 */
public class Hipodromo {
    
    
    public static void main(String[] args) {
    
        System.out.println(Runtime.getRuntime().availableProcessors());
        
        Caballo caballo = new Caballo("Trueno");
        Caballo caballo1 = new Caballo("Luz");
        Caballo caballo2 = new Caballo("Sonido");
        
        caballo.start();
        caballo1.start();
        caballo2.start();
        
        
        

    }
}
