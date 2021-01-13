
package javaswing.LayoutManager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CardLayoutt_2 extends JFrame implements ActionListener{
    Container c;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    CardLayout lay;
    CardLayoutt_2(){
        c = this.getContentPane();
        c.setBackground(Color.blue);
         
        lay = new CardLayout(10,15);
        c.setLayout(lay);
         b1 = new JButton("b1");
         b2 = new JButton("b2");
         b3 = new JButton("b3");
         b4 = new JButton("b4");
         
         c.add(b1,"first");
         c.add(b2,"second");
         c.add(b3,"third");
         c.add(b4,"fourth");
        lay.show(c, "fourth");
         
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" CardLaoutt ");
        setBounds(100, 100, 400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
       CardLayoutt_2 kf = new CardLayoutt_2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // lay.show(c,"second");
        lay.first(c);
        //lay.last(c);
    }
}


