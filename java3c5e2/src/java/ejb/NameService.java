/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class NameService {
    
    private String name; // nu avem voie sa folosim stare
    
    public void changeName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
