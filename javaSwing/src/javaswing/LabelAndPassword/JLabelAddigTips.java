package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelAddigTips extends JFrame {

    Container c;
    JLabel label1, label2;
    JTextField fl, f2;
    Font fn1, fn2;

    JLabelAddigTips() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        fn1 = new Font("Arial", Font.BOLD, 14);

        label1 = new JLabel("Enter your password : ");
        label1.setBounds(50, 20, 190, 50);
        label1.setFont(fn1);
        label1.setForeground(Color.blue);
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setToolTipText("Are you raju ?");
        System.out.println(label1.getText());
        String str = label1.getToolTipText();
        //System.out.println(str);
        label2 = new JLabel(str);
        label2.setBounds(50, 100, 190, 50);
        fn2 = new Font("Arial", Font.ITALIC, 30);
        label2.setFont(fn2);
        c.add(label1);
        c.add(label2);
    }

    public static void main(String[] args) {
        JLabelAddigTips fr = new JLabelAddigTips();
        fr.setVisible(true);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50, 50, 330, 330);
        fr.setTitle("JLabelFontSizeAndStyle");
    }
}
