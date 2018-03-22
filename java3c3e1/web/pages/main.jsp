<%@page import="model.User"%>


<h1>Hello, Welcome, <%= ((User)session.getAttribute("login")).getUsername() %>!</h1>

<a href="index.jsp?logout=1">LOGOUT</a>