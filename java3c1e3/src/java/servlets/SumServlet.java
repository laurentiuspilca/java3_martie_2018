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
@WebServlet(name = "SumServlet", urlPatterns = {"/SumServlet"})
public class SumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getHeader("x");
        String y = req.getHeader("y");
        
        if (x != null && y != null) {
            try {
                int a = Integer.parseInt(x);
                int b = Integer.parseInt(y);
                try (PrintWriter out = resp.getWriter()) {
                    out.print(a+b);
                }
            } catch (NumberFormatException e) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }
        } else {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    
}
