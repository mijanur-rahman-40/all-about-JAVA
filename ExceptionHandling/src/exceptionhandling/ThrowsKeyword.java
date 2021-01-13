
package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException,ArithmeticException,SQLException{
     
        File f = new File("test2.txt");
        Scanner sc;
        String input = "";
        sc = new Scanner(f);
        input = sc.nextLine();
    
   
   }
}
  

