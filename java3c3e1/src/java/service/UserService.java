/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author student
 */
public class UserService {
    
    private Connection con;
    
    private UserService() {
        try {
            String url = "jdbc:mysql://localhost/java3curs3";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final UserService SINGLETON = new UserService();
    }
    
    public static UserService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public User login(String username, String password) {
        UserDao userDao = new UserDao(con);
        User user = userDao.findUser(username);
        
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        
        return null;
    }
}
