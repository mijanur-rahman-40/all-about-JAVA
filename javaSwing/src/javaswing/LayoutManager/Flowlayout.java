
package javaswing.LayoutManager;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Flowlayout extends JFrame {
    Container c;
    //JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JButton buttons[];
    FlowLayout flow;
    Flowlayout(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        
        //flow = new FlowLayout();
         
        flow = new FlowLayout(FlowLayout.LEFT,10,15);
        flow.setHgap(20);
        flow.setVgap(20);
        c.setLayout(flow);
        
        buttons = new JButton[9];
        
        for(int i=0; i<9; i++){
            buttons[i] = new JButton(""+ (i+1) );
            buttons[i].setBounds(i+4,i+4,i*4+20,i*4+30);
            c.add(buttons[i]);
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" Layoutmanagerr ");
        setBounds(100, 100, 400, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        Flowlayout ob = new Flowlayout();
    }
}
