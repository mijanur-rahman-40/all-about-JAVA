package Polymorphism_7;

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }

    @Override
    public String accelerate() {
        return "Ford -> accleration";
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine";
    }  
}