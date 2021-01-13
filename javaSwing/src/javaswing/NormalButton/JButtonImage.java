
package javaswing.NormalButton;

import javaswing.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonImage extends JFrame{
    Container c;
    JButton button1,button2;
    ImageIcon icon1,icon2;
    JButtonImage() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        icon1 = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
        icon2 = new ImageIcon("F:\\Java Programming Code\\Picture/Running_48px.png");
        
        
        button1 = new JButton(icon1);
        button2 = new JButton(icon2);
        
        button1.setBounds(100,50,80,60);
        c.add(button1);
        
       
        button2.setBounds(200,50,80,60);
        c.add(button2);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JButton ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
       

    }
}

class ropo12 {

    public static void main(String[] args) {
        JButtonImage ob = new JButtonImage();
    }
}

