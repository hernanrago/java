<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%-- Comienzo Header de educacionIT --%>
        <div align="right">
            <font color="blue"><I><h2>www.educacionIT.com.ar</h2></I></font><hr>
        </div>
        <%-- Fin Header de educacionIT --%>        

    <h1>index.jsp</h1><hr>


<I> Ingrese los datos de la persona: </I><BR>
<FORM ACTION="PersonaServlet" METHOD="POST">
    Nombre: <input type="text" name="nombre"/><br>
    Apellido: <input type="text" name="apellido"/><br>
    Domicilio: <input type="text" name="domicilio"/><br>
    Pais: <input type="text" name="pais"/><br>
    <input type="submit" value="Enviar">
</FORM>
    
    </body>
</html>
