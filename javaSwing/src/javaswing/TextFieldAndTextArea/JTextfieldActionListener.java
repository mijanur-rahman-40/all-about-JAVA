
package javaswing.TextFieldAndTextArea;

import javaswing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextfieldActionListener extends JFrame {
     JTextField text1,text2;
    JButton button;
    JLabel label;
    JPanel panel;
    Container c;
    Font font1,font2;
    JTextfieldActionListener() {

        c =  this.getContentPane();
        c.setLayout(null);
        font1  = new Font("Arial",Font.BOLD,30);
        text1 = new JTextField();
        text1.setBounds(50,50,200,50);
        text1.setFont(font1);
        text1.setBackground(Color.red);
        text1.setForeground(Color.blue);
        text1.setHorizontalAlignment(JTextField.CENTER);
        
        font2  = new Font("Arial",Font.ITALIC,30);
        text2 = new JTextField();
        text2.setBounds(50,110,200,50);
        text2.setFont(font2);
        text2.setBackground(Color.blue);
        text2.setForeground(Color.red);
        text2.setHorizontalAlignment(JTextField.LEFT);
      
        
 /*
        text1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String str = text1.getText();
                if(str.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Something : ");
                }
                else
                JOptionPane.showMessageDialog(null, "text1 = "+str);
            }
        
        });
        
       
        font2  = new Font("Arial",Font.ITALIC,30);
        text2 = new JTextField();
        text2.setBounds(50,110,200,50);
        text2.setFont(font2);
        text2.setBackground(Color.blue);
        text2.setForeground(Color.red);
        text2.setHorizontalAlignment(JTextField.LEFT);
        
        text2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = text2.getText();
                if(str.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please Enter Something : ");
                }
                else
                JOptionPane.showMessageDialog(null, "text2 = "+str);
            }
        
        });
       
*/
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Title");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(text1);
        c.add(text2);
        
          
        Handler hand = new Handler();
        text1.addActionListener(hand);
        text2.addActionListener(hand);
           
    }

    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == text1){
                 String str = text1.getText();
                if(str.isEmpty()){ 
                JOptionPane.showMessageDialog(null, "Please Enter Something : ");
                }
                else{
                JOptionPane.showMessageDialog(null, "text1 = "+str);
                }
            }
            else{
                 String str = text2.getText();
                if(str.isEmpty()){ 
                JOptionPane.showMessageDialog(null, "Please Enter Something : ");
                }
                else{
                JOptionPane.showMessageDialog(null, "text2 = "+str);
                }
            }
        }
    }
}
      class top123{ 
    public static void main(String[] args) {
     JTextfieldActionListener ob = new JTextfieldActionListener();
    }
}

