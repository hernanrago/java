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
@DiscriminatorValue("EM")
public class Empleado extends Persona{
    
    @Column(name="EM_SUELDOS")
    private float sueldo;

    public Empleado() {
    }

    public Empleado(float sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(float sueldo, String nombre, int dni) {
        super(nombre, dni);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
