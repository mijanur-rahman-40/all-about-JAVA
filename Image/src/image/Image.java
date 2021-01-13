
package image;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

 class SimpleDialog3a {

    public static void main(String[] args){
//ImageIcon ob1 = new ImageIcon("D:\\\\family\\\\Personal pictures\\\\pictures/IMG_20180107_231005.jpg");
    
    JPanel panel = new JPanel();
      
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   // ImageIcon pc = new ImageIcon("F:\\");
   //ImageIcon pc = new ImageIcon("D:\\\\family\\\\Personal pictures\\\\pictures/IMG_20180107_231005.jpg");
     ImageIcon pc = new ImageIcon("F:\\Java Programming/leftmouth.PNG");
    ImageIcon pc1 = new ImageIcon("leftmouth.PNG");
   JLabel lab = new JLabel(pc, SwingConstants.CENTER);
   JLabel lab1 = new JLabel(pc1, SwingConstants.LEFT);
    panel.add(lab);
    frame.add(panel);
    frame.add(lab1);
    frame.setSize(400, 400);
    frame.setVisible(true);
/*
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Title");
        ob.setForeground(Color.darkGray);
        ob.setSize(600,500);
        ob.setLocation(300,200);
        ob.setVisible(true);
        */
    
    
    }

}


/*
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class DisplayImage extends JFrame {
    
    public DisplayImage() {

        initUI();
    }

    private void initUI() {       
        
        ImageIcon ii = loadImage();

        JLabel label = new JLabel(ii);

        createLayout(label);

        setTitle("Image");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private ImageIcon loadImage() {

        ImageIcon ii = new ImageIcon("D:\\family\\Personal pictures\\pictures/IMG_20180107_231005.jpg");
        return ii;
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
        );

        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            DisplayImage ex = new DisplayImage();
            ex.setVisible(true);
        });
    }
}
*/