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
@WebServlet(name = "PageServlet", urlPatterns = {"/PageServlet"})
public class PageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        if (username != null && password != null) {
            if (username.equals("gigel") && password.equals("12345")) {
                resp.setStatus(HttpServletResponse.SC_ACCEPTED);
                try (PrintWriter out = resp.getWriter()) {
                    out.print("HELLO");
                }
            } else {
                resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            }
        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

   
}
