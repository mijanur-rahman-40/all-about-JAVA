/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180412;


/**
 *
 * @author Teacher303LAB
 */
public class ThreadDemo {
     static public void main(String[] args){
         //System.out.println("Test");
         Thread t = Thread.currentThread();
         System.out.println("Current thread : " + t);
         t.setName("MyThread");
         System.out.println("Current thread : " + t);
         
         for(int i=0; i<5; i++){
             try {
                 System.out.println("i " + i);
                 Thread.sleep(1000);
             } catch (InterruptedException ex) {
                 
             }
         }
    }
}
