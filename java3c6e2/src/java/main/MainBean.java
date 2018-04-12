/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author student
 */
@Singleton
public class MainBean {

    private int x;

    @Lock(LockType.WRITE)
    public void increment() {
        x++;
    }

    @Lock(LockType.READ)
    public int getX() {
        return x;
    }

}
