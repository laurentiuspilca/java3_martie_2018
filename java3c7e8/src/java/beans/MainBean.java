/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
public class MainBean {
    
    @EJB
    private HelloBean helloBean;
    
    @PostConstruct
    public void init() {
        String hello = helloBean.sayHello("John");
        System.out.println(hello);
    }
}
