/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author educacionit
 */

@Entity
@DiscriminatorValue("CL")
public class Cliente extends Persona {
    
    @Column(name="CL_CREDITO")
    private float credito;

    public Cliente() {
    }

    public Cliente(float credito) {
        this.credito = credito;
    }

    public Cliente(float credito, String nombre, int dni) {
        super(nombre, dni);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    
    
    
}
