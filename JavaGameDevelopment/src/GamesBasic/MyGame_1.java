package GamesBasic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

class Game extends JFrame implements ActionListener, KeyListener, Runnable {

    int frameWidth = 700, frmaeHeight = 500;
    Thread thread = null;
    int paddlex = 200, paddley = 450;
    int paddleWidth = 250, paddleHeight = 50;
    int ball_1x = 0, ball_1y = 200, ball_2x = 250, ball_2y = 0, ball_3x = 500, ball_3y = 500,
            ball_4x = 600, ball_4y = 13, ball_5x = 35, ball_5y = 450;
    int ballDiameter = 50;
    boolean up_1 = false, right_1 = true, up_2 = false, right_2 = true,
            up_3 = false, right_3 = true, up_4 = false, right_4 = true,
            up_5 = false, right_5 = true;
    ;
    Timer tm = new Timer(1, this);
    int velx = 0, vely = 0;
    boolean collision = false;
    int collsion_count = 0;
    Font fon = new Font("Arial", Font.BOLD, 50);
    boolean ball1 = true, ball2 = true, ball3 = true, flag = true;
    Rectangle rec1, rec2, rec3, rec4, rec5, rec6;

    Game() {
        this.setBounds(100, 100, frameWidth, frmaeHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
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

        rec1 = new Rectangle(ball_1x, ball_1y, ballDiameter, ballDiameter);
        rec2 = new Rectangle(ball_2x, ball_2y, ballDiameter, ballDiameter);
        rec3 = new Rectangle(ball_3x, ball_3y, ballDiameter, ballDiameter);
        rec4 = new Rectangle(ball_4x, ball_4y, ballDiameter, ballDiameter);
        rec5 = new Rectangle(ball_5x, ball_5y, ballDiameter, ballDiameter);

        Graphics2D g2d = (Graphics2D) gh;
        gh.setColor(Color.darkGray);
        gh.fillRect(0, 0, frameWidth, frmaeHeight);

        gh.setColor(Color.red);
        gh.fillOval(rec1.x, rec1.y, ballDiameter, ballDiameter);

        gh.setColor(Color.blue);
        gh.fillOval(rec2.x, rec2.y, ballDiameter, ballDiameter);

        gh.setColor(Color.blue);
        gh.fillOval(rec3.x, rec3.y, ballDiameter, ballDiameter);

        gh.setColor(Color.red);
        gh.fillOval(rec4.x, rec4.y, ballDiameter, ballDiameter);

        gh.setColor(Color.yellow);
        gh.fillOval(rec5.x, rec5.y, ballDiameter, ballDiameter);

        ImageIcon newImage2 = new ImageIcon("src/g.jpg");
        Image img1 = newImage2.getImage();

        g2d.drawImage(img1, 100, 150, this);
        g2d.drawImage(img1, 300, 150, this);
        g2d.drawImage(img1, 500, 150, this);

        g2d.setColor(Color.black);
        g2d.drawOval(103, 139, 92, 31);
        g2d.setColor(Color.blue);
        g2d.drawOval(303, 139, 92, 31);
        g2d.setColor(Color.red);
        g2d.drawOval(503, 139, 92, 31);

        rec6 = new Rectangle(103, 140, 90, 30);

        g2d.setColor(Color.yellow);
        g2d.fillOval(103, 140, 90, 30);
        g2d.setColor(Color.red);
        g2d.fillOval(303, 140, 90, 30);
        g2d.setColor(Color.blue);
        g2d.fillOval(503, 140, 90, 30);

        if (collision) {
            g2d.setColor(Color.white);
            g2d.setFont(fon);

            collsion_count++;
            g2d.drawString("Coollision : " + collsion_count, 100, 100);
        }

        gh.setColor(Color.green);
        gh.fillRect(paddlex, paddley, paddleWidth, paddleWidth);

    }

    public void collision() {

        if (rec1.intersects(rec6)) {
            collision = true;
        }
    }

    @Override
    public void run() {
   
        while (true) {

//first  ball
            if (up_1) {
                ball_1y--;

            } else {
                ball_1y++;

            }
            if (right_1) {
                ball_1x++;

            } else {
                ball_1x--;

            }
            if (ball_1x < 0) {
                right_1 = true;
            }

            if (ball_1x > (frameWidth - ballDiameter)) {
                right_1 = false;
            }

            if (ball_1y < 0) {
                up_1 = false;
            }

            if (ball_1y > frmaeHeight - ballDiameter) {
                up_1 = true;
            }

            if (ball_1x > paddlex && ball_1x < (paddlex + paddleWidth)
                    && ball_1y > paddley - ballDiameter) {
                up_1 = true;
            }
//second ball
            if (up_2) {
                ball_2y--;

            } else {
                ball_2y++;

            }
            if (right_2) {
                ball_2x++;

            } else {
                ball_2x--;

            }
            if (ball_2x < 0) {
                right_2 = true;
            }

            if (ball_2x > (frameWidth - ballDiameter)) {
                right_2 = false;
            }

            if (ball_2y < 0) {
                up_2 = false;
            }

            if (ball_2y > frmaeHeight - ballDiameter) {
                up_2 = true;
            }

            if (ball_2x > paddlex && ball_2x < (paddlex + paddleWidth)
                    && ball_2y > paddley - ballDiameter) {
                up_2 = true;
            }
//third ball

            if (up_3) {
                ball_3y--;

            } else {
                ball_3y++;

            }
            if (right_3) {
                ball_3x++;

            } else {
                ball_3x--;

            }
            if (ball_3x < 0) {
                right_3 = true;
            }

            if (ball_3x > (frameWidth - ballDiameter)) {
                right_3 = false;
            }

            if (ball_3y < 0) {
                up_3 = false;
            }

            if (ball_3y > frmaeHeight - ballDiameter) {
                up_3 = true;
            }

            if (ball_3x > paddlex && ball_3x < (paddlex + paddleWidth)
                    && ball_3y > paddley - ballDiameter) {
                up_3 = true;
            }

//forth ball
            if (up_4) {
                ball_4y--;

            } else {
                ball_4y++;

            }
            if (right_4) {
                ball_4x++;

            } else {
                ball_4x--;

            }
            if (ball_4x < 0) {
                right_4 = true;
            }

            if (ball_4x > (frameWidth - ballDiameter)) {
                right_4 = false;
            }

            if (ball_4y < 0) {
                up_4 = false;
            }

            if (ball_4y > frmaeHeight - ballDiameter) {
                up_4 = true;
            }

            if (ball_4x > paddlex && ball_4x < (paddlex + paddleWidth)
                    && ball_4y > paddley - ballDiameter) {
                up_4 = true;
            }
            //fifth ball

            if (up_5) {
                ball_5y--;

            } else {
                ball_5y++;

            }
            if (right_5) {
                ball_5x++;

            } else {
                ball_5x--;

            }
            if (ball_5x < 0) {
                right_5 = true;
            }

            if (ball_5x > (frameWidth - ballDiameter)) {
                right_5 = false;
            }

            if (ball_5y < 0) {
                up_5 = false;
            }

            if (ball_5y > frmaeHeight - ballDiameter) {
                up_5 = true;
            }

            if (ball_5x > paddlex && ball_5x < (paddlex + paddleWidth)
                    && ball_5y > paddley - ballDiameter) {
                up_5 = true;
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
        Game ob = new Game();
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
