package SirCode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

class TestSwing3 {

    JTextField textField1, textField2;
    JLabel label1, label2;
    JButton button1;
    JButton button2;
    String username, password;
    JFrame ob;

    public TestSwing3() {
        username = "a";
        password = "a";
//Create three components
        label1 = new JLabel("Username:");
        textField1 = new JTextField(10);
        label2 = new JLabel("Password:");
        textField2 = new JTextField(10);
        button1 = new JButton("Login");
        button1.addActionListener(new ButtonListener());
        button2 = new JButton("Cancel");
        button2.addActionListener(new ButtonListener());

//Create panel and add components to panel
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button1);
        panel.add(button2);

        ob = new JFrame("Title");
//ob.getContentPane().add(panel);
        ob.add(panel);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setSize(250, 200);
        ob.setLocation(200, 200);
        ob.setVisible(true);
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
//System.out.println("Name = "+textField.getText());
            if (e.getActionCommand().equalsIgnoreCase("Login")) {
                if (textField1.getText().equalsIgnoreCase(username)
                        && textField2.getText().equalsIgnoreCase(password)) {
//System.out.println("Login");
                    // MainFrame mainFrame = new MainFrame();
                    ob.setVisible(false);
                } else {
//System.out.println("Invalid");
                    JOptionPane.showMessageDialog(null, "Username and password doesn't match",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                System.out.println("Cancel clicked");
            }
//System.out.println("Hello"+e.getActionCommand());
        }
    }

    public static void main(String args[]) {
        TestSwing3 t = new TestSwing3();
    }
}
