
package SirCode;
public class TestTrows {
//    static void show(){
//        throw new ArithmeticException();
//        throw new IllegalAccessException();
//    }
     static void show(int a) throws IllegalAccessException {
         if (a==1)
          throw new IllegalAccessException();
         
     }
     static void showme() throws IllegalAccessException{
         show(1);
         //throw new IllegalAccessException();
     }
    public static void main(String[] args) {
        try{
        showme();
        try{
       show(1);
       }
       catch(Exception e){
           System.out.println("Hellow world 1");
        }
        
//        
    } catch(Exception e){
           System.out.println("Hellow world : " + e);
           
        }
    }
}
