/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidorse1;

import org.my.ns.Servicio;
import org.my.ns.ServicioService;

/**
 *
 * @author educacionit
 */
public class ConsumidorSE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio saludo = new ServicioService().getServicioPort();
        String despedida = saludo.saludar("pablo");
        System.out.println("El mensaje es: "+despedida);
    }
    
}
