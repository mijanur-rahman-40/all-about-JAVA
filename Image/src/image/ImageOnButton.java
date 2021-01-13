
package image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageOnButton {
    JFrame fr;
    JPanel panel;
    JButton button;
    ImageOnButton(){
        
        fr = new JFrame();
        panel = new JPanel();
        
        
        //button.setIcon(new ImageIcon("D:\\family\\PNJ Emage\\My image.png"));
        //panel.add(button);
      
        fr.add(panel);  fr.validate();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("ImageOnButton");
        fr.setSize(500,300);
        fr.setLocation(200,200);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        ImageOnButton ob = new ImageOnButton();
    }
}
