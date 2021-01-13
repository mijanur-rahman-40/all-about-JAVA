package MyCode;

public class Runnable3 {

    public static void main(String[] args) {
        Thread ob = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getId() + "Value : " + i);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        });
        ob.start();
    }
}
