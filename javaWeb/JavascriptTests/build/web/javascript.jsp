<%-- 
    Document   : newjsp
    Created on : Nov 1, 2017, 12:33:03 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Javascript</title>
    </head>
    <body>
        <h1>AJAX</h1>
        
        <input type="text" size="20" id="idUsuario" name="id" onkeyup="validarUsuario()"/>
        
        <script type="text/javascript">
            var ajaxRequest;  // Esta variable nos permitirá utilizar Ajax
            function ajaxFunction(){
                try{
                  // Código para la mayoría de los browsers
                  ajaxRequest = new XMLHttpRequest();
                }catch (e){
                  // Código exclusivo para Internet Explorer
                  try{
                     ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
                  }catch (e) {
                     try{
                        ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
                     }catch (e){
                        // Algo falló!
                        alert("Error!");
                        return false;
                     }
                  }
                }
            }           
        </script>
        
        <script type="text/javascript">
            function validarUsuario() {
                ajaxFunction();
                // Acá indicamos cómo procesar la request una vez que ésta cambie de estado.
                ajaxRequest.onreadystatechange = processRequest;
                if (!target) target = document.getElementById("idUsuario");
                var url = "validate?id=" + escape(target.value);
                ajaxRequest.open("GET", url, true);
                ajaxRequest.send(null);
            }
            
            function processRequest(){
              if (xmlhttp.readyState==4 && xmlhttp.status==200){
                    document.getElementById("divRespuesta").innerHTML=ajaxRequest.responseText;
                }
            }
        </script>
</html>
