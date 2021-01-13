
package javaswing.RadioButtonAndJList;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListwithListener extends JFrame{
     JScrollPane scroll;
    String[] colorsname = {"black", "blue", "red", "white","yellow", "green", "orange"};
    Color[] colors = {Color.black,Color.blue,Color.red,Color.white,
    
    Color.yellow,Color.green,Color.orange
    };
    JFrame frame;
    JPanel panel; 
    JList list;
    JListwithListener() {
        
       Container c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.green);
      
        panel = new JPanel();
        list = new JList(colorsname);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scroll = new JScrollPane(list);
        //scroll.setBounds(10,100,150,100);
        
        panel.add(scroll);
        panel.setBounds(3,3,377,555);
        panel.setBackground(Color.pink);

        c.add(panel);
        
        list.addListSelectionListener(new ListSelectionListener(){
           @Override
           public void valueChanged(ListSelectionEvent e) {
               panel.setBackground(colors[list.getSelectedIndex()]);
           }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 600);
        setTitle("  JListwithListener ");
        setVisible(true);
    }

    public static void main(String[] args) {
       JListwithListener jc = new JListwithListener();
    }
}


