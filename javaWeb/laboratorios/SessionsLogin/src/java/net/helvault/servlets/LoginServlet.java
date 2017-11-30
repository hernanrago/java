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
import javax.servlet.http.HttpSession;
import net.helvault.classes.Usuario;

/**
 *
 * @author hernan
 */
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            
            String usuario=request.getParameter("usuario");
            String contrasena=request.getParameter("contrasena");
            HttpSession httpSession = request.getSession();
            boolean usuarioExistente=false;
            for (Usuario usuarioDB:LoginServlet.getUsuarios()) {
                if (usuario.equals(usuarioDB.getUsername())&&
                        contrasena.equals(usuarioDB.getPassword())) {
                    usuarioExistente=true;
                    httpSession.setAttribute("usuario", usuarioDB);
                    break;
                }   
            }
            if (usuarioExistente==true) {
                response.sendRedirect("bienvenido.jsp");
            }
            else {
                httpSession.setAttribute("error", "Usuario y/o contraseña erronea");
                response.sendRedirect("index.jsp");
            }
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

    public static ArrayList<Usuario> getUsuarios(){
    
        ArrayList<Usuario> arrayList = new ArrayList<>();
        Usuario gbaker = new Usuario("gbaker", "asd123", "Ginger", "Baker");
        Usuario eclapton = new Usuario("eclapton", "asd123", "Eric", "Clapton");
        Usuario jbruce = new Usuario("jbruce", "asd123", "Jack", "Bruce");
        arrayList.add(gbaker);
        arrayList.add(eclapton);
        arrayList.add(jbruce);
           
        return arrayList;
    }
}
