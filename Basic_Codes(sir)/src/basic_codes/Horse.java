
package p2;
import p1.Animal;
public class Horse extends Animal {
    void show(){
        System.out.println(+ age);
       //super.age
    }
    public static void main(String[] args) {
      Horse ob  = new Horse();
      ob.show();
    }

}

