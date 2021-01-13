
package javaswing.LabelAndPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFeldFontStyle extends JFrame{
   
    Container c;
    JPasswordField pass;
    Font fon ;

   JPasswordFeldFontStyle() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
       
        
        pass  = new JPasswordField();
        fon = new Font("Arial",Font.BOLD,25);
        pass.setBounds(50,60,150,50);
        pass.setEchoChar('&');
        pass.setFont(fon);
        pass.setBackground(Color.black);
        pass.setForeground(Color.blue);
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPasswordField ");
        setSize(500, 300);
        setLocation(200, 200);
        setVisible(true);
        c.add(pass);

    }
}

class topo1 {

    public static void main(String[] args) {
        JPasswordFeldFontStyle ob = new JPasswordFeldFontStyle();
    }
}


