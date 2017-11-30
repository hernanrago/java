package net.helvault.javatutoriales.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author hernan
 */

@Entity 
public class Presidente implements Serializable 
{ 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id; 

    private String nombre;  

    @OneToOne  
    private Pais pais;  

    public Presidente() 
    { 
    }  

    public int getId() 
    {  
        return id; 
    }  

    protected void setId(int id) 
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

    public Pais getPais() 
    {  
        return pais; 
    }  

    public void setPais(Pais pais) 
    {  
        this.pais = pais; 
    }
}