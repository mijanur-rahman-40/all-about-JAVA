
package homework;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

 class HomeWork1 {
    JFrame frame1,frame2;
    JLabel label1,label2;
    JPanel panel1,panel2;
    JButton button2,button1;
    JTextField field1,field2;
    HomeWork1(){
        label1 = new JLabel("Username :");
        label2 = new JLabel("Password :");
        field1 = new JTextField(15);
        field2 = new JTextField(15);
        button1 = new JButton("Login");
        button2 = new JButton("Cancel");
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(field1);
      
        panel1.add(label2);
        panel1.add(field2);
        panel1.add(button2);
         panel1.add(button1);
      
          GridBagConstraints gbc = new  GridBagConstraints();
        panel1.setLayout(new GridBagLayout());
        
       
        gbc.gridx = 2;
        gbc.gridy = 5;
        panel1.add(label1,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 5;
        panel1.add(field1,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 8;
        panel1.add(label2,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 8;
        panel1.add(field2,gbc);
       
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        panel1.add(button1,gbc);
        
        gbc.gridx = 4;
        gbc.gridy = 9;
        panel1.add(button2,gbc);
       /*
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 9;
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button2,gbc);
        */
       button1.addActionListener(new ButtonListener45());
       button2.addActionListener(new ButtonListener46());
        frame1 = new JFrame("Login Page");
        frame1.add(panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400,400);
        frame1.setLocation(250, 250);
        frame1.setVisible(true);
     }
     class ButtonListener46 implements ActionListener{
          public void actionPerformed(ActionEvent e){
              System.exit(0);
          }
     }
     class ButtonListener45 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
           String str1 = "karim";
           String str2 = "123";
          
           if(str1.equals(field1.getText().toString()) &&  
             str2.equals(field2.getText().toString())){
               panel2 = new JPanel();
               JLabel label = new JLabel("Welcome,[karim]");
               panel2.add(label);
               
               frame2 = new JFrame("Home page");
               frame2.add(panel2);
               panel2.setBackground(Color.gray);
               frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame2.setSize(400,200);
               frame2.setLocation(400, 400);
               frame2.setVisible(true);
               frame1.setVisible(false);
            
           }
           else
                 JOptionPane.showMessageDialog(null,"There is an error","Error", JOptionPane.ERROR_MESSAGE);
            //field2.setText(null);
       }
     }
     

    public static void main(String[] args) {
        HomeWork1 ob = new HomeWork1();
    }
    
 }
