<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%-- Comienzo Header de educacionIT --%>
        <div align="right">
            <font color="blue"><I><h2>www.educacionIT.com.ar</h2></I></font><hr>
        </div>
        <%-- Fin Header de educacionIT --%>
        
        <h1>Formulario de inscripción</h1>
        <hr><P>
        <form action="ProcesadorDeDatos" method="POST" >
            Nombre: <input type="text" name="txtNombre" value="" width="50" />
            <br><br>
            Apellido: <input type="text" name="txtApellido" value="" width="50" />
            <br><br>
            Dirección: <input type="text" name="txtDireccion" value="" width="50" />
            <br><br>
            Sexo: Masculino <input type="radio" name="radSexo" value="masculino" /> Femenino <input type="radio" name="radSexo" value="femenino" />
            <br><br>
            Puesto de trabajo:
            <SELECT NAME="cmbPuestoDeTrabajo">
                <OPTION VALUE="empty"></OPTION>                
                <OPTION VALUE="Programador">Programador</OPTION>
                <OPTION VALUE="Disenador">Diseñador</OPTION>
                <OPTION VALUE="Analista Funcional">Analista Funcional</OPTION>
                <OPTION VALUE="Lider de Proyecto">Líder de Proyecto</OPTION>
            </SELECT>
            <br><br>
            Tiene experiencia <input type="checkbox" name="chkExperiencia" value="si"/>
            <p>
            <hr>
            <p>            
            <input type="submit" value="Registrarme!">
        </form>
    
    </body>
</html>
