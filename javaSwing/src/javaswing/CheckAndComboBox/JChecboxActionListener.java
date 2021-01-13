
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JChecboxActionListener  extends JFrame{
    JCheckBox check,mack,pack;
      Font fon;
      ButtonGroup grp;
      JLabel label;
    JChecboxActionListener(){
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
      Handler handler =  new  Handler();
      check.addActionListener(handler);
      pack.addActionListener(handler);
      mack.addActionListener(handler);
      
      
      /*
      check.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               label.setText(null);
               label.setText("You are check");
           }
          
      });
      
      
      pack.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               label.setText(null);
               label.setText("You are pack");
           }
          
      });
      
      mack.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               label.setText(null);
               label.setText("You are mack");
           }
          
      });
      
     */
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(check.isSelected()){  // or (e.getSource() == check){
                 label.setText("You are check");
            }
            else if(pack.isSelected()){
                 label.setText("You are pack");
            }
            else{
                 label.setText("You are mack");
            }
        }
        
    }
    public static void main(String[] args) {
      JChecboxActionListener ob = new JChecboxActionListener();
    }
}
