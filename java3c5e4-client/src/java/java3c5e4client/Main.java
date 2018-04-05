/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3c5e4client;

import javax.ejb.EJB;
import service.IProdusService;

/**
 *
 * @author student
 */
public class Main {

    @EJB
    private static IProdusService produsService;

    public static void main(String[] args) {
        produsService.adaugaProdus();
    }
    
}
