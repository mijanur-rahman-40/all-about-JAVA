package javagamedevelopment;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MouceInput extends JFrame {

    int x = 15, y = 15;
    Font fon = new Font("Arial",Font.BOLD,20);
    boolean mouseonscreen;
    MouceInput() {
        addMouseListener(new Mouse());
        setBackground(Color.black);
        setTitle(" MouceInput ");
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Mouse implements MouseListener {

        @Override
        public void mousePressed(MouseEvent e) {
            int xpos = e.getX();
            int ypos = e.getY();
            x = xpos - 8;
            y = ypos - 5;
        }

        public void mouseRelessed(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            mouseonscreen = true;
        }

        @Override
        public void mouseExited(MouseEvent e) {
            mouseonscreen = false;
        }

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
        g.setColor(Color.yellow);
        g.fillOval(x, y, 25, 25);
        g.setColor(Color.red);
        g.setFont(fon);
        if(mouseonscreen){
        g.drawString("Co-ordinate : ("+x+","+y+")", 100, 200);
        }
        repaint();
    }

    public static void main(String[] args) {
        MouceInput ob = new MouceInput();
    }
}
