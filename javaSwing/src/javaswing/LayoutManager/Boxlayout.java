
package javaswing.LayoutManager;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boxlayout extends JFrame{
    Container c;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    BoxLayout box;
    Boxlayout(){
        c = this.getContentPane();
        c.setBackground(Color.yellow);
        
        
        //BoxLayout(Container c,int Axis);
        box = new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(box);
       
         b1 = new JButton("1");
         b1.setBackground(Color.red);
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         b6 = new JButton("6");
         
         c.add(b1);
         //if you want gaph after b1 button
         //c.add(Box.createHorizontalStrut(10));
         c.add(b2);
        // c.add(Box.createHorizontalStrut(30));
        c.add(Box.createVerticalStrut(30));
         c.add(b3);
         c.add(b4);
         c.add(b5);
         c.add(b6);
           
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Boxlayout ");
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        Boxlayout ob = new Boxlayout();
    }
    
}
