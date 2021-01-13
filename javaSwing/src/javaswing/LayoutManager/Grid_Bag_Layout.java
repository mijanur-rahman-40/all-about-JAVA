
package javaswing.LayoutManager;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid_Bag_Layout {
    JPanel panel;
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6;
    Grid_Bag_Layout(){
        GridBagConstraints gbc = new  GridBagConstraints();
        
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(5,5,5,5);
        
        b1 = new JButton("Button1"); 
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 6;
        gbc.fill= GridBagConstraints.VERTICAL;
        panel.add(b1,gbc);
        
        b2 = new JButton("Button2");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        panel.add(b2,gbc);
        
        b3 = new JButton("Button3");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        panel.add(b3,gbc);
        
        b4 = new JButton("Button4");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        panel.add(b4,gbc);
        
        b5 = new JButton("Button5");
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        panel.add(b5,gbc);
        
        b6 = new JButton("Button6");
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(b6,gbc);
        
     
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Grid Bag");
        frame.setSize(500,500);
        frame.setLocation(300, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Grid_Bag_Layout ob = new Grid_Bag_Layout();
    }

}
