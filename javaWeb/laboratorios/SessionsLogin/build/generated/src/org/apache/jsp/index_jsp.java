package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.helvault.servlets.LoginServlet;

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
      out.write("        <link rel=\"stylesheet\" href=\"css/newcss.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <title>index</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var xmlhttp;\n");
      out.write("            if (window.XMLHttpRequest) {\n");
      out.write("                xmlhttp=new XMLHttpRequest();\n");
      out.write("                alert(\"Usa un navegador distinto a IE\");\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                alert(\"Usa IE\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function () {\n");
      out.write("                var XMLRequest=crearInstancia();\n");
      out.write("                XMLRequest.open(\"POST\",\"index.jsp\"+document.getElementsByName(\"usuario\"));\n");
      out.write("                XMLRequest.open(\"POST\",\"index.jsp\"+document.getElementsByName(\"contrasena\"));\n");
      out.write("                XMLRequest.onreadystatechenge=cambiaEstado(XMLRequest);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function cambiaEstado(XMLRequest) {\n");
      out.write("\n");
      out.write("                if (XMLRequest.readyState === 1) {\n");
      out.write("                    XMLRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\n");
      out.write("                    XMLRequest.send(null);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (XMLRequest.readyState === 4) {\n");
      out.write("                    document.getElementById(\"texto\").innerHTML = XMLRequest.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        ");


            String error="";
            HttpSession httpSession = request.getSession();
            if(httpSession.getAttribute("error")!=null)
            error=(String) httpSession.getAttribute("error");

            
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h2>Ingrese su usuario y contraseña, por favor</h2>\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"usuario\" placeholder=\"Nombre\"/><br/>\n");
      out.write("            <input type=\"password\" name=\"contrasena\" placeholder=\"Contraseña\"/><br/>\n");
      out.write("            Acepta términos y condiciones <input type=\"checkbox\" name=\"ATC\" value=\"acepta\"/><br/>\n");
      out.write("            <input type=\"submit\" value=\"Ingresar\" onclick=\"comienzo\"/>\n");
      out.write("        </form>\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        ");
      out.print( error );
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          \n");
      out.write("    </body>\n");
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
