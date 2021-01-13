
package p2;
import p1.Furst;
 public class Second {
     public void hot(){
         System.out.println("Are you first");
     }
    public static void main(String[] args) {
        System.out.println("P2.second main method");
        Furst obj = new Furst();  //constructor is public
        obj.Fun();
    }
}
