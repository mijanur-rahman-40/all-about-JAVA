
package javaswing.ShapesAndOptionPane;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class OptionPane {
    public static void main(String[] args)
    {
                //The work
       JOptionPane.showMessageDialog(null, "student inserted successfully");
       JOptionPane.showMessageDialog(null,"Text","Title",JOptionPane.ERROR_MESSAGE);
		
      String name = JOptionPane.showInputDialog(null,"Enter Name:");
		System.out.println(" "+name);
		
		JOptionPane.showMessageDialog(null,"This is the Error Message", "Error Title Box", JOptionPane.ERROR_MESSAGE);
		int response = JOptionPane.showConfirmDialog(null,"Are you sure?");
		int yes=JOptionPane.YES_OPTION;
		int no=JOptionPane.NO_OPTION;
		int cancel=JOptionPane.CANCEL_OPTION;
		if(response==yes)
		{
			System.out.println("Thank You!");
		}
                else if(response==no)
		{
			System.out.println("Try Again!");
		}
                else
		{
			System.out.println("Canceled!");
		}
                
	}
}