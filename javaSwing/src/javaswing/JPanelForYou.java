package javaswing;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelForYou extends JFrame {
      Container c;
      JPanel panel1,panel2;
      Border border;
      JButton button1,button2;
      JLabel label;
    JPanelForYou() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        panel1 = new JPanel();
        panel1.setBounds(10,50,190,300);
        panel1.setBackground(Color.blue);
        
        panel2 = new JPanel();
        panel2.setBounds(240,50,200,300);
        panel2.setBackground(Color.black);
        
        button1 = new JButton("Click");
        button2 = new JButton("Display");
        panel1.add(button1);
        panel2.add(button2);
        
        label = new JLabel("Creating JPanel ");
        label.setBounds(50,10,200,50);
        c.add(label);
        
        c.add(panel1);
        c.add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JPanelForYou ");
        setBounds(100, 100, 500, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        JPanelForYou ob = new JPanelForYou();

    }
}
