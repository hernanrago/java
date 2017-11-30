<%-- 
    Document   : calculator
    Created on : Oct 19, 2017, 9:35:19 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <form action="CalculatorServlet" method="post">
            <table>
                <tr>
                    <td><input type="number" name="value01" placeholder="insert a value" style="width: 10em"></td>
                </tr>
                <tr>
                    <td><input type="number" name="value02" placeholder="insert a value" style="width: 10em"></td>
                </tr>
                <tr>
                    <td>
                        <select name="operation" style="width: 12em">
                            <option>Select an operation</option>
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
                    </td>
                </tr>
            <tr>
                <td><input type="submit" value="Execute" style="width: 12em"></input></td>
            </tr>
            </table>
        </form>
    </body>
</html>
