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
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusDao {
    
    private Connection con;
    
    public ProdusDao(Connection con) {
        this.con = con;
    }
    
    public void adaugaProdus(Produs p) throws SQLException {
        String sql = "INSERT INTO produse VALUES (NULL,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, p.getNume());
            stmt.setDouble(2, p.getPret());
            stmt.executeUpdate();
        }
    }
    
    public List<Produs> getProduse() throws SQLException {
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
        }
        
        return produse;
    }
}
