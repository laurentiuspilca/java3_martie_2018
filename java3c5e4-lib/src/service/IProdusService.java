/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ejb.Remote;

/**
 *
 * @author student
 */
@Remote
public interface IProdusService {
    public void adaugaProdus();
}
