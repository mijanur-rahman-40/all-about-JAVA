package Composition_Part2__3;

public class Car extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car(int doors, int engineCapacity, String name) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
    
}
