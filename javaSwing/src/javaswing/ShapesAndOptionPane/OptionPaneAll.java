
package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.awt.event.*;
/*
 class Frame {
    public static void main(String[] args) {
       JFrame iframe=new JFrame("Title Bar Text");
               iframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               iframe.setSize(100,200);
               iframe.setLocation(150,250);
               iframe.setVisible(true);
       
    }
}
*/

 class InputStream {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    String name=sc.next();
     System.out.println("Enter regno");
     int reg=sc.nextInt();
     System.out.println("enter your cgpa");
     double cgpa=sc.nextDouble();
      System.out.println("##" +name+ " "+reg);
    }
 }
 class message {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("F:\\Java Programming Code\\Picture/upmouth.png");
       JOptionPane.showMessageDialog(null,"Student inserted Successfuly");
      JOptionPane.showMessageDialog(null,"khela hbe","Information",JOptionPane.INFORMATION_MESSAGE,img);
       JOptionPane.showMessageDialog(null,"khela hbe","Plan",JOptionPane.PLAIN_MESSAGE);
      
       JOptionPane.showMessageDialog(null,"khela hbe","Error",JOptionPane.ERROR_MESSAGE);
       
       JOptionPane.showMessageDialog(null,"khela hbe","Warning",JOptionPane.WARNING_MESSAGE);
       
       JOptionPane.showMessageDialog(null,"khela hbe","Question",JOptionPane.QUESTION_MESSAGE);
       
       String name= JOptionPane.showInputDialog(null,"Enter name: ");
       String value= JOptionPane.showInputDialog(null,"Enter the Quentity: ");
       
          System.out.println("Your name: "+name);
       System.out.println("Your value: "+value);    
       
         int response= JOptionPane.showConfirmDialog(null,"Are you sure");
        if(response==JOptionPane.YES_NO_OPTION){             System.out.println("Yes");
        }
        else{         
            System.out.println("No");        }
       Object[] optionsButtonText={"Yes Please","No Thanks"};
      int userResponse= JOptionPane.showOptionDialog(null,"Update your option?","Or nothing",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, optionsButtonText,optionsButtonText[1]);
        
       JFrame iframe=new JFrame("Title Bar Text");
               iframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               iframe.setSize(400,200);
               iframe.setLocation(150,250);
               iframe.setVisible(true);
       
    }
}


class Demo extends JFrame{
    Demo(){
        super("Title Bar Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocation(200,200);
        setVisible(true);
    }
}
class Frame{
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.setSize(500, 200);
       // ob.setLocation(200,200);
       
    }
}
  

// COmponents inside panels


class KilotoMiles{
    private JFrame frame;
    private final JPanel panel;
    private final  JLabel label;
    private final JTextField textField;
    private final JButton button;
    KilotoMiles(){
        
        //create the GUI components
        label = new JLabel("Enter a distance in kilometers");
        textField = new JTextField(15);
        button = new JButton("Calculate");
        
        //create a panel and add the components to it
        panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        //create a frame and the panel to it
        JFrame frame = new JFrame("Kilometer Converter");
        frame.add(panel);
        
        //Display the frame on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();  //size frame to fit its components
        frame.setLocationRelativeTo(null);  //center on screen
        frame.setVisible(true);
    }
}
/*
class outer{
    private class Inner{
        
    }
}
*/
/*
class ButtonListener implements ActionListener{

    void actionPerfromed(ActionEvent e){
        //Get the user input
        String userinput = textField.getText();
        double Kilometers = Double.parseDouble(userinput);
        
        //COnvert the kilometer the meter
        double meter = Kilometers*1000; 
        
        //create the output string
        String message = "You entered "+ Kilometers + "Kilometrs."+ "\nConverted to meter equals" +meter;
  
    //Display a simple dialog box showing the meter
    JOptioPane.showMessageDialog(null,message,"Kilo to meter ",JOptionPane.PLAIN_MESSAGE);
    }
    
}
class All{
    public static void main(String[] args) {
                 KilotoMiles all = new  KilotoMiles();
    }
}
*/