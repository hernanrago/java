/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.autoreport;

/**
 *
 * @author educacionit
 */
public class AutoReport {
    private float precio;
    private String marca;

    public AutoReport() {
    }

    public AutoReport(float precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }
    
    

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "AutoReport{" + "precio=" + precio + ", marca=" + marca + '}';
    }
    
    
    
    
}
