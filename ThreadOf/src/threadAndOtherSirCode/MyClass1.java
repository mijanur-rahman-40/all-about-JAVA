/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadAndOtherSirCode;

public class MyClass1 extends Thread{
    MyClass1(String name){
        //super(name);
        setName(name);
    }
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(this.getName() + ": i = " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}