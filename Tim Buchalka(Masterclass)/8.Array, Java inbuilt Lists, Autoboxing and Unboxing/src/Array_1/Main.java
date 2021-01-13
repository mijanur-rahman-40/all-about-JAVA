package Array_1;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for(int i = 0; i < myIntArray.length; i++) myIntArray[i] = i*10;
        //Passing an array
        printArray(myIntArray);
        //Take input by console
        int[] secondIntArray = getInteger(5);
        for(int i = 0; i < secondIntArray.length; i++)
            System.out.println("Element " + i + ", value is " + secondIntArray[i]);
    }


    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            System.out.println("Element " + i + ", value is " + array[i]);
    }

    //returning an array
    public static int[] getInteger(int number) {
        int[] array = new int[number];
        System.out.println("Enter five numbers");

        for(int i = 0; i < number; i++ )
            array[i] = scanner.nextInt();
        return array;
    }
}
