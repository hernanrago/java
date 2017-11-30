/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.helvault.entities;

/**
 *
 * @author hernan
 */
public class Caballo extends Thread {
    String nombre;
    int kmRecorrido;

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            kmRecorrido=i;
            System.out.println(this.nombre+" recorrió "+i+" km.");
        }
    }
    
}
