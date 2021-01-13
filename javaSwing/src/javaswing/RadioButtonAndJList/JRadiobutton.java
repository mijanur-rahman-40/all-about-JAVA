
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadiobutton extends JFrame{
    JRadioButton male,female;
    Container c;
    JRadiobutton(){ 
        
       c =  this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.green);
     
           
     female = new JRadioButton("Female"); 
      male = new JRadioButton("Male");
      
      
     male.setBounds(50,100,100,50);
     male.setForeground(Color.red);
     male.setBackground(Color.blue);
     female.setBackground(Color.red);
     female.setForeground(Color.white);
     female.setBounds(160,100,100,50);
     
        c.add(male);
        c.add(female);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,50,400,400); 
       setTitle("JRadioButton");
       setVisible(true);
    }
    public static void main(String[] args) {
        JRadiobutton ob = new JRadiobutton();
    }   
}
