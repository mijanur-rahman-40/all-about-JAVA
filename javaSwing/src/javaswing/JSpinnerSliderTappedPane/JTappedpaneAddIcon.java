
package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTappedpaneAddIcon extends JFrame{
      Container c;
   JTabbedPane pane;
   JPanel panel1,panel2,panel3;
   JLabel label1,label2,label3;
   Font fon;
   ImageIcon home,help,edit;
    JTappedpaneAddIcon(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
         pane = new JTabbedPane();
       // pane = new JTabbedPane(JTabbedPane.TOP);
       // pane.setTabPlacement(JTabbedPane.RIGHT);
        pane.setBounds(34,35,400,200);
        c.add(pane);
        
        home = new ImageIcon("src/Off.png");
        help = new ImageIcon("src/On.png");
        edit = new ImageIcon("src/mute.png");
        
        fon = new Font("Arial",Font.BOLD,20);
        
        label1 = new JLabel("Panel___1");
        label1.setFont(fon);
       
        
        label2 = new JLabel("Panel___2");
        label2.setFont(fon);
        
        label3 = new JLabel("Panel___3");
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
        
        //addTab method 1,,2,3,4 parameter
        pane.addTab("Home",home, panel1,"I am paneltab 1");
        pane.addTab("Help",help, panel2);
        pane.addTab("Edit",edit,panel3);
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" TabbedPane ");
        setBounds(100, 100, 500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        JTappedpaneAddIcon kd = new JTappedpaneAddIcon();
    }
}

