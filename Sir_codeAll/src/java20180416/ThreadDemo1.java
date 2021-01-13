/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180416;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teacher303LAB
 */
public class ThreadDemo1 {
    public static void main(String args[]){
        Thread t1 = new MyClass1("T1");
        //Thread t2 = new MyClass1("T2");
        Thread t2 = new Thread(new MyClass2(), "T2");
        
        t1.start();
        t2.start();
        
        System.out.println("##1 " + t1.isAlive());
        System.out.println("##2 " + t2.isAlive());
        
        System.out.println("##3 " + t1.isAlive());
        System.out.println("##4 " + t2.isAlive());
        
        try {
            t2.join();
            //Thread.sleep(7000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       
        System.out.println("##5 " + t1.isAlive());
         System.out.println("##6 " + t2.isAlive());
        
    }   
    
}
