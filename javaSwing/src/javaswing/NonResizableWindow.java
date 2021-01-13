
package javaswing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NonResizableWindow {
    JPanel panel;
    JFrame ob;
    JTextField field;
    NonResizableWindow(){
    JFrame ob = new JFrame();
    
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("DisaleTextField");
        ob.setSize(500,300);
        ob.setLocation(200,200);
        ob.setVisible(true);
        ob.setResizable(false);
    }
    public static void main(String[] args) {
        NonResizableWindow ob = new NonResizableWindow();
    }
        
}
