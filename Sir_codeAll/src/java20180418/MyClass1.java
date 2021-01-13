/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180418;

/**
 *  Extending a Thread Class
 * @author Teacher303LAB
 */
public class MyClass1 extends Thread {
    MyClass1(String name ){
        super(name);
    }
    public void run(){
    
        try{
            for(int i=0; i<5; i++){
                System.out.println(this.getName()+ " i= "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
