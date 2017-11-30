<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="ar.com.educacionit.webprogramming.jsp.HolaJSP" %>
<html>
    <head><title>JSP Page</title></head>
    <body>

    <% 
        HolaJSP elObjeto = new HolaJSP();
        out.println( elObjeto.getSaludo() );
    %>
    
    </body>
</html>
