<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <H1> FORMULARIO DE AUTOS </H1><HR> 
        <form action="procesar.jsp" method="POST">
        
            Marca: <input type="text" name="marca" value="" /><BR><BR>
            Color: <input type="text" name="color" value="" /><BR>
            <input type="hidden" name="accion" value="insertar" />
            <HR>
            <input type="submit" value="Enviar datos" />
        
        </form>
    
    </body>
</html>
