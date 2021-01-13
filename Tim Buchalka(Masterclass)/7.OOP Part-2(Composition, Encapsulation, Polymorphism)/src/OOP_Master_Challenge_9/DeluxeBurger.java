package OOP_Master_Challenge_9;

/**
 *
 * @author jahid
 */
public class DeluxeBurger extends Hambarger{

    public DeluxeBurger() {
        super("Delex", "Sausage and Bacon", 14.54, "white");
        super.addHambargerAddition1("Chips", 2.75);
        super.addHambargerAddition2("Drink", 1.81);
    }

    @Override
    public void addHambargerAddition4(String name, double price) {
        System.out.println("Can not add additional item to a delex barger");
    }

    @Override
    public void addHambargerAddition3(String name, double price) {
        System.out.println("Can not add additional item to a delex barger");
    }

    @Override
    public void addHambargerAddition2(String name, double price) {
        System.out.println("Can not add additional item to a delex barger");
    }

    @Override
    public void addHambargerAddition1(String name, double price) {
        System.out.println("Can not add additional item to a delex barger");
    }
    
    
}
