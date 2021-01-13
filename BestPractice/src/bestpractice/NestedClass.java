package bestpractice;

//Code #1
class Aq {

    class Bw {

        //static void methodB()
        {
            System.out.println("Method B");
        }
    }
}

//Code #2
class Xu {

    static int x = 3131;

    static class Yu {

        // static int y = x++;
        static int y = ++x;

        static class Zu {

            static int z = y++;
        }
    }
}

class Mu {

    public static void main(String[] args) {
        System.out.println(Xu.x);

        System.out.println(Xu.Yu.y);

        System.out.println(Xu.Yu.Zu.z);
    }
}

//Code #3
class Ass {

    {
        new Bss();
    }

    static class Bss {

        {
            new Ass().new Css();
        }
    }

    class Css {

        {
            System.out.println("SUCCESS");
        }
    }
}

class Ms {

    public static void main(String[] args) {
        new Ass();
    }
}

//Code #4
class Xz {

    {
        System.out.println(1);
    }

    static {
        System.out.println(2);
    }

    public Xz() {
        new Yz();
    }

    static class Yz {

        {
            System.out.println(3);
        }

        static {
            System.out.println(4);
        }
    }
}

class Mainss {

    public static void main(String[] args) {
        Xz x = new Xz();

        Xz.Yz y = new Xz.Yz();
    }
}

//Code #4
class ABC {

    int i = 10;

    {
        i--;
    }

    public ABC() {
        --i;
    }

    class XYZ {

        int i = this.i;

        {
            i++;
        }

        public XYZ() {
            ++i;
        }
    }
}

class Mas {

    public static void main(String[] args) {
        ABC abc = new ABC();

        System.out.println(abc.i);

        ABC.XYZ xyz = abc.new XYZ();

        System.out.println(xyz.i);

        ABC.XYZ xyz1 = new ABC().new XYZ();

        System.out.println(xyz1.i);
        ABC.XYZ xyz12 = new ABC().new XYZ();

        System.out.println(xyz12.i);
    }
}

//Code #5
class P {

    String s = "PPP";

    {
        System.out.println(s);
    }

    String methodP() {
        class Q {

            String s = P.this.s + "QQQ";

            {
                System.out.println(s);
            }
        }

        return new Q().s + s;
    }
}

class Maiss {

    public static void main(String[] args) {
        P p = new P();

        System.out.println(p.methodP());
    }
}

//Code #6
class Ag {

    void methodA1(int i) {
        System.out.println(i++ + i);
    }

    void methodA2(int i) {
        System.out.println(--i - i--);
    }
}

class Bg {

    Ag a = new Ag() {
        @Override
        void methodA1(int i) {
            System.out.println(++i + i++);
        }

        @Override
        void methodA2(int i) {
            System.out.println(i-- - i);
        }
    };
}

class Mainass {

    public static void main(String[] args) {
        Ag a = new Ag();

        a.methodA1(10);

        a.methodA2(10);

        Bg b = new Bg();

        b.a.methodA1(10);

        b.a.methodA2(10);
    }
}

//Code #7
class Onee {

    {
        System.out.println("ONE");
    }

    class Two {

        {
            System.out.println("TWO");
        }
    }

    static {
        System.out.println("THREE");
    }

    static class Three {

        {
            System.out.println("FOUR");
        }

        static {
            System.out.println("FIVE");
        }
    }
}

class lss {

    public static void main(String[] args) {
        Onee one = new Onee();

        Onee.Two two = one.new Two();

        Onee.Three three = new Onee.Three();
    }
}
