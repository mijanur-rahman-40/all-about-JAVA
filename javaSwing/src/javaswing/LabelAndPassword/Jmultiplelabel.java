
package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// aei code eproblem ase

public class Jmultiplelabel  extends JPanel {
JLabel isbnLabel,authorLabel,titleLabel,priceLabel;
  JTextField isbnTextFld,authorTextFld,titleTextFld,priceTextFld;
    public Jmultiplelabel() {
         JPanel panel1 = new JPanel();
        setBackground(Color.yellow);

        setLayout(new GridBagLayout());

         isbnLabel = new JLabel("ISBN: ");
         isbnTextFld = new JTextField(10);

         authorLabel = new JLabel("Author: ");
         authorTextFld = new JTextField(10);

        JLabel titleLabel = new JLabel("Title: ");
         titleTextFld = new JTextField(10);

         priceLabel = new JLabel("Price: ");
         priceTextFld = new JTextField(10);

        JButton submitBtn = new JButton("Submit");

        JTextArea textArea = new JTextArea(10, 30);
       
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

         panel1.add(isbnLabel);
        panel1.add(authorLabel);
        panel1.add(titleLabel);
        panel1.add(priceLabel);
        
        add(isbnLabel, gbc);
        gbc.gridy++;
        add(authorLabel, gbc);
        gbc.gridy++;
        add(titleLabel, gbc);
        gbc.gridy++;
        add(priceLabel, gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        add(isbnTextFld, gbc);
        gbc.gridy++;
        add(authorTextFld, gbc);
        gbc.gridy++;
        add(titleTextFld, gbc);
        gbc.gridy++;
        add(priceTextFld, gbc);
        gbc.gridy++;
        add(submitBtn, gbc);

        gbc.gridx++;
        gbc.gridy = 0;
        gbc.gridheight = gbc.REMAINDER;
        add(new JScrollPane(textArea), gbc);
        panel1.add(this);
      
        
        JFrame frame1 = new JFrame("lbels");
      
        frame1.add(panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400,200);
        frame1.setLocation(400, 400);
        frame1.setVisible(true);
    }
} 
class hid{
    public static void main(String[] args) {
        Jmultiplelabel ob = new Jmultiplelabel();
    }
}
