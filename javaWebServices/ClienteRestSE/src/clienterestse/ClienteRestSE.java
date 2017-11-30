/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterestse;

import clienteREST.NewJerseyClient;
import java.util.ArrayList;
import clienterestse.Alumno;

/**
 *
 * @author pacevedo
 */
public class ClienteRestSE {

    public static void main(String[] args) {

        NewJerseyClient cliente = new NewJerseyClient();
        
        String rta = cliente.findAll_XML(String.class);        
        System.out.println("RTA: "+rta);
    }
    
}
