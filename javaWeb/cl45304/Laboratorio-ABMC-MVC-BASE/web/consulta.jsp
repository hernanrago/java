<%-- 
    Document   : consulta
    Created on : Oct 25, 2017, 7:34:59 PM
    Author     : hernan
--%>

<%@page import="ar.com.educacionit.webprogramming.abmc.entities.AlumnoDAO"%>
<%@page import="ar.com.educacionit.webprogramming.abmc.entities.Alumno"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de alumnos</title>
    </head>
    <body>
        <h1>Consulta de alumnos</h1>
        
        <table>
            <%
            ArrayList <Alumno> arrayList = AlumnoDAO.getTodos();
            String nombre=null;
            String apellido=null;
            for(Alumno alumnoDB : arrayList){
                nombre=alumnoDB.getNombre();
                apellido=alumnoDB.getApellido();    
            %>
            <tr>
                <td><%= nombre %></td>
                <td><%= apellido %></td>
            </tr>
            <%
            }
            %>
        </table>
        
    </body>
</html>
