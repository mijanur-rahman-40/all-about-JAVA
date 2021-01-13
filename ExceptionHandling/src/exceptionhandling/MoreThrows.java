
package exceptionhandling;

import java.util.Scanner;

public class MoreThrows  {
   public void print() throws Exception{
       
   }
   
   public void print1() throws RuntimeException{
       //if you use RuntimeException you do not need to use try catch block
   }  

}

class main{
    public static void main(String[] args) {
        MoreThrows obj = new  MoreThrows();
        try{
        obj.print();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        obj.print1();
    }
    
}