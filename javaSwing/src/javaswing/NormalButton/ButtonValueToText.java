
package javaswing.NormalButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonValueToText {
    JFrame frame;
    JLabel label;
    JButton button;
    JTextField text;
    ButtonValueToText(){
        frame = new JFrame();
        button = new JButton("5");
        text = new JTextField(10);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.add(button);
        frame.add(text);
        button.addActionListener(new ButtonListener());
    }
     class ButtonListener implements ActionListener{
         @Override
       public void actionPerformed(ActionEvent ae){
           String  str = ae.getActionCommand();
           text.setText(str);
           //text.se
            int num1= Integer.getInteger(str);
             System.out.println(num1);
            
       }
     }
}
class Hodai{
    public static void main(String[] args) {
        ButtonValueToText ob = new ButtonValueToText();
    }
}
// code  a problem ase