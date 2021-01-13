
package javaswing.Moucslistener.MYcode;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerr extends JFrame{
    Container c;
    JTextArea area;
    JTextField field;
    Font fon1;
   MouseMotionListenerr (){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        fon1 = new Font("Arial", Font.BOLD, 18);
        
        field = new JTextField();
        field.setBackground(Color.green);
        field.setBounds(250,20,280,60);
        field.setFont(fon1);
        c.add(field);
    
        area = new JTextArea();
        area.setBackground(Color.white);
        area.setBounds(10, 20, 230, 250);
        area.setForeground(Color.red);
        area.setFont(fon1);
        c.add(area);
        
        area.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                field.setText("mouseDragged  X = "+e.getX()+", Y = "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                field.setText("mouseMoved  X = "+e.getX()+", Y = "+e.getY());
            }
            
        });
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" MouseMotionListenerr ");
        setBounds(100, 100, 600, 450);
        setVisible(true);
    }
    public static void main(String[] args) {
        MouseMotionListenerr ob = new MouseMotionListenerr ();
    }
}
