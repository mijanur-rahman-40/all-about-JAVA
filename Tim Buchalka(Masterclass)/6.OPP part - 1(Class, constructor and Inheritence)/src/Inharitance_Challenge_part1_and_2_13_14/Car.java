package Inharitance_Challenge_part1_and_2_13_14;

public class Car extends Vehicle{
    private int wheel;
    private int doors;
    private int gears;
    private boolean isManual;
    
    private int currentGear;

    public Car(String name, String size, int wheel, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }
    
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelovity() : Velocity " + speed + " direction");
        move(speed, direction);
    }

    /*
    @Override
    public void stop() {
        super.stop(); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    
    
}
