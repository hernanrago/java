package ar.com.educacionit.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hernan
 */

@Entity
@Table(name="autos")
public class Auto {
    @Id
    @GeneratedValue //tipo de generación de ID
    @Column(name = "AU_ID")
    private long id;
    @Column(name = "AU_MARCA")
    private String marca;
    @Column(name = "AU_MODELO")
    private String modelo;
    @Column(name = "AU_PRECIO")
    private float precio;
    
    public Auto() {
    }

    public Auto(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio =precio;
    }
    
    public Auto(long id, String marca, String modelo, float precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio =precio;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio +'}';
    }
    
    
}
