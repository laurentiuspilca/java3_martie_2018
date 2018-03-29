/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import service.ProdusService;

/**
 *
 * @author student
 */
@Named
@RequestScoped
public class Produs {
    
    @Inject
    private ProdusService produsService;
    
    private int id;
    private String nume;
    private double pret;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    
    public String getMesaj() {
        return "A fost adaugat produsul " + nume;
    }

    public void addProdus() {
        produsService.addProdus(nume, pret);
    }
    
    public List<Produs> getProduse() {
        return produsService.getProduse();
    }
    
    public void stergeProdus(Produs p) {
        produsService.stergeProdus(p.id);
    }
}

