<%-- 
    Document   : index
    Created on : Mar 15, 2018, 6:46:00 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Form!</h1>
        <form method="post">
            <p><input type="text" name="nume" /></p>
            <p><input type="submit" value="Salut" /></p>
        </form>
        <%
            String nume = request.getParameter("nume");
            if (nume != null) {
        %>
              <h2>Hello, <%= nume %></h2>
        <%  } %>
    </body>
</html>
