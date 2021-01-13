package GamesBasic;

import java.awt.Color;
import java.awt.Container;
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

public class KeyMovement extends JFrame implements ActionListener, KeyListener {

   Image image = new ImageIcon("src/newimage.png").getImage();
    Container c;
    int man_position = 10;
     Timer tm = new Timer(5, this);
   
    KeyMovement() {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.addKeyListener(this);
         tm.start();
        setBounds(20, 20, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

   @Override
    public void paint(Graphics gh) {
        gh.setColor(Color.DARK_GRAY);
        gh.fillRect(0, 0, 700, 500);
        gh.setColor(Color.black);
        gh.fillRect(0,350,700,150 );
        gh.drawImage(image, man_position , 100, null);
    }
     public void actionPerformed(ActionEvent e) {
         
     }
    public static void main(String[] args) {
        KeyMovement ob = new KeyMovement();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if(c == KeyEvent.VK_LEFT)
        {
           man_position -= 10;
          
        }
       
        if(c == KeyEvent.VK_RIGHT)
        {
           man_position += 10;
        }
       
       repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
}
