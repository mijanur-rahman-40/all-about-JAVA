
package GamesBasic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MovingABalllll extends JFrame{
    Container c;
    int x = 50,y = 50,Rad = 50;
    MovingABalllll(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        
        setBounds(50,20,500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
       super.paint(g);
       g.fillOval(x, y, Rad, Rad);
       
    }
    void move(){
        if(y<getWidth()-Rad){
            y = y+1;
        }
        
        try{
            Thread.sleep(15);
        }
        catch(Exception e){
            
        }
    }
    
    public static void main(String[] args) {
        MovingABalllll ob = new MovingABalllll();
        while(true){
        ob.move();
        ob.repaint();
        }
    }

     
}
