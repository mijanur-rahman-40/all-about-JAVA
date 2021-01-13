/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java20180404;

/**
 *
 * @author Teacher303LAB
 */
public class Test {

    static void show() {
        //System.out.println("Test");
        try {
            int a = 10, b = 10;
            System.out.println("## 1");
            int c = a / b;
            System.out.println("c = " + c);
            System.out.println("## 2");
            try {
                int arr[] = new int[10];
                arr[8] = 10;
                arr[10] = 11;
                System.out.println("## 3");
            } catch (ArithmeticException e) {
                System.out.println("caught in arrayindex exception" + e);
            }

            throw new IllegalAccessException("Test");
        } catch (RuntimeException e) {
            System.out.println("caught in runtime exception#" + e);
        } 
        catch (Exception e) {
            System.out.println("caught in exception#" + e);
        }

        System.out.println("After Catch");

    }

    public static void main(String args[]) {
        show();
    }
}
