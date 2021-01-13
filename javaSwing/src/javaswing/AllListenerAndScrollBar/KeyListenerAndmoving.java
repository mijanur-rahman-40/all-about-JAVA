package javaswing.AllListenerAndScrollBar;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyListenerAndmoving extends Applet implements KeyListener{
    Rectangle rect;
    
    public void init(){
        this.addKeyListener(this);
        rect = new Rectangle(0,0,50,50);
      
    }
    
    public void paint(Graphics g){
        this.setSize(300,300);
        this.setBackground(Color.green);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(rect);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() ==  KeyEvent.VK_RIGHT){
            rect.setLocation(rect.x + 50,rect.y);
        }
       if(e.getKeyCode() ==  KeyEvent.VK_LEFT){
           rect.setLocation(rect.x - 50 ,rect.y);
        }
        if(e.getKeyCode() ==  KeyEvent.VK_UP){
              rect.setLocation(rect.x ,rect.y - 50);
        }
       if(e.getKeyCode() ==  KeyEvent.VK_DOWN){
            rect.setLocation(rect.x  ,rect.y + 50);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    
    
}