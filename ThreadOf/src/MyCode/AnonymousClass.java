
package MyCode;

public class AnonymousClass {
    public static void main(String[] args) {
        Runnable ob = new Runnable(){
            public void run(){
                System.out.println("Amin id ");
            }
        };
        Thread th  = new Thread(ob);
        th.start();
    }
}
class another {
    public static void main(String[] args) {
        Thread ob = new Thread(new Runnable(){
            public void run(){
                System.out.println("ANib"); 
            }
        });
        ob.start();
    }
}