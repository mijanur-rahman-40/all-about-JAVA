/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180416;

/**
 *
 * @author Teacher303LAB
 */
public class MyClass3 extends Thread {
    String str;
    MyClass3(String str){
        this.str = str;
    }
    public void run(){
        Caller.call(str);
    }
}
