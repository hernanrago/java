<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="ar.com.educacionit.webprogramming.jsp.Alumno"%>

<%
    ArrayList lasPersonas = new ArrayList();
    lasPersonas.add( new Alumno("1", "Sebastian") );
    lasPersonas.add( new Alumno("2", "Santiago") );
    lasPersonas.add( new Alumno("3", "Javier") );
    lasPersonas.add( new Alumno("4", "Pedro") );
%>

<html>
    <head><title>JSP Page</title></head>
    <body>

    <B>Combo estático</B><BR>
    <select size="1" name="D1">
        <option value="1">Sebastian</option>
        <option value="2">Santiago</option>
        <option value="3">Javier</option>
        <option value="4">Pedro</option>
    </select>

    <P><HR><P>

    <B>Combo dinámico</B><BR>
    <select size="1" name="D1">
        <%
            Iterator it = lasPersonas.iterator();
            while( it.hasNext() )
            {
                Alumno unAlumno = (Alumno) it.next();
                out.println( "<option value=" + unAlumno.getId() + ">" + unAlumno.getNombre() + "</option>" );
            }
        %>
    </select>    
    
    </body>
</html>
