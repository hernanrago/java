<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    Para ejecutar este ejemplo, ingrese lo siguiente como url:<br>
    <b><i>param.jsp?saludar=true&nombre=Juan</i></b>

    <%--
    Para ejecutar este ejemplo: param.jsp?saludar=true&nombre=Juan
    --%>
    <c:if test="${param.saludar}">
        <h1>Hola ${param.nombre}!</H1>
    </c:if>
    
    </body>
</html>
