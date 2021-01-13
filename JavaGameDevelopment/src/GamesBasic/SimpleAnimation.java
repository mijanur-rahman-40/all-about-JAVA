
package GamesBasic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 class Animation extends JPanel implements ActionListener{
     Timer tm = new Timer(20,this);
     int x = 0,velx = 10,x1 = 350,velx1 = 10;
     @Override
    public void paintComponent(Graphics gh){
        super.paintComponent(gh);
        gh.setColor(Color.green);
        //gh.fillRect(150, x, 30, 30);
        gh.fillRect(x, 150, 30, 30);
        gh.fillRect(x1, 150, 30, 30);
        //gh.fillRect(x, x, 30, 30);
        tm.start();
    }
     @Override
    public void actionPerformed(ActionEvent e){
        if(x<0 || x>350){
            velx = -velx;
        }
        
        x = x  + velx;
      
       repaint();
    }
     


   
    public static void main(String[] args) {
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.blue);
     
      Animation obj = new Animation();
      JFrame frame=  new JFrame();
      frame.setTitle("Animation");
      frame.setVisible(true);
      frame.setSize(400,400);
      frame.setLocation(300,300); 
     
      frame.add(panel);
      frame.add(obj);
      
    }
}

*/

class Animation extends JPanel implements ActionListener{
     Timer tm = new Timer(10,this);
     int x = 0,x1 = 330; 
     boolean right = false;
     Image icon1,icon2;
     @Override
    public void paintComponent(Graphics gh){
        super.paintComponent(gh);
        gh.setColor(Color.green);
        icon1 = new ImageIcon("src/CutImage.png").getImage();
        icon2 = new ImageIcon("src/newimage.png").getImage();
        //gh.fillRect(150, x, 30, 30);
        //gh.fillRect(x, 150, 30, 30);
        gh.drawImage(icon1, x, 150, this);
        gh.drawImage(icon2, 150, x, this);
        gh.fillRect(x1, 150, 30, 30);
        //gh.fillRect(x, x, 30, 30);
        tm.start();
    }
     @Override
    public void actionPerformed(ActionEvent e){
       
        
       if (x == 350) {
            right = true;
        }
        if (x == 0) {
            right = false;
        }
        if (right) {
            x--;
        } else {
            x++;
        }
        repaint();
        /*
        if (x1 == 350) {
            right = true;
        }
        if (x1 == 0) {
            right = false;
        }
        if (right) {
            x1--;
        } else {
            x1++;
        }
       
       repaint();
*/
    }
     


   
    public static void main(String[] args) {
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.blue);
     
      Animation obj = new Animation();
      JFrame frame=  new JFrame();
      frame.setTitle("Animation");
      frame.setVisible(true);
      frame.setSize(400,400);
      frame.setLocation(300,300); 
     
      frame.add(panel);
      frame.add(obj);
      
    }
}
