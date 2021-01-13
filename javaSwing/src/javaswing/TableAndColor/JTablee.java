
package javaswing.TableAndColor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTablee extends JFrame{
     Container c;
     JTable table;
     JLabel label;
     Font fon;
     String[]  cols = {"ID","NAME","GPA"};
     String[][] rows = {
         {"101","Karim","3.98"},
         {"102","Rarim","3.99"},
         {"103","Larim","3.48"},
         {"104","Tarim","3.32"},
         {"105","Barim","3.78"},
         {"106","Garim","3.99"},
         {"107","Karim","3.98"},
         {"108","Rarim","3.99"},
         {"109","Larim","3.48"},
         {"110","Tarim","3.32"},
         {"111","Barim","3.78"},
         {"112","Garim","3.99"},
         {"113","Larim","3.48"},
         {"114","Tarim","3.32"},
         {"115","Barim","3.78"},
         {"116","Garim","3.99"},
     
     };
     JScrollPane pane;
    JTablee (){
        
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        fon = new Font("Arial",Font.BOLD,16);
        
        label = new JLabel("Student Details");
        label.setBounds(170,15,120,30);
        label.setForeground(Color.black);
        label.setFont(fon);
        c.add(label);
                
        table = new JTable(rows,cols);
        //table.setEnabled(false);
        table.setForeground(Color.blue);
        table.setFont(fon);
        table.setSelectionBackground(Color.lightGray);
        
        pane = new JScrollPane(table);
        pane.setBounds(20,50,445,170);
        c.add(pane);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JTablee ");
        setBounds(100, 100, 500, 350);
        setVisible(true);
    }
    public static void main(String[] args) {
        JTablee jf = new JTablee ();
    }
}
