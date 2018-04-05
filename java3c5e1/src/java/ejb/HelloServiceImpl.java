/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import ejb.contract.NameService;

/**
 *
 * @author student
 */
@Singleton
@Startup
public class HelloServiceImpl {
    
    @EJB
    private NameService nameService;
    
    public HelloServiceImpl() {
        System.out.println("Constructor");
    }
    
    public void showHello() {
        System.out.println("Hello, " + nameService.getName() + "!");
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Initiated");
        showHello();
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Destroyed");
    }

}
