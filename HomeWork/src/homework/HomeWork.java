
package homework;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWork {
    JFrame frame1,frame2;
    JLabel label1,label2;
    JPanel panel1,panel2;
    JButton button1,button2;
    JTextField field1,field2;
    HomeWork(){
        label1 = new JLabel("Username :");
        label2 = new JLabel("Password :");
        ImageIcon ob = new ImageIcon("D:\\family\\PNJ Emage");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        button1 = new JButton("Login");
        button2 = new JButton("Cancel");
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(field1);
      
        panel1.add(label2);
        panel1.add(field2);
        panel1.add(button1);
        panel1.add(button2);
       
        panel1.setBackground(Color.blue);
        
        button2.addActionListener(new ButtonListener1());
        button1.addActionListener(new ButtonListener2());
        frame1 = new JFrame("Login Page");
        frame1.add(panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400,200);
        frame1.setLocation(400, 400);
        frame1.setVisible(true);
     }
     class ButtonListener1 implements ActionListener{
         @Override
       public void actionPerformed(ActionEvent ae){
          System.exit(0);
       }
     }
     class ButtonListener2 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
           String str1 = "karim";
           String str2 = "123";
           String s1,s2;
            s1 = field1.getText();
            s2 = field2.getText();
           if(str1.equalsIgnoreCase(s1) &&  str2.equalsIgnoreCase(s2)){ 
            
               JOptionPane.showMessageDialog(null,"");
               panel2 = new JPanel();
               JLabel label = new JLabel("Welcome,[karim]");
               panel2.add(label);
               frame2 =
                       new JFrame("Ho   field2.setText(null);me page");
               frame2.add(panel2);
               panel2.setBackground(Color.gray);
               frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame2.setSize(400,200);
               frame2.setLocation(400, 400);
               frame2.setVisible(true);
               frame1.setVisible(false);
               
            
           }
           else
                 JOptionPane.showMessageDialog(null,"Your username or password is not correct");
       }
     }
}
class Hodai{
    public static void main(String[] args) {
        HomeWork ob = new HomeWork();
    }
    
}
