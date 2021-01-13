package javaswing.TextFieldAndTextArea;

import javaswing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JTextArea_1 extends JFrame {

    JPanel jp;
    JTextArea area;
    Container c;
    Font fon;

    JTextArea_1() {
        c = this.getContentPane();
        c.setLayout(null);

        area = new JTextArea("TTTTT");
        //area = new JtextArea(10,15);
        //area = new JTextArea();
        area.setBounds(50, 50, 160, 140);
        area.setBackground(Color.red);
        area.setForeground(Color.blue);
        fon = new Font("Arial", Font.BOLD, 17);
        area.setFont(fon);
        c.add(area);
        setSize(440, 440);
        setVisible(true);
        setLocation(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JTextArea_1 ob = new JTextArea_1();
    }
}
