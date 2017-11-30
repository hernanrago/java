
import java.util.List;
import net.helvault.entities.Contacto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hernan
 */
public class Main {
    public static void main(String[] args) {
        ContactosDAO contactosDAO = new ContactosDAO();
        Contacto contactoRecuperado=null;
        long idEliminar;
        
        Contacto contacto = new Contacto("Cristian");
        Contacto contacto1 = new Contacto("Tony");
        Contacto contacto2 = new Contacto("Javier");
        
        idEliminar=contactosDAO.guardaContacto(contacto);
        contactosDAO.guardaContacto(contacto1);
        contactosDAO.guardaContacto(contacto2);
        
        //Modificamos el contacto 2 y lo actualizamos 
        contacto2.setNombre("Nuevo Contacto 2"); 
        contactosDAO.actualizaContacto(contacto2);  

        //Recuperamos el contacto1 de la base de datos 
        contactoRecuperado = contactosDAO.obtenContacto(idEliminar); 
        System.out.println("Recuperamos a " + contactoRecuperado.getNombre());  

        //Eliminamos al contactoRecuperado (que es el contacto3) 
        contactosDAO.eliminaContacto(contactoRecuperado);  

        //Obtenemos la lista de contactos que quedan en la base de datos y la mostramos 
        List<Contacto> listaContactos = contactosDAO.obtenListaContactos();  
        System.out.println("Hay " + listaContactos.size() + " contactos en la base de datos");  

        for(Contacto c : listaContactos) { 
            System.out.println("-> " + c.getNombre()); 
        } 
    }
    
}
