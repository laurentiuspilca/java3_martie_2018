/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author student
 */
@Named
public class UserService implements Serializable {
    
    public void login(String username, String password) {
        System.out.println("Logged in with " + username + " AND " + password);
    }
}
