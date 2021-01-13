
package javaswing.TableAndColor;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTabelof{
    JTable table;
    public JTabelof(){
        String[] colums = {"Name","Age","Gender"};
        String[][] data = {{"Raju","18","Male"},
                          {"Riru","16","Female"},
                          {"panku","32","male"},
                          {"Jake","30","Male"},
                          {"ere","30","Male"},
                          {"Jerest","350","feMale"},
                          {"tyeye","350","feMale"}}; 
       table = new JTable(data,colums);
       table.setPreferredScrollableViewportSize(new Dimension(450,63));
       table.setFillsViewportHeight(true);
       JScrollPane jps = new JScrollPane(table);
       
       JFrame frame = new JFrame();
        frame.add(jps);
        frame.setTitle("Table Bana");
        frame.setSize(500,500);
        frame.setLocation(300, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       JTabelof ob = new JTabelof();
    }
}
