package javaswing.TextFieldAndTextArea;

import javaswing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
    import javax.swing.JTextField;

class JTextfield extends JFrame{

    JTextField text1;
    JButton button;
    JLabel label;
    JPanel panel;
    Container c;
    JTextfield() {

        c =  this.getContentPane();
        c.setLayout(null);
        text1 = new JTextField(10);
        text1.setBounds(50,50,200,50);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Title");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(text1);
        
           
    }

}

class test123 {
    public static void main(String[] args) {
        JTextfield ob = new JTextfield();
    }
}
