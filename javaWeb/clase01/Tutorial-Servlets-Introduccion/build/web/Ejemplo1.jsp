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

    <h1>index.jsp</h1><hr>

<P>
<LI><I> Para llamar al método GET: </I><BR>
<a href="HolaServlet">Click aquí!</a>
<P>
<LI><I> Para llamar al método POST: </I><BR>
<FORM ACTION="HolaServlet" METHOD="POST">
    <input type="submit" value="Click aquí!">
</FORM>
    
    </body>
</html>
