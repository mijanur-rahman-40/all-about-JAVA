
package javaswing.MenuAndToggleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JManuActionListener extends JFrame implements ActionListener{
    Container c;
    JMenuBar bar;
    JMenu file, edit, help;
    JMenuItem newitem, openitem, exititem, cutitem, copyitem, pasteitem, selectitem;
     JManuActionListener(){
         c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);

        bar = new JMenuBar();
        this.setJMenuBar(bar);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        bar.add(file);
        bar.add(edit);
        bar.add(help);

        newitem = new JMenuItem("New");
        openitem = new JMenuItem("Open");
        exititem = new JMenuItem("Exit");
        cutitem = new JMenuItem("Cut");
        copyitem = new JMenuItem("Copy");
        pasteitem = new JMenuItem("Paste");
        selectitem = new JMenuItem("Select");
        
        file.add(newitem);
        file.add(openitem);
        file.add(exititem);
        
        edit.add(cutitem);
        edit.add(copyitem);
        
        help.add(pasteitem);
        help.add(selectitem);

        newitem.addActionListener(this);
        exititem.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JManuBar_1 ");
        setBounds(10, 10, 350, 450);
        setVisible(true);
     }
     
      @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newitem){
            JFrame newfrme = new JFrame();
            newfrme.setVisible(true);
            newfrme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newfrme.setBounds(10,10,300,300);
            newfrme.setTitle("New Frame");
        }
        else if(e.getSource() == exititem){
            System.exit(0);
        }
        
    }
     public static void main(String[] args) {
         JManuActionListener kf = new  JManuActionListener();
    }

   
}
