/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import service.MyService;

/**
 *
 * @author student
 */
@Singleton
public class MainBean {
    
    @EJB
    private MyService myService;
    
    public void service1() {
        // some logic here
        myService.call();
        // some other logic here
    }
    
    public void service2() {
        // some logic here
        myService.call();
        // some other logic here
    }
    
    public void service3() {
        // some logic here
        myService.call();
        // some other logic here
    }
    
}
