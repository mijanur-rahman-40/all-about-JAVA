
package exceptionhandling;

public class trycatchBlock {
    public static void main(String[] args) {
        System.out.println("1");
        int i = 0,k = 324, j =9;
        try{
             j = k/i;
                     
            System.out.println("Areyou try");         
        } 
        catch(Exception e){
            System.out.println("Here i am");
        }
       
        System.out.println("2");
    }
    
}
