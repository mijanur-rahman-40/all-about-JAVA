package methodsandclasses;

//public class useStatic {
class useStatic {

    static int a = 3;
    static int b;
    //static int b=a*3;

    /*
    staticuse(){
       
    }
     */

    static {
        b = a * 4;
        System.out.println("Value in Static: " + b);
    }

    //public useStatic(int x,int b){
    static int sum() {
        return a + b;
    }

    static int sum1(int x, int y) { //Static Main theke Non Static kuno kisu k Access kora jabe na
        return x + y;
    }

    public static void main(String args[]) {
        System.out.println("Value of b:" + b);
        //staticuse obj=new staticuse();
        //useStatic kup=new useStatic(3,7);
        System.out.println("Sum: " + sum());
        System.out.println("Sum1: " + sum1(3, 4));

    }
}
