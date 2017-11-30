<%-- 
    Document   : index
    Created on : 14-oct-2017, 12:27:57
    Author     : educacionit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario</title>
    </head>
    <body>
        <h1>Crear usuario</h1>
        <form action="procesar" method="POST">
            <input type="text" name="nombre" placeholder="Nombre completo" />
            <br /><br />
            <input type="email" name="mail" placeholder="Email" required />
            <br /><br />
            <input type="submit" />
        </form>
    </body>
</html>
