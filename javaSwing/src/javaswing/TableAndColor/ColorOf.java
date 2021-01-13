
package javaswing.TableAndColor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
    
public class ColorOf {
    JTextField Textfield;
    JButton button;
    JLabel label,label1;
    JPanel panel;
    JFrame frame;
    ColorOf(){
    
     label = new JLabel("Enter your name : ");
      label1 = new JLabel(" your name is : ");
     label.setForeground(Color.black); 
     
     Textfield = new JTextField(10);
     Textfield.setForeground(Color.red);
     button = new JButton("SUBMIT");
     button.setForeground(Color.green);
     button.addActionListener(new ButtonListener());
     panel = new JPanel();
     panel.add(label);
      panel.add(label1);
     panel.add(Textfield);
     panel.add(button);
     
     panel.setBackground(Color.red);
     JFrame ob = new JFrame("Title");
   ob.add(label,BorderLayout.WEST);
    ob.add(label1,BorderLayout.EAST);
   // ob.add(button,BorderLayout.WEST);
     ob.add(panel);
      ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Title");
        ob.setForeground(Color.darkGray);
        ob.setSize(600,500);
        ob.setLocation(300,200);
        ob.setVisible(true);
}
     class ButtonListener implements ActionListener{
         @Override
       public void actionPerformed(ActionEvent e){
          System.out.println( Textfield.getText());
          }
     }
}
class test1{
    public static void main(String[] args) {
        ColorOf ob = new ColorOf();
    }
}

