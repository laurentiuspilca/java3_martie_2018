/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author student
 */
@ApplicationException(rollback = true, inherited = false)
public class MyException extends Exception {
    
}
