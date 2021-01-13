
package MyCode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Runnnable2 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getId()+"Value : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
class test4{
    public static void main(String[] args) {
        Thread tw1 = new Thread(new Runnnable2());
        Thread tw2 = new Thread(new Runnnable2());
        tw1.start();
        tw2.start();
    }
}
