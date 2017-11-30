/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.xeven.rest;

import entities.Alumno;
import entities.AlumnoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author pacevedo
 */
@Path("Alumno")
public class AlumnoRest {
    @EJB
    private AlumnoFacade ejbAlumnoFachada;

    @GET
    @Produces({MediaType.APPLICATION_XML})
    public List<Alumno> listar(){
        return ejbAlumnoFachada.findAll();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML})
    @Path("{id}")
    public Alumno buscarPorID(@PathParam("id") Integer id){
        return ejbAlumnoFachada.find(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML})
    public void crear(Alumno alu){
        ejbAlumnoFachada.create(alu);
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_XML})
    @Path("{id}")
    public void editar(@PathParam("id") Integer id, Alumno alu){
        ejbAlumnoFachada.edit(alu);
    }
    
    @DELETE
    @Consumes({MediaType.APPLICATION_XML})
    @Path("{id}")
    public void eliminar(@PathParam("id") Integer id){
        ejbAlumnoFachada.remove(ejbAlumnoFachada.find(id));
    }
    
}
