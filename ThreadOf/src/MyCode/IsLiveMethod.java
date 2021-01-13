
package MyCode;
public class IsLiveMethod extends Thread{
    int x;
    public void run(){
        for(int i=0; i<10000; i++){
            
        }
        System.out.println("My thred ended and "+x);
    }
    
}
class fd{
    public static void main(String[] args) {
        IsLiveMethod bo = new IsLiveMethod();
        System.out.println("Main thread started");
        //System.out.println(bo.isAlive()); 
        bo.setDaemon(true);//if you set this method than it only work main method 
        bo.start();
       
        System.out.println("Main thread ended and x : "+bo.x);
    }
}

