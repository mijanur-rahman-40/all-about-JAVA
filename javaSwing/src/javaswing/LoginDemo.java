package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDemo extends JFrame {
    
    Container c;
    JLabel userlabel, passwordlabel;
    JTextField tfl,password;
    JPasswordField passwor;
    JButton submit, clear,calcel;
    Font fn1, fn2;
    
    LoginDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        fn1 = new Font("Arial", Font.BOLD, 16);
        
        userlabel = new JLabel("UserName : ");
        userlabel.setBounds(25, 20, 100, 100);
        userlabel.setForeground(Color.blue);
        userlabel.setFont(fn1);
        c.add(userlabel);
        
        passwordlabel = new JLabel("PassWord : ");
        passwordlabel.setBounds(25, 60, 100, 100);
        passwordlabel.setForeground(Color.blue);
        passwordlabel.setFont(fn1);
        c.add(passwordlabel);
        
        tfl = new JTextField();
        tfl.setBounds(120, 55, 145, 30);
        tfl.setForeground(Color.red);
        tfl.setFont(fn1);
        c.add(tfl);
       /* 
        password = new JPasswordField();
        password.setBounds(120, 95, 145, 30);
        password.setForeground(Color.red);
        password.setFont(fn1);
        c.add(password);
        */
        password = new JTextField();
        password.setBounds(120, 95, 145, 30);
        password.setForeground(Color.red);
        password.setFont(fn1);
        c.add(password);
        
        submit = new JButton("Login");
        submit.setForeground(Color.green);
        submit.setBackground(Color.black);
        submit.setFont(fn1);
        submit.setBounds(90, 140, 85, 30);
        c.add(submit);
        
        clear = new JButton("Clear");
        clear.setForeground(Color.green);
        clear.setBackground(Color.black);
        clear.setFont(fn1);
        clear.setBounds(180, 140, 85, 30);
        c.add(clear);
        
        calcel = new JButton("Cancel");
        calcel.setForeground(Color.green);
        calcel.setBackground(Color.black);
        calcel.setFont(fn1);
        calcel.setBounds(130, 175, 90, 30);
        c.add(calcel);
        
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfl.setText(null);
                password.setText(null);
            }
            
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String,String> map= new HashMap<String,String>(); 
                File file = new File("two.txt");
                BufferedReader br = null;
                try{
                    br = new BufferedReader(new FileReader(file));
                }catch(Exception ae){
                    
                }
                String st,name,pass;
                try {
                    while((st = br.readLine()) != null){
                      String[] take = st.split("&");
                      name = take[0];
                      pass = take[1];
                      map.put(name,pass);
                    }
                } catch (IOException ex) {
                    
                }
                String name1 = tfl.getText().toString();
                String pass1 = password.getText().toString();
                if (name1.equals(map.get(pass1))) {
                    JOptionPane.showMessageDialog(null, "You are successfully Login");
                   // dispose();
                    NewFrame ob = new NewFrame();
                    ob.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid UserName Or Password");
                }
            }
            
        });
        
    }
    
    public static void main(String[] args) {
        LoginDemo fr = new LoginDemo();
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50, 50, 300, 250);
        fr.setTitle("LoginDemo");
    }
}
