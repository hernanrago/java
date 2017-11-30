/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.helvault.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.helvault.services.GeoIP;
import net.helvault.services.GeoIPService;
import net.helvault.services.GeoIPServiceSoap;

/**
 *
 * @author hernan
 */
public class GeoIPServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter())
        {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GeoIPServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            GeoIPService geoIPService = new GeoIPService();
            GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
            
            if (request.getParameter("ip-out").equals("Presione para conocer su IP")) {
                GeoIP geoIP = geoIPServiceSoap.getGeoIPContext();
                String IP=geoIP.getIP();
                out.println("<h3>Su número de IP es: "+IP+"</h3>");
            }
            if (!request.getParameter("ip-in").isEmpty()) {
                GeoIP geoIP = geoIPServiceSoap.getGeoIP(request.getParameter("ip-in"));
                String pais=geoIP.getCountryName();
                out.println("<p>El IP "+geoIP.getIP()+" pertenece al país "+pais+"</p>");
            }
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

}
