<%-- 
    Document   : index
    Created on : Nov 3, 2017, 1:26:10 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/libs/jquery/jquery.js"></script>
        <title>Validación de Usuario Existente Vía jQuery AJAX</title>
    </head>
    <body>
        <h1>Validación de Usuario Existente Vía jQuery AJAX</h1>
        <input type="text" name="usuario" id="usuario" placeholder="Ingrese su nombre de usuario"/>
        <span id="respuesta"></span>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#usuario').keyup(function(){
                    $.ajax({
                        url:'ValidacionServlet',
                        dataType: 'html',
                        data:{
                            id: $('#usuario').val()
                        },
                        success: function (responseText){
                            if("existente"===responseText){
                                $('#respuesta').css('color','red');
                                $('#respuesta').html('Nombre de usuario en uso.');
                            } else {
                                $('#respuesta').css('color','green');
                                $('#respuesta').html('Usuario disponible.');
                            }
                        }
                    });
                });
            });
        </script>
    </body>
</html>
