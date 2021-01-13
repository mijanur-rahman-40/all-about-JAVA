
package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerWithChangeListener extends JFrame implements ChangeListener{
     Container c;
     JSpinner spinner;
     JLabel label,label1;
     Font fon;
    JSpinnerWithChangeListener(){
        
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        fon = new Font("Arial",Font.BOLD,20);
        
        SpinnerNumberModel  value = new SpinnerNumberModel(10,0,30,2);
        spinner  = new JSpinner(value);
        spinner.setBounds(100,90,60,40);
        spinner.setFont(fon);
        
        c.add(spinner);
        
       
        
        label  = new JLabel();
        label.setBounds(190,90,150,150);
        label.setFont(fon);
        label.setForeground(Color.yellow);
        c.add(label);
        
        label1  = new JLabel("Current value : ");
        label1.setBounds(40,90,150,150);
        label1.setFont(fon);
        label1.setForeground(Color.blue);
        c.add(label1);
        
        spinner.addChangeListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JSpinnerr ");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
     @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText(""+value);
    }
    
    public static void main(String[] args) {
        JSpinnerWithChangeListener fd = new JSpinnerWithChangeListener();
    }

   
}
