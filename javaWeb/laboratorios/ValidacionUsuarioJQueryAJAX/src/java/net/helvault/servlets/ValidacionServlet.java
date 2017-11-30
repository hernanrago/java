/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.helvault.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hernan
 */
public class ValidacionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    ArrayList<String> usuarios = ValidacionServlet.Usuarios();
    boolean Existente=false;
    
            for (String usuario: usuarios) {
                if(usuario.equals(request.getParameter("usuario"))&&
                        Existente==false){
                    Existente=true;
                    response.setContentType("text/xml");
                    response.setHeader("Cache-Control", "no-cache");
                    response.getWriter().write("existente");
                }
                else {
                    response.setContentType("text/xml");
                    response.setHeader("Cache-Control", "no-cache");
                    response.getWriter().write("disponible");
                }
            }               
    }
    
            
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public static ArrayList <String> Usuarios(){        
        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("Jesús");
        usuarios.add("María");
        usuarios.add("José");        
        return usuarios;        
    }
    
}
