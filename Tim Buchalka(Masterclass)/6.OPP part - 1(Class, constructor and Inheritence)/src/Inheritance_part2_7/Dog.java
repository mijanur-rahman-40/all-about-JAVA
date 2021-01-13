package Inheritance_part2_7;

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
    
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    } 
    /*
    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }    
    */
    public void run() {
        System.out.println("Dog.run() called");
        super.move(10);
       //If I put super.move() then it will call Animal class move and if write only move then Dog class move will call
        //And if we delete override move method then as Dog class has no move method so super.move(); and also move(); will call Animal class move meth
    }

    private void moveleg(int speed) {
        System.out.println("Dog.moveleg() called");
    }
    
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveleg(speed);
        super.move(speed); //To change body of generated methods, choose Tools | Templates.
    }

    
}