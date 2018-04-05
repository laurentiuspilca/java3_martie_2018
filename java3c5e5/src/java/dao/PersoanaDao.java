/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Persoana;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author student
 */
@Stateless
public class PersoanaDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public void adaugaPersoana(Persoana p) {
        em.persist(p);
    }
    
    public List<Persoana> findAll() {
        String sql = "SELECT p FROM Persoana p";
        TypedQuery<Persoana> q = em.createQuery(sql, Persoana.class);
        return q.getResultList();
    }
    
    public void delete(Persoana p) {
        em.remove(p);
    }
}
