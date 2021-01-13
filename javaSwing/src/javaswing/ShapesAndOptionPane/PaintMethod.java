
package javaswing.ShapesAndOptionPane;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintMethod extends Canvas{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(10,10,80,50);
         g.setColor(Color.blue);
        g.drawRect(10, 70, 80,50);
        //g.fillOval(110, 70, 60, 60);
         g.drawOval(110, 70, 60, 60);
         g.drawLine(110, 70, 60, 60);
    }
    
       public static void main(String[] args) {
       JPanel panel = new JPanel();
       PaintMethod  ob = new PaintMethod ();
     
      JFrame frame=  new JFrame();
      frame.setTitle("PaintMethod");
      frame.setVisible(true);
      frame.setSize(400,400);
      frame.setLocation(300,300);  frame.setBackground(Color.blue);
      frame.add(panel);
      frame.add(ob);
      
       }
    }

