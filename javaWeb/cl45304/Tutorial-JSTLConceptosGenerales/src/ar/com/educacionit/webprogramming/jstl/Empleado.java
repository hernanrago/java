/*
 * Empleado.java
 *
 *
 */
package ar.com.educacionit.webprogramming.jstl;

/**
 *
 * @author Sebastián S. Sanga
 */
public class Empleado {

    /**
     * Creates a new instance of Empleado
     */
    public Empleado() {
    }

    public Empleado(String n, String a, String l) {
        nombre = n;
        apellido = a;
        legajo = l;
    }

    // Atributos
    private String nombre = "";
    private String apellido = "";
    private String legajo = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

}
