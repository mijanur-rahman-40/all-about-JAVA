package methodsandclasses;

public class UseStatic {

    static int a = 3;
    static int b;//= a*3;

    //non-static variable
    int height;
// System.out.println("a = " + a);
    static {
        b = a * 3;
        System.out.println("Static Block");
    }

    static int sum(int x, int y) {
        //height =10;
        return x + y;
    }
}
class test1{
    public static void main(String args[]) {

        //System.out.println("b = " + a);
       System.out.println("Sum is : "+UseStatic.sum(2,3));
       UseStatic ob = new UseStatic();
       ob.sum(2,2);

    }
}
