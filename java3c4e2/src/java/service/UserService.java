/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author student
 */
@ManagedBean
@RequestScoped
public class UserService {
    
    public void login(String username, String password) {
        System.out.println("Userul a fost logat cu " + username + " " + password);
    }
    
    public void register(String username, String password) {
        System.out.println("Userul a fost inregistrat cu " + username + " " + password);
    }
}
