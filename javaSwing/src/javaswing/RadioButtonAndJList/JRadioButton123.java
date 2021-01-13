
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButton123 {
    JTextField text;
    JButton button;
    JPanel panel ;
    JRadioButton male,female;
    JLabel label;
    JRadioButton123(){
        panel = new JPanel();
        text = new JTextField(10);
        button = new JButton("Ok");
        male = new JRadioButton("male");
        female = new JRadioButton("female");
        label = new JLabel("Greeeting");
        ButtonGroup Bg = new ButtonGroup();
        button.addActionListener(new ButtonListener());
        
        
       
                
          Bg.add(male);
          Bg.add(female);
          
        panel.add(text);
       
        panel.add(male);
        panel.add(female);
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.red);
        
        JFrame ob = new JFrame("Title");
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Title");
        ob.setSize(350,400);
        ob.setLocation(600,200);
        ob.setVisible(true);
        ob.add(panel);
    }
    class ButtonListener implements ActionListener{
        @Override
         public void actionPerformed(ActionEvent e){
            String  name = text.getText();
            if(male.isSelected())
            {
                name = "Mr." + name;
            }
            else
            {
                name = "Ms." + name;
            }
            label.setText(name);
        }
    }
}
class test12{
 public static void main(String[] args) {
     JRadioButton123 ob = new JRadioButton123();
 }
}