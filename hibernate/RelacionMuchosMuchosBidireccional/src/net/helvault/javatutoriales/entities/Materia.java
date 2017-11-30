package net.helvault.javatutoriales.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author hernan
 */

@Entity
public class Materia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    
    @ManyToMany(mappedBy = "materias")
    private List <Estudiante> estudiantes = new ArrayList <Estudiante>();

    public Materia()
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

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void addEstudiante(Estudiante estudiante)
    {
        this.estudiantes.add(estudiante);
        estudiante.addMateria(this);
    }
    
    
}