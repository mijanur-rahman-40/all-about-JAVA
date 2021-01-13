
package javaswing.LayoutManager;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayout extends JFrame{
    Container c;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    GridLayout lay;
    Gridlayout(){
        c = this.getContentPane();
        c.setBackground(Color.yellow);
        
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         b6 = new JButton("6");
         b7 = new JButton("7");
         b8 = new JButton("8");
         b9 = new JButton("9");
         
         lay = new GridLayout();
         lay = new GridLayout(3,3);
         //lay = new GridLayout(4,4,10,10);
         lay.setHgap(10);
         lay.setVgap(10);
         c.setLayout(lay);
         
         c.add(b1); 
         c.add(b2);
         c.add(b3);
         c.add(b4);
         c.add(b5);
         c.add(b6);
         c.add(b7);
         c.add(b8);
         c.add(b9);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" GridLayout ");
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        Gridlayout pb = new Gridlayout();
    }
}
