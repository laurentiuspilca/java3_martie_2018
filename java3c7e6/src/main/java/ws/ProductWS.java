/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.Produs;

/**
 *
 * @author student
 */
@Named
@RequestScoped
@Path("/")
public class ProductWS {
    
    @GET
    @Path("/test")
    public String test() {
        return "Bau!";
    }
    
    @GET
    @Path("/produs")
    public Produs produs() {
        return new Produs();
    }
}
