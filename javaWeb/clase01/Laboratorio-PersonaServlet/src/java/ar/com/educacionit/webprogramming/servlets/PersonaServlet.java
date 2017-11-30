package ar.com.educacionit.webprogramming.servlets;

/*
 * PersonaServlet.java
 *
 *
 */
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Sebastián S. Sanga
 * @mail SebastianSanga@gmail.com
 */
public class PersonaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Establece el tipo de contenido
        response.setContentType("text/html;charset=UTF-8");

        // Obtiene el stream de salida
        PrintWriter out = response.getWriter();

        // Envia información
         out.println("<html>");
        out.println("<head>");
        out.println("<title>Datos de la Persona </title>");
        out.println("</head>");
        out.println("<body>");

        out.println("El nombre es: " + request.getParameter("nombre"));
        out.println("<BR>");
        out.println("El apellido es: " + request.getParameter("apellido"));
        out.println("<BR>");
        out.println("El domicilio es: " + request.getParameter("domicilio"));
        out.println("<BR>");
        out.println("El pais es: " + request.getParameter("pais"));
        out.println("<BR>");
        out.println("</body>");
        out.println("</html>");
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

        // Establece el tipo de contenido
        

        // Obtiene el stream de salida y envia informacion
        processRequest(request, response);

        // Llama al processRequest()
        //processRequest(request, response);        
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

    ////////////////////////////////////////////////////////////////////
    // Este método no debe ser sobrescrito cuando se trabaja con HTTP //
    ////////////////////////////////////////////////////////////////////
    /*
     public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
     {
     // Obtiene el stream de salida y envia informacion
     PrintWriter out = response.getWriter();
     out.println("<i>Soy el método <b>service()</b>!</i>");
     }*/
        // </editor-fold>
}
