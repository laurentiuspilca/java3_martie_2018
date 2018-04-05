/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dto.PersoanaDto;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author student
 */
@Remote
public interface PersoanaService {
    public void adaugaPersoana(PersoanaDto p);
    public List<PersoanaDto> findPersoane();
}
