
package javaswing.ShapesAndOptionPane;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

class Shape extends JPanel{
    public Shape(){
       JFrame window = new JFrame("Shaping");
       window.setSize(440,440);
       window.setVisible(true);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g){ 
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.drawOval(220, 220, 120, 120);
       
    }
}
class hi{
    public static void main(String[] args) {
        Shape ob = new Shape();
    }

}