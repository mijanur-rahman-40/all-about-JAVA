
package TestClassForAll;
import A1.*;
public class TesKor1 {
    public static void main(String[] args) {
        //with importing
        
        Box ob = new Box();
        ob.Naughty();
        ob. height = 3;
        System.out.println("height is :" + ob.height);
    /*
        A1.Box ob1 = new Box();
        ob1.Naughty();
        ob1. height = 3;
        System.out.println("height is :" + ob1.height);
       */
    A1.A2.Box ob1 = new A1.A2.Box();
    ob1.weight = 2322;
    ob1.Kamonaso();
      System.out.println("This is weight :" +ob1.weight);
    }
}
