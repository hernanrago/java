<%-- 
    Document   : internationalization-formatting
    Created on : Nov 1, 2017, 11:03:33 AM
    Author     : hernan
--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Internationalization & Formatting</title>
    </head>
    <body>
        <h1>Internationalization & Formatting </h1>
        
        <jsp:useBean id="now" class="java.util.Date"/>
        Fecha: <fmt:formatDate value="${now}" dateStyle="full"/></br>
        Fecha: <fmt:formatDate value="${now}" pattern="EEE,MMM d, yy"/>
        
    </body>
</html>
