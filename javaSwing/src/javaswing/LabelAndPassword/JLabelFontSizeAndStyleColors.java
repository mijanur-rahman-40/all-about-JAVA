
package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelFontSizeAndStyleColors extends JFrame{
     Container c;
    JLabel label1,label2;
    JTextField fl,f2;
    Font fn;
    JLabelFontSizeAndStyleColors(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
          fn = new Font("Arial",Font.BOLD,14);
          
        label1 = new JLabel("Enter your password : ");
        label1.setBounds(50,20,190,50);
        label1.setFont(fn);
        label1.setForeground(Color.blue);
        label1.setOpaque(true);
        label1.setBackground(Color.red);
     
       c.add(label1);
    }
    public static void main(String[] args) {
        JLabelFontSizeAndStyleColors fr = new JLabelFontSizeAndStyleColors();
        fr.setVisible(true);
       
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setBounds(50, 50, 330, 330);
       fr.setTitle("JLabelFontSizeAndStyle");
    }
}
