package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelFrameEtc {

    JTextField testfield;
    JLabel label;
    JButton button1;
    JButton button2;

    PanelFrameEtc() {
        //create three components
        label = new JLabel("Enter your name: ");
        testfield = new JTextField(10);
        button1 = new JButton("Su");
        button1.setBounds(100,200,50,50);
        button1.addActionListener(new ButtonListener());
        /*
          button2 = new JButton("Cancel");
         button2.addActionListener(new ButtonListener());
         */

        //Create  panel and add Components to panel
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(testfield);
        panel.add(button1);
        // panel.add(button2);

        JFrame ob = new JFrame("Title");
        //ob.getContentPane().add(panel);
        ob.add(panel);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Title");
        ob.setSize(500, 300);
        ob.setLocation(200, 200);
        ob.setVisible(true);

    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //  System.out.println("Name = "+testfield.getText());
            if (e.getActionCommand().equalsIgnoreCase("submit")) {
                System.out.println("Submit Clicked");
            } else //System.out.println("Hello "+e.getActionCommand());
            {
                System.out.println("Cancel Cliked");
            }
        }
    }

}

class test {

    public static void main(String[] args) {
        PanelFrameEtc ob1 = new PanelFrameEtc();
    }
}
