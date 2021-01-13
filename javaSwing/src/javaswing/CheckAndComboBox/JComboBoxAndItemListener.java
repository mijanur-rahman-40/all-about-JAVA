package javaswing.CheckAndComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxAndItemListener {

    JComboBoxAndItemListener() {
        String[] Options = {"Raju", "Ritu", "Dulal", "Banana"};
        JComboBox<String> combobox = new JComboBox<String>(Options);
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("ComboBox");
        frame.add(panel);
        panel.add(combobox);
        frame.setSize(300, 300);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class ItemHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Object combobox = null;
            if (e.getSource() == combobox) {
            }

        }
    }

    public static void main(String[] args) {
        JComboBoxAndItemListener ob = new JComboBoxAndItemListener();
    }

}
