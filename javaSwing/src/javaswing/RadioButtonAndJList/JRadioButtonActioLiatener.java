
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class JRadioButtonActioLiatener extends JFrame{
    JTextArea area;
     Font fon;
    JRadioButton female,male;
    ButtonGroup grop;
    JRadioButtonActioLiatener(){
        Container c = this.getContentPane();
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
     
     area = new JTextArea();
     area.setBounds(100,160,200,200);
     area.setBackground(Color.black);
     area.setForeground(Color.yellow);
     area.setFont(fon);
     
     
        c.add(male);
        c.add(female);

        c.add(area);
        
        male.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(null);
                   area.setText("You have selected male");
               } 
            
            
        });
        
         female.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(null);
                   area.setText("You have selected female");
               } 
            
            
        });
        
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,90,400,600); 
       setTitle("JRadioButton");
       setVisible(true);
    }
    public static void main(String[] args) {
        JRadioButtonActioLiatener ob = new JRadioButtonActioLiatener();
    }   
}

