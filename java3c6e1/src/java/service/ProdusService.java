/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import entities.Produs;
import exceptions.MyException;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author student
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ProdusService {
    
    @EJB
    private ProdusDao produsDao;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void adaugaZeceProduse() throws Exception {
        for (int i=1; i<=10; i++) {
            Produs p = new Produs();
            p.setNume("Produs " + i);
            p.setPret(i * 10);
            produsDao.addProdus(p);
            if (i == 5) throw new RuntimeException();
        }
    }
}
