
package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelMultiple extends JFrame{
    Container c;
    JLabel label1,label2;
    JTextField fl,f2;
    JLabelMultiple(){
        components();
    }
    public void components(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        label1 = new JLabel();
        label2 = new JLabel("Enter your password : ");
        fl = new JTextField();
        f2 = new JTextField();
        label1.setText("Enter your username : ");
        label1.setBounds(50,10,190,246);
        label2.setBounds(50,70,190,200);
        fl.setBounds(190,121,80,30);
        f2.setBounds(190,156,80,30);
        c.add(label1);
        c.add(label2);
        c.add(fl);
        c.add(f2);
    }
    public static void main(String[] args) {
        JLabelMultiple frame = new JLabelMultiple();
       frame.setVisible(true);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(50, 50, 330, 330);
       frame.setTitle("MultileLabel");
    }
}
