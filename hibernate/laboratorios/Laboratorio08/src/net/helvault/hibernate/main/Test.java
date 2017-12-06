package net.helvault.hibernate.main;

import net.helvault.hibernate.entities.Auto;
import net.helvault.hibernate.entities.Concesionario;
import net.helvault.hibernate.etc.ConcesionarioService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */
public class Test {
          
    public static void main(String[] args) {

        Auto auto1=new Auto("Fiat","147",30000,"ACV139");
        Auto auto2=new Auto("Fiat","128",20000,"AZD139");

        Concesionario concesionario=new Concesionario();

        concesionario.addAuto(auto1);
        concesionario.addAuto(auto2);

        ConcesionarioService.agregarAutos(01l,concesionario.getAutos());



    }
}
    

