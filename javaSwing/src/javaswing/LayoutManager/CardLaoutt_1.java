
package javaswing.LayoutManager;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLaoutt_1 extends JFrame implements ActionListener{
    Container c;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    CardLayout lay;
    CardLaoutt_1(){
          c = this.getContentPane();
        c.setBackground(Color.yellow);
         
        lay = new CardLayout();
        c.setLayout(lay);
         b1 = new JButton("b1");
         b2 = new JButton("b2");
         b3 = new JButton("b3");
         b4 = new JButton("b4");
         
         c.add(b1);
         c.add(b2);
         c.add(b3);
         c.add(b4);
         
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
        CardLaoutt_1 kf = new CardLaoutt_1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //lay.next(c);
        lay.previous(c);
    }
}
