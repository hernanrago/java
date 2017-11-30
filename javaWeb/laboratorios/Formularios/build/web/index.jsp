<%-- 
    Document   : index
    Created on : Oct 25, 2017, 9:12:46 AM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
        <link rel="stylesheet" href="css/newcss.css" type="text/css">
    </head>
    <body>
        <h1>Formulario de inscripción</h1>
        <hr/>
        <form action="ProcesadorDatos" method="post">
            Nombre <input type="text" name="nombre"/> <br/>
            Apellido <input type="text" name="apellido"/> <br/>
            Domicilio <input type="text" name="domicilio"/> <br/>
            Sexo Masculino <input type="radio" name="sexo" value="masculino"/> 
            Femenino <input type="radio" name="sexo" value="femenino"/> <br/>
            Puesto de trabajo <select name="puesto">
                <option disabled="" selected="">Seleccione su puesto</option>
                <option value="Programador">Programador</option>
                <option value="Diseñador">Diseñador</option>
                <option value="Analista Funcional">Analista Funcional</option>
                <option value="Lider de Proyecto">Líder de Proyecto</option>
            </select> <br/>
            Tiene experiencia <input type="checkbox" name="experiencia" value="si"/>
            <hr/>
            <input type="submit" value="Registrarme"/>
        </form>
    </body>
</html>
