
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class JRadioButtonGroup extends JFrame{
    JRadioButton male,female;
    Container c;
    ButtonGroup grop;
    Font fon;
   JRadioButtonGroup(){ 
        
     c =  this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.green);
     
       
     fon = new Font("Arial",Font.BOLD,17);
           
     female = new JRadioButton("Female"); 
     male = new JRadioButton("Male");
      
      
     male.setBounds(50,100,100,50);
     male.setForeground(Color.red);
     male.setBackground(Color.blue);
     
     female.setBackground(Color.pink);
     female.setForeground(Color.black);
     female.setBounds(160,100,100,50);
   
     male.setFont(fon);
     female.setFont(fon);
     
     grop = new ButtonGroup();
     grop.add(male);
     grop.add(female);
     
     
        c.add(male);
        c.add(female);
        
        
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,50,400,400); 
       setTitle("JRadioButton");
       setVisible(true);
    }
    public static void main(String[] args) {
        JRadioButtonGroup ob = new JRadioButtonGroup();
    }   
}

 

