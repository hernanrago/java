package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Iterator;
import ar.com.educacionit.webprogramming.abmc.entities.*;
import ar.com.educacionit.webprogramming.abmc.database.*;

public final class consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Administrador de Alumnos</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<H1>Consulta de Alumnos</H1>\n");
      out.write("<hr noshade color=\"#0000FF\" size=\"3\"><BR>\n");
      out.write("\n");
      out.write("<BR>\n");
      out.write("<form method=\"POST\" action=\"AlumnoServlet\">\n");
      out.write("  Id: <input type=\"text\" name=\"id\" size=\"2\"> Nombre:\n");
      out.write("  <input type=\"text\" name=\"nombre\" size=\"10\"> Apellido:\n");
      out.write("  <input type=\"text\" name=\"apellido\" size=\"10\">\n");
      out.write("  <input type=\"hidden\" name=\"accion\" value=\"consultar\"/>\n");
      out.write("  <input type=\"submit\" value=\"Buscar\" name=\"enviar\">\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<form method=\"POST\" action=\"alta.jsp\">\n");
      out.write("  <input type=\"submit\" value=\"Ir a ventana Insertar\" name=\"enviar\">    \n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr noshade color=\"#0000FF\" size=\"1\">\n");
      out.write("\n");
      out.write("  <table border=\"1\" cellpadding=\"5\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"100%\" id=\"AutoNumber1\">\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"5%\" bgcolor=\"#0000FF\"><b><font color=\"#FFFFFF\">#</font></b></td>\n");
      out.write("      <td width=\"5%\" bgcolor=\"#0000FF\"><b><font color=\"#FFFFFF\">ID</font></b></td>\n");
      out.write("      <td width=\"30%\" bgcolor=\"#0000FF\"><b><font color=\"#FFFFFF\">NOMBRE</font></b></td>\n");
      out.write("      <td width=\"30%\" bgcolor=\"#0000FF\"><b><font color=\"#FFFFFF\">APELLIDO</font></b></td>\n");
      out.write("      <td width=\"30%\" bgcolor=\"#0000FF\"><b><font color=\"#FFFFFF\">ADMIN</font></b></td>\n");
      out.write("    </tr>\n");
  
    ArrayList alumnos = (ArrayList) request.getAttribute("losAlumnos");
    // Informa los alumnos si hay al menos uno
    if( alumnos.size() != 0 )
    {
        // Variables
        Iterator it = alumnos.iterator();
        int contador = 0;
        
        // Informa los datos de cada alumno
        while( it.hasNext() )
        {
            contador++;
            Alumno elAlumno = (Alumno) it.next();

      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"5%\"><B>");
      out.print(contador);
      out.write(".</B></td>\n");
      out.write("                <td width=\"5%\">");
      out.print(elAlumno.getId());
      out.write("</td>\n");
      out.write("                <td width=\"30%\">");
      out.print(elAlumno.getNombre());
      out.write("</td>\n");
      out.write("                <td width=\"30%\">");
      out.print(elAlumno.getApellido());
      out.write("</td>\n");
      out.write("                <td width=\"30%\">\n");
      out.write("                    <a href=AlumnoServlet?accion=modificar_init&id=");
      out.print(elAlumno.getId());
      out.write(" >Modificar</a>\n");
      out.write("                    | \n");
      out.write("                    <a href=AlumnoServlet?accion=eliminar&id=");
      out.print(elAlumno.getId());
      out.write(" >Eliminar</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");

        }
    }

      out.write("\n");
      out.write("    \n");
      out.write("  </table>\n");
      out.write("  <P align=left>\n");
      out.write("  <B>");
      out.print(alumnos.size());
      out.write("</B> alumnos encontrado(s)\n");
      out.write("  </P>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
