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
public class TestJava {
    public static void main(String arsg[]){
        try{
            throw new MyException("Custom Exception");
        }
        catch(Exception e){
            System.out.println("Exception caught#" + e);
        }
    }
}
