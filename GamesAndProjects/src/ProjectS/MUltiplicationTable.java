package ProjectS;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MUltiplicationTable extends JFrame {

    JLabel Ilabel, tlabel;
    Container c;
    ImageIcon image;
    Font fon, fon1, fon3;
    JTextField field;
    JButton button;
    Cursor curs;
    JTextArea ta;
    int num;

    MUltiplicationTable() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        image = new ImageIcon("F:\\Java Programming Code\\Picture/Man.jpg");

        Ilabel = new JLabel();
        Ilabel.setText("Multiplication Table");
        Ilabel.setIcon(image);
        Ilabel.setBounds(45, 20, image.getIconWidth(), image.getIconHeight());
        c.add(Ilabel);

        tlabel = new JLabel("Enter any number : ");
        fon = new Font("Tahona", Font.BOLD, 20);
        tlabel.setBounds(80, 240, 250, 50);
        tlabel.setFont(fon);
        tlabel.setForeground(Color.yellow);
        c.add(tlabel);

        field = new JTextField();
        field.setBounds(270, 252, 75, 40);
        field.setBackground(Color.green);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setFont(fon);
        field.setForeground(Color.red);
        c.add(field);

        curs = new Cursor(Cursor.HAND_CURSOR);
        button = new JButton();
        fon3 = new Font("Tahona", Font.BOLD, 15);
        button.setText("Clear");
        button.setBackground(Color.GRAY);
        button.setForeground(Color.WHITE);
        button.setBounds(270, 300, 75, 40);
        button.setCursor(curs);
        button.setFont(fon3);
        c.add(button);

        ta = new JTextArea();
        fon1 = new Font("Arial", Font.BOLD, 25);
        ta.setBounds(45, 360, 300, 290);
        ta.setBackground(Color.blue);
        ta.setForeground(Color.red);
        ta.setFont(fon1);
        c.add(ta);

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String vale = field.getText();
                if (vale.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did not put any number");
                } else {
                    ta.setText("");
                    num = Integer.parseInt(field.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r, n, incr;
                        r = String.valueOf(result);
                        n = String.valueOf(num);
                        incr = String.valueOf(i);
                        ta.append(n + " X " + incr + " = " + result + "\n");
                    }
                }
            }
        });

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(null);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(45, 25, 400, 720);
        setTitle("JLabelAddingImage");

    }
}

class rit {

    public static void main(String[] args) {
        MUltiplicationTable fr = new MUltiplicationTable();

    }
}
