<%-- 
    Document   : index
    Created on : Oct 25, 2017, 1:49:58 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" 
        import="net.helvault.servlets.LoginServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/newcss.css" type="text/css">

        <title>index</title>
    </head>
    <body>
        <script type="text/javascript">
            var xmlhttp;
            if (window.XMLHttpRequest) {
                xmlhttp=new XMLHttpRequest();
                alert("Usa un navegador distinto a IE");
            }
            else {
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
                alert("Usa IE");
            }
            
            function () {
                var XMLRequest=crearInstancia();
                XMLRequest.open("POST","index.jsp"+document.getElementsByName("usuario"));
                XMLRequest.open("POST","index.jsp"+document.getElementsByName("contrasena"));
                XMLRequest.onreadystatechenge=cambiaEstado(XMLRequest);
            }
            
            function cambiaEstado(XMLRequest) {

                if (XMLRequest.readyState === 1) {
                    XMLRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                    XMLRequest.send(null);
                }

                if (XMLRequest.readyState === 4) {
                    document.getElementById("texto").innerHTML = XMLRequest.responseText;
                }
            }
        </script>
        
        <%

            String error="";
            HttpSession httpSession = request.getSession();
            if(httpSession.getAttribute("error")!=null)
            error=(String) httpSession.getAttribute("error");

            %>

        
        <h2>Ingrese su usuario y contraseña, por favor</h2>
        <form action="LoginServlet" method="post">
            <input type="text" name="usuario" placeholder="Nombre"/><br/>
            <input type="password" name="contrasena" placeholder="Contraseña"/><br/>
            Acepta términos y condiciones <input type="checkbox" name="ATC" value="acepta"/><br/>
            <input type="submit" value="Ingresar" onclick="comienzo"/>
        </form>
        <br/>
        
        <%= error %>
        
        
          
    </body>
</html>