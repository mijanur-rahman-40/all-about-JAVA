
package javaswing.TextFieldAndTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JTextAreaLineWrapping extends JFrame{
     JPanel jp;
    JTextArea area;
    Container c;
    Font fon;
    JTextAreaLineWrapping(){
      c =  this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.green);
    
     area = new JTextArea();
     area.setBounds(50,50,160,140);
     area.setLineWrap(true);
     area.setWrapStyleWord(true);
     area.setBackground(Color.white);
     area.setForeground(Color.blue);
     fon = new Font("Arial",Font.BOLD,17);
     area.setFont(fon);
   c.add(area);
       setSize(440,440);
       setVisible(true);
       setLocation(300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String[] args) {
      JTextAreaLineWrapping ob = new JTextAreaLineWrapping();
     }  
}
