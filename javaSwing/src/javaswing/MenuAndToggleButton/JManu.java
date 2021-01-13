
package javaswing.MenuAndToggleButton;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JManu {
       JMenuItem open1,open2,open3,open4;
       JMenu file1,file2,file3;
    JManu(){
         JFrame ob = new JFrame();
         JPanel panel = new JPanel();
         JMenuBar jmb = new JMenuBar();
         
         file1 = new JMenu("source");
         file2 = new JMenu("edit");
         file3 = new JMenu("project");
          
         open1 = new JMenuItem("Open file1 ....");
         open2 = new JMenuItem("Open file2 ....");
         open3 = new JMenuItem("Open file3 ....");
         open4 = new JMenuItem("Exit");
            
        file1.add(open1);
        file1.addSeparator();
        file1.add(open4);
        file2.add(open2);
        file3.add(open3);
        
        jmb.add(file1);
        jmb.add(file2);
        jmb.add(file3);
        ob.add(panel);
        ob.setJMenuBar(jmb);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Title");
        ob.setSize(500,300);
        ob.setLocation(200,200);
        ob.setVisible(true);
    }
    public static void main(String[] args) {
        JManu ob = new JManu();
    }
}
