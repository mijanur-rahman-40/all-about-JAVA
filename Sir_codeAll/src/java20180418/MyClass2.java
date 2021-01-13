/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180418;

/**
 *  Implementing Runnable Interface
 * @author Teacher303LAB
 */
public class MyClass2 implements Runnable {
    public void run(){    
        try{
            for(int i=0; i<3; i++){
                System.out.println("i= "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
