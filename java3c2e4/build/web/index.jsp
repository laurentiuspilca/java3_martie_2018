<%-- 
    Document   : index
    Created on : Mar 15, 2018, 8:18:59 PM
    Author     : student
--%>
<%!
    int x = 0;
%>


<%
    int y = 0;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            x++;
            y++;
        %>
        <h1>X: <%= x %></h1>
        <h1>Y: <%= y %></h1>
    </body>
</html>
