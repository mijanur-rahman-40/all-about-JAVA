/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180404;

/**
 *
 * @author Teacher303LAB
 */
public class TestFinally {
    static void method1(){
        try{
            System.out.println("Inside 1");
            throw new ArithmeticException();
        }
        finally{
            System.out.println("1's finally");
        }
    }
    
    static void method2(){
        try{
            System.out.println("Inside 2");
            return;
        }
        finally{
            System.out.println("2's finally");
        }
    }
    static void method3(){
        try{
            System.out.println("Inside 3");
        }
        finally{
            System.out.println("3's finally");
        }
    }
    
    public static void main(String args[]){
        try{
            method1();
        }
        catch(Exception e){
            System.out.println("Exception Caught: " + e);
        }
        method2();
        method3();
    }
    
}
