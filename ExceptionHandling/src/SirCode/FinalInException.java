package SirCode;

public class FinalInException {
    static void method1(){
        try{
            System.out.println("Inside 1");
            throw new RuntimeException("Demo");
        }
        finally{
            System.out.println("1 s finally");
        }
    }
    static void method2(){
        try{
            System.out.println(" Inside 2");
            return;
        }
        finally{
            System.out.println("2's finally");
        }
    }
    
        static void method3(){
          try{
              System.out.println("Inside 3");
          }  
          finally{
              System.out.println("3 s finally");
          }
     }
              
    public static void main(String[] args) {
        try{
            method1();
        }
        catch(Exception e){
            System.out.println("E ar "+e.toString());
      System.out.println("!'s fi");  
  
        }
   
    method2();
    method3();
  }
}
