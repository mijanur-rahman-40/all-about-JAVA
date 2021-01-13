
package MyCode;


public class Runnable1 extends A implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("21");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }

}
class A{
    public static void main(String[] args) {
        Runnable1 ob = new Runnable1();
        ob.run();
        //ob.start();
        Thread o = new Thread();
        o.start();
    }
}
