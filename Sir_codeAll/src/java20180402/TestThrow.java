/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180402;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teacher303LAB
 */
public class TestThrow {
    static void show(int i) throws IllegalAccessException{
//        try{
        if(i==0)   
            throw new IllegalAccessException("Show Method");
        System.out.println("No Exception");
        //throw new ArithmeticException();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }
    
    public static void main(String args[]) {
        try {
            //try {
            show(2);
            //} catch (IllegalAccessException ex) {
            //    ex.printStackTrace();
            // }
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
            //Logger.getLogger(TestThrow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
