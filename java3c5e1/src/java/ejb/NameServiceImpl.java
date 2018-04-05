/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import ejb.contract.NameService;
import javax.ejb.Local;
import javax.ejb.Singleton;

/**
 *
 * @author student
 */
@Singleton
@Local(NameService.class)
public class NameServiceImpl implements NameService {
    
    @Override
    public String getName() {
        return "John";
    }
}
