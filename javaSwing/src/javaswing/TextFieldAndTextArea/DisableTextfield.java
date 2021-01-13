
package javaswing.TextFieldAndTextArea;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisableTextfield {
    JPanel panel;
    JFrame ob;
    JTextField field;
    JButton button;
    DisableTextfield(){
     JFrame ob = new JFrame();
     field = new JTextField(10);
     panel = new JPanel();
   
     field.setEditable(false);
     field.setBackground(Color.red);
       panel.add(field);
        ob.add(panel);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("DisaleTextField");
        ob.setSize(500,300);
        ob.setLocation(200,200);
        ob.setVisible(true);
        
       
    }
    public static void main(String[] args) {
        DisableTextfield ob= new DisableTextfield();
    }
}
