
package threadAndOtherSirCode;

public class ThreadDemo2 {
    public static void main(String args[]){
        MyClass2 a = new MyClass2();
        Thread t1 = new Thread(new MyClass2());
       // Thread t2 = new Thread(a);
       Thread t2 = new Thread(new MyClass2());
        t1.start();
        t2.start();
        
    }
}
