
package exceptionhandling;

import java.util.Random;

public class Handleexceotion {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        Random r = new Random();
        for(int i=0; i<32; i++){
            try{
               b  = r.nextInt();
               c = r.nextInt();
               a = 1234/(b/c);
            }catch(ArithmeticException e){
                System.out.println("Division by Zero");
                System.out.println("b : "+b+"  c : "+c);
                a = 0;
                //set a to zero and continur;
            }
            System.out.println("a : "+a);
        }
    }
}
