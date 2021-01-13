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
public class TestDemo {
    public static void main(String args[]){
        try{
            throw new MyException("Demo");
        }
        catch(Exception e){
            System.out.println("Caught #" + e);
        }
    }
}
