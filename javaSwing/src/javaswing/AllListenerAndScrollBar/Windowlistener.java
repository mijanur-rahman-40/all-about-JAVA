
package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Windowlistener extends JFrame{
     Container c;
    JTextArea area;
    JTextField field;
    Font fon1;
    Windowlistener(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }
            
        });
        
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" MouseMotionListenerr ");
        setBounds(100, 100, 400, 600);
        setVisible(true);
    }
    public static void main(String[] args) {
        Windowlistener ob = new Windowlistener();
    }
}
