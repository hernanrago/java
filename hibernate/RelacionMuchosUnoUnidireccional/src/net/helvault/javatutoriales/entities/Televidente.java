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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author hernan
 */

@Entity
public class Televidente 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    
    @ManyToOne
    private CadenaTelevisiva cadenaFavorita;

    public Televidente()
    {
    }

    public CadenaTelevisiva getCadenaFavorita()
    {
        return cadenaFavorita;
    }

    public void setCadenaFavorita(CadenaTelevisiva cadenaFavorita)
    {
        this.cadenaFavorita = cadenaFavorita;
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
}