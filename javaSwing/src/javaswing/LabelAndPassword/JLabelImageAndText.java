
package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelImageAndText extends JFrame {
    JLabel label;
    Container c;
    ImageIcon image;
    JLabelImageAndText(){
      c = this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.pink);
      
      image = new ImageIcon("F:\\Java Programming Code\\Picture/Dog_48px.png");
      label  = new JLabel("It is a dog",image,JLabel.LEFT);
      label.setBounds(50,50,250,50);
      
      c.add(label);
      
    }

    public static void main(String[] args) {
        JLabelImageAndText fr = new JLabelImageAndText();
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50, 50,400, 500);
        fr.setTitle("JLabelAddingImage");
    }
}
  

