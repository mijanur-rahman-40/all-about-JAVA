
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckbox extends JFrame {
      JCheckBox check,mack,pack;
      Font fon;
    JCheckbox(){
       Container c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.green);
       fon = new Font("Arial",Font.BOLD,18);
        
        
       check = new JCheckBox("check");
       check.setBounds(50, 100, 90, 50);
       check.setBackground(Color.green);
       check.setForeground(Color.black);
       check.setFont(fon);
       c.add(check);
       
       mack = new JCheckBox("mack");
       mack.setBounds(50, 170, 90, 50);
       mack.setBackground(Color.green);
       mack.setForeground(Color.red);
       mack.setFont(fon);
       c.add(mack);
       
       pack = new JCheckBox("pack");
       pack.setBounds(50, 240, 90, 50);
       pack.setBackground(Color.green);
       pack.setForeground(Color.white);
       pack.setFont(fon);
       c.add(pack);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    public static void main(String[] args) {
        JCheckbox ob = new JCheckbox();
    }
}
