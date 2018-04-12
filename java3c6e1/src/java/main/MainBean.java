/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import service.ProdusService;

/**
 *
 * @author student
 */
@Singleton
@Startup
public class MainBean {
    
    @EJB
    private ProdusService produsService;
    
    @PostConstruct
    public void init() {
        try {
            produsService.adaugaZeceProduse();
        } catch (Exception ex) {
            Logger.getLogger(MainBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
