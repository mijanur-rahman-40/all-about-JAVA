
package TestClassForAll;
import A1.A2.*;
public class TestKor {
    public static void main(String[] args) {
        Box ob3 = new Box();
        ob3.weight =4;
        System.out.println("This is weight :" +ob3.weight);
        A1.Box  ob4 = new A1.Box();
        ob4.height = 5;
       // ob4.p = 10;
         System.out.println("This is height :" +ob4.height);
         ob4.Naughty();
    }
}
