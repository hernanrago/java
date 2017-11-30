<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Servlet ProcesadorDeDatos</title>
    </head>
    <body>

        <%-- Comienzo Header de educacionIT --%>
        <div align="right">
            <font color="blue"><I><h2>www.educacionIT.com.ar</h2></I></font><hr>
        </div>
        <%-- Fin Header de educacionIT --%>
        
         <h1>
       Datos Obtenidos
       </h1><hr><P>
    <li><b>Nombre</b>: <%= request.getAttribute("nombre") %><BR>
       <li><b>Apellido</b>: <%= request.getAttribute("apellido") %><BR>
       <li><b>Dirección</b>: <%= request.getAttribute("direccion") %><BR>
       <li><b>Sexo</b>: <%= request.getAttribute("sexo") %><BR>
       <li><b>Puesto de trabajo</b>: <%= request.getAttribute("puestoDeTrabajo") %><BR>
       <li><b>Tiene experiencia</b>: <%= request.getAttribute("tieneExperiencia") %><BR>
    </body>
</html>
