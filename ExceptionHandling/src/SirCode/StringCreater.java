package Sircode;

class MyException extends RuntimeException {

    String details;

    //super(details);
    MyException(String details) {
        //super(details);
        this.details = details;
    }

    public String toString() {
        // return "Hellow world";
        return " ## " + this.getClass().getName() + " : " + details;

    }
}
class test{
    public static void main(String[] args) {
        MyException ob = new MyException ("Raju");
        System.out.println(ob.toString());
    }
}
