/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author student
 */
@Singleton
@Startup
public class HelloService {
    
    @EJB
    private NameService nameService;
    
    @PostConstruct
    public void init() {
        nameService.changeName("John");
        System.out.println("Hello, " + nameService.getName() + "!");
    }
}
