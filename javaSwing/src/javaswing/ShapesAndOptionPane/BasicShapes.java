
package javaswing.ShapesAndOptionPane;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicShapes extends JPanel{
    @Override
    public void paintComponent(Graphics gh){
        super.paintComponent(gh);
        gh.setColor(Color.blue);
        gh.drawRect(80, 40, 40, 60);
        gh.fillRect(79, 39, 39, 59);
        gh.clearRect(79, 39, 39, 59);
        gh.fillOval(150, 30, 60, 60);
        gh.setColor(Color.red);
        //gh.draw3DRect(80, 30, 40, 60, true);
        //gh.drawOval(15, 30, 60, 60);
        gh.drawLine(80, 30, 50, 100);
    }
    public static void main(String[] args) {
        BasicShapes ob= new BasicShapes();
        JFrame jf = new JFrame();
        jf.setTitle("BasicShapes");
        jf.setSize(400,300);
        jf.setLocation(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(ob);
    }
}


class DrawALine extends JFrame{
   
    DrawALine(){
       
       setTitle("drawline");
       setSize(400,400);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocation(300,300);
       
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(0, 150, 300, 150);
        g.setColor(Color.green);
        g.drawLine(0, 0, 300, 300);
        g.setColor(Color.BLUE);
        g.drawLine(100, 100, 170, 30);
    }

    public static void main(String[] args) {
        DrawALine ob = new DrawALine();
    }
}