
package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FOcusListener extends JFrame{
     Container c;
    JTextArea area;
    JTextField field;
    Font fon1;
    JButton button;
    FOcusListener(){
          c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        button = new  JButton("CLICK");
        button.setBounds(20,30,120,50);
        button.setBackground(Color.red);
        c.add(button);
        
        area = new JTextArea();
        area.setBounds(150,30,159,150);
        c.add(area);
        
        button.addFocusListener(new FocusListener(){
              @Override
              public void focusGained(FocusEvent e) {
                  area.setText("focusGained");
              }

              @Override
              public void focusLost(FocusEvent e) {
                  area.setText("focusLost");
              }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" MouseMotionListenerr ");
        setBounds(100, 100, 400, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        FOcusListener ob= new FOcusListener();
    }
}
