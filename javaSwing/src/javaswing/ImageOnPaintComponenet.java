package javaswing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageOnPaintComponenet extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon icon = new ImageIcon("src/Cutimage.png");
        icon.paintIcon(this, g, 70, 70);
    }

    public static void main(String[] args) {
        ImageOnPaintComponenet obj = new ImageOnPaintComponenet();

        JFrame frame = new JFrame();
        frame.setTitle("Animation");
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLocation(300, 300);

        frame.add(obj);
    }
}
