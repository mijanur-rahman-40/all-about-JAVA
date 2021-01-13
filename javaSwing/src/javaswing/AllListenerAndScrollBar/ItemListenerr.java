
package javaswing.AllListenerAndScrollBar;

import javaswing.CheckAndComboBox.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemListenerr extends JFrame{
    JCheckBox check,mack,pack;
      Font fon;
      ButtonGroup grp;
      JLabel label;
    ItemListenerr(){
       Container c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.green);
       fon = new Font("Arial",Font.BOLD,18);
        
        
       check = new JCheckBox("check");
       check.setBounds(50, 100, 90, 50);
       check.setBackground(Color.green);
       check.setForeground(Color.black);
       check.setFont(fon);
       c.add(check);
       
       mack = new JCheckBox("mack");
       mack.setBounds(50, 170, 90, 50);
       mack.setBackground(Color.green);
       mack.setForeground(Color.red);
       mack.setFont(fon);
       c.add(mack);
       
       pack = new JCheckBox("pack");
       pack.setBounds(50, 240, 90, 50);
       pack.setBackground(Color.green);
       pack.setForeground(Color.white);
       pack.setFont(fon);
       c.add(pack);
     
       
      grp = new  ButtonGroup();
      grp.add(check);
      grp.add(mack);
      grp.add(pack);
      
      label = new JLabel("You Can Select Something");
      label.setBounds(50,250,250,150);
      label.setForeground(Color.blue);
      label.setFont(fon);
      c.add(label);
    
      
      Handler Hander = new Handler();
      check.addItemListener(Hander);
      mack.addItemListener(Hander);
      pack.addItemListener(Hander);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == check){
               label.setText("You have Selected check");
            }
            else if(e.getSource() == pack){
               label.setText("You have Selected pack");
            }
             else
               label.setText("You have Selected mack");
            }
        }
        
    
 
    public static void main(String[] args) {
      ItemListenerr ob = new ItemListenerr();
    }
}


