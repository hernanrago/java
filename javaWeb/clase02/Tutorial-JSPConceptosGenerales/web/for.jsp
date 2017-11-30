<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
    <head><title>JSP Page</title></head>
    <body>

    <B>[Headers estaticos]</B><BR>
    <H1>Header</H1>
    <H2>Header</H3>
    <H3>Header</H3>
    <H4>Header</H4>
    <H5>Header</H5>
    
    <P><HR><P>
    
    <B>[Headers dinamico]</B><BR>
    <%
        for(int i = 1; i < 6; i++)
            out.println("<H" + i + ">Header</H" + i + ">");
    %>

    </body>
</html>
