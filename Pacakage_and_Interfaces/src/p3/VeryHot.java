
package p3;
import p1.*;
import p2.*;
public class VeryHot {
    public static void main(String[] args) {
        VeryHot ob = new VeryHot();
        //without importing
        p1.Furst  ob1 = new p1.Furst();
        ob1.Fun();
        //with importing
        Furst ob2 = new Furst();
        ob2.Fun();
         //without importing
        p2.Second ob3 = new p2.Second();
        ob3.hot();
         //with importing
        Second ob4 = new Second();
        ob4.hot();
        
    }
}
