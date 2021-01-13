package javaswing.JSpinnerSliderTappedPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements ChangeListener {

    Container c;
    JSlider slider1, slider2, slider3;
    JLabel label1, label2, label3, label4;
    Font fon;
    JTextField field1, field2, field3;
    JPanel panel;

    Slider() {

        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);

        slider1 = new JSlider(0, 255, 0);
        slider1.setBounds(90, 90, 270, 30);
        slider1.setBackground(Color.red);
        c.add(slider1);

        slider2 = new JSlider(0, 255, 0);
        slider2.setBounds(90, 170, 270, 30);
        slider2.setBackground(Color.green);
        c.add(slider2);

        slider3 = new JSlider(0, 255, 0);
        slider3.setBounds(90, 250, 270, 30);
        slider3.setBackground(Color.blue);
        c.add(slider3);

        fon = new Font("Arial", Font.BOLD, 15);

        label1 = new JLabel("RED");
        label1.setBounds(25, 80, 50, 50);
        label1.setBackground(Color.red);
        label1.setForeground(Color.red);
        label1.setFont(fon);
        c.add(label1);

        label2 = new JLabel("GREEN");
        label2.setBounds(25, 160, 69, 50);
        label2.setBackground(Color.green);
        label2.setForeground(Color.green);
        label2.setFont(fon);
        c.add(label2);

        label3 = new JLabel("BLUE");
        label3.setBounds(25, 240, 50, 50);
        label3.setBackground(Color.blue);
        label3.setForeground(Color.blue);
        label3.setFont(fon);
        c.add(label3);

        field1 = new JTextField();
        field1.setBounds(380, 87, 70, 35);
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setFont(fon);
        field1.setForeground(Color.red);
        c.add(field1);

        field2 = new JTextField();
        field2.setBounds(380, 168, 70, 35);
        field2.setFont(fon);
        field2.setHorizontalAlignment(JTextField.CENTER);
        field2.setForeground(Color.green);
        c.add(field2);

        field3 = new JTextField();
        field3.setBounds(380, 248, 70, 35);
        field3.setHorizontalAlignment(JTextField.CENTER);
        field3.setFont(fon);
        field3.setForeground(Color.blue);
        c.add(field3);

        panel = new JPanel();
        panel.setBounds(490, 80, 200, 200);
        panel.setBackground(Color.CYAN);
        c.add(panel);

        label4 = new JLabel("PREVIEW");
        label4.setBounds(563, 270, 80, 80);
        label4.setForeground(Color.black);
        label4.setFont(fon);
        c.add(label4);
       
        
        slider1.addChangeListener(this);
        slider2.addChangeListener(this);
        slider3.addChangeListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JSliderrr ");
        setBounds(100, 100, 750, 420);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        int redValue = slider1.getValue();
        int greenValue = slider2.getValue();
        int blueValue = slider3.getValue();
        
        field1.setText("" + redValue);
        field2.setText("" + greenValue);
        field3.setText("" + blueValue);
        Color color = new Color(redValue, greenValue, blueValue);
        panel.setBackground(color);

    }

    public static void main(String[] args) {
        Slider hd = new Slider();
    }
}
