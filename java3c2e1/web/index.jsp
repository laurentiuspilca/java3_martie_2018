<%@page import="controllers.HelloController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Hello 
            <% 
                String nume = HelloController.getInstance().getName();
                out.println(nume); 
            %>
        </h1>
    </body>
</html>
