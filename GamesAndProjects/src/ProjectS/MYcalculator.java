
package ProjectS;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

 
  public class MYcalculator implements ActionListener {

    JTextField text1, text2, text3;
    JButton button1, button2, button3, button4, but, button5, button6, button7, button8,button9;
    JLabel label1, label2, label3;
    JPanel panel;
    JFrame frame;

    public MYcalculator() {
        panel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
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
        panel.add(button1, gbc);

        button2 = new JButton(" Substraction ");
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(button2, gbc);

        button3 = new JButton(" Multiplication ");
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(button3, gbc);

        button4 = new JButton(" Divission ");
        gbc.gridx = 2;
        gbc.gridy = 9;
        panel.add(button4, gbc);

        button5 = new JButton(" Square ");
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel.add(button5, gbc);

        button6 = new JButton(" SqRoot ");
        gbc.gridx = 3;
        gbc.gridy = 6;
        panel.add(button6, gbc);

        button7 = new JButton(" Mod ");
        gbc.gridx = 4;
        gbc.gridy = 3;
        panel.add(button7, gbc);

        button8 = new JButton(" Power ");
        gbc.gridx = 4;
        gbc.gridy = 9;
        panel.add(button8, gbc);
        
        button9 = new JButton(" Clear ");
        gbc.gridx = 2;
        gbc.gridy = 11;
        panel.add(button9, gbc);

        button1.setForeground(Color.blue);
        button2.setForeground(Color.black);
        button3.setForeground(Color.green);
        button4.setForeground(Color.BLACK);
        button5.setForeground(Color.blue);
        button6.setForeground(Color.BLACK);
        button7.setForeground(Color.red);
        button8.setForeground(Color.gray);
        button9.setForeground(Color.blue);
        

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        panel.add(label3);
        panel.add(text3);
        frame = new JFrame("Calculation of two numbers");
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setLocation(300, 300);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(text1.getText());
        int num2 = Integer.parseInt(text2.getText());
        int value;
        if (ae.getSource() == button1) {
            value = num1 + num2;
            text3.setText(value + "");
        } else if (ae.getSource() == button2) {
            value = num1 - num2;
            text3.setText(value + "");
        } else if (ae.getSource() == button3) {
            value = num1 * num2;
            text3.setText(value + "");
        } else if (ae.getSource() == button4) {
            double n1 = (double) num1;
            double n2 = (double) num2;
            double value1 = n1 / n2;
            int val = (int) value1;
            int val1 = (int) n2;
            if (val * val1 == num1) {
                text3.setText(num1 / num2 + "");
            } else {
                double round = Math.round(value1 * 1000) / 1000.0;
                text3.setText(round + "");
            }
        } else if (ae.getSource() == button5) {
            value = num1 * num1;
            text3.setText(value + "");
        } else if (ae.getSource() == button6) {
            double value2 = Math.sqrt(num1);
            int val = (int) value2;
            if (val * val == num1) {
                text3.setText(val + "");
            } else {
                double round = Math.round(value2 * 1000) / 1000.0;
                text3.setText(round + "");
            }
        } else if (ae.getSource() == button7) {
            value = num1 % num2;
            text3.setText(value + "");
        } else if (ae.getSource() == button8) {
            double value3 = Math.pow(num1, num2);
            int val = (int) value3;
            text3.setText(val + "");
        }
        else if(ae.getSource() == button9){
            text1.setText(null);
            text2.setText(null);
            text3.setText(null);
        }
    }
}

class Calculator123 {

    public static void main(String[] args) {
        MYcalculator ob = new MYcalculator();
    }
}
