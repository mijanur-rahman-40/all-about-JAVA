
package threadAndOtherSirCode;
public class MyClass2 implements Runnable {
    public void run(){    
        try{
            for(int i=0; i<3; i++){
                System.out.println("i= "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
