/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180416;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teacher303LAB
 */
public class Caller {
    synchronized static void call(String str){
        System.out.print("[" + str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.print("]");      
        
    }
}
