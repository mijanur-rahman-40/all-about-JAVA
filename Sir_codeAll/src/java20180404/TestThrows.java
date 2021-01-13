/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180404;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teacher303LAB
 */
public class TestThrows {
    static void show(int a) throws IllegalAccessException{
        if(a == 0)
            throw new IllegalAccessException();
    }
    
    static void showMe() throws IllegalAccessException  {
        show(1);
    }
    
    public static void main(String args[]){
        try {
            showMe();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TestThrows.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
