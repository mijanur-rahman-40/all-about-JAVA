package javaswing.NormalButton;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JButonactionListener extends JFrame {
Container c;
    JButton button1,button2;
    JTextField field;
    JButonactionListener() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
      
        button1 = new JButton("Clear");
        button2 = new JButton();
        
        button1.setBounds(50,110,80,30);
        button1.setBackground(Color.blue);
        button1.setForeground(Color.yellow);
        c.add(button1);
        
        field = new JTextField();
        field.setBounds(50,50,150,50);
        c.add(field);
       
        
       button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(null);
            }
           
       });
        
       
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JButton ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
    }
}

class dipo {

    public static void main(String[] args) {
        JButonactionListener ob = new JButonactionListener();
    }
}
