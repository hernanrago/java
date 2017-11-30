package net.helvault.hibernate.entities;

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
@DiscriminatorValue("C")
public class Cliente extends Persona {
    
    @Column(name="pe_cl_nro")
    private String nro;
    
    @Column(name="pe_cl_tipo")
    private int tipo;

    public Cliente() {
    }

    public Cliente(String nro, int tipo, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.nro = nro;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nro=" + nro + ", tipo=" + tipo + '}';
    }

}
