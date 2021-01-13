/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180215.Box;

/**
 *
 * @author Teacher303LAB
 */
public class UseStatic {
    static int a = 3;
    static int b = a*3;
    
    //non-static variable
    int height;
    
    static {
        //b = a * 3;
        System.out.println("Static Block");
    }
    
    static int sum(int x, int y){
        //height =10;
        return x + y;
    }
    
    public static void main(String args[]){
        
        System.out.println("b = "+ b);
        
    }
}
