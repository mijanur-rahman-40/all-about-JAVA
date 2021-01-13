package Reading_User_input_28;

import java.util.Scanner;

public class Reading_User_Input_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter= 0, sum = 0;
        
        while(counter < 10) {
            System.out.println("Enter a number order " + (counter + 1) + "t");
            
            boolean isInt = input.hasNextInt();
            if(isInt) {
                int number = input.nextInt();
                counter++;
                sum += number;
            }
            else {
                System.out.println("Invalid number");
            }
            input.nextLine(); //Handel end of line (ENTER key)
        }
        System.out.println("Sum is = " + sum);   
        input.close();
    }
}
