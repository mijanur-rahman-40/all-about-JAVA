/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180418;

/**
 *
 * @author Teacher303LAB
 */
public class ThreadDemo2 {
    public static void main(String args[]){
        MyClass2 a = new MyClass2();
        Thread t1 = new Thread(new MyClass2());
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
        
    }
}
