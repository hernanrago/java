<%-- 
    Document   : saluda1.jsp
    Created on : 02/02/2016, 12:34:57
    Author     : Vane
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%=request.getAttribute("user") %>,  Ud. se ha identificado correctamente!</h1>
    </body>
</html>
