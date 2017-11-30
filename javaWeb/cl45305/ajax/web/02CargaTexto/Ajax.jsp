<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Cargar Texto</title>
    </head>
    <body onload="cargarTexto();">
        <script type="text/javascript">
            function crearInstancia() {
                xmlhttp = null;
                if (window.XMLHttpRequest) {
                    xmlhttp = new XMLHttpRequest();
                } else {
                    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
                }
                return xmlhttp;

            }

            function cargarTexto() {
              
                var XMLRequest = crearInstancia();
                XMLRequest.open("GET", "Ejemplo2.xml", false);
                XMLRequest.onreadystatechange = cambiaEstado(XMLRequest);
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
        <div id="texto" ></div>
    </body>
</html>