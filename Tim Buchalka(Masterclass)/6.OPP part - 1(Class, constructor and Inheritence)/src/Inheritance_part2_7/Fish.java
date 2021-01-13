package Inheritance_part2_7;

public class Fish extends Animal{
    
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int gills, int eyes, int fins, String name, int size, int wide) {
        super(name, 1, 1, size, wide);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
 
    private  void rest() {
        
    }
    
    private void moveMuscles() {
        
    }
    
    private void moveBackFin() {
        
    }
    
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
