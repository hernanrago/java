package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Iterator;
import ar.com.educacionit.webprogramming.jsp.Alumno;

public final class combo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    ArrayList lasPersonas = new ArrayList();
    lasPersonas.add( new Alumno("1", "Sebastian") );
    lasPersonas.add( new Alumno("2", "Santiago") );
    lasPersonas.add( new Alumno("3", "Javier") );
    lasPersonas.add( new Alumno("4", "Pedro") );

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head><title>JSP Page</title></head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <B>Combo estático</B><BR>\n");
      out.write("    <select size=\"1\" name=\"D1\">\n");
      out.write("        <option value=\"1\">Sebastian</option>\n");
      out.write("        <option value=\"2\">Santiago</option>\n");
      out.write("        <option value=\"3\">Javier</option>\n");
      out.write("        <option value=\"4\">Pedro</option>\n");
      out.write("    </select>\n");
      out.write("\n");
      out.write("    <P><HR><P>\n");
      out.write("\n");
      out.write("    <B>Combo dinámico</B><BR>\n");
      out.write("    <select size=\"1\" name=\"D1\">\n");
      out.write("        ");

            Iterator it = lasPersonas.iterator();
            while( it.hasNext() )
            {
                Alumno unAlumno = (Alumno) it.next();
                out.println( "<option value=" + unAlumno.getId() + ">" + unAlumno.getNombre() + "</option>" );
            }
        
      out.write("\n");
      out.write("    </select>    \n");
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
