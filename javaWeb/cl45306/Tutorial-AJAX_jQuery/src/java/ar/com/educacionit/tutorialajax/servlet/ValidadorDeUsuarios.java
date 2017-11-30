/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.tutorialajax.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ncavallo
 */
public class ValidadorDeUsuarios extends HttpServlet {

    private static Map accounts = new HashMap();

    public void init() throws ServletException {
        super.init();
        accounts.put("Juan", "123");
        accounts.put("Pepe", "321");
        accounts.put("María", "3211");
        accounts.put("Nico", "456");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String targetId = request.getParameter("id");

        if ((targetId != null)
                && accounts.containsKey(targetId.trim())) {
            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");
            response.getWriter().write("true");
        } else {
            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");
            response.getWriter().write("false");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
