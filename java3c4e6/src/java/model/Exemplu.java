/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author student
 */
@Named
@RequestScoped
public class Exemplu {
    
    public String goToPage2() {
        // Flash.setAttribute("", "")
        
        FacesContext.getCurrentInstance()
                .getExternalContext()
                .getFlash()
                .put("myvalue", "valuetobesent");
        return "secondpage.xhtml";
    }
}
