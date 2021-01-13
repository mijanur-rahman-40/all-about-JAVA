package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelAddingImage extends JFrame {
    JLabel imglab;
    Container c;
    ImageIcon icon;
    JLabelAddingImage(){
      c = this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.pink);
      
    icon = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
    imglab = new JLabel(icon);
    //imglab.setBounds(20,10,190,200);
    //if you set the image (width,weidth) like actual image
    imglab.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
    imglab.setOpaque(true);
    imglab.setBackground(Color.pink);
    c.add(imglab);
    }

    public static void main(String[] args) {
        JLabelAddingImage fr = new JLabelAddingImage();
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50, 50,400, 500);
        fr.setTitle("JLabelAddingImage");
    }
}
