
package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListener123 extends JFrame {
    
    JTextField field;
    JTextArea area;
    Container C;
    KeyListener123()
    {  
         call();
    }
        
     public void   call(){
         
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setBounds(100,50,500,500);
     this.setTitle("Keylistener");
      
    C = this.getContentPane();
    C.setLayout(null);
    
    field = new JTextField();
    field.setBounds(50, 60, 150, 50);
    C.add(field);
    
    area = new JTextArea();
    area.setBounds(10,110,300,300);
    area.setBackground(Color.blue);
    C.add(area);
    
    field.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {
            
             area.append("Key Typed "+ e.getKeyChar()+"\n");
         }

         @Override
         public void keyPressed(KeyEvent e) {
                          area.append("Key Pressed "+ e.getKeyChar()+"\n");

         }

         @Override
         public void keyReleased(KeyEvent e) {
                          area.append("Key Released "+ e.getKeyChar()+"\n");

         }
     });
       
    }
    public static void main(String[] args) {
         KeyListener123 ob = new  KeyListener123();
         ob.setVisible(true);
    } 
}
