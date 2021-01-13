
package javaswing.MenuAndToggleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JToggleButtonnImage extends JFrame{
    Container c;
    JToggleButton but;
    JLabel label;
    ImageIcon of,on;
    JToggleButtonnImage (){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        // work with select or not select
        //but  = new JToggleButton();
          
        on = new ImageIcon("src/On.png");
        of = new ImageIcon("src/Off.png");
        
        but  = new JToggleButton(of);
        but.setBounds(100,100,100,50);
        c.add(but);
        
        label = new JLabel("Hello are you");
        label.setVisible(false);
        label.setBounds(100,130,100,100);
        c.add(label);
        
        on = new ImageIcon("src/On.png");
        of = new ImageIcon("src/Off.png");
        
        but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(but.isSelected()){
                    but.setIcon(on);
                    label.setVisible(true);
                }
                else{
                   but.setIcon(of);
                   label.setVisible(false);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JToggleButton ");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        JToggleButtonnImage o = new JToggleButtonnImage();
    }
}
