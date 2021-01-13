
package javagamedevelopment;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounchingBall  extends JPanel {
 
  // Box height and width
  int width;
  int height;
  int counter = 0;
  // Ball Size
  float radius = 25; 
  float diameter = radius * 2;
 
  // Center of Call
  float X = radius + 60;
  float Y = radius + 30;
 
  // Direction
  float dx = 3;
  float dy = 3;
 
  public BounchingBall() {
    MyThread thread = new MyThread();
     
    thread.start();
  }
  void onclicklistener(Event e)
  {
      
  }
  class MyThread extends Thread{
        MyThread() {
    }
  
    public void run() {
        while (true) {

          width = getWidth();
          height = getHeight();
          X += dx;
          Y += dy;
          counter++;
          int boundary = 30;
          if(X >= width - boundary) dx *= -1;
          if(Y >= height - boundary) dy *= -1;
          if(X <= boundary) dx *= -1;
          if(Y <= boundary) dy *= -1;
          repaint();
 
          try {
            Thread.sleep(10);
          } catch (InterruptedException ex) {
          }
 
        }
      }
}
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if(counter % 100 < 30) g.setColor(Color.BLUE);
    else if(counter % 100 < 60) g.setColor(Color.RED);
    else g.setColor(Color.GREEN);
    g.fillOval((int)(X-radius), (int)(Y-radius), (int)diameter, (int)diameter);
  }
 
  public static void main(String[] args) {
      
    JFrame frame = new JFrame("Bouncing Ball");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 300);
    frame.setContentPane(new BounchingBall());
    frame.setVisible(true);
  }
}

