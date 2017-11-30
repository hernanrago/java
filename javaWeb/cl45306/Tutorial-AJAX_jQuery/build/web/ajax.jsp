<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>AJAX</title>
        <script type="text/javascript" src="js/libs/jquery/jquery.js"></script>
    </head>
    <body>
        <span>Seleccione nombre de usuario: </span>
        <input type="text" size="20" id="idUsuario" name="user">
        <span id="spanRespuesta"></span>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#idUsuario').keyup(function () {

                    $.ajax({
                        url: 'ValidadorDeUsuarios',
                        dataType: 'html',
                        data: {
                            id: $('#idUsuario').val()
                        },
                        success: function (responseText) {
                            if("true"===responseText){
                                $('#spanRespuesta').css('color','red');
                                $('#spanRespuesta').html("Ese usuario ya existe.");
                            } else{
                                $('#spanRespuesta').css('color','green');
                                $('#spanRespuesta').html("Nombre de usuario disponible.");
                            }
                           
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            alert(textStatus+errorThrown);
                    }
                    });
                });
            });



        </script>

    </body>
</html>