
package javagamedevelopment;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class IntroductionThreads extends JFrame implements Runnable{
     int x, y,Xdirection,Ydirection;
    Container c;
    Font fon = new Font("Arial", Font.ITALIC, 34);
    Image dbimage,man;
    Graphics dbg;

    public void move(){
        x = x + Xdirection;
        y = y + Ydirection;
        if(x<=0){
            x = 0;
        }
        if(x>=350){
            x = 350;
        }
        if(y<=10){
            y = 10;
        }
        if(y>=350){
            y = 350;
        }
    }
    public void setXDirection(int xdir){
        Xdirection = xdir;
    }
    public void setYDirection(int ydir){
        Ydirection = ydir;
    }

    @Override
    public void run() {
        try{
           while(true){
            move();  
            Thread.sleep(5);
           } 
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    public class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == e.VK_LEFT) {
               setXDirection(-1);
            }
            if (e.getKeyCode() == e.VK_RIGHT) {
               setXDirection(+1);
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
               setYDirection(-1);
            }
            if (e.getKeyCode() == e.VK_DOWN) {
               setYDirection(+1);
            }
        }
        public void keyRelesed(KeyEvent e) {
            if (e.getKeyCode() == e.VK_LEFT) {
               setXDirection(0);
            }
            if (e.getKeyCode() == e.VK_RIGHT) {
               setXDirection(0);
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
               setYDirection(0);
            }
            if (e.getKeyCode() == e.VK_DOWN) {
               setYDirection(0);
            }
        }
    }

    public IntroductionThreads() {
        ImageIcon newImage = new ImageIcon("src/newimage.png");
        man = newImage.getImage();
        addKeyListener(new Al());
        setTitle(" Java Game ");
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = 150;
        y = 150;
    }

    @Override
    public void paint(Graphics gh) {
         dbimage = createImage(getWidth(), getHeight());
         dbg = dbimage.getGraphics();
        paintComponents(dbg);
        gh.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void paintComponents(Graphics g) {
        g.setFont(fon);
        g.setColor(Color.red);
        g.drawString("Hellow World!", 100, 60);
        g.drawImage(man, x, y, this);
        repaint();
    }

    public static void main(String[] args) {
        IntroductionThreads ob = new IntroductionThreads();
        Thread t1 = new Thread(ob);
        t1.start();
    }

}


