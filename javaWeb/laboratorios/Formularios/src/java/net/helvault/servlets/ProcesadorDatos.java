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

/**
 *
 * @author hernan
 */
public class ProcesadorDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8;es");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            
            request.setAttribute("nombre", request.getParameter("nombre"));
            request.setAttribute("apellido", request.getParameter("apellido"));
            request.setAttribute("domicilio", request.getParameter("domicilio"));
            request.setAttribute("sexo", request.getParameter("sexo"));
            request.setAttribute("puesto", request.getParameter("puesto"));
            if (request.getParameter("experiencia")==null) request.setAttribute("experiencia", "No");
            else request.setAttribute("experiencia", "Sí");
            
            request.getRequestDispatcher("destino.jsp").forward(request, response);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
