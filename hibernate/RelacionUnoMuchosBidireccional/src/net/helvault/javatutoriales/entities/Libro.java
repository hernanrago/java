package net.helvault.javatutoriales.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hernan
 */

@Entity
public class Libro { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String titulo;
    
    @ManyToOne
    private Persona persona;
    

    public Libro() 
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
    
    public String getTitulo() 
    { 
        return titulo; 
    }  

    public void setTitulo(String titulo) 
    { 
        this.titulo = titulo; 
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}