/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import model.Produs;

/**
 *
 * @author student
 */
@Named
@RequestScoped
public class ProdusDao {
    
    private Connection con;
    
    public void initConnection(Connection con) {
        this.con = con;
    }
    
    public void addProdus(String nume, double pret) {
        String sql = "INSERT INTO produse VALUES (NULL, ?, ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nume);
            stmt.setDouble(2, pret);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Produs> getProduse() {
        String sql = "SELECT * FROM produse";
        
        List<Produs> produse = new ArrayList<>();
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produs p = new Produs();
                p.setId(rs.getInt("id"));
                p.setNume(rs.getString("nume"));
                p.setPret(rs.getDouble("pret"));
                produse.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return produse;
    }
    
    public void stergeProdus(int id) {
        String sql = "DELETE FROM produse WHERE id = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
