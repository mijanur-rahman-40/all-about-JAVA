
package javaswing.TableAndColor;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class J_Colorchosser extends JFrame{
     Container c;
     JButton button;
    private J_Colorchosser(){
        c = this.getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(null);
        
        button  = new JButton("Choose a color");
        button.setBounds(40,50,150,50);
        c.add(button);
        
        button.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                  Color color = JColorChooser.showDialog(null,"Select a color", Color.yellow);
               c.setBackground(color);
              }
        });
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(" TabbedPane ");
        setBounds(100, 100, 500, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        J_Colorchosser ij = new J_Colorchosser();
    }
}
