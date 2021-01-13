package methodsandclasses;

class Box5 {

    int height;
    int width;
    int depth;

    public Box5(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }

    boolean isEqual(Box5 ob) {
        return ob.height == height && ob.width == width && ob.depth == depth;
        /*
            if(ob.height==height && ob.width==width && ob.depth==depth){
                return true;
            }
            else
                return false;
         */
    }

    void changevalue(int h, int w, int d) {
        height *= 2;
        width *= 2;
        depth *= 2;
    }

    void changevalue(Box5 ob) {
        ob.height *= 2;
        ob.depth *= 2;
        ob.depth *= 2;

    }

    public Box5(Box5 ob) {
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }

    int getVolume() {
        return height * width * depth;
    }

}

/*
public class Method_overloading {
    public static void main(String[] args) {
       Box5 ob1=new Box5(2,2,2);
        //Box6 b1=new Box6(5,5,5);
       // Box5 b4=new Box5(ob1);
        //b4.changevalue(ob1.height,ob1.width,ob1.depth);
        
      //  Box5 b4=new Box5(2,2,2);
       // b4.changevalue(2,2,2);
        ob1.changevalue(ob1);
        System.out.println(ob1.getVolume());
         //Box6 b2=new Box6(10,10,10);
         //Box6 b3=new Box6(5,5,5);
         
        //System.out.println(b1.isEqual(b2));
         //System.out.println(b2.isEqual(b3));
          //System.out.println(b3.isEqual(b1));
    }
}
 */
class OverloadDemo {

    void test() {
        System.out.println("No parameters");
    }
// Overload test for two integer parameters.

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
// Overload test for a double parameter

    void test1(double a) {
        System.out.println("Inside test(double) a: " + a);

    }

}

class Overload {

    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;
        ob.test();
        ob.test(10, 20);

        ob.test1(i); // this will invoke test(double)
        ob.test1(123.2); // this will invoke test(double)
    }
}
