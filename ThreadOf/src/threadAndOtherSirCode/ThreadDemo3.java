
package threadAndOtherSirCode;

public class ThreadDemo3 {
    public static void main(String args[]){
        Thread t1 = new MyClass3("hello1");
        Thread t2 = new MyClass3("hello2");
        Thread t3 = new MyClass3("hello3");
        
        t1.start();
        t2.start();
        t3.start();
     
    }
}
