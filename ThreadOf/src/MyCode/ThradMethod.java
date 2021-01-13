
package MyCode;

public class ThradMethod {
    private static int count = 0;
    public static synchronized void inCount(){
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
      
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000;i++){
                   inCount();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000;i++){
                  inCount();
                }
            }
        });
        t1.start();
        t2.start();
       
     t1.join();
     t2.join();
   //Java thread join method can be use to pause the current thread 
   //exacution until unless the specified thread is 
        System.out.println("Value : "+count);
    }
}
