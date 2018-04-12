/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.Singleton;
import javax.ejb.TimerService;

/**
 *
 * @author student
 */
@Singleton
public class MyService {
    
    private Semaphore sem = new Semaphore(10);
    
    @Resource
    private TimerService service;
    
    public void call() {
        try {
            sem.acquire();
            // apeleaza ceva care nu poate fi apelat mai de de 10 R simulatan
            System.out.println("Called");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
    }
    
    @Asynchronous
    public void myMethod() {
     
    }
}
