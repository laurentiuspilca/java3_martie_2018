/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationclient1;

import dto.Test;
import javax.ejb.EJB;
import services.PersoanaService;

/**
 *
 * @author student
 */
public class Main {

    @EJB
    private static services.IService service;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        service.sayHello("HELLO");
        service.test(new Test());
    }
    
}
