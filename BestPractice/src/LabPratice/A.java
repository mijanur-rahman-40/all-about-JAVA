package LabPratice;

//Question #1
class S {

    public static void changeMainThread(int sec, int priority) {
        Thread t = new Thread();
        t.setName("ExamThread");
        t.setPriority(priority);
        System.out.println("Current Thread: " + t);

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {

        }
        System.out.println("Threading is trying sleeping for 3s...");
    }
}

class t2r {

    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("main");
        System.out.println("Current Thread: " + t);
        S.changeMainThread(3, 9);
    }
}
//Question #2

public abstract class A {

    private int ai;

    A(int a) {
        this.ai = a;
    }

    public int am1() {
        return ai;
    }

    public abstract void am2(String s); // Prints reversed string.
}

class B extends A {

    private int bi;

    B(int a, int b) {
        super(a);
        this.bi = b;

    }

    public void bm() {
        System.out.println("ai : " + am1() + "\nbi : " + bi);
    }

    @Override
    public void am2(String s) {

        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1 = s1.reverse();
        System.out.println(s1);
    }
}

class top {

    public static void main(String[] args) {
        B b = new B(10, 20);
        b.bm();
        A a = b;
        a.am2("APPLE");

    }

}

//Question #3
interface I {

    int fi = 5;

    void im(int n);// prints factorial of n

    public abstract void am2(String s); // Prints reversed string.

}

class B1 {

    private int ai, bi;

    B1(int a, int b) {
        this.ai = a;
        this.bi = b;
    }

    public void bm() {
        System.out.println("ai : " + ai + "\nbi : " + bi);
    }
}

class C1 extends B1 implements I {

    C1(int a, int b) {
        super(a, b);
    }

    @Override
    public void im(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(" " + fact);
    }

    @Override
    public void am2(String s) {
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1 = s1.reverse();
        System.out.print(s1);
    }

}

class S1 {

    public static void changeMainThread(int sec, int priority) {
        Thread t = new Thread();
        t.setName("ExamThread");
        t.setPriority(priority);
        System.out.println("Current Thread: " + t);

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {

        }
        System.out.println("Threading is trying sleeping for 3s... Sleeping complete!");
    }
}

class tr {

    public static void main(String[] args) {
        C1 c = new C1(40, 25);
        c.bm();
        c.am2("Factorial");
        c.im(c.fi);
        Thread t = new Thread();
        t.setName("main");
        System.out.println("Current Thread: " + t);
        S1.changeMainThread(2, 8);
    }
}
