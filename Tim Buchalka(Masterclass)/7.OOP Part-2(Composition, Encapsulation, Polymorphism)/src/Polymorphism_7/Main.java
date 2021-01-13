package Polymorphism_7;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    
    public String startEngine() {
       return "Car -> startEngine";
    }
    
    public String accelerate() {
        return "Car -> accleration";
    }
    
    public String brake() {
        return "Car -> brake";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Mitsubishi -> break";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accleration";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine";
    }
    
    
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        
        Ford Ford = new Ford(6, "Forld Falcon");
        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());
    }
}
