/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180402;

/**
 *
 * @author Teacher303LAB
 */
public class TestFinally {
    static void method1(){
        try{
            System.out.println("Inside 1");
            throw new RuntimeException();
        }
        finally{
            System.out.println("1's Finally");
        }
        
    }
    
    static void method2(){
        try{
            System.out.println("Inside 2");
            return;
        }
        finally{
            System.out.println("2's Finally");
        }
        
    }
    
    static void method3(){
        try{
            System.out.println("Inside 3");
            
        }
        finally{
            System.out.println("3's Finally");
        }
        
    }
    
    public static void main(String args[]){
        try{
            method1();
        }
        catch(Exception e){
            System.out.println("Exception caught.");
        }
        method2();
        method3();
    }
}
