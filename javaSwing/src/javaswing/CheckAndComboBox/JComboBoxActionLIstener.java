
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxActionLIstener extends JFrame{
  Container c;
    JComboBox combo;
    String [] language = {"C","C++","Java","Phyton","Hg","joi"};
    JLabel label;
    Font fon;
    JButton but;
   JComboBoxActionLIstener (){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBounds(10, 10, 400, 600);
        c.setBackground(Color.pink);
        
        combo = new JComboBox(language);
        combo.setBounds(30,150,100,50);
        combo.setBackground(Color.green);
        combo.setForeground(Color.magenta);
        combo.setEditable(true);
        c.add(combo);
        
        fon = new Font("Arial",Font.BOLD,16);
        label = new JLabel();
        label.setBounds(140,150,230,50);
        label.setForeground(Color.blue);
        label.setFont(fon);
        c.add(label);
        
        but = new JButton("Show");
        but.setBounds(30,250,80,40);
        but.setBackground(Color.MAGENTA);
        c.add(but);
        /*
        combo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = combo.getSelectedItem().toString();
                label.setText("You Have Selected : "+s);
            }
        });
        */
        
         but.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = combo.getSelectedItem().toString();
                label.setText("You Have Selected : "+s);
            }
        });
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    public static void main(String[] args) {
        JComboBoxActionLIstener ob = new JComboBoxActionLIstener();
    }
}

