<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
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

            function comienzo() {

                var XMLRequest = crearInstancia();
                
                XMLRequest.open("GET", "Ciudades.jsp?ciudad=" + document.getElementById("ciudadIngresada").value, false);
                
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
        Ingrese ciudad a buscar:	<input type="text" id="ciudadIngresada" />
                                        <input type="button" onclick="comienzo()" value="BUSCAR">
        <div id="texto" ></div>
    </body>
</html>