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
      out.write("        <title>EducacionIT - Tutorial AJAX</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tutorial AJAX</h1>\n");
      out.write("        <span>Seleccione nombre de usuario: </span>\n");
      out.write("        <input type=\"text\" size=\"20\" id=\"idUsuario\" name=\"id\" onkeyup=\"validarUsuario();\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function crearInstancia() {\n");
      out.write("                \n");
      out.write("               var xmlhttp = null;\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    xmlhttp = new XMLHttpRequest();\n");
      out.write("                } else {\n");
      out.write("                    xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                return xmlhttp;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function validarUsuario() {\n");
      out.write("                \n");
      out.write("                var ajaxRequest = crearInstancia();\n");
      out.write("                // Acá indicamos cómo procesar la request una vez que ésta cambie de estado.\n");
      out.write("                var target = document.getElementById(\"idUsuario\");\n");
      out.write("                var url = \"validar?id=\" + escape(target.value);\n");
      out.write("                ajaxRequest.open(\"GET\", url, true);\n");
      out.write("                ajaxRequest.onreadystatechange = processRequest(ajaxRequest);\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function processRequest(ajaxRequest) {\n");
      out.write("                alert(ajaxRequest.readyState);\n");
      out.write("                if (ajaxRequest.readyState === 1) {\n");
      out.write("                    ajaxRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\n");
      out.write("                    ajaxRequest.send(null);\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (ajaxRequest.readyState === 4 && ajaxRequest.status === 200) {\n");
      out.write("                    var message = ajaxRequest.responseText;\n");
      out.write("                    if (\"true\" === message) {\n");
      out.write("                        document.getElementById(\"spanRespuesta\").style.color = \"red\";\n");
      out.write("                        document.getElementById(\"spanRespuesta\").innerHTML = \"Ese nombre de usuario ya existe\";\n");
      out.write("                    } else {\n");
      out.write("                        document.getElementById(\"spanRespuesta\").style.color = \"green\";\n");
      out.write("                        document.getElementById(\"spanRespuesta\").innerHTML = \"Nombre de usuario disponible\";\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <span id=\"spanRespuesta\"></span>\n");
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
