<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%
    // Constrola que exista la sesion de usuario
    if( session.getAttribute("user") == null ){
        session.setAttribute("error", "Para ingresar debe identificarse");
        response.sendRedirect("index.jsp");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>educacionIT :: Proyecto-Sessions</title>
    </head>
    <body>
    
    <div align="right"><h1>Proyecto-Sessions-Login :: Bienvenido</h1>
    <hr>
    Bienvenido, <i><%=session.getAttribute("user")%></i>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
    <a href="LoginServlet?accion=logout">[Logout]</a>
    <hr>
    <div>
    </body>
</html>
