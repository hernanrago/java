package net.helvault.hibernate.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author hernan
 */

@Entity
@Table(name="personas")
@DiscriminatorValue("V")
public class Vendedor extends Persona{
    
    @Column(name="pe_ve_legajo")
    private String legajo;
    
    @Column(name="pe_ve_fecha_ingreso")
    private Date fechaIngreso;

    public Vendedor() {
    }

    public Vendedor(String legajo, String fechaIngreso, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.legajo = legajo;
        this.fechaIngreso = Date.valueOf(fechaIngreso);
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = Date.valueOf(fechaIngreso);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "legajo=" + legajo + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
    
}
