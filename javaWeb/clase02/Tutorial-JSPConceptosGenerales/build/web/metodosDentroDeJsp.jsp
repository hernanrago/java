<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%!

    // Definición de un método dentro de un jsp (o de un servlet)
    private String saludar()
    {
        return "Hola, soy un método ubicado dentro del JSP (de un Servlet)";
    }
    
    // Definición de un atributo dentro de un jsp (o de un servlet)
    private int numero = 250;
%>

<html>
    <head><title>JSP Page</title></head>
    <body>
        <%
            out.println( saludar() + "<br>");
            out.println("<BR>");
            out.println( "El valor del atributo nro es: " + numero );
        %>
    
    </body>
</html>
