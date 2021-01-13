package javaswing.MenuAndToggleButton;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JManuSimple extends JFrame {

    Container c;
    JMenuBar bar;
    JMenu file, edit, help;
    JMenuItem newitem, openitem, exititem, cutitem, copyitem, pasteitem, selectitem;

    JManuSimple() {
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
        edit.add(pasteitem);
        edit.add(newitem);
        
        help.add(pasteitem);
        help.add(selectitem);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JManuBar_1 ");
        setBounds(10, 10, 350, 450);
        setVisible(true);
    }

    public static void main(String[] args) {
        JManuSimple jf = new JManuSimple();
    }

}
