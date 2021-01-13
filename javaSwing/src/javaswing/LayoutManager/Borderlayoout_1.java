
package javaswing.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Borderlayoout_1 {

    JFrame frame;
    JPanel panel;
    JButton b1,b2,b3,b4,b5;
    
    Borderlayoout_1()
    {
       JFrame ob = new JFrame("Title");
     
        
        b1 = new JButton("North Button");
        b2 = new JButton("South Button");
        b3 = new JButton("East Button");
        b4 = new JButton("West Button");
        b5 = new JButton("Center Button");
        JPanel panel = new JPanel();
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        
       
        ob.add(b1, BorderLayout.NORTH);
        ob.add(b2, BorderLayout.SOUTH);
        ob.add(b3, BorderLayout.EAST);
        ob.add(b4, BorderLayout.WEST);
        ob.add(b5, BorderLayout.CENTER);
        
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Borderlayoutt");
        ob.setBackground(Color.green);
        ob.setSize(400,600);
        ob.setLocation(0,0);
        ob.setVisible(true);
        
    }
    public static void main(String[] args) {
       Borderlayoout_1 pb =  new Borderlayoout_1(); 
    }
}
