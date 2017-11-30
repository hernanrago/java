/*
 * Auto.java
 *
 *
 */
package ar.com.educacionit.webprogramming.beans;

/**
 *
 * @author educacionit
 */
public class Auto {

    /**
     * Creates a new instance of AutoBean
     */
    public Auto() {
    }

    // Atributos
    private String marca;
    private String color;
    private String accion;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

}
