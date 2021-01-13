package Inharitance_Challenge_part1_and_2_13_14;

public class Outlander extends Car{
    private int rodeServiceMonth;

    public Outlander(int rodeServiceMonth) {
        super("Outlanda", "4WD", 5, 5, 6, false);
        this.rodeServiceMonth = rodeServiceMonth;
    }
    
    public void accelerate (int rate) {
        int newVelocity = getCurrentVelovity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        }
        else if(newVelocity > 0 && newVelocity <= 10)
            changeGear(1);
        else if(newVelocity > 0 && newVelocity <= 20)
            changeGear(2);
        else if(newVelocity > 0 && newVelocity <= 30)
            changeGear(3);
        else 
            changeGear(4);
        
        if(newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }
}
