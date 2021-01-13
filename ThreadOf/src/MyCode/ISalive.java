
package MyCode;
public class ISalive  extends Thread {

    int x = 0;

    public void run() {
        for (int i = 0; i < 40000; i++) {
            x++;
        }
     System.out.println("My thread ended ind : "+x); //user or non . daemon thread

    }

    public static void main(String[] args) {

        ISalive ob = new ISalive();
        ob.start();
        ob.setDaemon(true);
        ob.isAlive();
        System.out.println("Main thread ended ind : "+ob.x);
    }
}


