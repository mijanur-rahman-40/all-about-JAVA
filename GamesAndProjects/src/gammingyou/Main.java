
package gammingyou;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePlay game = new GamePlay();
        frame.setBounds(10,10,905,700);
        frame.setBackground(Color.blue);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
       
    }
    
}
