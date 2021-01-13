
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JcomboBoxItemlistener{
    JFrame frame;
    ImageIcon icon1,icon2;
    String[] input = {"cutimage","newimage"};
    JComboBox box;
    JLabel label;
    JcomboBoxItemlistener(){
        frame = new JFrame();
      
       icon1 = new ImageIcon("src/CutImage.png");
       icon2 = new ImageIcon("src/newimage.png");
       
       box = new JComboBox(input);
       box.setBounds(100,100,100,40);
       box.setForeground(Color.blue);
       frame.add(box);
       
       label = new JLabel();
       label.setBounds(250,100,60,60);
       label.setBackground(Color.green);
       
       box.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
               if(box.getSelectedItem().toString() == input[0]){
                   label.setIcon(icon1);
               }
               else if(box.getSelectedItem().toString() == input[1]){
                   label.setIcon(icon2);
               }    
                
                
            }
       });

      
       frame.add(label);
       
       frame.setBackground(Color.pink);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(0,0,400,600); 
       frame.setTitle("JcomboBoxItemlistener");
       frame.setLayout(null);
       frame.setVisible(true);
    }
    public static void main(String[] args) {
        JcomboBoxItemlistener jdh = new JcomboBoxItemlistener();
    }
    
}
