
package first_project;

import java.util.Scanner;

public class input {
   public static  void main(String[] args){
       Scanner input=new Scanner(System.in);
       int number;
       
       //System.out.printf("Enter any number = ");
        number =input.nextInt();
        System.out.printf("Number is %d\n",number);
        String name;
       name=input.next();
       //System.out.printf("String %s\n",name);
       System.out.println(name);
   }
}