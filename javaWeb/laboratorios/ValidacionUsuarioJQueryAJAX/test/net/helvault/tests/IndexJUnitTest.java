/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.helvault.tests;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.helvault.servlets.ValidacionServlet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernan
 */
public class IndexJUnitTest {
    
    public IndexJUnitTest() {
    }
    
    @Test
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    ArrayList<String> usuarios = ValidacionServlet.Usuarios();
            for (String usuario: usuarios) {
                if(usuario.equals(request.getParameter("usuario")))
                    response.setContentType("text/xml");
                    response.setHeader("Cache-Control", "no-cache");
                    response.getWriter().write("existente");
            }
            assertEquals("existente",response.);
    }
    
}
