/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author student
 */
@Named
@ApplicationScoped
public class ConnectionManager {
    
    private Connection con;
    
    public ConnectionManager() {
        String url = "jdbc:mysql://localhost/java3curs4";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection () {
        return this.con;
    }
}
