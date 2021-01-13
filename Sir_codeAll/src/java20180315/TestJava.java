/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180315;

import java.util.Scanner;

/**
 *
 * @author Teacher303LAB
 */
public class TestJava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter RegNo:");
        int reg = sc.nextInt();
        
        System.out.println("##" + name+" "+ reg);
    }
    
    
}
