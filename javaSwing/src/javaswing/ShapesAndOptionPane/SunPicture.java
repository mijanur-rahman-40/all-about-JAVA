
package javaswing.ShapesAndOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SunPicture extends JPanel{
    public void paintComponent(Graphics gh){
        super.paintComponent(gh);
     gh.setColor(Color.yellow);
     
     gh.fillOval(110, 100, 200, 200);
     gh.setColor(Color.blue);
     gh.drawLine(210, 10, 210, 100);
     gh.drawLine(210, 300, 210, 400);
     gh.drawLine(10, 200, 110, 200);
     gh.drawLine(310, 200, 420, 200);
     gh.drawLine(55, 75, 135, 135);
     gh.drawLine(285, 265, 370, 330); 
     gh.drawLine(285, 135, 375, 60);
     gh.drawLine(35, 330, 130, 260);
             
    }
    public static void main(String[] args) {
       SunPicture ob= new SunPicture();
        JFrame jf = new JFrame();
        jf.setTitle("BasicShapes");
        jf.setSize(450,450);
        jf.setLocation(300,100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ob);
    }
}


