
package p1;
import p2.Second;
public class Furst {
    //contains public default constructor
    public void Fun(){
        System.out.println("P1.FIrst class fun......");
    }
    public static void main(String[] args) {
        Second obj = new Second();
        obj.hot();
        Furst ob = new Furst();
        ob.Fun();
    }
}
