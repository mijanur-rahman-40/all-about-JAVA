package Problem_and_soluton_27;

import java.util.Scanner;

public class Problem_and_soiution_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birth year : ");
        boolean hasnumber = input.hasNextInt(); //Check if input is a number
        if(hasnumber) {
        int yearOfBirth = input.nextInt();
        input.nextLine(); // Stop string name from take ENTER as a string 
     
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Your name is " + name + " and age is " + (2019 - yearOfBirth));
        
        input.close();
        }
        else {
            System.out.println("Enter valid number ");
        }
        
    }
}
