/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author student
 */
public class PersoanaDto implements Serializable {
    
    private int id;
    private String nume;

    public PersoanaDto() {
    }

    public PersoanaDto(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }
    
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
    
    
}
