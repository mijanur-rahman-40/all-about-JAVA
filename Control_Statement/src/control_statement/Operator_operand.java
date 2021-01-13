
package first_project;

import java.util.Scanner;
public class Operator_operand {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
   long  num1,num2,result;
    System.out.println(" Enter two number");
    
    num1=input.nextInt();
    num2=input.nextInt();
    
         result=num1+num2;
        System.out.println("First result "+ result);
        
        result=num1-num2;
        System.out.println("Second result "+result);
        
        result=num1*num2;
        System.out.println("Third result "+result);
        
        result=num1%num2;
        System.out.println("forth result "+result);
        
    
}
}
