/*
 * CapturaDeDatosServlet.java
 *
 */
package ar.com.educacionit.webprogramming.servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionit.com.ar>
 * @version
 */
public class CapturaDeDatosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        
        if (usuarioValido(usuario, clave)) {
            response.sendRedirect("saluda1.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
       

       
        
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

    private boolean usuarioValido(String usuario, String clave) {
        //Este metodo deberia llamar a un DAO para verificar el usuario
        // en la base de datos. Aca se simula como que siempre es valido
        return true;
    }
}
