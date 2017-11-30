<%-- 
    Document   : bienvenido
    Created on : Oct 25, 2017, 3:22:53 PM
    Author     : hernan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8" 
        import="net.helvault.classes.Usuario, net.helvault.servlets.LoginServlet"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        <title>Bienvenido</title>
        <%
            HttpSession httpSession = request.getSession();
            
            %>
    </head>
    <body>        
        <h1>Bienvenido <%= httpSession.getAttribute("usuario") %></h1>
        
        <a href="index.jsp">Destruir sesión y volver al index</a>
    </body>
</html>


