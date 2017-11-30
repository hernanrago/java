package org.apache.jsp._06ConServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ajax_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"cargarTexto();\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function crearInstancia(){\r\n");
      out.write("xmlhttp=null;\r\n");
      out.write(" if (window.XMLHttpRequest) {  \r\n");
      out.write("     xmlhttp = new XMLHttpRequest();  \r\n");
      out.write(" } else {  \r\n");
      out.write("     xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");  \r\n");
      out.write(" } \r\n");
      out.write("\treturn xmlhttp;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function comienzo(){\r\n");
      out.write("\r\n");
      out.write("\tvar XMLRequest = crearInstancia();\r\n");
      out.write("\t\r\n");
      out.write("\tif (XMLRequest) {\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tXMLRequest.open(\"GET\",\"../CiudadServlet?ciudad=\"+document.getElementById(\"ciudadIngresada\").value,false);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tXMLRequest.onreadystatechange=cambiaEstado(XMLRequest);\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else  {\r\n");
      out.write("\t\talert(\"No se pudo crear instancia\");\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function cambiaEstado(XMLRequest){\r\n");
      out.write("\t\r\n");
      out.write("\t if (XMLRequest.readyState == 1) {\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t XMLRequest.setRequestHeader('Content-Type','application/x-www-form-urlencoded');\r\n");
      out.write("\t\t XMLRequest.send(null);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     if (XMLRequest.readyState == 4) {\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    \t    // via larga\r\n");
      out.write(" \t\t//var miDiv =document.getElementById(\"texto\");\r\n");
      out.write(" \t//\tvar valor = document.createTextNode(XMLRequest.responseText);\r\n");
      out.write(" \t\r\n");
      out.write(" \t//\tmiDiv.appendChild(valor);\r\n");
      out.write(" \t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t\t// via corta\r\n");
      out.write("     \t document.getElementById(\"texto\").innerHTML=XMLRequest.responseText;\r\n");
      out.write("     }\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("Ingrese ciudad a buscar:\t<input type=\"text\" id=\"ciudadIngresada\" / >\r\n");
      out.write("<input type=\"button\" onclick=\"comienzo()\" value=\"BUSCAR\">\r\n");
      out.write("<div id=\"texto\" ></div>\r\n");
      out.write("</body>\r\n");
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
