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

public class ImportImage extends JFrame {

    int x, y;
    Container c;
    Font fon = new Font("Arial", Font.ITALIC, 34);
    Image dbimage,man;
    Graphics dbg;

    public class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == e.VK_LEFT) {
                if (x <= 0) {
                    x = 0;
                } else {
                    x = x - 5;
                }
            }
            if (e.getKeyCode() == e.VK_RIGHT) {
                if (x >= 380) {
                    x = 380;
                } else {
                    x = x + 5;
                }
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                if (y <= 25) {
                    y = 25;
                } else {
                    y = y - 5;
                }
            }
            if (e.getKeyCode() == e.VK_DOWN) {
                if (y >= 380) {
                    y = 380;
                } else {
                    y = y + 5;
                }
            }
        }
    }

    public ImportImage() {
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
        ImportImage ob = new ImportImage();
    }

}
