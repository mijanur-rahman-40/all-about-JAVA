package bestpractice;

//Code #1
class Aa {

    int i = 10;
}

class B extends Aa {

    int i = 20;
}

class MainClas {

    public static void main(String[] args) {
        Aa a = new B();

        System.out.println(a.i);
    }
}

//Code #2
class Ab {

    {
        System.out.println(1);
    }
}

class Bc extends Ab {

    {
        System.out.println(2);
    }
}

class C extends Bc {

    {
        System.out.println(3);
    }
}

class MainClss {

    public static void main(String[] args) {
        C c = new C();
    }
}

//Code #3
class Ac {

    String s = "Class A";
}

class Bv extends Ac {

    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class Cc extends Bv {

    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

class ManClass {

    public static void main(String[] args) {
        Cc c = new Cc();

        System.out.println(c.s);
    }
}

//Code #4
class Ad {

    static {
        System.out.println("THIRD");
    }
}

class Bd extends Ad {

    static {
        System.out.println("SECOND");
    }
}

class Cd extends Bd {

    static {
        System.out.println("FIRST");
    }
}

class MaiClass {

    public static void main(String[] args) {
        Cd c = new Cd();
    }
}

//Code #5
class Ae {

    public Ae() {
        System.out.println("Class A Constructor");
    }
}

class Be extends Ae {

    public Be() {
        System.out.println("Class B Constructor");
    }
}

class Ce extends Be {

    public Ce() {
        System.out.println("Class C Constructor");
    }
}

class MainCass {

    public static void main(String[] args) {
        Ce c = new Ce();
    }
}

//Code #6
class Xa {

    static void staticMethod() {
        System.out.println("Class X");
    }
}

class Ya extends Xa {

    static void staticMethod() {
        System.out.println("Class Y");
    }
}

class Mainlass {

    public static void main(String[] args) {
        Ya.staticMethod();
        Xa.staticMethod();
    }
}

//Code #7
class Xx {

    public Xx(int i) {
        System.out.println(1);
    }
}

class Yy extends Xx {

    public Yy() {
        super(4);
        System.out.println(2);
    }
}

//code #8
class Aw {

    public Aw() {
        super();
        //A constructor can have either super() or this() but not both.

        //   this(10);
    }

    public Aw(int i) {
        System.out.println(i);
    }
}

//Code #9
class M {

    static {
        System.out.println('A');
    }

    public M() {
        System.out.println('C');
    }

    {
        System.out.println('B');
    }
    /*
    public M() {
        System.out.println('C');
    }
     */

}

class N extends M {

    static {
        System.out.println('D');
    }

    {
        System.out.println('E');
    }

    public N() {
        super();
        System.out.println('F');
    }
}

class Ma {

    public static void main(String[] args) {
        N n = new N();
    }
}

//Code #10
class Mm {

    int i;

    public Mm(int i) {
        this.i = i--;
        System.out.println("i : " + i);
    }
}

class Nm extends Mm {

    public Nm(int i) {
        super(++i);

        System.out.println(i);
    }
}

class Mai {

    public static void main(String[] args) {
        Nm n = new Nm(26);
    }
}

//Code #11
class Mn {

    int i = 51;

    public Mn(int j) {
        System.out.println(i);

        this.i = j * 10;
    }
}

class Nn extends Mn {

    public Nn(int j) {
        super(j);

        System.out.println(i);

        this.i = j * 20;
    }
}

class ainClass {

    public static void main(String[] args) {
        Nn n = new Nn(26);

        System.out.println(n.i);
    }
}

//Code 12
class Xyy {

    private int m = 48;
}

class Yyy extends Xyy {

    void methodOfY() {
        //  System.out.println(m);
    }
}

//Code #13
class Xd {

    int m = 1111;

    {
        m = m++;

        System.out.println(m);
    }
}

class Yd extends Xd {

    {
        System.out.println(methodOfY());
    }

    int methodOfY() {
        return m-- + --m;
    }
}

class ass {

    public static void main(String[] args) {
        Yd y = new Yd();
    }
}

//Class #14
class As {

    static String s = "AAA";

    static {
        s = s + "BBB";
        System.out.println("33");
    }

    {
        s = "AAABBB";
        System.out.println("34");
    }
}

class Bs extends As {

    static {
        s = s + "BBBAAA";
        System.out.println("35");
    }

    {
        System.out.println(s);
    }
}

class Class {

    public static void main(String[] args) {
        Bs b = new Bs();
    }
}

//Code #15
class Xk {

    int i = 10;

    public Xk() {
        i = i++ + i-- - i;
        System.out.println("i++ : " + i++);
        System.out.println("i-- : " + i--);
        System.out.println("--i : " + --i);
        System.out.println("i   : " + i);
    }

    static int staticMethod(int i) {
        return --i;
    }
}

class Yk extends Xk {

    public Yk() {
        System.out.println(staticMethod(i));
    }
}

class Mama {

    public static void main(String[] args) {
        Yk y = new Yk();
    }
}

//Code #16
class g {

    void g() {
        System.out.println(1);
    }
}

class Br extends g {

    void Br() {
        g();
    }
}

class Clas {

    public static void main(String[] args) {
        new Br().Br();
    }
}

//Code #17
class At {

    int i = 12;
}

class Bt extends At {

    At a;

    public Bt(At a) {
        this.a = a;
    }
}

class MainCl {

    public static void main(String[] args) {
        At a = new At();

        Bt b = new Bt(a);

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);

        b.a.i = 21;

        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);
    }
}

//Code #18
class ClassOnee {

    static int i, j = 19;

    {
        --i;
        System.out.println(i);
    }

    {
        j++;
    }
}

class ClassTwoo extends ClassOnee {

    static {
        i++;
    }

    static {
        --j;
    }

    public static void main(String[] args) {
        System.out.println(i);

        System.out.println(j);
    }
}

//Code #19
class Aee {

    int[] a = new int[5];

    {
        a[0] = 10;
    }
}

class ee extends Aee {

    {
        a = new int[5];
    }

    {
        System.out.println(a[0]);
    }

    public static void main(String[] args) {
        ee main = new ee();
    }
}

//Code #20
class Aww {

    int methodOfA(int i) {
        i /= 10;

        return i;
    }
}

class Bw extends Aww {

    int methodOfB(int i) {
        i *= 20;

        return methodOfA(i);
    }
}

class ww {

    public static void main(String[] args) {
        Bw b = new Bw();

        System.out.println(b.methodOfB(100));
    }
}

//Code #21
class Au {

    static int i;

    static {
        i++;
        System.out.println("1 "+i);
    }

    {
        ++i;
        System.out.println("2 "+i);
    }
}

class Bu extends Au {

    static {
        --i;
        System.out.println("3 "+i);
    }

    {
        i--;
        System.out.println("4 "+i);
    }
}

class tt {

    public static void main(String[] args) {
        System.out.println(new Bu().i);
    }
}

//Code #22
class MainClasss {

    public MainClasss(int i, int j) {
        System.out.println(method(i, j));
    }

    int method(int i, int j) {
        System.out.println(i++ + ++j);
        return i++ + ++j;
    }

    public static void main(String[] args) {
        MainClasss main = new MainClasss(10, 20);
    }
}

//Code #23
class Xo {

    static {
        Yo.methodOfY();
    }
}

class Yo extends Xo {

    static void methodOfY() {
        System.out.println("Hi....");
    }
}

class oo {

    public static void main(String[] args) {
        Yo.methodOfY();
    }
}

//Code #24
class One {

    int x = 2121;
}

class Two {

    int x = 12;

    {
        System.out.println(x);
    }
}

class yy {

    public static void main(String[] args) {
        Two two = new Two();
    }
}
