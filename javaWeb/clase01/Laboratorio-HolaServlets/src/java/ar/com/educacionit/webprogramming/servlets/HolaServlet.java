package ar.com.educacionit.webprogramming.servlets;

/*
 * HolaServlet.java
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
public class HolaServlet extends HttpServlet {

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
        out.println("<title>Servlet HolaServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<HR>");
        out.println("<h1>Hola, mundo! Soy un Servlet!</h1>");
        out.println("<HR>");
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
        response.setContentType("text/html;charset=UTF-8");

        // Obtiene el stream de salida y envia informacion
        PrintWriter out = response.getWriter();
        out.println("<i>Soy el método <b>doGet()</b>!</i>");

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

        // Establece el tipo de contenido        
        response.setContentType("text/html;charset=UTF-8");

        // Obtiene el stream de salida y envia informacion
        PrintWriter out = response.getWriter();
        out.println("<i>Soy el método <b>doPost()</b>!</i>");

        // Llama al processRequest()
        //processRequest(request, response);        
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
