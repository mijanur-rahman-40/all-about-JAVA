package GamesBasic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
class ball extends JPanel implements Runnable {

    public int x, y = 0;
    public String b;
    Thread t;

    public ball(int a, String c) {
        x = a;

        b = c;
        System.out.println("Creating " + c);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    @Override
    public void run() {
        while (true) {
            try {
                y = y + 1;
                System.out.println(x);
                update();
                Thread.sleep(50);
            } catch (Exception ex) {

            }
            System.out.println("exit" + b);
        }
    }

    public void update() {
        repaint();
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mini Tennis");
        ball game = new ball(250, "1");
        ball game1 = new ball(50, "2");
        frame.add(game);
        frame.add(game1);
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.start();
        game1.start();
    }
}
*/




