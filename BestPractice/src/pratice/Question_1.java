package pratice;

abstract class A {

    int i;

    {
        System.out.println("Welcome 1");
    }

    A(int a) {
        System.out.println("A is 3rd");
        i = a;
    }

    void show() {
        System.out.println(" i : " + i);
    }

    static {
        System.out.println("Static 2");
    }
}

class B extends A {

    int j;

    {
        System.out.println(" Welcome 2");
    }

    B(int a, int b) {
        super(a);
        System.out.println("B is second");
        j = b;
        super.i = 20;
    }

    void show() {
        System.out.println("j : " + j);
    }

    static {
        System.out.println("Static 3");
    }
}

class C extends B {

    C() {
        super(2, 1);
        System.out.println("C is 1st");
    }

    static void show(int a, int b, int c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    void show(String msg) {
        System.out.println(msg + "i and j" + i + " " + super.j);
    }

    static {
        System.out.println("Static 1");
    }
}

class Main {

    public static void main(String[] args) {
        C.show(1, 2, 3);
        C c = new C();
        // c.show(1,2,3);
        c.show();
        c.show("Error");
        A a = c;
        a.show();
    }
}

/*

run:
Static 2
Static 3
Static 1
a = 1
b = 2
c = 3
Welcome 1
A is 3rd
 Welcome 2
B is second
C is 1st
j : 1
Errori and j20 1
j : 1
 */
class Box {

    double width, height, depth;
    byte b = (byte) 3;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box b1 = new Box(10, 10, 10);
        Box b2 = b1;
        Box b3 = new Box(20, 20, 20);
        System.out.println("B1 = " + b1.volume() + ", B2 = " + b2.volume() + ",B3 = " + b3.volume());
        b1.width = b1.height = b1.depth = 30;
        b2.width = b2.height = b2.depth = 40;
        b3.width = b3.height = b3.depth = 50;
        System.out.println("B1 = " + b1.volume() + ", B2 = " + b2.volume() + ", B3 = " + b3.volume());
    }
}

class ItertiinExam {

    public static void main(String[] args) {
        int i = 0;
        First:
        while (i <= 8) {
            int sum = 0;
            i++;
            Second:
            for (int j = 1; j <= i;) {
                sum = sum + j++;
                for (int k = 1; k <= j; k++) {
                    if (k % 2 != 0) {
                        continue;
                    }
                    sum = sum + k;
                    if (sum > 88) {
                        break Second;
                    }
                }
                if (i == 3) {
                    continue First;
                }
            }
            System.out.println(sum + "");
        }
    }
}

class ThreadExam implements Runnable {

    ThreadExam() {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread2 : " + t);
        t.setName("ExamThread");
        t.setPriority(3);
        System.out.println("Current Thread2: " + t);
        printer();
    }

    synchronized public void printer() {
        Thread t = Thread.currentThread();
        System.out.println("Printer " + t);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread3 " + t);
        try {
            Thread.sleep(1000);
            printer();
        } catch (InterruptedException e) {
            System.out.println("ThreadExam Existing");
        }

    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExam(), "MainThread");
        System.out.println("Current Thread1 : " + t);
        t.setPriority(7);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("ThreadMain Existing");
        }
    }
}

class ExceptionExam {

    public static void main(String[] args) {
        System.out.println("Exam started");
        int a = args.length;
        /*
        if(a == 0){
            a = 42/a;
         */
        try {
            if (a == 1) {
                a = a / (a - a);
            }
            try {
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                    System.out.println("C[42] = " + c[42]);
                } else if (a == 3) {
                    throw new NullPointerException("Null");
                } else {
                    System.out.println("Exam Ended Fast");
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Divide by 0");
            } finally {
                System.out.println("Un-reachable code");
            }
        } catch (ArithmeticException e) {
            System.out.println("Array Index Out-Of-Bounds");
        } catch (Exception e) {
            System.out.println("No Exception");
        } finally {
            System.out.println("Program completed");
        }
        System.out.println("Exam Ended");
    }
}

/*

interface A1{
    int i = 10;
    int j = 20;
    private interface B1{
        void s1();
    }
    void show(String msg);
}
class C1 implements A1{
    int  k = 30;
    class D1 implements B1{
        void s1(){
            System.out.println("i = "+i+"j = "+j+"k = "+k);
        }
        public void change(){
            i = 10;
            j = 20;
        }
    }
    static class E{
        static void s1(){
            System.out.println("i = "+i+"j = "+j+"k = "+k);
        }
        void s1(String msg){
            System.out.println(msg);
        }
    }
    void show(String msg){
        System.out.println(msg + " "+k);  
    }
    String show(String msg){
        return msg+" "+k+" "+i;
    }
    public static void main(String[] args) {
        C1 c = new C1();
        c.show("Error");
        System.out.println("Hellow");
        D1 d = new D1();
        d.s1();
        d.change();
        E.s1("Hellow");
        E.s1();
        try{
            
        }catch(Exception e){
            
        }
        try{
            
        }catch(Exception e){
            
        }
    }
}
 */
class conversion {

    public static void main(String[] args) {
        byte b;
        int i = 25;
        double d = 323.142;
        b = (byte) i;
        System.out.println("(1) = " + i + " #b = " + b);
        i = (int) d;
        System.out.println("(2) = " + i + " #b = " + d);
        b = (byte) d;
        System.out.println("(3) = " + b + " #b = " + d);

    }
}

abstract class A2 {

    abstract void show();

    void showtoo() {
        System.out.println("1000");
    }
}

class B2 extends A2 {

    @Override
    void show() {
        System.out.println("4000");
    }

    void showtoo() {
        System.out.println("3000");
    }

    void showAlso() {
        System.out.println("7000");
    }
}

class C2 extends B2 {

    @Override
    void show() {
        System.out.println("6000");
    }

    void showtoo() {
        System.out.println("2000");
    }

    void showAlso() {
        System.out.println("5000");
    }
}

class oopexam {

    public static void main(String[] args) {
        B2 b = new B2();
        A2 a = b;
        a.show();
        a.showtoo();
        b.showAlso();
        b = new C2();
        b.show();
        b.showAlso();
        b.showtoo();
    }
}

class BlockExam {
    // System.out.println("B1 : Exam Started");

    int a;
    static int s = 33;

    BlockExam(int a) {
        this.a = a;
        System.out.println("B2 : Inside Constructure");
    }
}

class Bar {

}

class test {

    Bar doBar() {
        Bar b = new Bar();
        return b;
    }

    public static void main(String[] args) {
        test t = new test();
        Bar newbar = t.doBar();
        System.out.println("newBar");
        newbar = new Bar();
        System.out.println("finishing");
    }
}

class person {

    public void work() {
        System.out.println("Working");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacher extends person {

    public void work() {
        System.out.println("Teaching");
    }

    public void work(String cource) {
        System.out.println("Teaching cource :" + cource);
    }
}

class hot {

    public static void main(String[] args) {
        person p = new person();
        p.work();
        p.sleep();
        //p.work("oop");
        Teacher t = new Teacher();
        t.work();
        t.work("oop");
        t.sleep();
    }
}

interface A3 {

    int a = 10;
    final int b = 20;

    void am();
}

interface B3 extends A3 {

    static int b = 30;
    int c = 50;

    interface C3 {

        final static int c = 40;

        void bm();

        void am();
    }

    void bm();
}

class interfaceExam implements B3.C3 {

    int a = 60;

    @Override
    public void bm() {
        System.out.println("BM = " + a);
    }

    @Override
    public void am() {
        System.out.println("AM = " + c);

    }

    public static void main(String[] args) {
        interfaceExam inf = new interfaceExam();
        inf.am();
        A3 a = (A3) inf;
        B3 b = (B3) inf;
       // C3 c = inf;
        a.am();
        b.am();
        b.bm();
       // c.bm();
    }
}


class Garbage{
    public static void main(String[] args) {
        Garbage h = new Garbage();
        h.methodA();
    }
    Object methodA(){
        Object obj1 = new Object();
        Object[] obj2 = new Object[1];
        obj2[0] = obj1;
        obj1 = null;
        return obj2[0];
    }
}

class Parentclass{
    Parentclass(){
        System.out.println("Super con");
    }
}
class Subclass extends Parentclass{
    Subclass(){
        System.out.println("Sub con");
    }
    Subclass(int num){
        System.out.println("con arg");
    }
    void display(){
        System.out.println("Hellow");
    }
    public static void main(String[] args) {
     Subclass obj = new Subclass();
     obj.display();
     Subclass obj2;
     obj2 = new Subclass(10);
     obj2.display();
    }
}