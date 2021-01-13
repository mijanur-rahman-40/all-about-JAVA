
package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JSpinnerrSimple extends JFrame{
    Container c;
    JSpinner spiner;
    Font fon;
    JSpinnerrSimple(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        fon = new Font("Arial",Font.BOLD,17);
        
        SpinnerNumberModel  value = new SpinnerNumberModel(10,0,30,2);
        
        spiner = new JSpinner(value);
        spiner.setBounds(100,100,80,40);
        spiner.setBackground(Color.blue);
        spiner.setForeground(Color.yellow);
        spiner.setFont(fon);
        c.add(spiner);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JSpinnerr ");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        JSpinnerrSimple object = new JSpinnerrSimple();
    }
}
