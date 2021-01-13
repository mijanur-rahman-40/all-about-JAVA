
package exceptionhandling;

import java.util.Scanner;

public class OwnException {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        try{
            number = sc.nextInt();
            if(number>10){
                //Exception e = new Exception();
                //throw e;
                throw new MyException1();
            }
                    
        }
        /*
        catch(Exception e){
            System.out.println("Number can be greater than 10");
            
        }
*/
         catch(MyException1 e){
            //System.out.println("Number can be greater than 10");
            
        }
        //System.out.println("Programme end");
    }
}
class MyException1 extends Exception{
    MyException1(){
        System.out.println("Number can not be 10 Constructor");
    }
}
