
package javaswing.NormalButton;

import javaswing.*;
import javaswing.NormalButton.JButtonnnn;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonCursor extends JFrame{
    Container c;
    JButton button1,button2;
    Font fon ;
   Cursor curse;
  JButtonCursor() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        fon = new Font("Arial",Font.TRUETYPE_FONT,13);
        curse = new Cursor(Cursor.MOVE_CURSOR);
        
        button1 = new JButton();
        button2 = new JButton();
       // button1.setSize(100, 100);
        button1.setBounds(100,50,80,40);
        button1.setCursor(curse);
        button1.setText("Decko");
        button1.setFont(fon);
        button1.setForeground(Color.green);
        button1.setBackground(Color.blue);
        c.add(button1);
        
       
        button2.setBounds(150,100,80,40);
        button2.setText("Mecko");
        button2.setBackground(Color.yellow);
        button2.setFont(fon);
        button2.setForeground(Color.blue);
        c.add(button2);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JButton ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
       

    }
}

class ropo2 {

    public static void main(String[] args) {
        JButtonCursor ob = new JButtonCursor();
    }
}


