package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>index</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/newcss.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario de inscripción</h1>\n");
      out.write("        <hr/>\n");
      out.write("        <form action=\"ProcesadorDatos\" method=\"post\">\n");
      out.write("            Nombre <input type=\"text\" name=\"nombre\"/> <br/>\n");
      out.write("            Apellido <input type=\"text\" name=\"apellido\"/> <br/>\n");
      out.write("            Domicilio <input type=\"text\" name=\"domicilio\"/> <br/>\n");
      out.write("            Sexo Masculino <input type=\"radio\" name=\"sexo\" value=\"masculino\"/> \n");
      out.write("            Femenino <input type=\"radio\" name=\"sexo\" value=\"femenino\"/> <br/>\n");
      out.write("            Puesto de trabajo <select name=\"puesto\">\n");
      out.write("                <option disabled=\"\" selected=\"\">Seleccione su puesto</option>\n");
      out.write("                <option value=\"Programador\">Programador</option>\n");
      out.write("                <option value=\"Diseñador\">Diseñador</option>\n");
      out.write("                <option value=\"Analista Funcional\">Analista Funcional</option>\n");
      out.write("                <option value=\"Lider de Proyecto\">Líder de Proyecto</option>\n");
      out.write("            </select> <br/>\n");
      out.write("            Tiene experiencia <input type=\"checkbox\" name=\"experiencia\" value=\"si\"/>\n");
      out.write("            <hr/>\n");
      out.write("            <input type=\"submit\" value=\"Registrarme\"/>\n");
      out.write("        </form>\n");
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
