package Inheritance_part1_6;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int wide;

    public Animal(String name, int brain, int body, int size, int wide) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.wide = wide;
    }
    public void eat() {
        System.out.println("Animal.eat() called");
    }
    
    public void moive() {
        
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWide() {
        return wide;
    }
    
}
