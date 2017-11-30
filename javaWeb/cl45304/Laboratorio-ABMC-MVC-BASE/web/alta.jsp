<%-- 
    Document   : alta
    Created on : Oct 25, 2017, 6:34:02 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta</title>
    </head>
    <body>
        <h1>Alta de usuarios</h1>
        <form action="ABMCServlet" method="post">
            <input type="hidden" name="accion" value="alta"/>
            <input type="text" name="nombre" placeholder="Nombre"/><br/>
            <input type="text" name="apellido" placeholder="Apellido"/><br/>
            <input type="submit" value="Alta"/>
        </form>
    </body>
</html>
