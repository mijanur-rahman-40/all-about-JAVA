
package exceptionhandling;

public class FinalBlock {
   
    public static void main(String[] args) {
        try{
            int  a = 100/0;
            //System.exit(1);
        }
        
        catch(ArithmeticException e){
            System.out.println("Cstch called");
            System.out.println(e);
        }
        finally{
            System.out.println("finally called1");
        }
    }
}

class final2{
 public static int retInt(){
        int a = 100;
         try{
           return a;
           //after return no code will be excecuted like 
        }
        catch(Exception e){
            System.out.println("Cstch called");
            System.out.println(e);
            return a;
        }
        finally{
            System.out.println("finally called");
            //when function returned then at first finally will bw called
         }
    
 }
         public static void main(String[] args) {
             System.out.println(retInt());
}
    }  



class final3{
 public static int retInt(){
        int a = 100;
         try{
             a = 100/0;
           return a;
            
           //after return no code will be excecuted like 
        }
        catch(Exception e){
            System.out.println("Catch called");
            System.out.println(e);
            return a;
        }
        finally{
             // if you ovrride the a
             a = 323;
            System.out.println("finally called");
            return a;
            //when function returned then at first finally will bw called
         }
    
 }
         public static void main(String[] args) {
             System.out.println(retInt());
}
    }  