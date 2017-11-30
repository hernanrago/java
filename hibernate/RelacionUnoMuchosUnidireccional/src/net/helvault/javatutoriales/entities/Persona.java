package net.helvault.javatutoriales.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author hernan
 */
@Entity
public class Persona  
{ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<Libro>();  

    public Persona() 
    { 
    }  

    public long getId() 
    { 
        return id; 
    }  

    protected void setId(long id) 
    { 
        this.id = id; 
    }  

    public String getNombre() 
    { 
        return nombre; 
    }  

    public void setNombre(String nombre) 
    { 
        this.nombre = nombre; 
    }  

    public List getLibros() 
    { 
        return libros; 
    }  

    public void setLibros(List libros) 
    { 
        this.libros = libros; 
    }  

    public void addLibro(Libro libro) 
    { 
        this.libros.add(libro); 
    } 
}