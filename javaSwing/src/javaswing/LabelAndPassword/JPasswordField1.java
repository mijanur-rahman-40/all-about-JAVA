package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPasswordField1 extends JFrame {

   
    Container c;
    JPasswordField pass;

    JPasswordField1() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        pass  = new JPasswordField();
        pass.setBounds(50,20,150,50);
        pass.setEchoChar('*');
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPasswordField ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(pass);

    }
}

class topo {

    public static void main(String[] args) {
        JPasswordField1 ob = new JPasswordField1();
    }
}
