package javagamedevelopment;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MouseMoved extends JFrame implements MouseMotionListener {

    boolean mouseDragged;
    int mx, my;

    MouseMoved() {
        addMouseMotionListener(this);
        setTitle(" MouseMoved ");
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
        if (mouseDragged) {
            g.setColor(Color.darkGray);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.lightGray);
            g.fillRect(mx, my, 20, 20);
        } else {
            g.setColor(Color.pink);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.black);
            g.fillRect(mx, my, 20, 20);

        }
        repaint();
    }

    public static void main(String[] args) {
        MouseMoved ob = new MouseMoved();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mx = e.getX() - 7;
        my = e.getY() - 7;
        mouseDragged = true;
        e.consume();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
        mouseDragged = false;
        e.consume();
    }
}
