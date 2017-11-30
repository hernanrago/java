/*
 * Alumno.java
 *
 *
 */
package ar.com.educacionit.webprogramming.jsp;

/**
 *
 * @author Sebastián S. Sanga
 */
public class Alumno {

    /**
     * Creates a new instance of Alumno
     */
    public Alumno() {
    }

    public Alumno(String unId, String unNombre) {
        id = unId;
        nombre = unNombre;
    }

    public Alumno(String unId, String unNombre, String unApellido) {
        id = unId;
        nombre = unNombre;
        setApellido(unApellido);
    }

    private String id = "";
    private String nombre = "";
    private String apellido = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

}
