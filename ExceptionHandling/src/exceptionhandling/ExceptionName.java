
package exceptionhandling;

public class ExceptionName {
     public static void main(String[] args) {
        System.out.println("1");
        int i = 0,k = 324, j =9;
        int arr[] = new int[10];
        try{ 
            arr[11] = 91;
            j = k/i; 
            
        }
        
         catch(Exception e){
            System.out.println(e);
        }
       /*
        catch(ArithmeticException e){
            System.out.println("This is an arithmatic exception");
        }
        
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is an ArrayIndexOutOfBoundsException");
        
        }
       
        catch(Exception e){
            System.out.println("This is an : "+e);
        }
       */
        System.out.println("Value of i : "+i);
    }
}
