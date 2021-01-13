package javagamedevelopment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MoreCollisionDetection extends JFrame implements MouseMotionListener {

    int mx, my;
    Font fon = new Font("Arial", Font.BOLD, 34);

    MoreCollisionDetection() {
        this.setBackground(Color.black);
        addMouseMotionListener(this);
        setTitle(" MoreCollisionDetection ");
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics gh) {
        Image dbimage = createImage(getWidth(), getHeight());
        Graphics dbg = dbimage.getGraphics();
        paintComponents(dbg);
        gh.drawImage(dbimage, 0, 0, this);
    }

    @Override
    public void paintComponents(Graphics g) {
        Rectangle rec1 = new Rectangle(mx, my, 50, 50);
        Rectangle rec2 = new Rectangle(150, 150, 80, 80);
        g.setColor(Color.yellow);
        g.fillRect(rec1.x, rec1.y, rec1.width, rec1.height);
        g.setColor(Color.pink);
        g.fillRect(rec2.x, rec2.y, rec2.width, rec2.height);
        if (rec1.intersects(rec2)) {
            g.setFont(fon);
            g.setColor(Color.blue);
            g.drawString("Collision!!!!", 120, 120);
        }
        repaint();
    }

    public static void main(String[] args) {
        MoreCollisionDetection ob = new MoreCollisionDetection();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();

    }
}
