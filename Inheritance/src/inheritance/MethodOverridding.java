package inheritance;

class X {

    int i, j;

    X(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j : " + i + " " + j);
    }
}

class Y extends X {

    int k;

    Y(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        System.out.println("k : " + k);
    }
}

class MethodOverridding {

    public static void main(String[] args) {
        Y ob = new Y(1, 2, 3);
        ob.show();
        X a = new X(1, 2);
        Y r;
        r = ob;
        a.show();
        r.show();

    }
}

class O {

    int i, j;

    O(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j : " + i + " " + j);
    }
}

class W extends O {

    int k;

    W(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); // This call's A show()
        System.out.println("K = " + k);
    }
}

class SuperInRoding {

    public static void main(String[] args) {
        W ob = new W(1, 2, 3);
        ob.show();
    }
}

class T {

    int i, j;

    T(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j :" + i + " " + j);
    }
}

class U extends T {

    int k;

    U(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    /*
    void show(String msg){
        System.out.println(msg + k);
    }
     */
    void show() {
        System.out.println(" k");
    }
}

class Doverride {

    public static void main(String[] args) {
        U ob = new U(1, 2, 3);
        //ob.show("The text is K: ");
        ob.show();
    }
}

// Using run-time polymorphism.
class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }
// override area for rectangle

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }
// override area for right triangle

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {

    public static void main(String args[]) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = f;
        System.out.println("Area is " + figref.area());
    }
}
