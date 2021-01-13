package javaswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameImageIconChange extends JFrame{
   private ImageIcon icon ;
   private Container c;
    JFrameImageIconChange(){
        components();
    }
    public void components(){
       // if image in the same pacakge with the class
        //icon = new ImageIcon(getclass().getResource("upmouth.png"));
        c = this.getContentPane();
        c.setBackground(Color.blue);
         icon = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
         this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        JFrameImageIconChange ob = new JFrameImageIconChange();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 330, 330);
        ob.setTitle("Frame");
    }
}


class tro{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon();
       icon = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
        
       frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 330, 330);
        frame.setTitle("Frame");
    }
}