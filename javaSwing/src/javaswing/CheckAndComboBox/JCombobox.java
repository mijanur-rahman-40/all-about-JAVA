
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JCombobox  extends JFrame{
    Container c;
    JComboBox combo;
    String [] language = {"C","C++","Java","Phyton","Hg","joi"};
    JCombobox (){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBounds(10, 10, 400, 600);
        c.setBackground(Color.pink);
        
        combo = new JComboBox(language);
        combo.setBounds(50,150,100,50);
        combo.setBackground(Color.green);
        c.add(combo);
        
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    public static void main(String[] args) {
        JCombobox ob = new JCombobox ();
    }
}
