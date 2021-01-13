package Reading_User_Input_26;

import java.util.Scanner;

public class Reading_User_Input_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birth year : ");
        int yearOfBirth = input.nextInt();
        input.nextLine(); // Stop string name from take ENTER as a string 
     
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Your name is " + name + " and age is " + (2019 - yearOfBirth));
        
        input.close();
    }
}
