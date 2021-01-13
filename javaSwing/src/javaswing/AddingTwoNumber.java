package javaswing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Addition extends JFrame implements ActionListener {

    JTextField text1, text2;
    JButton button;
    JLabel label;
    JPanel panel;

    public Addition() {
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        button = new JButton("OK");
        label = new JLabel("Result");

        add(text1);
        add(text2);
        add(button);
        add(label);

        button.addActionListener(this);  //ActionListener is an interface
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.yellow);
    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int value = num1 * num2;
        label.setText(value + "");
    }

}

public class AddingTwoNumber {

    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

/*

class  Addition1 {
    JTextField text1,text2,text3;
    JButton button1,button2,button3,button4,but,button5,button6,button7,button8;
    JLabel label1,label2,label3;
    JPanel panel;
    JFrame frame;
    public Addition1(){
      panel = new JPanel();
      GridBagConstraints gbc = new  GridBagConstraints();
       panel.setLayout(new GridBagLayout());
       text1 = new JTextField(7);
       text1.setForeground(Color.blue);
       text2 = new JTextField(7);
       text2.setForeground(Color.red);
       text3 = new JTextField(7);
       text3.setForeground(Color.black);
       
       label1 = new JLabel(" Number 1st: ");
       label1.setForeground(Color.yellow);
       label2 = new JLabel(" Number 2nd: ");
       label2.setForeground(Color.pink);
       label3 = new JLabel(" Result is: ");
       label3.setForeground(Color.red);
       
       panel.setBackground(Color.darkGray);
       
       panel.add(label1);
       panel.add(text1);
       panel.add(label2);
       panel.add(text2);
       
      button1 = new JButton(" Summation ");
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(button1,gbc);
        
      button2 = new JButton(" Substraction ");
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(button2,gbc);
        
      button3 = new JButton(" Multiplication ");
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(button3,gbc);
        
      button4 = new JButton(" Divission ");
        gbc.gridx = 2;
        gbc.gridy = 9;
        panel.add(button4,gbc);
        
      button5 = new JButton(" Square ");
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(button5,gbc);
        
      button6 = new JButton(" SqRoot ");
        gbc.gridx = 3;
        gbc.gridy = 6;
        panel.add(button6,gbc);
        
      button7 = new JButton(" Mod ");
        gbc.gridx = 4;
        gbc.gridy = 3;
        panel.add(button7,gbc);
        
      button8 = new JButton(" Power ");
        gbc.gridx = 4;
        gbc.gridy = 9;
        panel.add(button8,gbc);
      
       
       button1.setForeground(Color.blue);
       button2.setForeground(Color.black);
       button3.setForeground(Color.green);
       button4.setForeground(Color.BLACK);
       button5.setForeground(Color.blue);
       button6.setForeground(Color.BLACK);
       button7.setForeground(Color.red);
       button8.setForeground(Color.gray);
       
       button1.addActionListener(new ButtonListener1());
       button2.addActionListener(new ButtonListener2());
       button3.addActionListener(new ButtonListener3());
       button4.addActionListener(new ButtonListener4());
       button5.addActionListener(new ButtonListener5());
       button6.addActionListener(new ButtonListener6());
       button7.addActionListener(new ButtonListener7());
       button8.addActionListener(new ButtonListener8());
       
      
       
       /*
       panel.add(button1);
       panel.add(button2);
       panel.add(button3);
       panel.add(button4);
       panel.add(button5);
       panel.add(button6);
       panel.add(button7);
       panel.add(button8);
     
       
       panel.add(label3);
       panel.add(text3);
       frame = new JFrame("Calculation of two numbers");
       frame.add(panel);
        
       // frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setLocation(300,300);
    }
    class ButtonListener1 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int value  = num1 + num2;
        text3.setText(value + "");
             }
          }
    class ButtonListener2 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int value  = num1 - num2;
        text3.setText(value + "");
             }
          }
    class ButtonListener3 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int value  = num1 * num2;
        text3.setText(value + "");
             }
          }
    class ButtonListener4 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
       int num1= Integer.parseInt(text1.getText());
       int num2 = Integer.parseInt(text2.getText());
       double n1 = (double)num1;
       double n2 = (double)num2;
       double value  = n1 / n2;
       int val = (int)value;
       int val1 =(int)n2;
       if(val*val1 == num1) {
            text3.setText( num1/num2 + "");
       }
       else{
         double round = Math.round(value*1000)/1000.0;
       text3.setText(round + "");
                } 
             }
       }
     class ButtonListener5 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
       // int num2 = Integer.parseInt(text2.getText());
        int value  = num1*num1;
        text3.setText(value + "");  
             }
          }
      class ButtonListener6 implements ActionListener{
        @Override
       public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
       // int num2 = Integer.parseInt(text2.getText());
        double value  = Math.sqrt(num1);
        int val =(int)value;
        if(val*val == num1) {
             text3.setText(val + "");
        }
        else {       
        double round = Math.round(value*1000)/1000.0;
        text3.setText(round + "");
                }
             }
          }
       class ButtonListener7 implements ActionListener{
        @Override
         public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int  value  = num1%num2;
        text3.setText(value + ""); 
             }
          }
        class ButtonListener8 implements ActionListener{
        @Override
         public void actionPerformed(ActionEvent e){
        int num1= Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        double value  = Math.pow(num1,num2);
        int val = (int)value;
        text3.setText(val + "");
             }
          }
       }
  class Calculator1{     
      public static void main(String[] args) {
        Addition1 ob = new Addition1();
      }
  }
 */

