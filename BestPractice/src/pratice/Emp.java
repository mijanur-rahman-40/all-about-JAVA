// # 1
package pratice;

public class Emp {

    static int bankVault;
}

class TestDemo {

    public static void main(String args[]) {
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();
        emp1.bankVault = 10;
        emp2.bankVault = 20;
        System.out.println("" + emp1.bankVault);
        System.out.println("" + emp2.bankVault);
        System.out.println("" + Emp.bankVault);
    }
}

// # 2
class TestJava {

    void show() {
        try {
            String s = null;
            System.out.println("1");
            try {
                System.out.println(s.length());
            } catch (NullPointerException e) {

                System.out.println("inner");
            }
            System.out.println("2");
        } catch (NullPointerException e) {
            System.out.println("outer");
        }

    }

    public static void main(String args[]) {
        TestJava ob = new TestJava();
        ob.show();
    }
}

// # 2
class Animal {

    void jump() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {

    void jump(int a) {
        System.out.println("Cat");
    }
}

class Rabbit extends Animal {

    void jump() {
        System.out.println("Rabbit");
    }
}

class Circus {

    public static void main(String args[]) {
        Animal ani = new Animal();
        ani.jump();
        Cat cat = new Cat();
         //Animal ani = cat;
        //Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();
       // ani.jump();
        // cat.jump(3);
        rabbit.jump();
    }
}

// # 3
abstract class X {

    X() {
        System.out.println("X()");
    }

    abstract void a();

    void b() {
        System.out.println("X.b()");
        a();
    }
}

class Y extends X {

    void a() {
        System.out.println("Y.a()");
    }

    void b() {
        System.out.println("Y.b()");
    }

    void c() {
        System.out.println("Y.c()");
        super.b();
    }
}

 class TestMain {

    public static void main(String[] args) {
        Y y = new Y();
        y.c();
    }
}
