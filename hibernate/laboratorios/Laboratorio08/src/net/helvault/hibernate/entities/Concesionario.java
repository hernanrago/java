package net.helvault.hibernate.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan
 */

@Entity
@Table(name = "concesionarios")
public class Concesionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;

    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Auto> autos=new ArrayList<>();

    public Concesionario() {
    }

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public void addAuto(Auto auto){
        this.autos.add(auto);
    }

}

