package javaswing;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameBasic {

    JButton button;
    JFrame frame;
    JLabel lab;

    FrameBasic() {
        frame = new JFrame();
        button = new JButton("tttfddd");
        //button.setBounds(10,100,90,40);
        button.setVisible(true);
        frame.add(button);
        lab = new JLabel("NNNNNNNNNNNmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        frame.add(lab);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 400, 600);
        //frame.setBackground(Color.yellow);
        frame.setTitle("JcomboBoxItemlistener");
        frame.setLayout(null);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FrameBasic jdh = new FrameBasic();
    }

}
