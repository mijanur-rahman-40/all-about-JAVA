package javaswing.AllListenerAndScrollBar;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VowelCounter extends JFrame {

    Container c;
    JLabel label, lab, a, e, i, o, u, a1, e1, i1, o1, u1, lab1;
    JTextArea area;
    Font fon, fon1, fn1;
    JScrollPane scroll;
    int totalVowel = 0;
    int a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0;

    VowelCounter() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        fon = new Font("Arial", Font.BOLD, 18);

        label = new JLabel("Enter The Text : ");
        label.setBounds(10, 9, 170, 100);
        label.setForeground(Color.blue);
        label.setFont(fon);
        c.add(label);

        fon1 = new Font("Arial", Font.BOLD, 15);
        fn1 = new Font("Arial", Font.BOLD, 25);

        area = new JTextArea();
        area.setBackground(Color.green);
        area.setForeground(Color.black);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(fon1);
        scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(160, 10, 350, 90);
        c.add(scroll);

        lab = new JLabel("Total Number of Vowels  : ");
        a = new JLabel("a  =  ");
        e = new JLabel("e  =  ");
        i = new JLabel("i   =  ");
        o = new JLabel("o  =  ");
        u = new JLabel("u  =  ");

        lab.setBounds(150, 50, 300, 150);
        lab.setForeground(Color.red);
        lab.setFont(fon1);
        c.add(lab);

        a.setBounds(150, 120, 90, 90);
        a.setForeground(Color.YELLOW);
        a.setFont(fn1);
        c.add(a);

        e.setBounds(150, 150, 90, 90);
        e.setForeground(Color.MAGENTA);
        e.setFont(fn1);
        c.add(e);

        i.setBounds(150, 180, 90, 90);
        i.setForeground(Color.blue);
        i.setFont(fn1);
        c.add(i);

        o.setBounds(150, 210, 90, 90);
        o.setForeground(Color.white);
        o.setFont(fn1);
        c.add(o);

        u.setBounds(150, 240, 90, 90);
        u.setForeground(Color.black);
        u.setFont(fn1);
        c.add(u);

        a1 = new JLabel();
        e1 = new JLabel();
        i1 = new JLabel();
        o1 = new JLabel();
        u1 = new JLabel();
        lab1 = new JLabel();

        lab1.setBounds(340, 50, 130, 150);
        lab1.setFont(fn1);
        lab1.setForeground(Color.blue);
        c.add(lab1);

        a1.setBounds(205, 113, 100, 100);
        a1.setFont(fn1);
        c.add(a1);

        e1.setBounds(205, 143, 100, 100);
        e1.setFont(fn1);
        c.add(e1);

        i1.setBounds(205, 173, 100, 100);
        i1.setFont(fn1);
        c.add(i1);

        o1.setBounds(205, 203, 100, 100);
        o1.setFont(fn1);
        c.add(o1);

        u1.setBounds(205, 234, 100, 100);
        u1.setFont(fn1);
        c.add(u1);

    
            area.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getSource() == area) {
                        if (e.VK_A == e.getKeyCode()) {
                            a_count++;
                            totalVowel++;
                        }
                        if (e.VK_E == e.getKeyCode()) {
                            e_count++;
                            totalVowel++;
                        }
                        if (e.VK_I == e.getKeyCode()) {
                            i_count++;
                            totalVowel++;
                        }
                        if (e.VK_O == e.getKeyCode()) {
                            o_count++;
                            totalVowel++;
                        }
                        if (e.VK_U == e.getKeyCode()) {
                            u_count++;
                            totalVowel++;
                        }
                    }

                    a1.setText(" " + a_count);
                    e1.setText(" " + e_count);
                    i1.setText(" " + i_count);
                    o1.setText(" " + o_count);
                    u1.setText(" " + u_count);
                    lab1.setText(" " + totalVowel);

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }

            });

        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" VowelCounter");
        setBounds(100, 100, 550, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        VowelCounter ob = new VowelCounter();
    }
}
