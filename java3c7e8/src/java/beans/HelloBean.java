/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import interceptors.InterceptAndLog;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author student
 */
@Stateless
@Interceptors(InterceptAndLog.class)
public class HelloBean {
    
    public String sayHello(String nume) {
        return "Hello, " + nume;
    }
}
