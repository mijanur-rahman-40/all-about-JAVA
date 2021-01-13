
package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderrr extends JFrame{
     Container c;
     JSlider slide;
     Font fon;
    JSliderrr(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        fon = new Font("Arial",Font.BOLD,15);
        
        slide  = new JSlider(0,20,0);
        //slide  = new JSlider(JSlider.VERTICAL,0,20,0);
        slide.setBounds(40,80,210,60);
        slide.setFont(fon);
        slide.setMinorTickSpacing(1);
        slide.setMajorTickSpacing(3);
        slide.setForeground(Color.yellow);
        slide.setBackground(Color.black);
        slide.setPaintLabels(true);
        slide.setPaintTicks(true);
        c.add(slide);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JSliderrr ");
        setBounds(100, 100, 300, 300);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        JSliderrr lfk = new JSliderrr();
    }
}
