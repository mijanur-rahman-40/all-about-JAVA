package inheritance;

class J {

    void callme() {
        System.out.println("Inside J's callme method");
    }
}

class K extends J {

    //override callme()
    void callme() {
        System.out.println("Inside K's callme method");
    }
}

class L extends K {

    //overide callme()
    void callme() {
        System.out.println("Inside L's callme method");
    }
}

class dDispatch {

    public static void main(String[] args) {

        J a = new J();
        K b = new K();
        L c = new L();

        J r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();

    }
}
