/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180312;

import javax.swing.JOptionPane;

public class NewClass {

    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null, "Text", "Title", JOptionPane.ERROR_MESSAGE);
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        System.out.println("Name:"+name);
    }

}