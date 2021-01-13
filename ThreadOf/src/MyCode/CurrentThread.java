
package MyCode;


public class CurrentThread extends A1 implements Runnable {
    @Override
    public void run(){
        System.out.println("Inside the run method :"+Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            System.out.println("21");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }

}
class A1{
    
}
class test{
    public static void main(String[] args) {
        CurrentThread ob = new CurrentThread();
        //ob.run();
        //ob.start();
        Thread o = new Thread(ob,"My thread 1");
        o.start();
        System.out.println(o.getName());
        System.out.println("Inside the Main method: "+Thread.currentThread().getName());
    }
}
