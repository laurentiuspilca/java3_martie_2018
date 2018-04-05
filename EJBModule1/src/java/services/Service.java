/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dto.Test;
import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class Service implements IService {

    @Override
    public void sayHello(String test) {
        System.out.println(test);
    }

    @Override
    public void test(Test t) {
        System.out.println("Test " + t);
    }
    
}
