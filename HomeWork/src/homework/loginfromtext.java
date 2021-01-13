package homework;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginfromtext {

    JFrame frame1, frame2;
    JLabel label1, label2;
    JPanel panel1, panel2;
    JButton button, button1;
    JTextField field1, field2;

    loginfromtext() {
        label1 = new JLabel("Username :");
        label2 = new JLabel("Password :");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        button = new JButton("Login");
        button1 = new JButton("Cancel");
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(field1);

        panel1.add(label2);
        panel1.add(field2);
        panel1.add(button);
        panel1.add(button1);

        button.addActionListener(new ButtonListener45());
        button1.addActionListener(new ButtonListener46());
        frame1 = new JFrame("Login Page");
        frame1.add(panel1);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 200);
        frame1.setLocation(400, 400);
        frame1.setVisible(true);
    }

    class ButtonListener46 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    class ButtonListener45 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Map<String, String> map = new HashMap<String, String>();
            File file = new File("two.txt");

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {

            }

            String st, user, pass;
            try {
                while ((st = br.readLine()) != null) {
                    String[] tokens = st.split("&");
                    user = tokens[0];
                    pass = tokens[1];
                    map.put(user, pass);
                    // System.out.println("User : "+user+" Pass: "+pass);
                }
            } catch (IOException ex) {

            }
            // System.out.println("$$ : "+map.get("Aff"));
            String str4 = field1.getText().toString();
            String str5 = field2.getText().toString();

            if (str5.equals(map.get(str4))) {
                panel2 = new JPanel();
                JLabel label = new JLabel("Welcome : " + str4);
                panel2.add(label);

                frame2 = new JFrame("Home page");
                frame2.add(panel2);
                panel2.setBackground(Color.gray);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(400, 200);
                frame2.setLocation(400, 400);
                frame2.setVisible(true);
                frame1.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "There is an error", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public static void main(String[] args) {
        loginfromtext ob = new loginfromtext();
    }

}
