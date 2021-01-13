/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180402;

/**
 *
 * @author Teacher303LAB
 */
public class Test {
    
    static void show() {

        try {
            int a = 10, b = 10;
            int c = a / b;
            System.out.println("c = " + c);

            int arr[] = new int[10];
            arr[9] = 100;
            arr[10] = 101;
        } catch (ArithmeticException e) {
            System.out.println("catch 1 #" + e);
            System.out.println("#" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch 2 #" + e);
            System.out.println("#" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("catch 3 #" + e);
            System.out.println("#" + e.getMessage());
        }

        System.out.println("After Catch");

    }

    public static void main(String args[]) {
        //System.out.println("Test");
        show();

    }
    
}
