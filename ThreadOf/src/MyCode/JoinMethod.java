package MyCode;

public class JoinMethod extends Thread {

    int x;

    public void run() {
        for (int i = 0; i < 40000; i++) {
            x++;
        }
    }

    public static void main(String[] args) {

        JoinMethod ob = new JoinMethod();
        ob.start();
        try {
            //Thread.sleep(1);//1,2,3,...  //or use join method
            ob.join();
        } catch (InterruptedException ex) {

        }
        System.out.println(ob.x);
    }
}
