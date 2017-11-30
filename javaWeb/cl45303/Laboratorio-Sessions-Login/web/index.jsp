<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>educacionIT :: Proyecto-Sessions</title>
    </head>
    <body>

    <div align="right"><h1>Proyecto-Sessions-Login :: Login</h1></div>
    <hr>
    <div align=center>
    <form method="POST" action="LoginServlet">
        <input type="hidden" name=accion value=login>
        username: <input type="text" name=username>
        <br><br>
        password: <input type="password" name=password>
        <br>
        Acepta términos y condiciones <input type="checkbox" name="tercon" value="acepta"/>
        <hr>
        <input type=submit value=Login><br>
        <font color="red">
        
        <% if(session.getAttribute("error") != null){
          out.print(session.getAttribute("error"));
        }%>
        </font>
    </form>
    </div>
    </body>
</html>
