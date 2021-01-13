package Inharitance_Challenge_part1_and_2_13_14;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelovity;
    private int currentDirection;
    
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        
        this.currentDirection = 0;
        this.currentVelovity = 0;
    }
    
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(). Steering at " + currentDirection + " degree");
    }
    
    public void move(int velocity, int direction) {
        currentVelovity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelovity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelovity() {
        return currentVelovity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    
    public void stop() {
        this.currentVelovity = 0;
    }
}
