/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.helvault.entities;

import java.io.Serializable;

/**
 *
 * @author hernan
 */
public class Contacto implements Serializable {
    
    private long id;
    private String nombre;

    public Contacto() {
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }
    
    private void setId(long id){
        this.id= id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
