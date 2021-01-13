package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListt extends JFrame{
    JScrollPane scroll;
    String[] colors = {"black", "blue", "red", "white","yellow", "blue", "red", "white"};
    JFrame frame;
    JPanel panel; 
    JList list;
    JListt() {
        
       Container c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.green);
      
        panel = new JPanel();
        list = new JList(colors);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scroll = new JScrollPane(list);
        scroll.setBounds(10,100,150,100);
        
        panel.add(scroll);
        panel.setBounds(3,3,377,555);
        panel.setBackground(Color.pink);

        c.add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 600);
        setTitle("  JListt ");
        setVisible(true);
    }

    public static void main(String[] args) {
        JListt jc = new JListt();
    }
}
