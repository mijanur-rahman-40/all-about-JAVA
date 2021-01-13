package javaswing.MenuAndToggleButton;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuIconAndKeyboardShortcut extends JFrame implements ActionListener {

    Container c;
    JMenuBar bar;
    JMenu file, edit, help;
    JMenuItem newitem, openitem, exititem, cutitem, copyitem, pasteitem, selectitem;
    ImageIcon cut, newimg;

    JMenuIconAndKeyboardShortcut() {
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
        edit.addSeparator();
        edit.add(copyitem);
        edit.addSeparator();

        help.add(pasteitem);
        help.add(selectitem);

        cut = new ImageIcon("src/CutImage.png");
        cutitem.setIcon(cut);

        newimg = new ImageIcon("src/newimage.png");
        newitem.setIcon(newimg);
        newitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        newitem.addActionListener(this);
        exititem.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" JMenuIconAndKeyboardShortcut");
        setBounds(10, 10, 350, 450);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newitem) {
            JFrame newfrme = new JFrame();
            newfrme.setVisible(true);
            newfrme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newfrme.setBounds(10, 10, 300, 300);
            newfrme.setTitle("New Frame");
        } else if (e.getSource() == exititem) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        JMenuIconAndKeyboardShortcut dd = new JMenuIconAndKeyboardShortcut();
    }

}
