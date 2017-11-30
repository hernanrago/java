<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head><title>JSP Page</title></head>
    <body>
        <p>    
    
        <%-- Define variables --%>
        <c:set var="categoria" value="C" scope="request" />
        
        <%-- Utiliza el choose --%>
        <c:choose>
            <c:when test="${categoria == 'A'}">
                <c:out value="Es la categoría A" />
            </c:when>
            <c:when test="${categoria == 'B'}">
                <c:out value="Es la categoría B" />
            </c:when>
            <c:when test="${categoria == 'C'}">
                <c:out value="Es la categoría C" />
            </c:when>
            <c:otherwise>
                <c:out value="No es una categoria" />
            </c:otherwise>
        </c:choose>

    </body>
</html>
