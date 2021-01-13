
package homework;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.xml.ws.Service;


public class login {
    
    JFrame frame;
    JPanel panel;
    JLabel label1, label2, label5;
    JTextField textField1, textField2;
    JButton button;
    
    public login(){
        
        label1 = new JLabel("username:");
        label2 = new JLabel("password:");
        textField1 = new JTextField(30);
        textField2 = new JTextField(30);
        button = new JButton("Login");
        button.addActionListener(new ButtonListener());
        
        panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        
        frame = new JFrame("Login Page");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
   
    class MyMouseMotionListener implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
          String str = "Mouse Dragged: x=" + e.getX() + " y=" + e.getY();
           //System.out.println(str);
            label5.setText(str);
            
      }

        @Override
        public void mouseMoved(MouseEvent e) {
         String str = "Mouse Moved: x=" + e.getX() + " y=" + e.getY();
           //System.out.println(str);
            label5.setText(str);
           
        }
       
    }
    
    class MyAdaptar extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
             System.out.println("Clicked");
        }
        
        @Override
        public void mouseDragged(MouseEvent e) {
           String str = "Mouse Dragged: x=" + e.getX() + " y=" + e.getY();
            //System.out.println(str);
            label5.setText(str);
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            String str = "Mouse Moved: x=" + e.getX() + " y=" + e.getY();
            //System.out.println(str);
            label5.setText(str);
            
        }
        
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
    
    
   private class ButtonListener implements ActionListener{ 
      
       public void actionPerformed(ActionEvent e){
           
           String userInput1 = textField1.getText();
           String userInput2 = textField2.getText();
           if("raju".equals(userInput1) && "123".equals(userInput2)){
        
               JLabel label = new JLabel("Welcome " + userInput1);
               label5 = new JLabel();
             
               JPanel panel1 = new JPanel();
               panel1.add(label);
               panel1.add(label5);
               panel1.addMouseListener(new MyAdaptar());
               panel1.addMouseMotionListener(new MyAdaptar());
               JFrame frame1 = new JFrame("Welcome");
               frame1.add(panel1);
               frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame1.pack();
               frame1.setSize(600, 600);
               frame1.setLocationRelativeTo(null);
               frame1.setVisible(true);
               frame.setVisible(false);
               
           }
           else{
            JOptionPane.showMessageDialog(panel, "Username or Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
           }
       }
  }
    
   public static void main(String args[]){
       login t = new login();
   } 
}
