/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180313;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Teacher303LAB
 */
public class TestSwing1 extends JFrame{

    public TestSwing1() {
        //super();
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocation(300, 300);
        setVisible(true);
    }
    
    public static void main(String args[]){
        //System.out.println("Test");
        TestSwing1 t = new TestSwing1();
        
    }
    
}
