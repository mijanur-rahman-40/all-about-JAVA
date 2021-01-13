package inheritance;

class Box2 {

    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = depth = height = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class Boxweight extends Box2 {

    double weight;

    Boxweight(Boxweight ob) {
        super(ob);
        weight = ob.weight;
    }

    Boxweight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }

    Boxweight() {
        super();
        weight = -1;
    }

    Boxweight(double len, double m) {
        super(len);
        weight = m;
    }
}

class TestSuper {

    public static void main(String args[]) {
        Boxweight mybox1 = new Boxweight(10, 20, 15, 34.3);
        Boxweight mybox2 = new Boxweight(2, 3, 4, 0.076);
        Boxweight mybox3 = new Boxweight(); // default
        Boxweight mycube = new Boxweight(3, 2);
        Boxweight myclone = new Boxweight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();

    }
}

//using super to overcome name hidding
class AB {

    int i;
}

class BC extends AB {

    int i;//this i hides this i in AB

    BC(int a, int b) {
        super.i = a; //i in AB
        i = b;
    }

    void show() {
        System.out.println("i in superclas: " + super.i);
        System.out.println("i in subclass:  " + i);
    }
}

class useSuper {

    public static void main(String[] args) {
        BC subob = new BC(10, 20);
        subob.show();
    }
}
