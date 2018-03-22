/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Log;

/**
 *
 * @author student
 */
public class LogDao {
    
    private Connection con;
    
    public LogDao(Connection con) {
        this.con = con;
    }
    
    public void addLog(Log log) {
        String sql = "INSERT INTO logs VALUES (NULL, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, log.getMessage());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
