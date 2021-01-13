package GamesBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;


/*
public class BouncingBall extends JFrame implements KeyListener,Runnable{
    int frameWidth = 700,frmaeHeight = 500; 
    Thread thread = null;
    int paddlex =200 ,paddley = 400;
    int paddleWidth =300 ,paddleHeight = 100;
    int ballx = 350,bally = 350;
    int ballDiameter = 25;
    boolean up = false,right = true;
    BouncingBall(){
        this.setBounds(100,100,frameWidth,frmaeHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addKeyListener(this);
        thread = new Thread(this);
        thread.start();
    }
    
    public void paint(Graphics gh){
        super.paint(gh);
        gh.setColor(Color.green);
        gh.fillRect(0, 0, frameWidth, frmaeHeight);
        gh.setColor(Color.black);
        gh.fillRect(paddlex, paddley, paddleWidth, paddleHeight);
        gh.setColor(Color.red);
        gh.fillOval(ballx, bally, ballDiameter, ballDiameter);
    }
    
    @Override
    public void run() {
        while(true){
            if(up){
                bally--;
            }
            else
                bally++;
            if(right){
                ballx++;
            }
            else
                ballx--;
            if(ballx<0){
                right = true;
            }
            if(ballx > (frameWidth - ballDiameter)){
                right = false;  
            }
            
            if(bally<0){
                up = false;
            }
            if(bally>frmaeHeight - ballDiameter){
                up = true;
            }
            if(ballx>paddlex && ballx < (paddlex + paddleWidth) && 
                    bally > paddley - ballDiameter){
                up = true;
            }
            
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            repaint();
        } 
    }
    
    public static void main(String[] args) {
        BouncingBall ob = new BouncingBall();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
    
}


 */
public class BouncingBall extends JFrame implements ActionListener, KeyListener, Runnable {

    int frameWidth = 700, frmaeHeight = 500;
    Thread thread = null;
    int paddlex = 200, paddley = 450;
    int paddleWidth = 250, paddleHeight = 50;
    int ballx = 350, bally = 350;
    int ballDiameter = 50;
    boolean up = false, right = true;
    Timer tm = new Timer(1, this);
    int velx = 0, vely = 0;
    boolean collision = true;
    Rectangle rect1, rect2;
    Font fon = new Font("Arial", Font.BOLD, 34);
    int count = 0;
    boolean ball1 = true, ball2 = true, ball3 = true;

    BouncingBall() {
        this.setBounds(100, 100, frameWidth, frmaeHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon newImage1 = new ImageIcon("src/images.jpg");
        Image img = newImage1.getImage();
        addKeyListener(this);
        tm.start();
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics gh) {
        Image dbimage = createImage(getWidth(), getHeight());
        Graphics dbg = dbimage.getGraphics();
        paintComponents(dbg);
        gh.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void paintComponents(Graphics gh) {

        Rectangle rec1 = new Rectangle(ballx, bally, ballDiameter, ballDiameter);
        // Rectangle rec5 = new Rectangle(ballx+20, bally+20, ballDiameter, ballDiameter);

        Rectangle rec2 = new Rectangle(100, 40, 70, 70);
        Rectangle rec3 = new Rectangle(300, 40, 70, 70);
        Rectangle rec4 = new Rectangle(500, 40, 70, 70);

        //gh.setColor(Color.black);
        // gh.fillOval(rec5.x, rec5.y, rec5.width, rec5.height);
        gh.setColor(Color.pink);
        gh.fillRect(0, 0, frameWidth, frmaeHeight);

        //gh.setColor(Color.green);
       //gh.fillOval(rec1.x, rec1.y, rec1.width, rec1.height);
        ImageIcon newImage1 = new ImageIcon("src/images.jpg");
        Image img = newImage1.getImage();
        gh.drawImage(img, rec1.x, rec1.y,this);

        gh.setColor(Color.blue);
        gh.fillOval(rec2.x, rec2.y, rec2.width, rec2.height);

        gh.setColor(Color.black);
        gh.fillOval(rec3.x, rec3.y, rec3.width, rec3.height);

        gh.setColor(Color.red);
        gh.fillOval(rec4.x, rec4.y, rec4.width, rec4.height);

        if (rec1.intersects(rec2)) {

            gh.setFont(fon);
            gh.setColor(Color.blue);
            gh.drawString("Collision!!!! : " + (count++) + "", 300, 400);

        }
        if (rec1.intersects(rec3)) {

            gh.setFont(fon);
            gh.setColor(Color.blue);
            gh.drawString("Collision!!!! : " + (count++) + "", 300, 400);
        }
        if (rec1.intersects(rec4)) {

            gh.setFont(fon);
            gh.setColor(Color.blue);
            gh.drawString("Collision!!!! : " + (count++) + "", 300, 400);
        }

        gh.setColor(Color.blue);
        gh.drawRect(100, 70, 70, 170);
        gh.setColor(Color.black);
        gh.drawRect(300, 70, 70, 170);
        gh.setColor(Color.red);
        gh.drawRect(500, 70, 70, 170);

        gh.setColor(Color.green);
        gh.fillRect(paddlex, paddley, paddleWidth, paddleHeight);

    }

    @Override
    public void run() {
        while (true) {
            if (up) {
                bally--;
            } else {
                bally++;
            }
            if (right) {
                ballx++;
            } else {
                ballx--;
            }
            if (ballx < 0) {
                right = true;
            }
            if (ballx > (frameWidth - ballDiameter)) {
                right = false;
            }

            if (bally < 0) {
                up = false;
            }
            if (bally > frmaeHeight - ballDiameter) {
                up = true;
            }
            if (ballx > paddlex && ballx < (paddlex + paddleWidth)
                    && bally > paddley - ballDiameter) {
                up = true;
            }

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            repaint();
        }
    }

    public static void main(String[] args) {
        BouncingBall ob = new BouncingBall();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();
        if (c == e.VK_LEFT) {
            velx = -1;
            vely = 0;
        }
        if (c == e.VK_RIGHT) {
            velx = 1;
            vely = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        velx = 0;
        vely = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (paddlex < 0) {
            velx = 0;
            paddlex = 0;
        }
        if (paddlex > 445) {
            velx = 0;
            paddlex = 445;
        }
        paddlex = paddlex + velx;

        repaint();
    }

}
