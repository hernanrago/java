<%-- 
    Document   : index
    Created on : Oct 18, 2017, 4:56:59 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h1>Presione el botón para ver la lista de países:</h1>
        <form action="CountriesServlet" method="post">
            <input type="submit" value="Listado de países" name="service">
            <input type="submit" value="Listado de código de moneda" name="service">
        </form>
    </body>
</html>
