
package threadAndOtherSirCode;

public class MyClass3 extends Thread {
    String str;
    MyClass3(String name ){
        //super(name);
        this.str = name;
    }
    public void run(){
    
        Caller.call(str);
    }
}
