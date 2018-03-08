/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet(name = "ParamsServlet", urlPatterns = {"/ParamsServlet"})
public class ParamsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramX = req.getParameter("x");
        System.out.println("X: " + paramX);
        
        String paramY = req.getHeader("y");
        System.out.println("Y: " + paramY);
    }

    
}
