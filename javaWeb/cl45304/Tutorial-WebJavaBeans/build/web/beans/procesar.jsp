<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%-- no es necesario importar la clase del AutoBean ya que al hacer el "useBean" en la propiedad "class" ponemos el paquete --%>

<%-- Instancia un bean, que es igual a hacer AutoBean formulario = new AutoBean() --%>
<jsp:useBean id="formulario" class="ar.com.educacionit.webprogramming.beans.Auto" scope="request" />

<%-- Completa el bean con todos los datos que vienen del formulario --%>
<jsp:setProperty name="formulario" property="*" />


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <h1>Procesar.jsp</h1>
    
    La marca es <B><jsp:getProperty name="formulario" property="marca" /></B>    
    <P>
    El color es <B><jsp:getProperty name="formulario" property="color" /></B>    
    <P>        
    La accion es <B><jsp:getProperty name="formulario" property="accion" /></B>    
    <P>        
        
    <HR>
    <HR>
    
    Tambien funciona utilizando el objeto llamado formulario como una variable local de JSP...
    <BR><BR>

    La marca es <B><%=formulario.getMarca()%></B>    
    <P>
    El color es <B><%=formulario.getColor()%></B>    
    <P>        
    La accion es <B><%=formulario.getAccion()%></B>    
    <P>
        
    
    </body>
</html>
