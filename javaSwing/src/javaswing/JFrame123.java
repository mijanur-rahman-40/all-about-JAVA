
package javaswing;

import javax.swing.JFrame;

public class JFrame123 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
       fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fr.setBounds(50, 50, 330, 330);
       fr.setTitle("Frame");
    }
}


class frame extends  JFrame{
    frame(){
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(50, 50, 330, 330);
       setTitle("Frame");
    }
}
class tr{
    public static void main(String[] args) {
        frame ov = new frame();
         ov.setVisible(true);
    }
}