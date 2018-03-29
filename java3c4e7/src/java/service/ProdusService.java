/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProdusDao;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import managers.ConnectionManager;
import model.Produs;

/**
 *
 * @author student
 */
@Named
@RequestScoped
public class ProdusService {
    
    @Inject
    private ConnectionManager connectionManager;
    
    @Inject
    private ProdusDao produsDao;
    
    @PostConstruct
    public void init() {
        produsDao.initConnection(connectionManager.getConnection());
    }
    
    public void addProdus(String nume, double pret) {
        produsDao.addProdus(nume, pret);
    }
    
    public List<Produs> getProduse() {
        return produsDao.getProduse();
    }
    
    public void stergeProdus(int id) {
        produsDao.stergeProdus(id);
    }
}
