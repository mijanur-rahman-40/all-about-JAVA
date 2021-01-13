package bestpractice;

//Code #1
class A {

    static int i;

    static {
        System.out.println(1);

        i = 100;
    }

    public static void topper() {
        System.out.println("it is toppper");
    }
}

class StaticInitializationBlock {

    static {
        System.out.println(2);
    }

    public static void main(String[] args) {
        System.out.println(3);

        System.out.println(A.i);
        A.topper();
        A ob = new A();
        ob.topper();
    }
}

//Code #2
class A1 {

    static int first;

    static String second;

    static {
        System.out.println(1);

        first = 100;
    }

    static {
        System.out.println(2);

        second = "SECOND";
    }
}

class StaticInitializationBlock1 {

    static {
        System.out.println(3);
    }

    public static void main(String[] args) {
        System.out.println(4);

        System.out.println(A1.first);

        System.out.println(A1.second);
    }
}

//Code #3
class A3 {

    static {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }

    public static void main(String[] args) {
        A3 a;
    }
}

//Code #4
//Yes, We can invoke static method inside the SIB.
class A4 {

    //SIB - Static Initialization Block
    static {
        staticmethod();   //Invoking static method inside SIB
    }

    static void staticmethod() {
        System.out.println("It is a static method");
    }

    public static void main(String[] args) {
        A4 a;
    }
}

//Code #5
class A5 {

    static int i = 10;

    int j = 100;

    {
        methodOne();

        i = 100;

        j = 10;
    }

    void methodOne() {
        System.out.println("i = " + i);

        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        A5 a = new A5();

        a.methodOne();
    }
}

//Code #6
//No, We can’t call non-static method from a static method.
class A6 {

    static void staticMethod() {
        //nonStaticMethod();    //Compile time error : can't make static reference to non-static method
    }

    void nonStaticMethod() {

    }
}

//Code #7
class A7 {

    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    public A7() {
        System.out.println(3);
    }

    public static void main(String[] args) {
        System.out.println(4);

        A7 a = new A7();
    }
}

//Code #8
class A8 {

    static {
        i = 30;
    }

    static int i = 20;

    static {
        i = 10;
    }

    public static void main(String[] args) {
        System.out.println(A8.i);
    }
}

//Code #9
class A9 {

    {
        System.out.println(1);

        id = 1001;
    }

    static {
        System.out.println(2);

        name = "NAME";
    }

    static String name;

    public A9(String name, int id) {
        System.out.println(3);

        this.name = name;

        this.id = id;
        System.out.println(name + " " + id);
    }

    int id;

    {
        System.out.println(4);

        System.out.println(id);
    }

    static {
        System.out.println(5);

        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println(6);

        A9 a = new A9("MyName", 1111);
    }
}

/*
2
5
NAME
6
1
4
1001
3

 */
//Code #10
class A10 {

    {
        // System.out.println(i);
    }

    int i = 10;
}

class A2 {

    {
        // i++;
        i = 1111;
        // System.out.println(i);

    }

    int i;
}

//Code #11
class ClassOne0 {

    static int i = 10;

    {
        i = 30;
    }

    static {
        i = 20;
    }

    static {
        i = 25;
    }

    public ClassOne0(int i) {
        System.out.println(i);

        this.i = i;
    }

}

class ClassTwo0 {

    public static void main(String[] args) {
        System.out.println(ClassOne0.i);
    }
}

//Code #12
class ClassOne1 {

    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    public ClassOne1(int i) {
        System.out.println(3);
    }

    public ClassOne1() {
        System.out.println(4);
    }
}

class ClassTwo1 {

    {
        System.out.println(5);
    }

    static {
        System.out.println("5");
    }

    public static void main(String[] args) {
        System.out.println(6);

        ClassOne1 one = new ClassOne1();

        ClassOne1 two = new ClassOne1(10);
    }
}

/*
6
2
1
4
1
3
 */
//Code #13
class ClassOne2 {

    char c = 'A';

    {
        c = 'B';
    }

    public ClassOne2(char c) {
        this.c = c;
    }
}

class ClassTwo2 {

    public static void main(String[] args) {
        ClassOne2 one = new ClassOne2('Z');

        System.out.println(one.c);
    }
}

//Code #14
class ClassOne3 {

    String s;

    {
        s = "FIRST";
    }

    {
        s = "SECOND";
    }

    ClassOne3() {
        s = "THIRD";
    }

    ClassOne3(String s) {
        this();

        System.out.println(this.s);
    }
}

class ClassTwo3 {

    public static void main(String[] args) {
        ClassOne3 one = new ClassOne3("LAST");
    }
}

//Code #15
//No. Constructors can not be called recursively.
class A_ {

    A_(int a) {

    }

    A_(float a) {

    }
    /*
    public A_(int i)
    {
        this((float)23.5);
    }
 
    public A_(float f)
    {
        this(28.56);
    }
 
    A_(double d)
    {
        this(10);
    }
     */
}

//Code #16
class A16 {

    static {
        System.out.println('A');
    }

    static {
        System.out.println('B');
    }

    public A16() {
        System.out.println('C');
    }

    public static void main(String[] args) {
        System.out.println('D');

        A16 a = new A16();
    }
}

//Code #17
class A17 {

    static void methodOne17() {
        System.out.println("A");
    }

    void methodTwo17() {
        System.out.println("B");

        methodOne17();
    }

    public static void main(String[] args) {
        System.out.println("C");

        new A17().methodTwo17();
    }
}

//Code #18
class ClassOne18 {

    static {
        System.out.println(1);
    }

    public static void main(String[] args) {
        System.out.println(2);
    }
}

class ClassTwo18 {

    {
        System.out.println(3);
    }

    public static void main(String[] args) {
        ClassOne18.main(args);
    }
}

//Code #19
class A19 {

    static int methodOne(int i) {
        i = i++ + --i;

        return i;
    }

    static int methodTwo(int i) {
        i = i-- - ++i + methodOne(i);

        return i;
    }

    public static void main(String[] args) {
        int i = 11;
        int ans = methodTwo(i);
        System.out.println("ans : " + ans + " " + ++i + " " + --i);
        System.out.println(ans + ++i - --i);
    }
}

//Code #20
class ClassOne {

    static {
        System.out.println('A');
    }

    static char c = 'Z';

    static char getC() {
        return c;
    }
}

class ClassTwo {

    {
        System.out.println('B');
    }

    public static void main(String[] args) {
        char c;

        c = ClassOne.getC();

        System.out.println(c);
    }
}

//Code #21
class ClassOne20 {

    {
        s = "second";
    }

    String s = "first";

    {
        System.out.println(s);

        s = "third";
    }

    public ClassOne20() {
        System.out.println(s);
    }

    public ClassOne20(String s) {
        System.out.println(s);

        this.s = s;
    }
}

class ClassTwo20 {

    public static void main(String[] args) {
        ClassOne20 one = new ClassOne20("last");

        ClassOne20 two = new ClassOne20();
    }
}

//Code #21
class A21 {

    static int i = 10, j = 20;

    int m = 30, n = 40;

    public static void main(String[] args) {
        A21 a1 = new A21();

        A21 a2 = new A21();

        a1.i = 100;

        System.out.println(a2.i);

        a2.j = 200;

        System.out.println(a1.j);

        a1.m = 300;

        System.out.println(a2.m);

        a2.n = 400;

        System.out.println(a1.n);
    }
}

//Code #22
class A22 {

    int i = 111;

    static int j = 222;

    static void methodOne(int i, int j) {
        System.out.println(i);

        System.out.println(j);
    }

    void methodOne1(int i, int j) {
        System.out.println(i);

        System.out.println(j);
    }

    public static void main(String[] args) {
        methodOne(333, 444);
        //  methodOne1(333, 444);
        new A22().methodOne1(333, 444);

    }
}

//Code #23
class A23 {

    int m;

    double n;

    public A23(int i) {
        m = i;
    }

    public A23(double d) {
        n = d;
    }

    {
        System.out.println(m);

        System.out.println(n);
    }

    public static void main(String[] args) {
        A23 a1 = new A23(500);

        A23 a2 = new A23(50.0);

        System.out.println(a1.m + " : " + a1.n);

        System.out.println(a2.m + " : " + a2.n);
    }
}

//Code 24
class A24 {

    char c = 'A';

    A24 a;

    {
        System.out.println(c);

        c = 'B';
    }

    public A24(A24 a) {
        this.a = a;
    }

    public static void main(String[] args) {
        A24 a = null;

        a = new A24(a);

        System.out.println(a.c);

        System.out.println(a.a.c);

        System.out.println(a.a.a.c);

        System.out.println(a.a.a.a.c);

        a.a.a.a.a.c = 'Z';

        System.out.println(a.c);
    }
}

//Code #25
class A25 {

    int i;

    A25 a;

    {
        i = 10;

        a = new A25();
    }

    public static void main(String[] args) {
        A25 a = new A25();

        System.out.println(a.a.a.a.a.a.i);
    }
}

//Code #26
class A26 {

    String s;

    A26 a;

    public A26(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        A26 a1 = new A26("first");

        A26 a2 = new A26("second");

        a1.a = a2;

        a2.a = a1;

        System.out.println(a1.a.s);

        System.out.println(a2.a.s);
    }
}

//Code #27
class X {

    Z z = new Z();
}

class Y {

    X x = new X();
}

class Z {

    Y y = new Y();
}

class MainClass {

    public static void main(String[] args) {
        Z z = new Z();
    }
}

//Code #28
class X28 {

    int i = 50;
}

class Y28 {

    int i = 100;

    X28 x;
}

class MainClass1 {

    public static void main(String[] args) {
        X28 x = new X28();

        Y28 y = new Y28();

        y.x = x;

        System.out.println(x.i);

        System.out.println(y.i);

        System.out.println(y.x.i);
    }
}


//Code #29

 class A29
{
    String s;
 
    public A29()
    {
        this("It's not me");
 
        System.out.println('A');
 
        System.out.println(s);
    }
 
    A29(String  s)
    {
        System.out.println('B');
 
        System.out.println(this.s);
 
        this.s = s;
    }
 
    {
        System.out.println('C');
 
        System.out.println(s);
 
        this.s = "ABCD";
    }
 
    public static void main(String[] args)
    {
        A29 a1 = new A29();
 
        A29 a2 = new A29("It's me");
    }
}

//Code #30


 class A30
{
    static void test()
    {
        System.out.println("Tested....");
    }
 
    static
    {
        test();
        System.out.println("1");
    }
 
    public static void main(String[] args)
    {
        test();
    }
}