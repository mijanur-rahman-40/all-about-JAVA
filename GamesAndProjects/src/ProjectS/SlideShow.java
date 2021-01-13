
package ProjectS;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener{
    Container c;
    JPanel panel;
    JButton prev,next;
    Font fon;
    ImageIcon icon;
    JLabel label;
    CardLayout cards;
    Image img,newimage;
    SlideShow(){
        
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        
        cards = new CardLayout();
        
        panel = new JPanel(cards);
        panel.setBounds(15,15,353,270);
        c.add(panel);
        
        fon = new Font("Arial",Font.BOLD,15);
        
        prev = new JButton("Previous");
        prev.setBackground(Color.black);
        prev.setForeground(Color.yellow);
        prev.setBounds(15,300,100,40);
        prev.setFont(fon);
        c.add(prev);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.yellow);
        next.setBounds(268,300,100,40);
        next.setFont(fon);
        c.add(next);
        
       
        
        String[] imagenames = {"IMG_20160915_124722.jpg","IMG_20160916_120946.jpg",
            "IMG_20161220_183805.jpg","IMG_20170121_172015.jpg","IMG_20170901_171636.jpg",
            "IMG_20170902_095602.jpg","IMG_20180504_144556.jpg"
        };
        /*
        for(String name:imagenames){
            icon = new ImageIcon("src/IMAGE/"+name);
            */
        for(int i=0; i<7; i++){
            icon = new ImageIcon("src/IMAGE/"+imagenames[i]);
            //Resize the 
            img = icon.getImage();
            newimage = img.getScaledInstance(panel.getWidth(),panel.getHeight(), Image.SCALE_SMOOTH);
            
            icon = new ImageIcon(newimage);
            label = new JLabel(icon);
            panel.add(label);
        }
        
        prev.addActionListener(this);
        next.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" SlideShow ");
        setBounds(100, 100, 400, 392);
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == prev){
          cards.previous(panel);
        }
        if(e.getSource() == next){
        cards.next(panel);
        }    
    }
    public static void main(String[] args) {
        SlideShow KV = new SlideShow();
    }

   
}
  
