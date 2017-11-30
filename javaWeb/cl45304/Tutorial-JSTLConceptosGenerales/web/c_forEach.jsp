<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head><title>JSP Page</title></head>
    <body>
        <p>    
        
        <%-- Itera desde 10 al 20 saltando de a dos --%>
        <c:forEach var="i" begin="10" end="20" step="2">
          <c:out value="${i}"/><BR>
        </c:forEach>
        
        <HR>
        
        <%-- Itera desde 10 al 20 saltando index y count--%>
        <c:forEach var="i" begin="10" end="20" varStatus="status">
            indice: <c:out value="${status.index}"/> 
            iteracion #: <c:out value="${status.count}"/> <BR>
        </c:forEach>
        
        <HR>
        
        <%-- Itera por los empleados de una empresa --%>
        <jsp:useBean id="empresaBean" scope="request" class="ar.com.educacionit.webprogramming.jstl.EmpresaBean" />
        <c:forEach var="e" items="${empresaBean.empleados}">
            <c:out value="${e.nombre}" /> | <c:out value="${e.apellido}" /><BR>
        </c:forEach>

    </body>
</html>
