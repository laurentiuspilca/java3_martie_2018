/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Produs;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author student
 */
@Stateless
public class ProdusDao {
    
    @PersistenceContext
    private EntityManager em;
    
    @TransactionAttribute(TransactionAttributeType.NEVER)
    public void addProdus(Produs p) {
        em.persist(p);
    }
}
