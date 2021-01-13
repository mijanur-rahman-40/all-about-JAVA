
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListMultipleSelection extends JFrame{
     JScrollPane scroll,scroll1;
    String[] foods = {"cake","bread","juice","meat","water","fruit","rice"};
    JFrame frame;
    JPanel panel; 
    JList leftlist,rightlist;
    JButton button;
    Font fon;
     JListMultipleSelection() {
        
       Container c = this.getContentPane();
       c.setLayout(new FlowLayout());
       c.setBackground(Color.green);
       
       fon = new Font("Arial",Font.BOLD,15);
      
        panel = new JPanel();
        
        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scroll = new JScrollPane(leftlist);
        
        button = new JButton("Move -->");
        button.setBounds(50,200,60,30);
        button.setFont(fon);
        button.setBackground(Color.black);
        button.setForeground(Color.yellow);
        
        button.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               rightlist.setListData(leftlist.getSelectedValues());
           }
        });
        
        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scroll1 = new JScrollPane(rightlist);
        
        
        panel.add(button);
        panel.add(scroll);
        panel.add(scroll1);
        panel.setBounds(3,3,377,555);
        panel.setBackground(Color.pink);

        c.add(panel);
       
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 600);
        setTitle("  JListwithListener ");
        setVisible(true);
    }
    public static void main(String[] args) {
        JListMultipleSelection ifd = new  JListMultipleSelection();
    }
}
