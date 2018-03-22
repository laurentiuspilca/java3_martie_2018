<h1>Login</h1>

<form method="post">
    <p>USERNAME: <input type="text" name="username" /></p>
    <p>PASSWORD: <input type="password" name="password" /></p>
    <p><input type="submit" name="login" value="Login" /></p>
</form>

<% 

    String login = request.getParameter("login");
    
    if (login != null) {
        out.println("<h2>Username sau parola gresite!</h2>");
    } 
%>