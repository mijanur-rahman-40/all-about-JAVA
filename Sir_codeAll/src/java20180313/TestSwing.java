/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180313;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Composition
 * @author Teacher303LAB
 */
public class TestSwing {

    public TestSwing() {
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");
        button.addActionListener(new ButtonListener());
        
        JButton button1 = new JButton("Submit1");
        button1.addActionListener(new ButtonListener());
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(button1);
                
        JFrame frame = new JFrame();
        //frame.add(panel);
        frame.getContentPane().add(panel);
        
        frame.setTitle("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocation(300, 300);
        frame.setVisible(true);
    }
    
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /*public void actionPerformed(ActionEvent e) {
            //System.out.println("Hello World." + e.getActionCommand());
            if(e.getActionCommand().equalsIgnoreCase("submit")){
                System.out.println("Button 1 Pressed");
                
            }
            else{
                System.out.println("Button 2 Pressed");
            }
            
        }*/
        
    }
    
    public static void main(String args[]){
        //System.out.println("Test");
        TestSwing t = new TestSwing();
        
    }
    
}
