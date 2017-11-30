<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head><title>JSP Page</title></head>
    <body>
      
        

    
  <table border="1" cellpadding="5" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%" id="AutoNumber1">
    <tr>
      <td width="5%" bgcolor="#0000FF"><b><font color="#FFFFFF">#</font></b></td>
      <td width="5%" bgcolor="#0000FF"><b><font color="#FFFFFF">ID</font></b></td>
      <td width="30%" bgcolor="#0000FF"><b><font color="#FFFFFF">NOMBRE</font></b></td>
      <td width="30%" bgcolor="#0000FF"><b><font color="#FFFFFF">APELLIDO</font></b></td>
      <td width="30%" bgcolor="#0000FF"><b><font color="#FFFFFF">ADMIN</font></b></td>
    </tr>
       
            
             <c:forEach var="alu" items="${losAlumnos}">
                 <tr>
                     <td width="5%"><B>${alu.count}.</B></td>
                     <td width="5%">${alu.id}</td>
                     <td width="30%"> <c:out value="${alu.nombre}" /> </td>
                     <td width="30%"> <c:out value="${alu.apellido}" /> </td>
                     <td width="30%">
                    <a href=AlumnoServlet?accion=modificar_init&id=<c:out value="${alu.id}" /> >Modificar</a>
                    | 
                    <a href=AlumnoServlet?accion=eliminar&id=<c:out value="${alu.id}" /> >Eliminar</a>
                </td>
                     
                  </tr>
            
        </c:forEach>
                
                
               
               
               
           

    
  </table>
        
        <%-- Itera por los empleados de una empresa --%>
        
       

    </body>
</html>
