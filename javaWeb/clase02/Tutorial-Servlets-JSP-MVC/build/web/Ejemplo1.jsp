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

    <h1>Ejemplo con sendRedirect</h1><hr>

<form action="CapturaDeDatosServlet" method="POST">
        Usuario: <input type="text" name="usuario">
        <BR>
        Clave: <input type="password" name="clave">
        <HR>
        <input type="submit" value="Loguearse">
    </form>
    
    </body>
</html>
