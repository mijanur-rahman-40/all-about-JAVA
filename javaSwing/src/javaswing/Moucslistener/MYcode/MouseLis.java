
package javaswing.Moucslistener.MYcode;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseLis {
   
   JLabel label;
   JTextField text;
    MouseLis(){
        
        label = new JLabel("Input");
        text = new JTextField(10);
        JPanel panel = new JPanel();
        panel.addMouseListener(new Mymouselis()) ;
        panel.addMouseMotionListener(new MymouceMotion ());
        panel.addMouseWheelListener(new MymoceWhell());

       
        JFrame  frame1 = new JFrame("Login Page");
        frame1.add(panel);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400,300);
        frame1.setLocation(400, 400);
        frame1.setVisible(true); 
       
    }
    class MymoceWhell implements MouseWheelListener{

        @Override
        public void mouseWheelMoved(MouseWheelEvent mwe) {
            mwe.getX();
            System.out.println( mwe.getX());
        }
       
    }
    class MymouceMotion implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent me) {
            //String str1 = "abc";
           text.getText();
            
            String str = "Mouce Dragged :a ="+me.getX()+" b = "+me.getX();
           // System.out.println(str);
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            String str = "Mouce Moved :a ="+me.getX()+" b = "+me.getX();
            //System.out.println(str);
        }
        
    }
    class Mymouselis implements MouseListener{
      
        @Override
        public void mouseClicked(MouseEvent me) {
            System.out.println("CLiked");
        }

        @Override
        public void mousePressed(MouseEvent me) {
            System.out.println("CLiked1");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }
    }
    public static void main(String[] args) {
        MouseLis ob= new MouseLis();
    }
}
