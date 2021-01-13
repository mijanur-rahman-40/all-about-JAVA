
package first_project;

public class Test_for_prime {
    /*
    public static void main(String[] args) {
        int num;
        boolean isprime;
        num=23;
        if(num < 2)
            isprime=false;
        else{
            isprime=true;
    }
        for(int i=2; i<=num/i; i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else
            System.out.println("Not prime");
    }
}
*/
    /*
// Search an array using for-each style for.
       public static void main(String args[]) {
          int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
          int val = 0;
           boolean found = false;
// use for-each style for to search nums for val
        for(int x : nums){
          if(x == val) {
         found = true;
               break;
                   }
                }
         if(found)
           System.out.println("Value found!");
         else
               System.out.println("No");
            }
       */
 // Parts of the for loop can be empty. 
/*    
       public static void main(String args[]) {
   int i;
      boolean done = false;
        i  = 0;
           for( ; !done; ) {
             System.out.println("i is " + i);
           if(i == 10){
               done = true;
           }
           i++;
           }
          }
    
*/
    /*
   // Use a for-each style for loop.
     public static void main(String args[]) {
       int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      int sum = 0;
    // use for-each style for to display and sum the values
      for(int x : nums) {
       System.out.println("Value is: " + x);
         sum += x;
      }
           System.out.println("Summation: " + sum);
       }
    
*/
// Use for-each style for on a two-dimensional array.

     public static void main(String args[]) {
        int sum = 0;
      int nums[][] = new int[3][5];
// give nums some values
           for(int i = 0; i < 3; i++)
         for(int j = 0; j < 5; j++)
         nums[i][j] = (i+1)*(j+1);
           // use for-each for to display and sum the values
          for(int x[] : nums) {
           for(int y : x) {
          System.out.println("Value is: " + y);
        sum += y;
         }
       }
     }
}
