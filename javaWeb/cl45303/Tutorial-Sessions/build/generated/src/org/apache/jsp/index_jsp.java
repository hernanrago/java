package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ar.com.educacionit.webprogramming.sessions.Persona;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <h1>index.jsp</h1>\n");
      out.write("    <HR>\n");
      out.write("    \n");
      out.write("    <a href=\"index.jsp\">Ir a index.jsp</a> | \n");
      out.write("    <a href=\"bienvenido.jsp\">Ir a bienvenido.jsp</a> | \n");
      out.write("    <a href=\"chau.jsp\">Ir a chau.jsp</a>\n");
      out.write("    <HR>\n");
      out.write("    <P>\n");
      out.write("    <P>\n");
      out.write("    <form method=\"POST\" action=\"CargaDatosServlet\">\n");
      out.write("        Nombre: <input type=\"text\" name=\"nombre\"><BR>\n");
      out.write("        Apellido: <input type=\"text\" name=\"apellido\"><BR><BR>\n");
      out.write("        <input type=\"submit\" value=\"Cargar datos en sesion!\">\n");
      out.write("    </form>\n");
      out.write("<P>\n");
      out.write("<HR>\n");
      out.write("<HR>\n");
      out.write("<P>\n");
      out.write("\n");
      out.write("    <B>DATOS EN SESION:</B><BR>\n");
      out.write("    ");

        // Construye variables
        String nombre = "<font color=red>VACIO</font>";
        String apellido = "<font color=red>VACIO</font>";
        
        // Obtiene los datos guardados en sesion si es que los hay
        Persona p = (Persona) session.getAttribute("persona");
        
        // Chequea los datos de la sesion
        if(p!= null){
            nombre = "<font color=green>" + p.getNombre() + "</font>";
            apellido = "<font color=green>" + p.getApellido() + "</font>";
        }
    
      out.write("\n");
      out.write("    Nombre: ");
      out.print(nombre);
      out.write("<BR>\n");
      out.write("    Apellido: ");
      out.print(apellido);
      out.write("<BR>\n");
      out.write("    sessionID: ");
      out.print(session.getId());
      out.write("<BR>\n");
      out.write("    <BR>\n");
      out.write("    <a href=\"destruir-sesion.jsp\">Destruir sesion</a>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
