/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class MyTimer {

    @Schedule(dayOfWeek = "Mon-Fri", month = "*", hour = "9-22", dayOfMonth = "*", year = "*", minute = "*", second = "*")
    public void myTimer() {
        System.out.println("Timer event: " + new Date());
    }
}
