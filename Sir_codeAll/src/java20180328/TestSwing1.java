/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180328;

import javax.swing.JFrame;

/**
 *
 * @author Teacher303LAB
 */
public class TestSwing1 extends JFrame {

    public TestSwing1() {
        //super("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Title");
        setSize(300, 200);
        setLocation(200, 200);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        TestSwing1 ob = new TestSwing1();
    }
    
    
}
