
package javaswing.Moucslistener.MYcode;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouceAndArea extends JFrame{
    Container c;
    JTextArea area;
    JTextField field;
    JScrollPane scroll;
    Font fon1;
    MouceAndArea(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        fon1 = new Font("Arial", Font.BOLD, 18);
        
        field = new JTextField();
        field.setBackground(Color.green);
        field.setBounds(60,20,280,80);
        field.setFont(fon1);
        c.add(field);
        
        area = new JTextArea();
        area.setBackground(Color.black);
        area.setLineWrap(true);
        area.setForeground(Color.yellow);
        area.setWrapStyleWord(true);
        area.setFont(fon1);
        scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(40, 150, 320, 200);
        c.add(scroll);
        
        field.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                area.append("MouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                area.append("MousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                area.append("MouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                area.append("MouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                area.append("MouseExited\n");
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" MouceAndArea");
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        MouceAndArea ob = new MouceAndArea();
    }
}
