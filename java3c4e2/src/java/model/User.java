/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import service.UserService;

/**
 *
 * @author student
 */
@ManagedBean
@RequestScoped
public class User {
    
    @ManagedProperty("#{userService}")
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

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void login() {
        userService.login(username, password);
    }
    
    public void register() {
        userService.register(username, password);
    }
}
