package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javascript_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Javascript</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>AJAX</h1>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" size=\"20\" id=\"idUsuario\" name=\"id\" onkeyup=\"validarUsuario()\"/>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var ajaxRequest;  // Esta variable nos permitirá utilizar Ajax\n");
      out.write("            function ajaxFunction(){\n");
      out.write("                try{\n");
      out.write("                  // Código para la mayoría de los browsers\n");
      out.write("                  ajaxRequest = new XMLHttpRequest();\n");
      out.write("                }catch (e){\n");
      out.write("                  // Código exclusivo para Internet Explorer\n");
      out.write("                  try{\n");
      out.write("                     ajaxRequest = new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("                  }catch (e) {\n");
      out.write("                     try{\n");
      out.write("                        ajaxRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                     }catch (e){\n");
      out.write("                        // Algo falló!\n");
      out.write("                        alert(\"Error!\");\n");
      out.write("                        return false;\n");
      out.write("                     }\n");
      out.write("                  }\n");
      out.write("                }\n");
      out.write("            }           \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validarUsuario() {\n");
      out.write("                ajaxFunction();\n");
      out.write("                // Acá indicamos cómo procesar la request una vez que ésta cambie de estado.\n");
      out.write("                ajaxRequest.onreadystatechange = processRequest;\n");
      out.write("                if (!target) target = document.getElementById(\"idUsuario\");\n");
      out.write("                var url = \"validate?id=\" + escape(target.value);\n");
      out.write("                ajaxRequest.open(\"GET\", url, true);\n");
      out.write("                ajaxRequest.send(null);\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
