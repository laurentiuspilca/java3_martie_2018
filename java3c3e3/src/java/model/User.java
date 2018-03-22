/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import service.UserService;

/**
 *
 * @author student
 */
@Named
public class User implements Serializable {
    
    @Inject
    private UserService userService;
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void login() {
        //System.out.println("Logged in with " + username + " AND " + password);
        userService.login(username, password);
    }

}
