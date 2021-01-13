
package threadAndOtherSirCode;

public class ThreadOf {
    public static void main(String[] args) {
        //Thread t = Thread.currentThread();
        Thread t = new Thread();
        System.out.println("Current thread"+t);
        t.setName("My thread");
        t.setPriority(8);
        System.out.println("Current thread"+t);
        try{
            for(int i=0; i<10; i++){
                System.out.println("i : "+i);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            
        }
    }
}
