/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import calculadoraweb.CalculadoraWeb;
import calculadoraweb.CalculadoraWebService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacionit
 */
public class CalcularServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String rta=realizarCalculos(request.getParameter("numeros"));
            out.println(rta);
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String realizarCalculos(String numerosReq) {
        String rta="<h2>Recibí: "+numerosReq+"</h2>";
        ArrayList<Double>numeros=new ArrayList<>();
        for (String numero:numerosReq.split(","))
            numeros.add(Double.valueOf(numero));//validar
        CalculadoraWeb calculadoraWeb = new CalculadoraWebService().getCalculadoraWebPort();
        Double suma=calculadoraWeb.sumar(numeros);
        Double resta=calculadoraWeb.restar(numeros);
        Double producto=calculadoraWeb.multiplicar(numeros);
        Double division=calculadoraWeb.dividir(numeros);
        Double potencia=calculadoraWeb.potenciar2(4.0,2);
        rta+="<p>El resultado de la suma es: "+suma+"</p>";
        rta+="<p>El resultado de la resta es: "+resta+"</p>";
        rta+="<p>El resultado de la multiplicación es: "+producto+"</p>";
        rta+="<p>El resultado de la división es: "+division+"</p>";
        rta+="<p>El resultado de la potenciación es: "+potencia+"</p>";
        return rta;
    }

    
}
