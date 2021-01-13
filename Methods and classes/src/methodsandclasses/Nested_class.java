package methodsandclasses;

/*
package java20180215;
 class A{
     final int FINAL=23;
     FINAL =20;
     //int a1[]=new int [10];
     //System.out.println("Length =" +a1.length);
    int x=2;
    class B{
        int y;
        void f2(){
            y=x+2;
            System.out.println(" Y =" +y);
        }
    }
    /*
    A(int len){
        height=width=depth=len;
    }
    A(int len){
    this(len,len,len

    void f1(){
        //x=y+2;
    }
}
public class Java20180215 {
    public static void main(String[] args) {
       A a=new A();
       System.out.println(a.FINAL);
       
         
       //B a =new B();
      // A.B b=new B();
      // A.B b=new A().new B();
       //b.f2();
       //a.f1();
         //int a1[]=new int [10];
        // int a1[]={1,2,3};
        //System.out.println("Length =" +a1.length);
    }
    
 */
class A {

    int x;

    class B {

        int y, z, b;

        B(int a, int c) {
            this(c, c, c);
            b = a;
            x = c;
            System.out.println("This is constructore");

        }

        B(int a, int b, int c) {
            System.out.println("this is this constructore");
        }

        void f2() {
            y = x + 2;
            //z=this.b+y;
            z = b + y;
            System.out.println("This is f2");
        }
    }

    void f1() {
        // x=y+2; this is not accessable
    }
}

public class Nested_class {

    public static void main(String[] args) {

        //A a=new A();
        //A.B  b=new B();
        A.B b = new A().new B(2, 3);
        b.f2();
        System.out.println("Value of Z :" + b.z);
        //System.out.println("X ar man: "+ a.x);
    }
}

class NestInnerClass {

    public static void main(String[] args) {
        A c = new A();
        //A.B d = new B(2,3);
        c.x = 4;
        //d.f2();
        //System.out.println(d.y);

    }

}

//Demonstrate an inner class
class outer {

    int out_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {

        void display() {
            System.out.println("display: out_x = " + out_x);
        }
    }
}

class Nested_class1 {

    public static void main(String[] args) {
        outer outer = new outer();
        outer.test();
    }
}


/*
// This program will not compile.
class Outer {
int outer_x = 100;
   void test() {
   Inner inner = new Inner();
   inner.display();
    }
// this is an inner class
  class Inner {
    int y = 10; // y is local to Inner
     void display() {
    System.out.println("display: outer_x = " + outer_x);
    }
 }
   void showy() {
    System.out.println(y); // error, y not known here!
   }

}
   class InnerClassDemo {
   public static void main(String args[]) {
   Outer outer = new Outer();
     outer.test();
   }
}
 */
// Define an inner class within a for loop.
class Outer {

    int outer_x = 100;

    void test() {

        class Inner {
            //for(int i=0; i<10; i++) {

            void display() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
        }
        Inner inner = new Inner();
        inner.display();
    }
}

class InnerClassDemo {

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
