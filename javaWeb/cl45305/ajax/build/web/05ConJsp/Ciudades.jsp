<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Ciudades</title>
    </head>
    <body>
        <%
            // Obtener el parametro con el nombre de la ciudad
            String persona = request.getParameter("ciudad");

            // Devolver el lugar de residencia de la persona
            if (persona.equalsIgnoreCase("Capital")) {
                out.print("Ud vive en Capital Federal!!");
            } else if (persona.equalsIgnoreCase("Rosario")) {
                out.print("Trae alfajores");
            } else if (persona.equalsIgnoreCase("Bariloche")) {
                out.print("Me gusta esquiar");
            } else {
                out.print("Ingrese otra ciudad!");
            }
        %>

    </body>
</html>