/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Master_Challenge_9;

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
        
        System.out.println("");
        
        HealthlyBurger healthlyBurger = new HealthlyBurger("Bacon", 5.67);
        healthlyBurger.addHambargerAddition1("Egg", 5.43);
        healthlyBurger.itemizHambarger();
        healthlyBurger.addHambargerAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is: "+ healthlyBurger.itemizHambarger());
        
        System.out.println("");
        
        DeluxeBurger db = new DeluxeBurger();
        db.addHambargerAddition1("Should not do this", 50.53);
        db.itemizHambarger();
    }
}
