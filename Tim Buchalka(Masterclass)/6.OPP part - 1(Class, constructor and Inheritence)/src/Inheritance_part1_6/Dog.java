package Inheritance_part1_6;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name, int size, int wide, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, wide);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    /*
    public Dog(String name, int brain, int body, int size, int wide) {
        super(name, brain, body, size, wide);
    }
    */
    
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog.eat()2 called");
        chew();
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
