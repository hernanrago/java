<%-- 
    Document   : destino
    Created on : Oct 25, 2017, 10:00:38 AM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" lang="es">
        
        <title>Datos Obtenidos</title>
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
        
    </head>
    <body>
        <h1>Datos Obtenidos</h1>
        <hr/>
        Nombre: <%= request.getAttribute("nombre") %> <br/>
        Apellido: <%= request.getAttribute("apellido") %> <br/>
        Domicilio: <%= request.getAttribute("domicilio") %> <br/>
        Sexo: <%= request.getAttribute("sexo") %> <br/>
        Puesto de trabajo: <%= request.getAttribute("puesto") %> <br/>
        Experiencia: <%= request.getAttribute("experiencia") %>
        <hr/>
    </body>
</html>
