
package javaswing.LabelAndPassword;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordColor extends JFrame{
   
    Container c;
    JPasswordField pass;
    Font fon ;

   JPasswordColor() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        
        pass  = new JPasswordField();
        fon = new Font("Arial",Font.BOLD,25);
        pass.setBounds(50,20,150,50);
        pass.setBackground(Color.pink);
        pass.setForeground(Color.yellow);
        pass.setEchoChar('&');
        pass.setFont(fon);
        
        
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPasswordField ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(pass);

    }
}

class topo12 {
    public static void main(String[] args) {
        JPasswordColor ob = new JPasswordColor();
    }
}


