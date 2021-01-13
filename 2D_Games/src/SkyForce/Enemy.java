package SkyForce;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Enemy extends JFrame {

    private int x;
    private int y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tick() {
        y += 3;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void render(Graphics g) {

        ImageIcon icon = new ImageIcon("src/enimy.png");
        Image img = icon.getImage();
        g.drawImage(img, x, y, this);
    }
}
