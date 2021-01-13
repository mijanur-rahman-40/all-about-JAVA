/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Master_Challenge_8;

/**
 *
 * @author jahid
 */
public class Main {
    public static void main(String[] args) {
        Hambarger hambarger = new Hambarger("Basic", "Sausage", 3.56, "White");
        double price = hambarger.itemizHambarger();
        hambarger.addHambargerAddition1("Tomato", 0.27);
        hambarger.addHambargerAddition2("Lettuce", 0.75);
        hambarger.addHambargerAddition3("Cheese", 1.13);
        System.out.println("Total Barger price is: " + hambarger.itemizHambarger());
    }
}
