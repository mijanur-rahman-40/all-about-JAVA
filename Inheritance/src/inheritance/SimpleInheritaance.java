package inheritance;
//A simple example of inheritance

class A {

    int i, j;

    void showj() {
        System.out.println("i and j : " + i + " " + j);
    }
}

class B extends A {

    int k;

    void showk() {
        System.out.println("K :" + k);
    }
}

class C extends B {

    void sum() {
        System.out.println("i+j+k :" + (i + j + k));
    }
}

class SimpleInheritance {

    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();
        C subob1 = new C();
        superob.i = 10;
        superob.j = 20;
        System.out.println("Contens of super ob: ");
        superob.showj();

        subob.i = 7;
        subob.j = 8;
        subob.k = 9;
        System.out.println("Contenrs of subob ");
        subob.showj();
        subob.showk();
        System.out.println();
        System.out.println("\n");

        subob1.i = 3;
        subob1.j = 4;
        subob1.k = 5;
        System.out.println("Contenrs of subob1 ");
        subob1.showj();
        subob1.showk();
        System.out.printf("\n\n");
        System.out.println("Sum of i j k");
        subob1.sum();
    }
}

//Member Access and Inheritance
class A1 {

    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B1 extends A1 {

    int total;

    void sum() {
        //total = i+j;
    }
}

class Access {

    public static void main(String args[]) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        System.out.println("Total is " + subOb.total);
    }
}

// This program uses inheritance to extend Box.
class Box4 {

    double width;
    double height;
    double depth;

    Box4(Box4 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box4() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box4(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box4 {

    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {

    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}

class ReferenceInheritance {

    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box4 plainbox = new Box4();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is "
                + weightbox.weight);
        System.out.println();
// assign BoxWeight reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);
    }
}
// The following statement is invalid because plainbox
//does not define a weight member. 
// System.out.println("Weight of plainbox is " + plainbox.weight);

//sir code    problem ase
class Person {

    private int id;
    String name;
    int age;
    float height;

    Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void doWork() {
        System.out.println("Working");
    }
}

class Teacher extends Person {

    int salary;
    String designation;

    Teacher(String n, int a, float h) {
        super(n, a, h);
        name = n;
        age = a;
        //salary = s;
        // designation = d;
        height = h;
    }
}

class Test_main {

    public static void main(String[] args) {
        Person ob1 = new Person("raju", 22, (float) 2.10);
        Teacher ob2 = new Teacher("raju", 22, (float) 2.10);
    }
}

class E {

    E() {

        System.out.println("E");
    }
}

class F extends E {

    F() {
        System.out.println("E");
    }
}

class G extends F {

    G() {
        System.out.println("G");
    }
}

class constructorCAll {

    public static void main(String[] args) {
        G ob = new G();

    }
}

class EF {

    void showE() {
        System.out.println("E");
    }
}

class FG extends EF {

    void showE() {
        System.out.println("E1");
    }
}

class GH extends FG {

    GH() {
        System.out.println("G");
    }
}

class constructorCAll1 {

    public static void main(String[] args) {
        // G ob=new G();
        EF ob1 = new FG(); //je constructor ar object banasse tar version ke call hiobe
        //FG ob2 = new FG();
        ob1.showE();
        //ob2.showE();

    }
}
