package ar.com.educacionit.webprogramming.sessions.servlets;

import ar.com.educacionit.webprogramming.sessions.entities.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sesion = request.getSession();
        String accion = request.getParameter("accion");
        if ("logout".equals(accion)) {
            sesion.invalidate();
            response.sendRedirect("index.jsp");
            return;
        }
        
        ArrayList<Usuario> usuarios = dameUsuarios();
       
        
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        
        boolean encontro = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(pass)) {
                sesion.setAttribute("user", usuario);
                encontro = true;
                break;
            }
        }
        
        if (encontro) {
            sesion.setAttribute("error", "");
            response.sendRedirect("bienvenido.jsp");
            
        } else {
            sesion.setAttribute("error", "El usuario es inválido");
            response.sendRedirect("index.jsp");
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

    private ArrayList<Usuario> dameUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario u1 = new Usuario();
        u1.setApellido("Perez");
        u1.setNombre("Jaime");
        u1.setPassword("123");
        u1.setUsername("jaiper");
        usuarios.add(u1);
        
        Usuario u2 = new Usuario();
        u2.setApellido("Juarez");
        u2.setNombre("Maxi");
        u2.setPassword("123");
        u2.setUsername("maxjua");
        usuarios.add(u2);
        
        Usuario u3 = new Usuario();
        u3.setApellido("Gomez");
        u3.setNombre("Pedro");
        u3.setPassword("123");
        u3.setUsername("pego");
        usuarios.add(u3);
        
        return usuarios;
    }

}
