/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dto.Test;
import javax.ejb.Remote;

/**
 *
 * @author student
 */
@Remote
public interface IService {
    public void sayHello(String test);
    public void test(Test t);
}
