/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.LogDao;
import java.sql.Connection;
import java.sql.DriverManager;
import model.Log;

/**
 *
 * @author student
 */
public class LogService {

    private Connection con;

    private LogService() {
        try {
            String url = "jdbc:mysql://localhost/java3curs3";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class SingletonHolder {

        private static final LogService SINGLETON = new LogService();
    }

    public static LogService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void log (String message) {
        Log log = new Log();
        log.setMessage(message);
        LogDao logDao = new LogDao(con);
        logDao.addLog(log);
    }
}
