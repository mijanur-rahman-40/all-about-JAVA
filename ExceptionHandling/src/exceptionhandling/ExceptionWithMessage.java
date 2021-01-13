
package exceptionhandling;

import java.util.Scanner;

public class ExceptionWithMessage extends Exception{
     public ExceptionWithMessage(String str){
         super(str);
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter a number");
        x =  sc.nextInt();
        try{
        if(x>10){
            //throw new Exception("Message or number can not be greater than ");
         throw new ExceptionWithMessage("x can not be up 10");
        }
      } 
        catch(ExceptionWithMessage e){
            e.printStackTrace();
        }
       catch(Exception e){
           //System.out.println("x cannot be grater then 10");
          e.printStackTrace();
       }
    }
}
