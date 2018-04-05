/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateful;

/**
 *
 * @author student
 */
@Stateful
public class NameService {
    
    private String name; // putem avea stare
    
    public void changeName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
