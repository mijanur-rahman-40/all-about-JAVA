
package javaswing.TextFieldAndTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextfieldcolor extends JFrame{
     JTextField text1;
    JButton button;
    JLabel label;
    JPanel panel;
    Container c;
    Font font;
    JTextfieldcolor() {

        c =  this.getContentPane();
        c.setLayout(null);
        font  = new Font("Arial",Font.BOLD,17);
        text1 = new JTextField("How are you");
        text1.setBounds(50,50,200,50);
        text1.setFont(font);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Title");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(text1);
        text1.setBackground(Color.red);
        text1.setForeground(Color.blue);
        
           
    }

}

class top1 {
    public static void main(String[] args) {
       JTextfieldcolor ob = new JTextfieldcolor();
    }
}




