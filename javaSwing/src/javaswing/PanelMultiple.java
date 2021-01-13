
package javaswing;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMultiple {
    JPanel panel1,panel2,panel3,panel4,panel5;
    JButton button1,button2,button3,button4;
    JLabel label;
    JTextField text;
    PanelMultiple(){  
    JFrame window = new JFrame("Multiple Panels");
     panel1 = new JPanel();
     panel2 = new JPanel();
     panel3 = new JPanel();
     panel4 = new JPanel();
     panel5 = new JPanel();
     
     button1= new JButton("Click1");
     button2= new JButton("Click2");
     //button3= new JButton("Click3");
     //button4= new JButton("Click4");
     //label = new JLabel("Button is clicked");
     //text = new JTextField(10);
     
     button1.addActionListener(new ButtonListener1());
     button2.addActionListener(new ButtonListener2());
    // button3.addActionListener(new ButtonListener3());
     //button4.addActionListener(new ButtonListener4());
     
    //label.setForeground(Color.pink);
    //label.setVisible(true);
    
    panel1.setBackground(Color.CYAN);
    panel2.setBackground(Color.DARK_GRAY);
    panel3.setBackground(Color.blue);
    panel4.setBackground(Color.lightGray);
    panel5.setBackground(Color.gray);
   
//    panel5.add(label);
    //panel1.add(text);
    panel1.add(button1);
    panel2.add(button2);
    //panel3.add(button3);
    //panel4.add(button4);
    
    button1.setForeground(Color.blue);
    button2.setForeground(Color.black);
    //button3.setForeground(Color.MAGENTA);
    //button4.setForeground(Color.DARK_GRAY);
    
    window.add(panel5,BorderLayout.CENTER);
    window.add(panel1,BorderLayout.PAGE_START);
    window.add(panel2,BorderLayout.PAGE_END);
    //window.add(panel3,BorderLayout.WEST);
    //window.add(panel4,BorderLayout.EAST);
    
    window.setSize(300,300);
    window.setLocation(300,300);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    class ButtonListener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           //label.setVisible(true);
           panel1.setBackground(Color.green);
           panel2.setBackground(Color.black);
          }
      }
    
    class ButtonListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           //label.setVisible(true);
           panel2.setBackground(Color.yellow);
           panel3.setBackground(Color.red);
          }
      }
    /*
    class ButtonListener3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           //label.setVisible(true);
           panel3.setBackground(Color.black);
           panel4.setBackground(Color.white);
          }
      }
    class ButtonListener4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           //label.setVisible(true);
           panel1.setBackground(Color.orange);
           panel4.setBackground(Color.pink);
          }
      }
*/
  }
class test13{
    public static void main(String[] args) {
       PanelMultiple ob= new  PanelMultiple();
         
    }
}
