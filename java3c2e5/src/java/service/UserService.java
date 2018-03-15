/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import java.sql.Connection;
import java.sql.DriverManager;
import model.User;

/**
 *
 * @author student
 */
public class UserService {
    private Connection con;
    
    private UserService() {
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
        private static final UserService SINGLETON = new UserService();
    }
    
    public static UserService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public boolean register (User user) {
        try {
            UserDao userDao = new UserDao(con);
            
            User dbUser = userDao.getUser(user.getUsername());
            
            if (dbUser == null) {
                userDao.addUser(user);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean login(User user) {
        try {
            UserDao userDao = new UserDao(con);
            User dbUser = userDao.getUser(user.getUsername());
            if (dbUser != null) {
                if (user.getPassword().equals(dbUser.getPassword())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
