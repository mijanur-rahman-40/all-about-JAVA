package SkyForce;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Players extends JFrame implements KeyListener {

    private int x;
    private int y;
    boolean left, right;
    private boolean fire;
    private long current;
    private long delay;
    private int health;

    public Players(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void init() {
        Display.frame.addKeyListener(this);
        current = System.nanoTime();
        delay = 100;
        health = 10;
    }

    public void tick() {
        if (!(health <= 0)) {
            if (right) {
                if (x <= 350) {
                    x += 10;
                }
            }
            if (left) {
                if (x >= 5) {
                    x -= 10;
                }
            }
            if (fire) {
                long breaks = (System.nanoTime() - current) / 1000000;
                if (breaks > delay) {
                    GameManager.bullet.add(new Bullet(x + 20, y));
                }
                current = System.nanoTime();
            }
        }
    }

    public void render(Graphics g) {
        if (!(health <= 0)) {
        ImageIcon icon = new ImageIcon("src/player.png");
        Image img = icon.getImage();
        g.drawImage(img, x, y, this);
            
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int source = e.getKeyCode();
        if (source == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (source == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (source == KeyEvent.VK_B) {
            fire = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int source = e.getKeyCode();
        if (source == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (source == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (source == KeyEvent.VK_B) {
            fire = false;
        }
    }
}
