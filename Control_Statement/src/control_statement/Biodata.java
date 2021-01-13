//package first_project;
//assigning
/*
public class Biodata {
    public static void main(String args[]){
        int num;
        num=10;
        System.out.println("This is num:" +num);
        num=num*2;
        System.out.println("The value of the number is ");
        System.out.println(num);
    }
}
 */
 /*     
    public static void main(String[] args){
        System.out.println("MIjanur rahman");
        System.out.println("01746478276");
    }

}
 */
 /*
public class Biodata{
    public static void main(String args[]){
        int x,y;
        x=10;
        y=20;
        if(x<y)
            System.out.println("x is less than y");
        x=x*2;
        if(x>y){
            System.out.println("x now greater than o");
        }
        if(x==y){
            System.out.println("you didnot see this");
        }
    }
}
 */

//for looping
/*
public class Biodata{
    public static void main(String args[]){
        int x;
        for(x=0;x<10;x++){
            System.out.println("This is x: "+x);
        }
    }
}
 */
//using blocks of code
/*
public class Biodata{
    public static void main(String args[]){
        int x, y;
        y=20;
        for(x=0; x<10;  x++){
            System.out.println("This is x: "+x);
            System.out.println("This is y: "+y);
            y=y-2;
        }
    }
}
 */
 /*
//Compute distance light travels using long variables
//package first_project;
public class Biodata{
    public static void main(String args[]){
        int light_speed;
        long days;
        long seconds;
        long distance;
        light_speed=1860000;
        days=1000;
        seconds=days*24*60*60;
        distance=light_speed*seconds;
        System.out.println("ln " + days);
          System.out.println("days light will travel about ");
          System.out.println(distance+ " miles");
    }
}
 */
//Double
//package first_project;
/*
public class Biodata{
    public static void main(String args[]){
        double pi,r,a; float f;
        r=10.8;
        pi=3.1416;
        a=pi*r*r;
        f=(float)a;
        System.out.println("Area of circle is "+a);
    }
}
 */
// Demonstrate char data type.
/*
class Biodata {
public static void main(String args[]) {
   char ch1, ch2;
    ch1 = 88; // code for X
      ch2 = 'Y';
       System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
}
}





 */
//Booleans
/*
class Biodata {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("b is "+b);
        b=true;
        System.out.println("b is "+b);
        if(b)
        {
            System.out.println("This is executed");
        }
        b=false;
        if(b)
        {
            System.out.println("This is not executed");
        }
        System.out.println("10>9 is " +(10<9));
    }
}
 */
 /*
package first_project;
//import java.util.Scanner;
class Biodata {
    public static void main(String[] args) {
        double a=3.0,b=4.0;
        //a=input.nextln();
        double c=Math.sqrt(a*a+b*b);
        System.out.println("c is "+c);
        
    }
}
 */
// Demonstrate casts.
/*
class Biodata {
public static void main(String args[]) {
byte b;
int i = 256;
double d = 323.142;
         System.out.println("\nConversion of int to byte.");
      b = (byte) i;
               System.out.println("i and b " + i + " " + b);
        System.out.println("\nConversion of double to int.");
           i = (int) d;
           System.out.println("d and i " + d + " " + i);
              System.out.println("\nConversion of double to byte.");
             b = (byte) d;
              System.out.println("d and b " + d + " " + b);
              byte c;
              c=50*2;
              System.out.println(c);
}
}
 */
//The Type Promotion Rules
/*
class Biodata{
    public static void main(String[] args) {
        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = "+result);
    }
}
 */
//ARRAY
/*
class Biodata{
    public static void main(String[] args) {
        int month_days[];
        month_days=new int[12];
        month_days[0]=3561;
        month_days[1]=5;
        month_days[2]=3561;
        month_days[3]=361;
        month_days[4]=76;
        
        System.out.println("month_days"+ month_days[3]+ "sha");
    }
}
 */
 /*
class Biodata{
      public static void main(String args[]) {
             int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
       30, 31 };
             System.out.println("April has " + month_days[3] +" days");
}
}
 */
// Average an array of values.
/*
class Biodata {
     public static void main(String args[]) {
      double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
      double result=0;
      int i;
      for(i=0;i<5;i++){
          result=result+nums[i];
      }
         System.out.println("Average is "+ result/5);
         int twoD[][]= new int[4][5];
         int  j, k = 0;
          for(i=0; i<4; i++){
              for(j=0; j<5; j++) {
                  twoD[i][j] = k;
                       k++;
            }
        }
          
          for(i=0; i<4; i++) {
               for(j=0; j<5; j++){
                   System.out.print(twoD[i][j] + " ");
               }
                  System.out.println();
              }
           }
     }
       

 */
 /*
 // Manually allocate differing size second dimensions
class Biodata{
    public static void main(String args[]) {
        int twoD[][] = new int[4][];
          twoD[0] = new int[1];
          twoD[1] = new int[2];
          twoD[2] = new int[3];
          twoD[3] = new int[4];
            int i, j, k = 0;
             for(i=0; i<4; i++){
           for(j=0; j<i+1; j++) {
              twoD[i][j] = k;
                   k++;
              }
             }
             for(i=0; i<4; i++) {
           for(j=0; j<i+1; j++){
             System.out.print(twoD[i][j] + " ");
                 
             } System.out.println();
          }
    }
}
 */
// Initialize a two-dimensional array.
/*
class Biodata{
    public static void main(String[] args) {
        double arr[][] = {
        { 0*0, 1*0, 2*0, 3*0 },
          { 0*1, 1*1, 2*1, 3*1},
        { 0*2, 1*2, 2*2, 3*2 },
         { 0*3, 1*3, 2*3, 3*3 }
    };
       
      int i, j;
           for(i=0; i<4; i++) {
            for(j=0; j<4; j++)
          System.out.print(arr[i][j] + " ");
           System.out.println();
         }
      }
          }
 */
// Demonstrate a three-dimensional array.
class Biodata {

    public static void main(String[] args) {
        int threeD[][][] = new int[4][5][6];
        int i, j, k;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 5; k++) {
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                    //System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
