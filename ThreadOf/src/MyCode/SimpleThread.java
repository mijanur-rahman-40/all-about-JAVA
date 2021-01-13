
package MyCode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThread extends Thread{
    @Override
    public void run(){
        for(int i=2; i<8; i++){
            System.out.println(Thread.currentThread().getId()+"Value  "+i);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
          }
        }
    }
}
class  frwq{
    public static void main(String[] args) {
        SimpleThread ob = new SimpleThread();
        ob.start();
        //System.out.println(ob);
        SimpleThread ob1 = new SimpleThread();
        ob1.start();
    }
}