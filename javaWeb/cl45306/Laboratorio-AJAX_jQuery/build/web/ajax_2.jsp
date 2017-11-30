<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Tutorial AJAX</title>
        <script type="text/javascript" src="js/libs/jquery/jquery.js"></script>
    </head>
    <body>
        <span>Ingrese nombre y apellido: </span>
        <input type="text" size="20" id="nombre" name="nombre"/>
        <input type="text" size="20" id="apellido" name="apellido"/>
        <input type="button"  id="boton" name="boton" value="Enviar"/>
        <div id="spanRespuesta"></div>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#nombre').keyup (function () {

                    $.ajax({
                        url: 'MiServlet2',
                        dataType: 'html',
                        data: {
                            nombre: $('#nombre').val(), apellido: $('#apellido').val()
                        },
                        success: function (responseText) {
                            $('#spanRespuesta').html(responseText);
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            alert(textStatus + errorThrown);
                        }
                    });
                });
            });



        </script>

    </body>
</html>