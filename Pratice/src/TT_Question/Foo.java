package TT_Question;

    abstract class X {
        X() {
            System.out.println("X()");
        }

        abstract void a();

        void b() {
            System.out.println("X.b()");
            a();
        }
    }

    class Y extends X {

        void a() {
            System.out.println("Y.a()");
        }

        void b() {
            System.out.println("Y.b()");
        }

        void c() {
            System.out.println("Y.c()");
            super.b();
        }
    }

     class TestMain {

        public static void main(String[] args) {
            Y y = new Y();
            y.c();
        }
    }

