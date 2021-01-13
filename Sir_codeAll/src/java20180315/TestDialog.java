/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180315;

import javax.swing.JOptionPane;

/**
 *
 * @author Teacher303LAB
 */
public class TestDialog {
    public static void main(String args[]){
        //JOptionPane.showMessageDialog(null, "Student inserted Successfully");
        //JOptionPane.showMessageDialog(null, "Text", "Title", JOptionPane.ERROR_MESSAGE);
        String name = JOptionPane.showInputDialog(null, "Enter Name:");
        
        System.out.println("##"+name);
    }
}
