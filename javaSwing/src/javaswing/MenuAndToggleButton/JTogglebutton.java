package javaswing.MenuAndToggleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JTogglebutton extends JFrame {

    Container c;
    JToggleButton but;
    JLabel label;
    JTogglebutton() {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        // work with select or not select
        //but  = new JToggleButton();
        
        /*
       All methods : 
       JToggleutton(String text);
        JToggleutton(String text,Boolean selected);
        JToggleutton(Icon icon);
        JToggleutton(Icon icon,Boolean selected);
         JToggleutton(String text,Icon icon);
          JToggleutton(String text,Icon icon,Boolean selected);
        
      */
        
        but  = new JToggleButton("Off");
        but.setBounds(100,100,100,50);
        c.add(but);
        
        label = new JLabel("Hello are you");
        label.setVisible(false);
        label.setBounds(100,130,100,100);
        c.add(label);
        
        but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(but.isSelected()){
                    but.setText("On");
                    label.setVisible(true);
                }
                else{
                    but.setText("Off");
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
        JTogglebutton ob = new JTogglebutton();
    }
}
