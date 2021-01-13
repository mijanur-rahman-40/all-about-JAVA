
package javaswing.LayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borderlayoutt_2 extends JFrame{
    Container c;
    //BorderLayout blay;
    JButton bt1,bt2,bt3,bt4,bt5;
    JPanel panel;
    Borderlayoutt_2(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        
       // blay = new BorderLayout(10,10);
       // blay = new BorderLayout();
        //or
       // blay.setHgap(10);
       // blay.setVgap(10);
       // c.setLayout(blay);
        
       panel = new JPanel();
       panel.setBounds(100,50,100,100);
       panel.setBackground(Color.red);
       //c.add(panel,BorderLayout.CENTER);
       
       
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        
        c.add(bt1,BorderLayout.NORTH);
        c.add(bt2,BorderLayout.WEST);
        c.add(bt3,BorderLayout.CENTER);
        c.add(bt4,BorderLayout.EAST);
        c.add(bt5,BorderLayout.SOUTH);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Borderlayoutt ");
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        Borderlayoutt_2 ob = new Borderlayoutt_2();
    }
}
