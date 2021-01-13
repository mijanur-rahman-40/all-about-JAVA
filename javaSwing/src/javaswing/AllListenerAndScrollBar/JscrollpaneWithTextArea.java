
package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JscrollpaneWithTextArea extends JFrame{
    JPanel jp;
    JTextArea area;
    Container c;
    Font fon;
    JScrollPane scroll;
    JscrollpaneWithTextArea(){
      c =  this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.green);
    
     area = new JTextArea();
   
     //area.setLineWrap(true);
     //area.setWrapStyleWord(true);
     area.setBackground(Color.white);
     area.setForeground(Color.blue);
     fon = new Font("Arial",Font.BOLD,17);
     area.setFont(fon);
     
     scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    //scroll = new JScrollPane(area);
   //scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scroll.setBounds(50,50,160,140);
     
       c.add(scroll);
       setSize(440,440);
       setVisible(true);
       setLocation(300,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String[] args) {
      JscrollpaneWithTextArea ob = new JscrollpaneWithTextArea();
     }  

}
