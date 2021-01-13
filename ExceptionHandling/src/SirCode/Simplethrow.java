package SirCode;

public class Simplethrow {

    static void show() {

        try {
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            System.out.println("Caught inside : "+e);
            throw e;
        }
    }
    public static void main(String[] args) {
       try{
           show();
       } 
       catch(Exception e){
           System.out.println("Recaught : "+e);
           
       }
    }
}
