/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.PersoanaDao;
import dto.PersoanaDto;
import entities.Persoana;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class PersoanaServiceImpl implements PersoanaService {
   
    @EJB
    private PersoanaDao persoanaDao;

    @Override
    public void adaugaPersoana(PersoanaDto p) {
        Persoana pers = new Persoana();
        pers.setNume(p.getNume());
        persoanaDao.adaugaPersoana(pers);
    }

    @Override
    public List<PersoanaDto> findPersoane() {
        return persoanaDao.findAll()
                .stream()
                .map(p -> new PersoanaDto(p.getId(), p.getNume()))
                .collect(Collectors.toList());
    }
    
    
}
