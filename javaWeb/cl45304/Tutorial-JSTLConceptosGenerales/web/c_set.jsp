<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head><title>JSP Page</title></head>
    <body>
        <p>    
    
        <%-- Setea una variable --%>
        <c:set var="miVariable" scope="request" value="soy el valor" />

        <%-- Imprime el valor miVariable --%>
        <c:out value="miVariable" />

        <P>

        <%-- Imprime el contenido de miVariable --%>
        <c:out value="${miVariable}" />
        
        <P>
    
    </body>
</html>
