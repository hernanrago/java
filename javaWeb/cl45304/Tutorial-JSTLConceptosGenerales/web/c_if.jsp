<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head><title>JSP Page</title></head>
    <body>
        <p>    
    
        <%-- Define variables --%>
        <c:set var="vacio" scope="request" value="" />
        <c:set var="miVariable" scope="request" value="100" />
        
        <c:if test="${empty vacio}">
            <c:out value="La variable <B>vacio</B> esta vacía!" escapeXml="" />
        </c:if>
        
        <c:if test="${!empty vacio}">
            <c:out value="La variable <B>vacio</B> NO esta vacía!" escapeXml="" />
        </c:if>        

        <P>
        
        <c:if test="${ miVariable == '100'}">
            <c:out value="miVariable es igual a 100" />
        </c:if>        
        
        <c:if test="${!(miVariable == '100')}">
            <c:out value="miVariable NO es igual a 100" />
        </c:if>        
        
    
    </body>
</html>
