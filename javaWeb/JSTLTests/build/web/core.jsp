<%-- 
    Document   : core
    Created on : Oct 31, 2017, 7:34:13 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JavaServerPages Standard Tag Library</title>
    </head>
    <body>
        <h1>JavaServerPages Standard Tag Library</h1>
        
        <h4>Tag 'out'</h4>
        <c:out value="Tag 'out' -> c:out value='Tag out'"/><br/>
        
        <h4>Tag 'set'</h4>
        <c:set var="variable" scope="request" value="valor"/>
        <c:out value="variable -> c:out value='variable'" /><br/>
        <c:out value="${variable} -> c:out value='$ {variable}'"/><br/>
        
        <h4>Tag 'if'</h4>
        <c:set var="vacio" scope="request" value=""/>
        <c:set var="variable2" scope="request" value="100"/>
        <c:if test="${empty vacio}">
            <c:out value="La variable <B>vacio</B> está vacia." escapeXml=""/><br/>
        </c:if>
        <c:if test="${!empty vacio}">
            <c:out value="La variable <B>vacio</B> no está vacia." escapeXml=""/><br/>
        </c:if>
        
        <h4>Tag 'choose'</h4>
        <c:set var="categoria" value="C" scope="request"/>
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
        
        <h4>Tag 'forEach'</h4>
        <c:forEach var="i" begin="10" end="20" step="2">
            <c:out value="${i}"/><BR>
        </c:forEach>
        
        <c:forEach var="i" begin="10" end="20" varStatus="status">
            indice: <c:out value="${status.index}"/>
            iteracion #: <c:out value="${status.count}"/> <BR>
        </c:forEach>
        
        <h4>El valor 'param'</h4>

        <c:if test="${param.saludar}">
            <h1>Hola ${param.nombre}</h1>
        </c:if>

            <%--agregar ?saludar=true&nombre=Juan a la URL --%>
        
        
        
    </body>
</html>
