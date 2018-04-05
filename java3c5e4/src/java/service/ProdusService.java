/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import entities.Produs;
import javax.ejb.EJB;
import javax.ejb.Singleton;

/**
 *
 * @author student
 */
@Singleton
public class ProdusService implements IProdusService {
    
    @EJB
    private ProdusDao produsDao;
    
    @Override
    public void adaugaProdus() {
        Produs p = new Produs();
        p.setNume("Bere");
        p.setPret(10);
        produsDao.addProdus(p);
    }
}
