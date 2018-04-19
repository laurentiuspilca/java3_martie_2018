/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import services.ProductService;

/**
 *
 * @author student
 */
@WebService
@Stateless
public class ProdusWS {
    
    @EJB
    private ProductService productService;
    
    @WebMethod(operationName = "test")
    public String test() {
        return "Bau!";
    }
    
    @Oneway
    @WebMethod(operationName = "doSometingWithProducts")
    public void doSometingWithProducts() {
        productService.doSomethingWithProducts();
    }
}
