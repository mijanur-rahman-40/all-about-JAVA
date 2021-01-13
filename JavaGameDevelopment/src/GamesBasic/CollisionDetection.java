package GamesBasic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.shape.Circle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
public class CollisionDetection extends JPanel implements ActionListener {

    rect rect1;
    rect rect2;
    Timer time;
    boolean collision = false;
    CollisionDetection() {
        setBackground(Color.green);
        rect1 = new rect(0, 75);
        rect2 = new rect(700, 75);
        time = new Timer(1, this);
        time.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rect1.move();
        rect2.move();
        collision();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
         //super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        //g2d.fillRect(rect1.x, rect1.y, 100, 50);
        g2d.fillOval(rect1.x, rect1.y, 100, 50);
        g2d.setColor(Color.black);
        g2d.fillRect(rect2.x, rect2.y, 150, 80);
        if(collision){
            g2d.drawString("Collisin",350,50);
            if(rect1.equals(rect2)){
                System.out.println("yes");
            }
        }
    }
    public void collision(){
        Rectangle rectangle1 = rect1.bounds();
        Rectangle rectangle2 = rect2.bounds();
        if(rectangle1.intersects(rectangle2)){
            collision = true;
        }
        else 
            collision = false;
    }
}

class rect {

    int x, y;
    boolean right = false;

    rect(int startx, int starty) {
        x = startx;
        y = starty;
    }

    void move() {
        if (x == 730) {
            right = true;
        }
        if (x == 0) {
            right = false;
        }
        if (right) {
            x--;
        } else {
            x++;
        }
    }
    public Rectangle bounds(){
        return (new Rectangle(x,y,100,50));
    }  
}

class main {

    public static void main(String[] args) {
        CollisionDetection ob1 = new CollisionDetection();
        JFrame ob = new JFrame();
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle(" CollisionDetection ");
        ob.setSize(850, 400);
        ob.setLocation(300, 200);
        ob.setVisible(true);
        ob.add(ob1);
    }
}


*/

public class CollisionDetection extends JPanel implements ActionListener {

    rect rect1;
    rect rect2;
    Timer time;
    Color b,c;
    boolean collision = false;
    CollisionDetection() {
        setBackground(Color.green);
        rect1 = new rect(0, 75);
        rect2 = new rect(700, 75);
        time = new Timer(1, this);
        time.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rect1.move();
        rect2.move();
        collision();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
         //super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red); b =  g2d.getColor();
        //g2d.fillRect(rect1.x, rect1.y, 100, 50);
        g2d.fillOval(rect1.x, rect1.y, 100, 50);
        g2d.setColor(Color.black);
        c = g2d.getColor();
        g2d.fillRect(rect2.x, rect2.y, 150, 80);
        if(collision){
            //g2d.drawString("Collisin",350,50);
            g2d.drawString("Collision",350,50);
           
        }
    }
    public void collision(){
        Rectangle rectangle1 = rect1.bounds();
        Rectangle rectangle2 = rect2.bounds();
        if(rectangle1.intersects(rectangle2)){
            collision = true;
        }
    }
}

class rect {

    int x, y;
    boolean right = false;
    boolean up = false;

    rect(int startx, int starty) {
        x = startx;
        y = starty;
    }

    void move() {
        if (x == 730) {
            right = true;
        }
        if (x == 0) {
            right = false;
        }
        if (right) {
            x--;
        } else {
            x++;
        }
       
    }
    public Rectangle bounds(){
        return (new Rectangle(x,y,100,50));
    }  
  
   
}

class main {

    public static void main(String[] args) {
        CollisionDetection ob1 = new CollisionDetection();
        JFrame ob = new JFrame();
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle(" CollisionDetection ");
        ob.setSize(850, 400);
        ob.setLocation(300, 200);
        ob.setVisible(true);
        ob.add(ob1);
    }
}
