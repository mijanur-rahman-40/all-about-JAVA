
package javaswing.CheckAndComboBox;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxMethods extends JFrame{
     Container c;
    JComboBox combo;
    String [] language = {"C","C++","Java","Phyton","Hg","joi"};
    JComboBoxMethods (){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBounds(10, 10, 400, 600);
        c.setBackground(Color.pink);
        
       combo = new JComboBox(language);
      //combo = new JComboBox();
        combo.setBounds(50,150,100,50);
        combo.setBackground(Color.green);
        combo.setEditable(true);
        /*
        combo.addItem("Fortran");
        combo.addItem("c");
        combo.addItem("Java");
        combo.addItem("Phyton");
        combo.addItem("java");
*/
        combo.removeItem("Java");
        combo.removeItemAt(1);
        //combo.removeAllItems();
        //combo.setSelectedIndex(3);
        //combo.setSelectedItem("Phyton");
        c.add(combo);
        
        
       // System.out.println("Total Items  = : "+combo.getItemCount());
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0,0,400,600); 
       setTitle("JCheckbox");
       setVisible(true);
    }
    public static void main(String[] args) {
        JComboBoxMethods ob = new JComboBoxMethods();
    }
}


