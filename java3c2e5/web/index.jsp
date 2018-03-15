<%-- 
    Document   : index
    Created on : Mar 15, 2018, 9:07:06 PM
    Author     : student
--%>

<%@page import="model.User"%>
<%@page import="service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (request.getParameter("logout") != null) {
                session.removeAttribute("login");
                response.sendRedirect("index.jsp");
            }
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String loginAction = request.getParameter("login");
            String registerAction = request.getParameter("register");
            
            if (loginAction != null) {
                if (username != null && password != null) {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    boolean res = UserService.getInstance().login(user);
                    if (res) {
                        session.setAttribute("login", "true");
                    }
                }
            }
            
            boolean registerResult = false;
            if (registerAction != null) {
                if (username != null && password != null) {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    registerResult = UserService.getInstance().register(user);
                }
            }
            Object login = session.getAttribute("login");
            
            if (login != null) {
        %>
            <jsp:include page="views/main.jsp" />
        <% } else { %>
            <jsp:include page="views/login.jsp" />
            
            <%
                if(registerAction != null && registerResult) {
                    out.println("<h2>Inregistrare reusita!</h2>");
                }
                
                if(registerAction != null && !registerResult) {
                    out.println("<h2>Usersul exista deja!</h2>");
                }
            %>
        <% } %>
    </body>
</html>
