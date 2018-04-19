/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interceptors;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author student
 */
@Interceptor
public class InterceptAndLog {
    
    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        System.out.println("Aici a fost invocata metoda!");
        System.out.println(context.getMethod());
        for (Object p : context.getParameters()) {
            System.out.println("PARAM: " + p);
        }
        //Object result = context.proceed();
        System.out.println("Aici s-a terminat metoda");
        return "BAU";
    }
}
