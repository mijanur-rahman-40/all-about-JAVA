
package moucework;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author Teacher303LAB
 */
 class MainFrame {
    JTextField textField1, textField2;
    //JLabel label1;
    JButton button1;
    JButton button2;
    String username, password;
    
    public MainFrame() {
     //Create panel and add components to panel
        //label1 = new JLabel();
        
        JPanel panel = new JPanel();
        //panel.add(label1);
        panel.addMouseListener(new MyMouseListener());
        panel.addMouseMotionListener(new MyMouseMotionListener());
        //panel.addMouseListener(new MyAdapter());
        //panel.addMouseMotionListener(new MyAdapter());
        
        JFrame ob = new JFrame("Home Page");
        
        //ob.getContentPane().add(panel);
        ob.add(panel);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setSize(300, 300);
        ob.setLocation(200, 200);
        ob.setVisible(true);
    }
    
    class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
    
    class MyMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            
             String str = "Mouse Dragged: x=" + e.getX() +" y="+e.getY();
             //System.out.println(str);
             //label1.setText(str);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            String str = "Mouse Moved: x=" + e.getX() +" y="+e.getY();
            System.out.println(str);
            //label1.setText("Mouse Moved: x=" + e.getX() +" y="+e.getY());
        }
        
    }
    
    class MyAdapter extends MouseAdapter{
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            System.out.println("Clicked");
//        }
//        
//        @Override
//        public void mouseDragged(MouseEvent e) {
//            
//             String str = "Mouse Dragged: x=" + e.getX() +" y="+e.getY();
//             //System.out.println(str);
//             label1.setText(str);
//        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //label1.setText("Mouse Moved: x=" + e.getX() +" y="+e.getY());
        }
    }
     public static void main(String[] args) {
         MainFrame ob = new MainFrame();
     }
    
}