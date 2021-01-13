
package AccessProtection;
class Base{
    
}
interface Ispeed{
    
}
public class Bicycle extends Base implements Ispeed{
    private int cadence;
     private int gear;
      private int speed;
      public Bicycle (int a,int b,int c){
          this.cadence = a;
          this.gear = b;
          this.speed = c;
      }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
      
}
class test{
    public static void main(String[] args) {
        Bicycle ob = new  Bicycle(1,2,3);
        System.out.println(ob.getCadence());
        
    }
}