/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet(name = "ReverseStringServlet", urlPatterns = {"/ReverseStringServlet"})
public class ReverseStringServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getParameter("str");
        if (str != null) {
            String reversed = new StringBuffer(str).reverse().toString();
            try (PrintWriter out = resp.getWriter()) {
                out.print(reversed);
                resp.setStatus(HttpServletResponse.SC_ACCEPTED);
            }
        } else {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }
    
    
}
