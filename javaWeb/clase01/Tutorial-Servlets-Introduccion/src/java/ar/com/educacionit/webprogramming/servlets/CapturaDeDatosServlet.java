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

        // Establece el tipo de informacion a enviar 
        response.setContentType("text/html;charset=UTF-8");

        // Obtiene el stream de salida
        PrintWriter out = response.getWriter();

        // Genera el HTML a enviar al cliente
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet CapturaDeDatosServlet</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("El usuario es: " + request.getParameter("usuario"));
        out.println("<BR>");
        out.println("La clave es: " + request.getParameter("clave"));

        out.println("</body>");
        out.println("</html>");

        // Cierra el stream
        out.close();
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
