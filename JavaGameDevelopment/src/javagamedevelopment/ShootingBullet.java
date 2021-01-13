package javagamedevelopment;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ShootingBullet extends JFrame implements Runnable {

    int x, y, Xdirection, Ydirection;
    Container c;
    Image dbimage, images1, images2, images3;
    Graphics dbg;
    boolean readytofire, shot = false;
    Rectangle bullet;
    int bx, by;

    public void move() {
        x = x + Xdirection;

        if (x <= 0) {
            x = 0;
        }
        if (x >= 310) {
            x = 310;
        }

    }

    public void setXDirection(int xdir) {
        Xdirection = xdir;
    }

    @Override
    public void run() {
        try {
            while (true) {
                shoot();
                move();
                Thread.sleep(5);
            }
        } catch (Exception e) {
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
            if (e.getKeyCode() == e.VK_SPACE) {
                if (bullet == null) {
                    readytofire = true;
                }
                if (readytofire) {
                    by = y - 22;
                    bx = x + 22;
                    bullet = new Rectangle(bx, by, 10, 30);
                    shot = true;
                }
            }

        }

        public void keyRelesed(KeyEvent e) {
            if (e.getKeyCode() == e.VK_LEFT) {
                setXDirection(0);
            }
            if (e.getKeyCode() == e.VK_RIGHT) {
                setXDirection(0);
            }
            if (e.getKeyCode() == e.VK_SPACE) {
                readytofire = false;
                if (bullet.y <= -30) {
                    bullet = new Rectangle(0, 0, 0, 0);
                    shot = false;
                    readytofire = true;
                }
            }
        }
    }

    public ShootingBullet() {
        ImageIcon newImage1 = new ImageIcon("src/gu.jpg");
        images1 = newImage1.getImage();
        ImageIcon newImage2 = new ImageIcon("src/bullet.jpg");
        images2 = newImage2.getImage();
        ImageIcon newImage3 = new ImageIcon("src/Logo.png");
        images3 = newImage3.getImage();
        addKeyListener(new Al());
        setTitle(" Java Game ");
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = 150;
        y = 360;
    }

    public void shoot() {
        if (shot) {
            bullet.y--;
        }
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

        g.drawImage(images1, 0, 0, this);
        g.drawImage(images3, x, y, this);
        g.setColor(Color.yellow);
        g.drawImage(images2, x + 35, y - 20, this);
        if (shot) {
            g.drawImage(images2, bullet.x, bullet.y, this);
        }
        repaint();
    }

    public static void main(String[] args) {
        ShootingBullet ob = new ShootingBullet();
        Thread t1 = new Thread(ob);
        t1.start();
    }
}
