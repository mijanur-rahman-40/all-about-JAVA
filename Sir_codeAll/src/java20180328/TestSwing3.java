/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180328;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author Teacher303LAB
 */
public class TestSwing3 {
    JTextField textField;
    JLabel label;
    JButton button1;
    JButton button2;
    
    public TestSwing3() {
        //Create three components
        label = new JLabel("Enter your name:");
        textField = new JTextField(10);
        button1 = new JButton("Submit");
        button1.addActionListener(new ButtonListener());
        
        button2 = new JButton("Cancel");
        button2.addActionListener(new ButtonListener());
        
        
        //Create panel and add components to panel
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        
        
        JFrame ob = new JFrame("Title");
        //ob.getContentPane().add(panel);
        ob.add(panel);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setSize(300, 200);
        ob.setLocation(200, 200);
        ob.setVisible(true);
    }
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            //System.out.println("Name = "+textField.getText());
            if(e.getActionCommand().equalsIgnoreCase("submit")){
                System.out.println("Submit clicked");
            }
            else{
                System.out.println("Cancel clicked");
            }
            //System.out.println("Hello"+e.getActionCommand());
        }
    }    
    
    public static void main(String args[]){
        TestSwing3 t = new TestSwing3();
    }
    
}
