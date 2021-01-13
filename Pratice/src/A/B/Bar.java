package A.B;
import A.Foo;

public class Bar {
    public static void main(String[] args) {
        Foo f = new Foo();
        //System.out.println(""+f.a);
        //System.out.println(""+f.b);
        System.out.println(""+f.c);
                
    }
}
/*
public class Bar extends Foo {

    Bar() {

        Foo f1 = new Foo();
        Foo f2 = new Foo();
        
        f1.e = 60;
        f2.e = 70;
       //f1.f = 70;

        //System.out.println("" + f1.a);

       // System.out.println("" + f1.b);

        System.out.println("" + c);

        System.out.println("" + f1.d);

        System.out.println("" + f1.e);

        System.out.println("" + f2.e);

        System.out.println("" + Foo.e);

        System.out.println("" + f1.f);

    }
    public static void main(String[] args) {
        new Bar();
    }
}
*/