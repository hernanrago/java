/*
 * ProcesadorDeDatos.java
 *
 *
 */
package ar.com.educacionit.webprogramming.servlets;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Sebastián S. Sanga
 * @mail SebastianSanga@gmail.com
 */
public class ProcesadorDeDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Establece el tipo de contenido y obtiene la salida


        // Obtiene los datos del formulario
        // Obtiene el nombre
        String nombre =  request.getParameter("txtNombre");
        request.setAttribute("nombre", nombre);

        // Obtiene el apellido
        String apellido =  request.getParameter("txtApellido");
        request.setAttribute("apellido", apellido);

        // Obtiene la dirección
        String direccion =  request.getParameter("txtDireccion");
        request.setAttribute("direccion", direccion);

        // Obtiene el sexo
        String sexo =  request.getParameter("radSexo");
        request.setAttribute("sexo", sexo);

        // Obtiene el puesto de trabajo
        String puestoDeTrabajo =  request.getParameter("cmbPuestoDeTrabajo");
        request.setAttribute("puestoDeTrabajo", puestoDeTrabajo);

        // Obtiene si tiene experiencia
        String tieneExperiencia = request.getParameter("chkExperiencia");
        
        if (tieneExperiencia == null) {
            request.setAttribute("tieneExperiencia", "No");
        } else{
            request.setAttribute("tieneExperiencia", "Si");
        }
        
        request.getRequestDispatcher("destino.jsp").forward(request, response);
   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
