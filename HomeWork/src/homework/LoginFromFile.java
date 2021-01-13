package homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.PasswordField;

public class LoginFromFile {

    private JFrame frame;
    private JFrame frame1;
    private JPanel panel;
    private JLabel userLabel;
    private JLabel userLabel1;
    private JLabel passLabel;
    private JButton loginButton;
    private JTextField userField;
    private JPasswordField passwordField;

    public final static HashMap userList = new HashMap();

    static {
        userList.put("A", "123");
        userList.put("B", "1234");
        userList.put("C", "12345");
    }

    public LoginFromFile() {
        userLabel = new JLabel("      User ID");
        userField = new JTextField(25);
        passLabel = new JLabel("Password");
        passwordField = new JPasswordField(25);
        loginButton = new JButton("Login");
        loginButton.addActionListener(new buttonListener());
        panel = new JPanel();
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        
        frame = new JFrame();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Page");
        frame.setVisible(true);
        
        frame1 = new JFrame();
        frame1.setSize(400,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("Home");
        frame1.setVisible(false);
        JPanel panel1 = new JPanel();
        frame1.add(panel1);
      
        panel1.addMouseListener(new MyAdapter());
        panel1.addMouseMotionListener(new MyAdapter());
        userLabel1=new JLabel("");
        panel1.add(userLabel1);
        
    }
    
    
    
    public class MyAdapter extends  MouseAdapter{
       @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Clicked");
            userLabel1.setText("Clicked");
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Dragging");
            userLabel1.setText("Dragging "+e.getX() + " " + e.getY());
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Moving");
            userLabel1.setText("Moving "+e.getX() + " " + e.getY());
        }
    }
    
    

    
    public class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = userField.getText().toString();
            //char[] input = passwordField.getPassword();
            String passString = passwordField.getText().toString();
            System.out.println(passString);
            
            if(userList.containsKey(userInput) && userList.get(userInput).equals(passString)){
                frame.setVisible(false);
                frame1.setVisible(true);
            }
            
            else{
                JOptionPane.showMessageDialog(panel, "Login Failed" );
            }
            
        }
        
    }
    
    public static void main(String[] args) {

        LoginFromFile aLogin = new LoginFromFile();
    }

}
