
package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Actionlistener extends JFrame implements ActionListener{
    JButton button1,button2,button3;
    Container c;
    Actionlistener(){
        
        c = this.getContentPane();
        c.setLayout(null);
       
        
         button1 = new JButton("RED");
         button2 = new JButton("GREEN");
         button3 = new JButton("BLUE");
         
         button1.setBounds(40,90,80,50);
         button2.setBounds(40,190,80,50);
         button3.setBounds(40,290,80,50);
         
        c.add(button1);
        c.add(button2);
        c.add(button3);
         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Actionlistener");
        setBounds(0,0,400,600);
        setVisible(true);
        
        button1.addActionListener(this);
         button2.addActionListener(this);
          button3.addActionListener(this);
       
    }
    public static void main(String[] args) {
       Actionlistener ob = new Actionlistener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            c.setBackground(Color.red);
        }
        else if(e.getSource() == button2){
              c.setBackground(Color.green);
        }
        else if(e.getSource() == button3){
              c.setBackground(Color.blue);
        }
    }
}
