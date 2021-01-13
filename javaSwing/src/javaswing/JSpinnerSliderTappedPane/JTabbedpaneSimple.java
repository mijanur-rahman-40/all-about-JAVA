package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedpaneSimple extends JFrame {
   Container c;
   JTabbedPane pane;
   JPanel panel1,panel2,panel3;
   JLabel label1,label2,label3;
   Font fon;
    JTabbedpaneSimple() {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        pane = new JTabbedPane();
        pane.setBounds(34,35,200,200);
        c.add(pane);
        
        fon = new Font("Arial",Font.BOLD,20);
        
        label1 = new JLabel("Panel 1");
        label1.setFont(fon);
       
        
        label2 = new JLabel("Panel 2");
        label2.setFont(fon);
        
        label3 = new JLabel("Panel 3");
        label3.setFont(fon);
        
        panel1 = new JPanel();
        panel1.setBackground(Color.red);
        panel1.add(label1);
      
        
        
        panel2 = new JPanel();
        panel2.setBackground(Color.blue);
        panel2.add(label2);
       
        
        panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.add(label3);
        
        
        pane.addTab("Home", panel1);
        pane.addTab("Help", panel2);
        pane.addTab("Edit", panel3);
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" TabbedPane ");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        JTabbedpaneSimple kd = new JTabbedpaneSimple();
    }
}
