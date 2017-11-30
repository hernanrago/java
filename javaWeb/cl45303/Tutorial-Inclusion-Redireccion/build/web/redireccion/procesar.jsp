<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%

// Obtiene la opcion elegida
String opcionElegida = request.getParameter("opcion");

// Realiza la redireccion segun corresponda
if(opcionElegida.equals("1"))
{
    response.sendRedirect("bienvenido.html");
}
else
{
%>
    <jsp:forward page="chau.html" />
<%
}
%>