<%-- 
    Document   : index
    Created on : Mar 22, 2018, 6:20:36 PM
    Author     : student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>
<%@page import="service.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String login = request.getParameter("login");
    if (login != null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = UserService.getInstance().login(username, password);
        
        if (user != null) session.setAttribute("login", user);
    }
    
    String logout = request.getParameter("logout");
    if (logout != null) {
        session.setAttribute("login", null);
        response.sendRedirect("index.jsp");
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${sessionScope['login'] ne null}">
                <jsp:include page="pages/main.jsp" />
            </c:when>
            <c:otherwise>
                <jsp:include page="pages/login.jsp" />
            </c:otherwise>
        </c:choose>
    </body>
</html>
