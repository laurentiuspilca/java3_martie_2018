<%-- 
    Document   : index
    Created on : Mar 15, 2018, 7:19:53 PM
    Author     : student
--%>

<%@page import="java.util.List"%>
<%@page import="service.ProdusService"%>
<%@page import="model.Produs"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Produse</h1>
        
        <form method="post">
            <p>NUME: <input type="text" name="nume" /></p>
            <p>PRET: <input type="text" name="pret" /></p>
            <p><input type="submit" value="Adauga" /></p>
        </form>
        
        <% 
            String nume = request.getParameter("nume");
            String pret = request.getParameter("pret");
            
            if (nume != null && pret != null) {
                Produs p = new Produs();
                p.setNume(nume);
                p.setPret(Double.parseDouble(pret));
                ProdusService.getInstance().adaugaProdus(p);
                out.println("<h2>Produs adaugat!</h2>");
            }
        %>
        <hr />
        
        <table>
            <tr>
                <td>ID</td>
                <td>NUME</td>
                <td>PRET</td>
            </tr>
            <%
                List<Produs> produse = ProdusService.getInstance().getProduse();
                for (Produs p : produse) {
            %>
                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getNume() %></td>
                    <td><%= p.getPret() %></td>
                </tr>
            <% } %>
        </table>
    </body>
</html>
