/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusService {
    
    private Connection con;
    
    private ProdusService() {
        String url = "jdbc:mysql://localhost/java3curs2";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaProdus(Produs p) {
        try {
            ProdusDao produsDao = new ProdusDao(con);
            produsDao.adaugaProdus(p);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Produs> getProduse() {
        try {
            ProdusDao produsDao = new ProdusDao(con);
            return produsDao.getProduse();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return Collections.emptyList();
    }
}
