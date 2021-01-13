
package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewFrame extends JFrame{
    Container c;
    JLabel label;
    Font fon;
    NewFrame(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(50, 50, 350, 300);
        setTitle("Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        fon = new Font("Arial",Font.BOLD,50);
        
        label = new JLabel();
        label.setText("Welcome");
        label.setBounds(50,30,240,200);
        label.setForeground(Color.blue);
        label.setFont(fon);
        c.add(label);
        
    }
    public static void main(String[] args) {
        NewFrame ob = new NewFrame();
        
    }
}
