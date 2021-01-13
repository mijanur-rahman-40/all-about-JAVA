
package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        int i = 0, j= 5, k = 0;
       // k = j/i; //unchecked
        File f = new File("G:\\Java Programming test.txt");
        Scanner sc;
        String input = "abc";
        try{
        sc = new Scanner(f); //checked
        input = sc.nextLine();
        }
        catch(FileNotFoundException e){
           System.out.println("File not found");     
         }
       // sc.close();
        System.out.println(input);
   
   }
}
