
package javaswing.LayoutManager;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public  class GridLayoutt {
   JLabel label1,label2,label3,label4,label5,label6,label7,label8;
   JButton button1,button2,button3,button4;
    GridLayoutt(){
    label1 = new JLabel("Hellow 1");
    label2 = new JLabel("Hellow 2");
    button1 = new JButton("Hellow 3");
    label3 = new JLabel("Hellow 4");
    button2 = new JButton("Hellow 5");
    label4 = new JLabel("Hellow 6");
    button3 = new JButton("Hellow 7");
    label5 = new JLabel("Hellow 8");
    label6 = new JLabel("Hellow 9");
    label7 = new JLabel("Hellow 10");
    label8 = new JLabel("Hellow 11");
    button4 = new JButton("Hellow 12");
    JPanel panel = new JPanel();
    panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
   
     panel.add(label1);
     panel.add(label2);
     panel.add(label3);
     panel.add(label4);
     panel.add(label5);
     panel.add(label6);
     panel.add(label7);  
     panel.add(label8);
     panel.add(button1);
     panel.add(button2);
     panel.add(button3);
     panel.add(button4);
     panel.setLayout((LayoutManager) new GridLayout(5,4,5,10));
     JFrame frame = new JFrame("Grid Layout");
     frame.add(panel);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       
}
    }
class Test{
   public static void main(String[] args) {
       GridLayoutt ob = new GridLayoutt();
   }

}
